package X;

import android.text.TextUtils;
import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498300p5o {
    public static final WsChannelMsg LIZ(byte[] bArr) {
        StringBuilder sb;
        int iIndexOf;
        Frame frameDecode = Frame.ADAPTER.decode(bArr);
        long jLongValue = ((Long) Wire.get(frameDecode.seqid, Frame.DEFAULT_SEQID)).longValue();
        long jLongValue2 = ((Long) Wire.get(frameDecode.logid, Frame.DEFAULT_LOGID)).longValue();
        int iIntValue = ((Integer) Wire.get(frameDecode.service, Frame.DEFAULT_SERVICE)).intValue();
        int iIntValue2 = ((Integer) Wire.get(frameDecode.method, Frame.DEFAULT_METHOD)).intValue();
        List<C1516580pZI> list = (List) Wire.get(frameDecode.headers, Collections.emptyList());
        String str = (String) Wire.get(frameDecode.payload_encoding, "");
        String str2 = (String) Wire.get(frameDecode.payload_type, "");
        byte[] byteArray = ((ByteString) Wire.get(frameDecode.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        String str3 = (String) Wire.get(frameDecode.serverTiming, "");
        String str4 = (String) Wire.get(frameDecode.msgId, "");
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.logId = jLongValue2;
        wsChannelMsg.seqId = jLongValue;
        wsChannelMsg.service = iIntValue;
        wsChannelMsg.method = iIntValue2;
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (C1516580pZI c1516580pZI : list) {
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.key = (String) Wire.get(c1516580pZI.key, "");
                msgHeader.value = (String) Wire.get(c1516580pZI.value, "");
                arrayList.add(msgHeader);
            }
            wsChannelMsg.msgHeaders = arrayList;
        }
        wsChannelMsg.payloadEncoding = str;
        wsChannelMsg.payloadType = str2;
        wsChannelMsg.payload = byteArray;
        String string = null;
        if (!TextUtils.isEmpty(str3) && (iIndexOf = (sb = new StringBuilder(str3)).indexOf("ttnet;")) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recv_time=");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(";");
            sb.insert(iIndexOf + 6, C2188811AlT.LIZIZ(sbLIZ));
            string = sb.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            str3 = string;
        }
        wsChannelMsg.serverTiming = str3;
        wsChannelMsg.msgId = str4;
        return wsChannelMsg;
    }

    public static final byte[] LIZIZ(WsChannelMsg wsChannelMsg) {
        ByteString byteStringOf;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.LIZ() != null) {
            byteStringOf = ByteString.of(wsChannelMsg.LIZ());
        } else {
            byteStringOf = ByteString.EMPTY;
        }
        C1516550pZF c1516550pZF = new C1516550pZF();
        c1516550pZF.LJ = Long.valueOf(wsChannelMsg.logId);
        c1516550pZF.LIZLLL = Long.valueOf(wsChannelMsg.seqId);
        c1516550pZF.LJFF = Integer.valueOf(wsChannelMsg.service);
        c1516550pZF.LJIIIIZZ = wsChannelMsg.payloadEncoding;
        c1516550pZF.LJIIIZ = wsChannelMsg.payloadType;
        c1516550pZF.LJIIJ = byteStringOf;
        c1516550pZF.LJI = Integer.valueOf(wsChannelMsg.method);
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (WsChannelMsg.MsgHeader msgHeader : list) {
                C1516560pZG c1516560pZG = new C1516560pZG();
                c1516560pZG.LIZLLL = msgHeader.key;
                c1516560pZG.LJ = msgHeader.value;
                arrayList.add(c1516560pZG.build());
            }
        }
        if (!arrayList.isEmpty()) {
            C1516540pZE.LIZ(arrayList);
            c1516550pZF.LJII = arrayList;
        }
        return Frame.ADAPTER.encode(c1516550pZF.build());
    }
}

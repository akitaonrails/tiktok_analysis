package com.bytedance.android.live.network;

import X.C080U;
import X.C09UD;
import X.C0X52;
import X.C0XMB;
import X.C1161920gLG;
import X.C1494590ozp;
import X.C1508660pMW;
import X.C1904507d5;
import X.C501450JlX;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.retrofit2.client.Request;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseInterceptorV2 implements InterfaceC1904907d9 {
    public final C1508660pMW LL = new C1508660pMW();

    public static ResponseInterceptorV2 LIZ() {
        return new ResponseInterceptorV2();
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String string;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C1508660pMW c1508660pMW = this.LL;
        c1508660pMW.getClass();
        String url = request.getUrl();
        if (!TextUtils.isEmpty(url)) {
            StringBuilder sb = new StringBuilder(url);
            c1508660pMW.LIZ(sb);
            string = sb.toString();
        } else {
            string = "";
        }
        if (C1161920gLG.LIZJ(IHostNetwork.class) != null) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).minorModeInterceptMonitor(string);
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ(string);
        Request requestLIZ = c0xmbNewBuilder.LIZ();
        if ("/webcast/room/enter/".equals(requestLIZ.getPath())) {
            if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                LinkedList linkedList = new LinkedList(requestLIZ.getHeaders());
                linkedList.add(new C080U("response-format", "protobuf"));
                C0XMB c0xmbNewBuilder2 = requestLIZ.newBuilder();
                c0xmbNewBuilder2.LIZJ = linkedList;
                requestLIZ = c0xmbNewBuilder2.LIZ();
            }
        } else if (C09UD.LIZJ(requestLIZ)) {
            LinkedList linkedList2 = new LinkedList(requestLIZ.getHeaders());
            linkedList2.add(new C080U("response-format", "protobuf"));
            C0XMB c0xmbNewBuilder3 = requestLIZ.newBuilder();
            c0xmbNewBuilder3.LIZJ = linkedList2;
            requestLIZ = c0xmbNewBuilder3.LIZ();
        }
        Request requestLIZIZ = C1904507d5.LIZIZ(requestLIZ);
        C0X52 c0x52LIZ = c1494590ozp.LIZ(requestLIZIZ);
        C501450JlX.LIZIZ(requestLIZIZ, c0x52LIZ);
        return c0x52LIZ;
    }
}

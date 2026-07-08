package X;

import Y.AfS172S0100000_3;
import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS2S2102000_30;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0auv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953390auv {
    public static GetUploadAuthResponse.ResponseData LIZ;

    public static void LIZ(String str, int i, int i2, Function2 function2) {
        long id;
        Object c098200Yq;
        long jLongValue;
        String strU3;
        String strLIZ = C1017903yT.LIZ();
        AwS2S2102000_30 awS2S2102000_30 = new AwS2S2102000_30(str, (String) function2, (Function2<? super String, ? super String, Unit>) strLIZ, (String) i, i2, 2);
        GetUploadAuthResponse.ResponseData responseData = LIZ;
        if (responseData != null && responseData.accessKey.length() > 0 && responseData.secretKey.length() > 0 && responseData.sessionToken.length() > 0 && C158B.LIZJ() < responseData.expiredTime) {
            awS2S2102000_30.invoke();
            return;
        }
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(awS2S2102000_30, 1101);
        AwS164S1100000_15 awS164S1100000_15 = new AwS164S1100000_15(function2, (Function2<? super String, ? super String, Unit>) strLIZ, (String) 13);
        GetUploadAuthParams getUploadAuthParams = new GetUploadAuthParams();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        getUploadAuthParams.roomId = id;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(strU3));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            Long l = (Long) c098200Yq;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            getUploadAuthParams.channelId = jLongValue;
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            getUploadAuthParams.channelId = 0L;
        }
        C480460Ism.LIZ().getClass();
        ((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).fetchImageUploadToken(getUploadAuthParams).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(awS559S0100000_15, 217), new AfS172S0100000_3(awS164S1100000_15, 91));
    }
}

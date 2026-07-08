package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0UIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770000UIk {
    public static C19EG LIZ;
    public static InterfaceC769940UIe LIZIZ;
    public static InterfaceC770050UIp LIZJ;
    public static C769960UIg LIZLLL;
    public static boolean LJ;

    public static void LIZ() {
        InterfaceC770050UIp interfaceC770050UIp = LIZJ;
        if (interfaceC770050UIp != null) {
            interfaceC770050UIp.LJIIZILJ(CertProviderManagerKt.findCert("bpea-go_live_destroy_video", 1476788484));
        }
        LIZJ = null;
        LIZIZ = null;
        C769960UIg c769960UIg = LIZLLL;
        if (c769960UIg != null) {
            DataChannelGlobal.LLILZ.zQ2(c769960UIg);
            c769960UIg.LLJI = null;
            c769960UIg.LLJIJIL = null;
            c769960UIg.LLJILJIL = null;
            c769960UIg.LLJILJILJ = null;
        }
        LIZLLL = null;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveCoreInitUtil().LIZJ();
    }
}

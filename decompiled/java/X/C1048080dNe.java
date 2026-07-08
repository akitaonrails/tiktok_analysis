package X;

import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS0S0001100_16;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048080dNe {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1048080dNe.class, "baLogService", "getBaLogService()Lcom/bytedance/ies/ugc/aweme/commwecialize/ba/service/IBALogService;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1048080dNe.class, "userVideoPlayLogService", "getUserVideoPlayLogService()Lcom/ss/android/ugc/aweme/commercialize/service/IUserVideoPlayLogService;", 0);
        c09r3.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public static C1048100dNg LIZ() {
        C1048100dNg c1048100dNg = C1807670x8n.LJJIL;
        if (c1048100dNg == null) {
            synchronized (C1048100dNg.class) {
                try {
                    c1048100dNg = C1807670x8n.LJJIL;
                    if (c1048100dNg == null) {
                        C1048100dNg c1048100dNg2 = new C1048100dNg();
                        C1807670x8n.LJJIL = c1048100dNg2;
                        return c1048100dNg2;
                    }
                } finally {
                }
            }
        }
        return c1048100dNg;
    }

    public static C581800Mrq LIZIZ() {
        C581800Mrq c581800Mrq = C1807670x8n.LJJIJIIJI;
        if (c581800Mrq == null) {
            synchronized (C581800Mrq.class) {
                try {
                    c581800Mrq = C1807670x8n.LJJIJIIJI;
                    if (c581800Mrq == null) {
                        C581800Mrq c581800Mrq2 = new C581800Mrq();
                        C1807670x8n.LJJIJIIJI = c581800Mrq2;
                        return c581800Mrq2;
                    }
                } finally {
                }
            }
        }
        return c581800Mrq;
    }

    public static final void LIZLLL(Aweme aweme, long j, int i, C2189821An6 c2189821An6) {
        Aweme awemeLIZ;
        AwemeRawAd awemeRawAd;
        C1048100dNg c1048100dNgLIZ = LIZ();
        if (aweme != null && !C1010120cOQ.LJJIJ(aweme)) {
            if (AwemeExtKt.isPseudoAd(aweme)) {
                if (C2264471DkD.LJ() && ((IAppMeasurementProvider) c1048100dNgLIZ.LIZ.getValue()).LIZJ(aweme, "")) {
                    C589080N8o.LIZIZ(c1048100dNgLIZ, null, new AwS550S0100000_6(aweme, 1623));
                } else {
                    C1048070dNd c1048070dNd = new C1048070dNd(aweme, c2189821An6);
                    AwemeRawAd awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                    C1048060dNc.LIZ.getClass();
                    c1048070dNd.logAd(C1048060dNc.LIZIZ, awemeRawAdLJJIJL, new AwS0S0001100_16(j, i, 4));
                }
            } else if (!AwemeExtKt.isAdTraffic(aweme) && ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJII(aweme)) {
                C1048070dNd c1048070dNd2 = new C1048070dNd(aweme, c2189821An6);
                C1048060dNc.LIZ.getClass();
                c1048070dNd2.log(C1048060dNc.LIZLLL, new AwS0S0001100_16(j, i, 3));
            }
        }
        C581800Mrq c581800MrqLIZIZ = LIZIZ();
        if (c2189821An6 != null && Intrinsics.LJFF(c2189821An6.getEventType(), "instant_page") && (awemeLIZ = ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZ()) != null && (awemeRawAd = awemeLIZ.getAwemeRawAd()) != null && awemeRawAd.getDetailBottomBanner() != null) {
            int tiktokPageType = awemeRawAd.getTiktokPageType();
            InterfaceC581680Mre interfaceC581680MreLIZ = c581800MrqLIZIZ.LIZ();
            if (interfaceC581680MreLIZ != null) {
                interfaceC581680MreLIZ.LJJIIJ(awemeRawAd, j, i, tiktokPageType, aweme);
            }
            InterfaceC581680Mre interfaceC581680MreLIZ2 = c581800MrqLIZIZ.LIZ();
            if (interfaceC581680MreLIZ2 != null) {
                interfaceC581680MreLIZ2.LIZIZ(awemeRawAd, i + 1, tiktokPageType, aweme);
            }
        }
    }

    public static final void LIZJ(String str, Aweme aweme, long j, int i, C2189821An6 c2189821An6) {
        Aweme awemeLIZ;
        AwemeRawAd awemeRawAd;
        C1048100dNg c1048100dNgLIZ = LIZ();
        if (aweme != null && !C1017070cZd.LLIIL(aweme) && !C1010120cOQ.LJJIJ(aweme)) {
            if (AwemeExtKt.isPseudoAd(aweme)) {
                if (C2264471DkD.LJ() && ((IAppMeasurementProvider) c1048100dNgLIZ.LIZ.getValue()).LIZJ(aweme, "")) {
                    C589080N8o.LIZIZ(c1048100dNgLIZ, null, new AwS550S0100000_6(aweme, 1622));
                } else {
                    C1048070dNd c1048070dNd = new C1048070dNd(aweme, c2189821An6);
                    AwemeRawAd awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                    C1048060dNc.LIZ.getClass();
                    c1048070dNd.logAd(C1048060dNc.LIZJ, awemeRawAdLJJIJL, new AwS0S0001100_16(j, i, 1));
                }
            } else if (!AwemeExtKt.isAdTraffic(aweme) && ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJII(aweme)) {
                C1048070dNd c1048070dNd2 = new C1048070dNd(aweme, c2189821An6);
                C1048060dNc.LIZ.getClass();
                c1048070dNd2.log(C1048060dNc.LJ, new AwS0S0001100_16(j, i, 2));
            }
        }
        C581800Mrq c581800MrqLIZIZ = LIZIZ();
        if (Intrinsics.LJFF(c581800MrqLIZIZ.LIZJ, str) && c2189821An6 != null && Intrinsics.LJFF(c2189821An6.getEventType(), "instant_page") && (awemeLIZ = ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZ()) != null && (awemeRawAd = awemeLIZ.getAwemeRawAd()) != null && awemeRawAd.getDetailBottomBanner() != null) {
            int tiktokPageType = awemeRawAd.getTiktokPageType();
            InterfaceC581680Mre interfaceC581680MreLIZ = c581800MrqLIZIZ.LIZ();
            if (interfaceC581680MreLIZ != null) {
                interfaceC581680MreLIZ.LJ(awemeRawAd, j, i, tiktokPageType, aweme);
            }
        }
    }
}

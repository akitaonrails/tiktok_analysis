package X;

import Y.AfS3S0000100_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyIntelligentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRecommendRoomAb;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0aEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927170aEd {
    public static DataChannel LIZ;
    public static C11JF LIZIZ;
    public static C11JL LIZJ;
    public static int LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static C942600adW LJIIIIZZ;
    public static String LJIIIZ;
    public static BaseMultiGuestLinkMicMatchFragment LJIIJ;
    public static long LJIIJJI;
    public static String LJII = "";
    public static final boolean LJIIL = LinkMicApplyIntelligentSetting.enable();

    public static String LIZ() {
        return LJI ? C497740JfY.LJIJJ(2131854187, LJII) : C497740JfY.LJIJJ(2131854190, LJII);
    }

    public static void LIZIZ() {
        C472820IgS.LIZ("resetCountDown");
        C11JL c11jl = LIZJ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        LIZJ = null;
        C11JF c11jf = LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LIZIZ = null;
    }

    public static void LIZJ(int i) {
        LIZLLL = i;
        if (i == 0) {
            LJIIJJI = 0L;
        }
    }

    public static void LIZLLL(long j) {
        if (!MultiGuestRecommendRoomAb.INSTANCE.isEnable()) {
            C472820IgS.LIZ("not in ab group!");
            return;
        }
        if (LIZIZ != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDown for time: ");
        sbLIZ.append(j);
        sbLIZ.append(" s");
        C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = (C11JF) C19490011Na.LIZLLL(1L, j, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0000100_15(j, 9), new C09JN() { // from class: X.0aEg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestLinkMicMatchHelper@1d3e.startCountDown$2");
                C11JF c11jf = C927170aEd.LIZIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                C927170aEd.LIZIZ = null;
                C1C7U.LIZIZ("MultiGuestLinkMicMatchHelper@1d3e.startCountDown$2");
            }
        });
    }
}

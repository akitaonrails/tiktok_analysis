package X;

import Y.AfS183S0100000_14;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0o1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457440o1u {
    public static final C1457440o1u LIZ = new C1457440o1u();
    public static String LIZIZ = "";

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (C13LP.LJJJJ(videoPublishEditModel.mShootWay, C1442040nd4.LIZ)) {
            return;
        }
        C1403010mc7.LIZ.getMusicService().Wk();
        C1085780eMS.LIZ();
    }

    public static void LIZ(long j, VideoPublishEditModel videoPublishEditModel) {
        C1403010mc7.LIZ.getMusicService().dl().LJIIIZ(C1442040nd4.LJ(videoPublishEditModel, j, false, null, null, false, 0L, false, null, null, false, 1022));
    }

    public static C11NZ LIZJ(AbstractC1457480o1y abstractC1457480o1y, boolean z, C2256608sm c2256608sm, int i) {
        String strLIZ;
        String strLIZ2;
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c2256608sm = new C2256608sm(i2);
        }
        C11JN c11jnLJIILIIL = null;
        if (C0CHQ.LIZ().getAccountService().LIZ() || (C0C64.LJIILLIIL().LJIJ(31744, 0, "reverse_ai_music_panel_type", true) != 0 && !z)) {
            return null;
        }
        if (!((Boolean) C2274608vg.LIZ.getValue()).booleanValue()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("is_login", String.valueOf(C0CHQ.LIZ().getAccountService().isLogin()));
            C20684815ws.LJIILLIIL("tool_performance_ai_music_start_frames", c0lab.LIZ);
        }
        if (abstractC1457480o1y instanceof C1457510o21) {
            C1403010mc7.LIZ.getMusicService().dl();
            C1457510o21 c1457510o21 = (C1457510o21) abstractC1457480o1y;
            c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C2265708uF(c1457510o21.LIZIZ, c1457510o21.LIZJ), abstractC1457480o1y.LIZ);
        } else if (abstractC1457480o1y instanceof C1457540o24) {
            C1457540o24 c1457540o24 = (C1457540o24) abstractC1457480o1y;
            Uri uri = UriProtector.parse(c1457540o24.LIZIZ);
            if (uri != null && (strLIZ2 = C09N5.LIZ(C0CHQ.LIZ, uri)) != null) {
                C1403010mc7.LIZ.getMusicService().dl();
                c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C2265908uH(strLIZ2, c1457540o24.LIZJ), abstractC1457480o1y.LIZ);
            }
        } else if (abstractC1457480o1y instanceof C573450MeN) {
            C1403010mc7.LIZ.getMusicService().dl();
            c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C1921307fn(C13LP.LLIIII(((C1457520o22) abstractC1457480o1y).LIZIZ)), abstractC1457480o1y.LIZ);
        } else if (abstractC1457480o1y instanceof C1457520o22) {
            C1403010mc7.LIZ.getMusicService().dl();
            c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C1921307fn(((C1457520o22) abstractC1457480o1y).LIZIZ), abstractC1457480o1y.LIZ);
        } else if (abstractC1457480o1y instanceof C1457500o20) {
            C1403010mc7.LIZ.getMusicService().dl();
            C1457500o20 c1457500o20 = (C1457500o20) abstractC1457480o1y;
            c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C2275508vp(c1457500o20.LIZIZ, c1457500o20.LIZJ, c1457500o20.LIZLLL), abstractC1457480o1y.LIZ);
        } else if (abstractC1457480o1y instanceof C1457470o1x) {
            C1457470o1x c1457470o1x = (C1457470o1x) abstractC1457480o1y;
            Uri uri2 = UriProtector.parse(c1457470o1x.LIZIZ);
            if (uri2 != null && (strLIZ = C09N5.LIZ(C0CHQ.LIZ, uri2)) != null) {
                C1403010mc7.LIZ.getMusicService().dl();
                c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C2266008uI(strLIZ, c1457470o1x.LIZJ, c1457470o1x.LIZLLL, c1457470o1x.LJ, c1457470o1x.LJFF, c1457470o1x.LJI), abstractC1457480o1y.LIZ);
            }
        } else if (abstractC1457480o1y instanceof C1457460o1w) {
            C1403010mc7.LIZ.getMusicService().dl();
            C1457460o1w c1457460o1w = (C1457460o1w) abstractC1457480o1y;
            c11jnLJIILIIL = C1458410o3T.LJIILIIL(new C2256108sh(c1457460o1w.LIZIZ, c1457460o1w.LIZJ, c2256608sm.LIZ, c1457460o1w.LIZLLL, c1457460o1w.LJ), abstractC1457480o1y.LIZ);
        } else {
            throw new C1954807lC();
        }
        C1403010mc7.LIZ.getMusicService().gl();
        return c11jnLJIILIIL;
    }

    public static C11NZ LIZIZ(final VideoPublishEditModel videoPublishEditModel, final long j, int i, C2256608sm c2256608sm, int i2) {
        C11NZ c11nzLIZJ;
        if ((i2 & 2) != 0) {
            j = -1;
        }
        int i3 = 0;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            c2256608sm = new C2256608sm(i3);
        }
        if (!C13LP.LJJJJ(videoPublishEditModel.mShootWay, C1442040nd4.LIZ)) {
            C1457430o1t.LIZ.getClass();
            AbstractC1457480o1y abstractC1457480o1yLIZJ = C1457430o1t.LIZJ(videoPublishEditModel, i, c2256608sm);
            if (abstractC1457480o1yLIZJ != null && (c11nzLIZJ = LIZJ(abstractC1457480o1yLIZJ, false, c2256608sm, 2)) != null) {
                c11nzLIZJ.LJJIJIIJIL(new AfS183S0100000_14(videoPublishEditModel, 16));
                if (j >= 0) {
                    if (!C0BVY.LIZ(videoPublishEditModel)) {
                        C201955140j.LJIILIIL("PreEmbTaskManager", "not need preload music");
                    } else {
                        long jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "studio_panel_pre_request_music_time_duration_opt", true);
                        if (jLJIJJLI > 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_panel_pre_request_music_time_opt", true, false)) {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            C11RO c11ro = C11S5.LIZIZ;
                            C1701890uOB.LIZ(timeUnit, "unit is null");
                            C1701890uOB.LIZ(c11ro, "scheduler is null");
                            new C19477411Ie(jLJIJJLI, timeUnit, c11ro).LJIJI(new C09JN() { // from class: X.00QV
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    C1C7U.LIZ("AIMusic@2158.uploadFrame$1$1$3");
                                    C1C7U.LIZIZ("AIMusic@2158.uploadFrame$1$1$3");
                                }
                            }, new InterfaceC781210Ukh() { // from class: X.0o23
                                @Override // X.InterfaceC781210Ukh
                                public final void run() {
                                    C1457440o1u c1457440o1u = C1457440o1u.LIZ;
                                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                                    long j2 = j;
                                    c1457440o1u.getClass();
                                    C1457440o1u.LIZ(j2, videoPublishEditModel2);
                                }
                            });
                            return c11nzLIZJ;
                        }
                        LIZ.getClass();
                        LIZ(j, videoPublishEditModel);
                        return c11nzLIZJ;
                    }
                }
                return c11nzLIZJ;
            }
            return null;
        }
        return null;
    }
}

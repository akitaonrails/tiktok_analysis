package X;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0qU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551820qU8 {
    public static boolean LIZ;
    public static final C1552360qV0 LIZIZ = new AbstractC1552800qVi() { // from class: X.0qV0
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC1552800qVi
        public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
            C1551810qU7 statisticModel;
            IN in = abstractC1552240qUo.LIZIZ;
            if (in instanceof Pair) {
                Object obj = ((Pair) in).second;
                if ((obj instanceof UpdatePackage) && (statisticModel = ((UpdatePackage) obj).getStatisticModel()) != null) {
                    statisticModel.LJIILJJIL = SystemClock.uptimeMillis() - statisticModel.LJIL;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC1552800qVi
        public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
            C1551810qU7 statisticModel;
            IN in = abstractC1552240qUo.LIZIZ;
            if (in instanceof Pair) {
                Object obj = ((Pair) in).second;
                if ((obj instanceof UpdatePackage) && (statisticModel = ((UpdatePackage) obj).getStatisticModel()) != null) {
                    statisticModel.LJIL = SystemClock.uptimeMillis();
                }
            }
        }

        @Override // X.AbstractC1552800qVi
        public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
            C1551820qU8.LIZLLL(c1552250qUp, 400, th);
        }
    };
    public static Map<AbstractC1552040qUU, Map<Class<? extends AbstractC1552240qUo<?, ?>>, AbstractC1552800qVi>> LIZJ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        C1552210qUl.LIZIZ(C1551570qTj.class, new AbstractC1552800qVi() { // from class: X.0qUC
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                long jUptimeMillis = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIIZILJ;
                c1551810qU7LIZIZ.LJIIIIZZ = jUptimeMillis;
                c1551810qU7LIZIZ.LJII += jUptimeMillis;
            }

            @Override // X.AbstractC1552800qVi
            public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                Pair pair = (Pair) c1552250qUp.getOutputForType(C1551600qTm.class);
                UpdatePackage updatePackage = (UpdatePackage) pair.second;
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, true);
                c1551810qU7LIZIZ.LJIIZILJ = SystemClock.uptimeMillis();
                c1551810qU7LIZIZ.LIZIZ(updatePackage, true).LJ = ((Uri) pair.first).toString();
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                c1551810qU7LIZIZ.LJII += SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIIZILJ;
                C1551820qU8.LIZIZ(c1552250qUp, false).LIZIZ((UpdatePackage) c1552250qUp.getInputForType(C1551600qTm.class), false).LJFF++;
            }
        });
        C1552210qUl.LIZIZ(C1551600qTm.class, new AbstractC1552800qVi() { // from class: X.0qVp
            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                int i;
                if (th instanceof C1551660qTs) {
                    i = 101;
                } else if (!(th instanceof C1550950qSj)) {
                    return;
                } else {
                    i = 403;
                }
                C1551820qU8.LIZLLL(c1552250qUp, i, th);
            }
        });
        C1552210qUl.LIZIZ(C1550900qSe.class, new AbstractC1552800qVi() { // from class: X.0qVB
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                c1551810qU7LIZIZ.LJIIJ = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIJ;
            }

            @Override // X.AbstractC1552800qVi
            public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551820qU8.LIZIZ(c1552250qUp, false).LJIJ = SystemClock.uptimeMillis();
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                int i;
                if (th instanceof C1550950qSj) {
                    i = 403;
                } else {
                    i = 200;
                }
                C1551820qU8.LIZLLL(c1552250qUp, i, th);
            }
        });
        C1552210qUl.LIZIZ(C1550850qSZ.class, new AbstractC1552800qVi() { // from class: X.0qW2
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                C1551820qU8.LIZLLL(c1552250qUp, 500, th);
            }
        });
        C1552210qUl.LIZIZ(C1550960qSk.class, new AbstractC1552800qVi() { // from class: X.0qVA
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                c1551810qU7LIZIZ.LJIILIIL = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIJJLI;
            }

            @Override // X.AbstractC1552800qVi
            public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551820qU8.LIZIZ(c1552250qUp, false).LJIJJLI = SystemClock.uptimeMillis();
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                int i;
                if (th instanceof C1550940qSi) {
                    i = 301;
                } else {
                    i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                }
                C1551820qU8.LIZLLL(c1552250qUp, i, th);
            }
        });
        C1552210qUl.LIZIZ(C1550910qSf.class, new AbstractC1552800qVi() { // from class: X.0qUj
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                if (abstractC1552240qUo instanceof C1550910qSf) {
                    C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                    c1551810qU7LIZIZ.LJIIJJI = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIJI;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1552800qVi
            public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                boolean z = abstractC1552240qUo instanceof C1550820qSW;
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, z);
                if (z) {
                    c1551810qU7LIZIZ.LIZIZ((UpdatePackage) abstractC1552240qUo.LIZIZ, true);
                } else {
                    c1551810qU7LIZIZ.LJIJI = SystemClock.uptimeMillis();
                }
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                int i;
                if (th instanceof C1550830qSX) {
                    i = 400;
                } else if (th instanceof C1550940qSi) {
                    i = 401;
                } else if (th instanceof C1550950qSj) {
                    i = 403;
                } else {
                    i = 402;
                }
                C1551820qU8.LIZLLL(c1552250qUp, i, th);
            }
        });
        C1552210qUl.LIZIZ(C1550820qSW.class, new AbstractC1552800qVi() { // from class: X.0qUj
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                if (abstractC1552240qUo instanceof C1550910qSf) {
                    C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                    c1551810qU7LIZIZ.LJIIJJI = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIJI;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1552800qVi
            public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                boolean z = abstractC1552240qUo instanceof C1550820qSW;
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, z);
                if (z) {
                    c1551810qU7LIZIZ.LIZIZ((UpdatePackage) abstractC1552240qUo.LIZIZ, true);
                } else {
                    c1551810qU7LIZIZ.LJIJI = SystemClock.uptimeMillis();
                }
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                int i;
                if (th instanceof C1550830qSX) {
                    i = 400;
                } else if (th instanceof C1550940qSi) {
                    i = 401;
                } else if (th instanceof C1550950qSj) {
                    i = 403;
                } else {
                    i = 402;
                }
                C1551820qU8.LIZLLL(c1552250qUp, i, th);
            }
        });
        C1552210qUl.LIZIZ(C1550970qSl.class, new AbstractC1552800qVi() { // from class: X.0qVC
            @Override // X.AbstractC1552800qVi
            public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                c1551810qU7LIZIZ.LJIIL = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIJJ;
            }

            @Override // X.AbstractC1552800qVi
            public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                C1551820qU8.LIZIZ(c1552250qUp, false).LJIJJ = SystemClock.uptimeMillis();
            }

            @Override // X.AbstractC1552800qVi
            public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
                int code;
                if (th instanceof C2222608nI) {
                    code = ((C2222608nI) th).getCode();
                } else if (th instanceof C1550950qSj) {
                    code = 403;
                } else {
                    code = 1099;
                }
                C1551820qU8.LIZLLL(c1552250qUp, code, th);
            }
        });
        C1552210qUl.LIZIZ(C1551700qTw.class, LIZIZ);
        C1552210qUl.LIZIZ(C1550780qSS.class, new AbstractC1552800qVi() { // from class: X.0qUA
            @Override // X.AbstractC1552800qVi
            public final void LJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                boolean z;
                boolean z2;
                String str;
                UpdatePackage updatePackageLIZJ = C1551820qU8.LIZJ(c1552250qUp);
                if (updatePackageLIZJ.getDecompressFrom() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (updatePackageLIZJ.getDecompressFrom() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    str = "[Update Line]";
                } else if (!z2) {
                    return;
                } else {
                    str = "[Compress Line]";
                }
                if (updatePackageLIZJ.compressEnd) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("[recompress end]");
                    C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("[rename end]");
                    C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                c1551810qU7LIZIZ.LIZLLL = true;
                long jUptimeMillis = SystemClock.uptimeMillis();
                c1551810qU7LIZIZ.LJFF = jUptimeMillis - c1551810qU7LIZIZ.LJIILLIIL;
                C1552790qVh c1552790qVhLIZIZ = c1551810qU7LIZIZ.LIZIZ(updatePackageLIZJ, false);
                c1552790qVhLIZIZ.LIZIZ = true;
                long j = jUptimeMillis - c1552790qVhLIZIZ.LJII;
                c1551810qU7LIZIZ.LJI = j;
                c1551810qU7LIZIZ.LJIIIZ = j - c1551810qU7LIZIZ.LJII;
                C1551940qUK c1551940qUK = C797990VSb.LIZ;
                c1551940qUK.LIZIZ();
                GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
                if (geckoGlobalConfig != null) {
                    c1551810qU7LIZIZ.LJIILL = System.currentTimeMillis() - geckoGlobalConfig.getAppColdStartTime();
                }
                C1551780qU4.LJIIL(updatePackageLIZJ);
                if (!z2) {
                    C1551830qU9.LIZ(updatePackageLIZJ, true, false, null);
                }
            }
        });
        C1552210qUl.LIZIZ(C1550920qSg.class, new AbstractC1552800qVi() { // from class: X.0qUB
            @Override // X.AbstractC1552800qVi
            public final void LJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
                UpdatePackage updatePackageLIZJ = C1551820qU8.LIZJ(c1552250qUp);
                if (updatePackageLIZJ.compressEnd) {
                    C1553130qWF.LIZLLL("gecko-debug-tag", "[download end]");
                    C1551810qU7 c1551810qU7LIZIZ = C1551820qU8.LIZIZ(c1552250qUp, false);
                    c1551810qU7LIZIZ.LIZLLL = true;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    c1551810qU7LIZIZ.LJFF = jUptimeMillis - c1551810qU7LIZIZ.LJIILLIIL;
                    C1552790qVh c1552790qVhLIZIZ = c1551810qU7LIZIZ.LIZIZ(updatePackageLIZJ, false);
                    c1552790qVhLIZIZ.LIZIZ = true;
                    long j = jUptimeMillis - c1552790qVhLIZIZ.LJII;
                    c1551810qU7LIZIZ.LJI = j;
                    c1551810qU7LIZIZ.LJIIIZ = j - c1551810qU7LIZIZ.LJII;
                    C1551940qUK c1551940qUK = C797990VSb.LIZ;
                    c1551940qUK.LIZIZ();
                    GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
                    if (geckoGlobalConfig != null) {
                        c1551810qU7LIZIZ.LJIILL = System.currentTimeMillis() - geckoGlobalConfig.getAppColdStartTime();
                    }
                    C1551780qU4.LJIIL(updatePackageLIZJ);
                    C1551830qU9.LIZ(updatePackageLIZJ, true, false, null);
                }
            }
        });
    }

    public static <T> UpdatePackage LIZJ(InterfaceC1552320qUw<T> interfaceC1552320qUw) {
        try {
            return (UpdatePackage) interfaceC1552320qUw.getInputForType(C1550820qSW.class);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return (UpdatePackage) interfaceC1552320qUw.getInputForType(C1551600qTm.class);
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return (UpdatePackage) interfaceC1552320qUw.getInputForType(C1551150qT3.class);
            }
        }
    }

    public static <T> C1551810qU7 LIZIZ(InterfaceC1552320qUw<T> interfaceC1552320qUw, boolean z) {
        UpdatePackage updatePackageLIZJ = LIZJ(interfaceC1552320qUw);
        C1551810qU7 statisticModel = updatePackageLIZJ.getStatisticModel();
        if (statisticModel == null) {
            statisticModel = new C1551810qU7();
            statisticModel.LIZIZ = ((Integer) interfaceC1552320qUw.getPipelineData("req_type")).intValue();
            statisticModel.LIZJ = ((Integer) interfaceC1552320qUw.getPipelineData("sync_task_id")).intValue();
            Object pipelineData = interfaceC1552320qUw.getPipelineData("update_priority");
            if (pipelineData != null) {
                statisticModel.LIZ = ((Integer) pipelineData).intValue();
            }
            statisticModel.LJIILLIIL = SystemClock.uptimeMillis();
            long j = updatePackageLIZJ.durationPause;
            if (j > 0) {
                statisticModel.LJJ = j;
                updatePackageLIZJ.durationPause = 0L;
            }
            updatePackageLIZJ.setStatisticModel(statisticModel);
            if (!z) {
                statisticModel.LJ = true;
                C1553130qWF.LIZLLL("gecko-debug-tag", "UpdateListeners.getStatisticModel create by error");
            }
        }
        return statisticModel;
    }

    public static void LIZLLL(C1552250qUp c1552250qUp, int i, Throwable th) {
        UpdatePackage updatePackageLIZJ = LIZJ(c1552250qUp);
        C1551810qU7 c1551810qU7LIZIZ = LIZIZ(c1552250qUp, false);
        c1551810qU7LIZIZ.LJII = 0L;
        c1551810qU7LIZIZ.LJIIIZ = 0L;
        c1551810qU7LIZIZ.LJIIJ = 0L;
        c1551810qU7LIZIZ.LJIIJJI = 0L;
        c1551810qU7LIZIZ.LJIIL = 0L;
        c1551810qU7LIZIZ.LJIILIIL = 0L;
        c1551810qU7LIZIZ.LJJ = 0L;
        C1552790qVh c1552790qVhLIZIZ = c1551810qU7LIZIZ.LIZIZ(updatePackageLIZJ, false);
        c1552790qVhLIZIZ.LIZIZ = false;
        c1552790qVhLIZIZ.LIZJ = i;
        c1552790qVhLIZIZ.LIZLLL = th.getMessage();
        if (updatePackageLIZJ.isLastStep()) {
            c1551810qU7LIZIZ.LIZLLL = false;
            c1551810qU7LIZIZ.LJFF = SystemClock.uptimeMillis() - c1551810qU7LIZIZ.LJIILLIIL;
            C1551780qU4.LJIIL(updatePackageLIZJ);
            C1551830qU9.LIZ(updatePackageLIZJ, false, th instanceof C1551630qTp, th.getMessage());
        }
    }
}

package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS49S0300000_16;
import Y.ARunnableS93S0000000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21278918Pb {
    public static volatile boolean LIZIZ;
    public static final C21278918Pb LIZ = new C21278918Pb();
    public static volatile String LIZJ = "price_tag";

    public static void LJ() {
        if (LIZIZ || !(!((Boolean) C1865620yeG.LIZ.getValue()).booleanValue())) {
            return;
        }
        try {
            ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS93S0000000_16(8));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Pair LIZ(Context context, Aweme aweme, String str) {
        C1618390sDV.LIZ.getClass();
        if (!C1618390sDV.LIZ(context)) {
            return new Pair(Boolean.FALSE, 1);
        }
        C18PZ.LIZ.getClass();
        if (!C18PZ.LIZJ) {
            return new Pair(Boolean.FALSE, 2);
        }
        if (C18PZ.LJ) {
            return new Pair(Boolean.FALSE, 3);
        }
        C01GW c01gw = C21278818Pa.LIZ;
        if (C21278818Pa.LIZIZ != null) {
            if (!C21278818Pa.LJIIJ(aweme)) {
                return new Pair(Boolean.FALSE, 5);
            }
            if (LIZIZ) {
                return new Pair(Boolean.FALSE, 6);
            }
            C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(aweme, str);
            if (c21279318PfLIZJ != null) {
                C18PX c18px = c21279318PfLIZJ.LJIIIZ;
                if (c18px != null && c18px.LIZIZ()) {
                    return new Pair(Boolean.FALSE, 7);
                }
                if (c21279318PfLIZJ.LJIILIIL) {
                    return new Pair(Boolean.FALSE, 8);
                }
            }
            return new Pair(Boolean.TRUE, 0);
        }
        return new Pair(Boolean.FALSE, 4);
    }

    public static void LIZJ(Context context, Aweme aweme, String str, boolean z) {
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        BottomTabAbility bottomTabAbilityLIZ;
        C19EG c19egLIZIZ2;
        Object ability;
        LIZIZ(context, aweme, str, z, false);
        if (C276490AsZ.LIZ() && C21280918Pv.LIZ) {
            C21280918Pv.LIZ = false;
            Object obj = null;
            C21280918Pv.LIZIZ = null;
            try {
                if (C297720Bli.LIZ()) {
                    if (context != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) != null) {
                        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19egLIZIZ2, null), MainActivityScope.class);
                        if (c0qsjLIZJ != null) {
                            ability = c0qsjLIZJ.getAbility(BottomTabAbility.class);
                        } else {
                            ability = null;
                        }
                        if (ability instanceof BottomTabAbility) {
                            obj = ability;
                        }
                        bottomTabAbilityLIZ = (BottomTabAbility) obj;
                    } else {
                        return;
                    }
                } else if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null) {
                    bottomTabAbilityLIZ = C1769510w9F.LIZ(mainActivityScopeLIZJ);
                } else {
                    return;
                }
                if (bottomTabAbilityLIZ != null) {
                    try {
                        ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS116S0100000_16(bottomTabAbilityLIZ, 146));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static void LIZLLL(Context context, C21279318Pf c21279318Pf, boolean z, Bitmap bitmap) {
        boolean zSameAs;
        int iLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        BottomTabAbility bottomTabAbilityLIZ;
        Object ability;
        C18PX c18px = c21279318Pf.LJIIIZ;
        if (c18px != null) {
            Object obj = null;
            if (c18px.LIZLLL) {
                LIZIZ = true;
                if (c21279318Pf.LJIILJJIL) {
                    c21279318Pf.LJIILJJIL = false;
                }
                if (!c21279318Pf.LJIILL) {
                    c21279318Pf.LJIILL = true;
                }
                try {
                    c18px.LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZIZ = false;
                }
                if (LIZIZ) {
                    try {
                        DataCenter dataCenter = c21279318Pf.LJIIJ;
                        if (dataCenter != null) {
                            dataCenter.zQ2(Boolean.TRUE, "AD_ACTION_MOVE_OUT_DESC");
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                } else {
                    LIZ.getClass();
                    LJ();
                }
                if (z && C276490AsZ.LIZ()) {
                    if (bitmap != null) {
                        try {
                            zSameAs = bitmap.sameAs(C21280918Pv.LIZIZ);
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            zSameAs = false;
                        }
                    } else {
                        zSameAs = false;
                    }
                    if (context != null && bitmap != null) {
                        if (C21280918Pv.LIZ && zSameAs) {
                            return;
                        }
                        C21280918Pv.LIZ = true;
                        C21280918Pv.LIZIZ = bitmap;
                        try {
                            C443530HaJ c443530HaJ = new C443530HaJ(context.getResources(), bitmap);
                            c443530HaJ.LIZJ(C418440Gaw.LIZIZ(4));
                            c443530HaJ.LIZLLL.setAntiAlias(true);
                            c443530HaJ.invalidateSelf();
                            if ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            } else {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                            }
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                            layoutParams.gravity = 49;
                            try {
                                if (C297720Bli.LIZ()) {
                                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                                    if (c19egLIZIZ == null) {
                                        return;
                                    }
                                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19egLIZIZ, null), MainActivityScope.class);
                                    if (c0qsjLIZJ != null) {
                                        ability = c0qsjLIZJ.getAbility(BottomTabAbility.class);
                                    } else {
                                        ability = null;
                                    }
                                    if (ability instanceof BottomTabAbility) {
                                        obj = ability;
                                    }
                                    bottomTabAbilityLIZ = (BottomTabAbility) obj;
                                } else {
                                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
                                    if (c19egLIZIZ2 == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ2)) == null) {
                                        return;
                                    } else {
                                        bottomTabAbilityLIZ = C1769510w9F.LIZ(mainActivityScopeLIZJ);
                                    }
                                }
                                if (bottomTabAbilityLIZ == null) {
                                    return;
                                }
                                try {
                                    ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS49S0300000_16(bottomTabAbilityLIZ, c443530HaJ, layoutParams, 8));
                                    return;
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    return;
                                }
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                return;
                            }
                        } catch (Throwable th5) {
                            TryCatchGuardChecker.doCheck(th5);
                        }
                        TryCatchGuardChecker.doCheck(th5);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r6, com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            X.18Pf r3 = X.C21278818Pa.LIZJ(r7, r8)
            if (r3 == 0) goto L98
            r5 = 0
            X.C21278918Pb.LIZIZ = r5
            X.18PX r0 = r3.LJIIIZ     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L15
            r0.LIZ()     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L15:
            if (r9 == 0) goto L98
            r1 = 1
            r3.LJIILIIL = r1
            boolean r0 = X.C276490AsZ.LIZ()
            if (r0 == 0) goto L7e
            boolean r0 = X.C21280918Pv.LIZ
            if (r0 == 0) goto L7e
            boolean r0 = X.C297720Bli.LIZ()     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            if (r0 == 0) goto L54
            if (r6 == 0) goto L7e
            X.19EG r0 = X.C1388190mED.LIZIZ(r6)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L7e
            X.0Q7z r2 = X.C1558360qeg.LJI(r0, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L7a
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L7a
            X.0QSJ r1 = X.C687700QyG.LIZJ(r2, r1)     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L4e
            java.lang.Class<com.ss.android.ugc.aweme.base.activity.BottomTabAbility> r0 = com.ss.android.ugc.aweme.base.activity.BottomTabAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L7a
        L49:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.activity.BottomTabAbility     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L51
            goto L50
        L4e:
            r1 = r4
            goto L49
        L50:
            r4 = r1
        L51:
            com.ss.android.ugc.aweme.base.activity.BottomTabAbility r4 = (com.ss.android.ugc.aweme.base.activity.BottomTabAbility) r4     // Catch: java.lang.Throwable -> L7a
            goto L66
        L54:
            if (r6 == 0) goto L7e
            X.19EG r0 = X.C1388190mED.LIZIZ(r6)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.base.activity.BottomTabAbility r4 = X.C1769510w9F.LIZ(r0)     // Catch: java.lang.Throwable -> L7a
        L66:
            if (r4 == 0) goto L7e
            X.06Li r2 = X.ExecutorC1592406Li.LLILLJJLI     // Catch: java.lang.Throwable -> L75
            Y.ARunnableS116S0100000_16 r1 = new Y.ARunnableS116S0100000_16     // Catch: java.lang.Throwable -> L75
            r0 = 145(0x91, float:2.03E-43)
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L75
            r2.execute(r1)     // Catch: java.lang.Throwable -> L75
            goto L7e
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            if (r10 == 0) goto L98
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r3.LJIIJ     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L90
            java.lang.String r1 = "AD_ACTION_MOVE_IN_DESC"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            r2.zQ2(r0, r1)     // Catch: java.lang.Throwable -> L8c
            goto L90
        L8c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L90:
            X.18Pb r0 = X.C21278918Pb.LIZ
            r0.getClass()
            LJ()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21278918Pb.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, boolean):void");
    }
}

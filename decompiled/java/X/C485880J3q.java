package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0J3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485880J3q {
    public static C0J44 LJ;
    public static Context LJFF;
    public static RecyclerView LJI;
    public static C485820J3k LJIIIIZZ;
    public static final C485880J3q LIZ = new C485880J3q();
    public static final Thread LIZIZ = C786410Ut5.u3();
    public static final ConcurrentHashMap<Integer, List<C485910J3t>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class<?>, C485920J3u> LIZLLL = new ConcurrentHashMap<>();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(11));

    public static void LJI(View view) {
        MutableContextWrapper mutableContextWrapper;
        Context context = view.getContext();
        if ((context instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context) != null) {
            mutableContextWrapper.setBaseContext(LJFF);
        }
    }

    public final synchronized View LIZLLL(final int i, final boolean z) {
        boolean z2;
        View view;
        final C485910J3t c485910J3t;
        ConcurrentHashMap<Integer, List<C485910J3t>> concurrentHashMap = LIZJ;
        List<C485910J3t> list = concurrentHashMap.get(Integer.valueOf(i));
        View view2 = null;
        if (list != null) {
            boolean z3 = true;
            if (list.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                list = null;
            }
            if (list != null) {
                try {
                    c485910J3t = (C485910J3t) C19719612Di.LJJIJ(list);
                    if (c485910J3t != null) {
                        z3 = false;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("ViewHolderLayoutPreloadManager", e);
                    view = null;
                }
                if (z3) {
                    return null;
                }
                if (list.size() < c485910J3t.LIZJ) {
                    C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.0J3r
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ViewHolderLayoutPreloadManager@f011.getInternal$2$1");
                            try {
                                C485880J3q c485880J3q = C485880J3q.LIZ;
                                int i2 = i;
                                int i3 = c485910J3t.LIZJ;
                                boolean z4 = z;
                                c485880J3q.getClass();
                                C485880J3q.LIZIZ(i2, i3, z4);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ViewHolderLayoutPreloadManager@f011.getInternal$2$1");
                        }
                    });
                }
                if (c485910J3t.LIZJ == 0 && list.size() == 0) {
                    concurrentHashMap.remove(Integer.valueOf(i));
                }
                if (c485910J3t.LIZIZ) {
                    LockSupport.parkNanos(c485910J3t, 20000L);
                    view = c485910J3t.LIZ;
                } else {
                    view = c485910J3t.LIZ;
                }
                if (view != null) {
                    LIZ.getClass();
                    LJI(view);
                    view2 = view;
                }
            }
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r6, int r7, boolean r8) {
        /*
            X.0J3t r4 = new X.0J3t
            X.0J44 r3 = X.C485880J3q.LJ
            r4.<init>(r6, r3)
            r5 = 1
            r4.LIZIZ = r5
            r4.LIZJ = r7
            android.content.Context r2 = X.C485880J3q.LJFF
            if (r2 == 0) goto L25
            X.0J3q r0 = X.C485880J3q.LIZ
            r0.getClass()
            X.01GW r0 = X.C485880J3q.LJII
            java.lang.Object r1 = r0.getValue()
            com.bytedance.android.livesdkapi.host.IHostPerformanceOpt r1 = (com.bytedance.android.livesdkapi.host.IHostPerformanceOpt) r1
            androidx.recyclerview.widget.RecyclerView r0 = X.C485880J3q.LJI
            android.view.View r0 = r1.jH0(r2, r6, r0, r8)
            if (r0 != 0) goto L2d
        L25:
            if (r3 == 0) goto L54
            androidx.recyclerview.widget.RecyclerView r0 = X.C485880J3q.LJI
            android.view.View r0 = LIZ(r3, r6, r0, r8)
        L2d:
            r4.LIZ = r0
            r3 = 0
            r4.LIZIZ = r3
            android.content.Context r0 = X.C485880J3q.LJFF
            if (r0 == 0) goto L53
            android.view.View r1 = r4.LIZ
            if (r1 == 0) goto L42
            X.0J3q r0 = X.C485880J3q.LIZ
            r0.getClass()
            LJI(r1)
        L42:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.List<X.0J3t>> r2 = X.C485880J3q.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L56
            r0.add(r4)
        L53:
            return
        L54:
            r0 = 0
            goto L2d
        L56:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.0J3t[] r0 = new X.C485910J3t[r5]
            r0[r3] = r4
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            r2.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C485880J3q.LIZIZ(int, int, boolean):void");
    }

    public static void LJ(final int i, final int i2, final int i3) {
        if (LJFF != null && LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableViewHolderLayoutPreload()) {
            C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.0J3p
                public final void LIZ() {
                    if (1 > i2) {
                        return;
                    }
                    int i4 = 1;
                    while (true) {
                        List<C485910J3t> list = C485880J3q.LIZJ.get(Integer.valueOf(i));
                        if (list != null) {
                            Integer numValueOf = Integer.valueOf(list.size());
                            if (numValueOf.intValue() >= i2) {
                                numValueOf.intValue();
                                return;
                            }
                        }
                        C485880J3q c485880J3q = C485880J3q.LIZ;
                        int i5 = i;
                        int i6 = i3;
                        c485880J3q.getClass();
                        C485880J3q.LIZIZ(i5, i6, false);
                        LockSupport.unpark(C485880J3q.LIZIZ);
                        if (i4 == i2) {
                            return;
                        } else {
                            i4++;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ViewHolderLayoutPreloadManager@f011.preload$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ViewHolderLayoutPreloadManager@f011.preload$1");
                }
            });
        }
    }

    public final View LIZJ(int i, ViewGroup viewGroup, boolean z) {
        View viewLIZ;
        if (LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableViewHolderLayoutPreload()) {
            viewLIZ = LIZLLL(i, false);
            if (viewLIZ != null) {
                if (z && viewGroup != null) {
                    viewGroup.addView(viewLIZ);
                }
            } else {
                C0J44 c0j44 = LJ;
                if (c0j44 != null) {
                    viewLIZ = LIZ(c0j44, i, viewGroup, z);
                    if (viewLIZ == null) {
                    }
                }
                if (viewGroup != null || (viewLIZ = C500260Jjc.LJIILL(i, viewGroup, z)) == null) {
                    return C786410Ut5.Td(C786410Ut5.ne(C497740JfY.LJII()), i, viewGroup, z);
                }
            }
        } else {
            C0J44 c0j442 = LJ;
            if (c0j442 != null) {
                viewLIZ = LIZ(c0j442, i, viewGroup, z);
                if (viewLIZ == null) {
                }
            }
            if (viewGroup != null) {
            }
            return C786410Ut5.Td(C786410Ut5.ne(C497740JfY.LJII()), i, viewGroup, z);
        }
        return viewLIZ;
    }

    public static View LIZ(C0J44 c0j44, int i, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(c0j44);
        }
        return c0j44.inflate(i, viewGroup, z);
    }

    public static void LJFF(Class cls, final int i, final int i2, final int i3) {
        if (LJFF == null) {
            return;
        }
        LIZLLL.put(cls, new C485920J3u(i));
        if (LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableViewHolderLayoutPreload()) {
            C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.0J3o
                public final /* synthetic */ boolean LLILZ = false;

                public final void LIZ() {
                    if (1 > i2) {
                        return;
                    }
                    int i4 = 1;
                    while (true) {
                        List<C485910J3t> list = C485880J3q.LIZJ.get(Integer.valueOf(i));
                        if (list != null) {
                            Integer numValueOf = Integer.valueOf(list.size());
                            if (numValueOf.intValue() >= i2) {
                                numValueOf.intValue();
                                return;
                            }
                        }
                        C485880J3q c485880J3q = C485880J3q.LIZ;
                        int i5 = i;
                        int i6 = i3;
                        boolean z = this.LLILZ;
                        c485880J3q.getClass();
                        C485880J3q.LIZIZ(i5, i6, z);
                        LockSupport.unpark(C485880J3q.LIZIZ);
                        if (i4 == i2) {
                            return;
                        } else {
                            i4++;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ViewHolderLayoutPreloadManager@f011.preload$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ViewHolderLayoutPreloadManager@f011.preload$2");
                }
            });
        }
    }
}

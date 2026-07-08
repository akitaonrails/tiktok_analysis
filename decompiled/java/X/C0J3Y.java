package X;

import Y.ARunnableS18S0101000_7;
import Y.ARunnableS2S0001000_7;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTextViewOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadOPTSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3Y {
    public static C0J45 LJI;
    public static C0J45 LJII;
    public static Context LJIIIIZZ;
    public static boolean LJIIIZ;
    public static C485820J3k LJIIJ;
    public static C0J4A LJIIJJI;
    public static C19MB LJIILL;
    public static C19MB LJIILLIIL;
    public static boolean LJIJ;
    public static boolean LJIJI;
    public static final C0J3Y LIZ = new C0J3Y();
    public static long LIZIZ = -1;
    public static final Thread LIZJ = C786410Ut5.u3();
    public static final SparseArray<C485750J3d> LIZLLL = new SparseArray<>();
    public static final ConcurrentHashMap<Integer, C0J3X> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0J3X>> LJFF = new ConcurrentHashMap<>();
    public static EnumC485780J3g LJIIL = EnumC485780J3g.UN_SET;
    public static final ConcurrentHashMap<EnumC485780J3g, ConcurrentHashMap<Integer, C0J3X>> LJIILIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<EnumC485780J3g, ConcurrentHashMap<Integer, C0J3X>> LJIILJJIL = new ConcurrentHashMap<>();
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(339));
    public static final C01GW LJIJJ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(338));
    public static final List<String> LJIJJLI = C1697810uHb.LJIIJJI("ttlive_broadcast_count_down_widget_opt", "ttlive_fragment_live_broadcast", "ttlive_widget_internet_speed_monitor", "ttlive_widget_anchor_toolbar");

    public static void LJIJ() {
        LJI = null;
        LJII = null;
        LJIIJJI = null;
        for (Map.Entry<Integer, C0J3X> entry : LJ.entrySet()) {
            C0J3Z c0j3z = C0J3Z.LIZ;
            C485730J3b c485730J3b = entry.getValue().LIZLLL;
            c485730J3b.getClass();
            c485730J3b.LJII = SystemClock.elapsedRealtime() - c485730J3b.LJ;
            c485730J3b.LJFF = -1L;
            c0j3z.LIZJ(c485730J3b);
        }
        Iterator<Map.Entry<Integer, CopyOnWriteArrayList<C0J3X>>> it2 = LJFF.entrySet().iterator();
        while (it2.hasNext()) {
            for (C0J3X c0j3x : it2.next().getValue()) {
                C0J3Z c0j3z2 = C0J3Z.LIZ;
                C485730J3b c485730J3b2 = c0j3x.LIZLLL;
                c485730J3b2.getClass();
                c485730J3b2.LJII = SystemClock.elapsedRealtime() - c485730J3b2.LJ;
                c485730J3b2.LJFF = -1L;
                c0j3z2.LIZJ(c485730J3b2);
            }
        }
        C0J3Z.LIZ.LIZIZ();
        LJIILIIL.clear();
        LJIILJJIL.clear();
        LIZIZ = -1L;
        LJIIIZ = false;
        LJ.clear();
        LJFF.clear();
        C485820J3k c485820J3k = LJIIJ;
        if (c485820J3k != null) {
            c485820J3k.setBaseContext(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
        }
        LiveWidgetProvider.Companion.getInstance().setEnableWidgetCrossContextReuse(false);
        LJIIIIZZ = null;
        LJIJ = false;
        C485880J3q.LIZ.getClass();
        C485880J3q.LJ = null;
        C485880J3q.LIZLLL.clear();
        C485880J3q.LIZJ.clear();
        C485880J3q.LJFF = null;
        C485880J3q.LJI = null;
        C485820J3k c485820J3k2 = C485880J3q.LJIIIIZZ;
        if (c485820J3k2 != null) {
            c485820J3k2.setBaseContext(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
        }
        C485950J3x.LIZIZ.clear();
        LJIIL = EnumC485780J3g.UN_SET;
    }

    public static void LIZIZ() {
        for (Map.Entry<EnumC485780J3g, ConcurrentHashMap<Integer, C0J3X>> entry : LJIILIIL.entrySet()) {
            if (LJIIL.isAtLeast(entry.getKey())) {
                for (Map.Entry<Integer, C0J3X> entry2 : entry.getValue().entrySet()) {
                    C0J3Y c0j3y = LIZ;
                    int iIntValue = entry2.getKey().intValue();
                    ViewGroup viewGroup = entry2.getValue().LIZIZ;
                    C485730J3b c485730J3b = entry2.getValue().LIZLLL;
                    boolean z = entry2.getValue().LJFF;
                    c0j3y.getClass();
                    LIZJ(iIntValue, viewGroup, c485730J3b, z);
                }
                entry.getValue().clear();
            }
        }
        for (Map.Entry<EnumC485780J3g, ConcurrentHashMap<Integer, C0J3X>> entry3 : LJIILJJIL.entrySet()) {
            if (LJIIL.isAtLeast(entry3.getKey())) {
                for (Map.Entry<Integer, C0J3X> entry4 : entry3.getValue().entrySet()) {
                    LIZ.LJ(entry4.getKey().intValue(), entry4.getValue().LJ, entry4.getValue().LIZIZ, entry4.getValue().LIZLLL, entry4.getValue().LJFF);
                }
                entry3.getValue().clear();
            }
        }
    }

    public static boolean LJIIL() {
        return ((Boolean) LJIJJ.getValue()).booleanValue();
    }

    public static View LJII(int i) {
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0J3X c0j3xRemove = LJ.remove(Integer.valueOf(i));
        if (c0j3xRemove != null) {
            c0j3xRemove.LJII = true;
            if (c0j3xRemove.LJIIIIZZ) {
                LockSupport.parkNanos(c0j3xRemove, 20000L);
                view = c0j3xRemove.LJI;
            } else {
                view = c0j3xRemove.LJI;
            }
        } else {
            view = null;
        }
        C0J3Z.LIZ.LIZJ(LJIJJ(c0j3xRemove, i, jElapsedRealtime));
        return view;
    }

    public static View LJIIIIZZ(int i) {
        if (LiveLayoutPreloadSetting.INSTANCE.enable()) {
            return LJII(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LJIIIZ(X.C0J3X r10) throws java.lang.Throwable {
        /*
            java.lang.String r6 = "LayoutPreloadManager"
            X.0J3b r1 = r10.LIZLLL
            boolean r0 = X.C0J3Y.LJIJ
            r1.LJIIJJI = r0
            boolean r0 = X.C0J3Y.LJIJI
            r1.LJIIJ = r0
            r9 = 0
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r10.LJFF     // Catch: java.lang.Throwable -> L8e
            r7 = 0
            if (r0 != 0) goto L5e
            X.0J3b r1 = r10.LIZLLL     // Catch: java.lang.Throwable -> L3c
            X.0J3c r0 = X.EnumC485740J3c.X2C     // Catch: java.lang.Throwable -> L3c
            r1.LIZJ = r0     // Catch: java.lang.Throwable -> L3c
            X.0J45 r0 = r10.LIZJ     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L5e
            android.content.Context r5 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L5e
            X.0J3Y r0 = X.C0J3Y.LIZ     // Catch: java.lang.Throwable -> L3c
            r0.getClass()     // Catch: java.lang.Throwable -> L3c
            X.01GW r0 = X.C0J3Y.LJIIZILJ     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L3c
            com.bytedance.android.livesdkapi.host.IHostPerformanceOpt r2 = (com.bytedance.android.livesdkapi.host.IHostPerformanceOpt) r2     // Catch: java.lang.Throwable -> L3c
            int r1 = r10.LIZ     // Catch: java.lang.Throwable -> L3c
            android.view.ViewGroup r0 = r10.LIZIZ     // Catch: java.lang.Throwable -> L3c
            android.view.View r8 = r2.jH0(r5, r1, r0, r7)     // Catch: java.lang.Throwable -> L3c
            goto L5f
        L3c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "x2c inflate error "
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            X.0J3b r0 = r10.LIZLLL     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L8e
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8e
            X.C20441214yg.LJFF(r6, r0, r2)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = LJIIL()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L5e
            throw r2     // Catch: java.lang.Throwable -> L8e
        L5e:
            r8 = r9
        L5f:
            if (r8 != 0) goto L89
            X.0J3b r1 = r10.LIZLLL     // Catch: java.lang.Throwable -> L91
            X.0J3c r0 = X.EnumC485740J3c.SYSTEM_LAYOUT_INFLATER     // Catch: java.lang.Throwable -> L91
            r1.LIZJ = r0     // Catch: java.lang.Throwable -> L91
            X.0J4A r0 = X.C0J3Y.LJIIJJI     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L6c
            goto L6e
        L6c:
            r0 = 0
            goto L6f
        L6e:
            r0 = 1
        L6f:
            if (r0 == 0) goto L75
            X.0J3c r0 = X.EnumC485740J3c.ASYNC_INFLATER     // Catch: java.lang.Throwable -> L91
            r1.LIZJ = r0     // Catch: java.lang.Throwable -> L91
        L75:
            X.0J45 r5 = r10.LIZJ     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L8a
            int r2 = r10.LIZ     // Catch: java.lang.Throwable -> L91
            android.view.ViewGroup r1 = r10.LIZIZ     // Catch: java.lang.Throwable -> L91
            boolean r0 = com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager.LJIILIIL     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L84
            X.C0J43.LIZIZ(r5)     // Catch: java.lang.Throwable -> L91
        L84:
            android.view.View r9 = r5.inflate(r2, r1, r7)     // Catch: java.lang.Throwable -> L91
            goto L8a
        L89:
            r9 = r8
        L8a:
            LJIIJ(r10, r3)     // Catch: java.lang.Throwable -> L8e
            return r9
        L8e:
            r2 = move-exception
            r8 = r9
            goto L92
        L91:
            r2 = move-exception
        L92:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "inflate error "
            r1.append(r0)
            X.0J3b r0 = r10.LIZLLL
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJFF(r6, r0, r2)
            boolean r0 = LJIIL()
            if (r0 != 0) goto Lb3
            return r8
        Lb3:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J3Y.LJIIIZ(X.0J3X):android.view.View");
    }

    public static void LJIIJJI(Context context) {
        String simpleName;
        boolean zLJFF;
        C0J44 c0j44;
        Context mutableContextWrapper;
        if (C464660IKa.LIZ()) {
            zLJFF = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isLivePlayActivity(context);
        } else {
            if (context != null) {
                simpleName = context.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            zLJFF = Intrinsics.LJFF(simpleName, "LivePlayActivity");
        }
        LJIIIZ = zLJFF;
        LiveWidgetProvider.Companion companion = LiveWidgetProvider.Companion;
        boolean z = true;
        if (companion.getInstance().isQuickReturnReuseEnabled()) {
            if (LJIIIZ) {
                companion.getInstance().setEnableWidgetCrossContextReuse(true);
                companion.getInstance().cancelDelayedClear();
            } else {
                companion.getInstance().clearAll();
            }
        }
        if (!LiveLayoutPreloadThreadOPTSetting.threadOptimize(LJIIIZ) && LJIIIZ) {
            z = false;
        }
        LJIJ = z;
        LJIJI = LJIIIZ;
        LJIIIIZZ = context;
        if (context != null) {
            C1834150xpV.LIZ(context, false);
            if (LJIIIZ && companion.getInstance().isQuickReturnReuseEnabled()) {
                C485820J3k c485820J3k = LJIIJ;
                if (c485820J3k == null) {
                    LJIIJ = new C485820J3k(context);
                } else {
                    c485820J3k.setBaseContext(context);
                }
                mutableContextWrapper = LJIIJ;
            } else {
                LJIIJ = null;
                mutableContextWrapper = new MutableContextWrapper(context);
            }
            LJI = new C0J45(mutableContextWrapper);
            LJII = new C0J45(mutableContextWrapper);
            if (LiveTextViewOptSetting.enable()) {
                C0J45 c0j45 = LJI;
                if (c0j45 != null) {
                    C786410Ut5.Wd(c0j45, new C1091720eW2());
                }
                C0J45 c0j452 = LJII;
                if (c0j452 != null) {
                    C786410Ut5.Wd(c0j452, new C1091720eW2());
                }
            }
            if (!LJIIIZ) {
                Iterator<T> it2 = LJ.values().iterator();
                while (it2.hasNext()) {
                    View view = ((C0J3X) it2.next()).LJI;
                    if (view != null) {
                        LIZ.getClass();
                        LJIJI(view);
                    }
                }
            }
            if (LJIJ) {
                C0J4A c0j4a = new C0J4A(context, LiveLayoutPreloadThreadPriority.INSTANCE.getPriority());
                if (LiveTextViewOptSetting.enable()) {
                    c0j4a.LIZLLL(new C1091720eW2());
                }
                LJIIJJI = c0j4a;
            }
        } else {
            LJ.clear();
        }
        C485880J3q.LIZ.getClass();
        C485880J3q.LJFF = context;
        if (context != null) {
            LiveWidgetProvider.Companion companion2 = LiveWidgetProvider.Companion;
            if (companion2.getInstance().isQuickReturnReuseEnabled() && companion2.getInstance().getEnableWidgetCrossContextReuse()) {
                C485820J3k c485820J3k2 = C485880J3q.LJIIIIZZ;
                if (c485820J3k2 == null) {
                    C485880J3q.LJIIIIZZ = new C485820J3k(context);
                } else {
                    c485820J3k2.setBaseContext(context);
                }
            } else {
                C485880J3q.LJIIIIZZ = null;
            }
            RecyclerView recyclerView = C485880J3q.LJI;
            if (recyclerView == null) {
                Context mutableContextWrapper2 = C485880J3q.LJIIIIZZ;
                if (mutableContextWrapper2 == null) {
                    mutableContextWrapper2 = new MutableContextWrapper(context);
                }
                RecyclerView recyclerView2 = new RecyclerView(mutableContextWrapper2);
                recyclerView2.setLayoutManager(new LinearLayoutManager(mutableContextWrapper2));
                C485880J3q.LJI = recyclerView2;
            } else {
                C485880J3q.LJI(recyclerView);
            }
            Context mutableContextWrapper3 = C485880J3q.LJIIIIZZ;
            if (mutableContextWrapper3 == null) {
                mutableContextWrapper3 = new MutableContextWrapper(context);
            }
            C485880J3q.LJ = new C0J44(mutableContextWrapper3);
            if (LiveTextViewOptSetting.enable() && (c0j44 = C485880J3q.LJ) != null) {
                LayoutInflater.Factory2 c1091720eW2 = new C1091720eW2();
                try {
                    if (NxRewordManager.LJIILIIL) {
                        LayoutInflater.Factory2 factory2 = c0j44.getFactory2();
                        if (!(c0j44 instanceof C0J4J)) {
                            Field field = C0J43.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("layoutInflateLancet setFactory2 : ");
                            sbLIZ.append(c1091720eW2);
                            sbLIZ.append("----nxFactory: ");
                            sbLIZ.append(factory2);
                            sbLIZ.append(" inflate : ");
                            sbLIZ.append(c0j44);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if (factory2 instanceof C0J4G) {
                                ((C0J4G) factory2).LIZIZ(c1091720eW2);
                                return;
                            }
                            c1091720eW2 = new C0J4G(null, c1091720eW2);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    Field field2 = C0J43.LIZ;
                    sbLIZ2.append("NxReword/inflateLancet");
                    sbLIZ2.append("layoutInflateLancet setFactory2: ");
                    sbLIZ2.append(e.toString());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
                c0j44.setFactory2(c1091720eW2);
                return;
            }
            return;
        }
        C485880J3q.LIZLLL.clear();
        C485880J3q.LIZJ.clear();
        C485880J3q.LJI = null;
    }

    public static void LJIJI(View view) {
        MutableContextWrapper mutableContextWrapper;
        Context context = view.getContext();
        if ((context instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context) != null) {
            mutableContextWrapper.setBaseContext(LJIIIIZZ);
        }
    }

    public final synchronized void LIZ(C0J3X c0j3x) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0J3X>> concurrentHashMap = LJFF;
        CopyOnWriteArrayList<C0J3X> copyOnWriteArrayList = concurrentHashMap.get(Integer.valueOf(c0j3x.LIZ));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(c0j3x);
        } else {
            Integer numValueOf = Integer.valueOf(c0j3x.LIZ);
            CopyOnWriteArrayList<C0J3X> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList2.add(c0j3x);
            concurrentHashMap.put(numValueOf, copyOnWriteArrayList2);
        }
    }

    public final synchronized View LJI(int i) {
        View view;
        boolean z;
        View view2;
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0J3X>> concurrentHashMap = LJFF;
        CopyOnWriteArrayList<C0J3X> copyOnWriteArrayList = concurrentHashMap.get(Integer.valueOf(i));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        view = null;
        if (copyOnWriteArrayList != null) {
            if (copyOnWriteArrayList.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                copyOnWriteArrayList = null;
            }
            if (copyOnWriteArrayList != null) {
                try {
                    C0J3X c0j3x = (C0J3X) C19719612Di.LJJIJ(copyOnWriteArrayList);
                    if (copyOnWriteArrayList.size() == 0) {
                        concurrentHashMap.remove(Integer.valueOf(i));
                    }
                    if (c0j3x != null) {
                        if (c0j3x.LJIIIIZZ) {
                            LockSupport.parkNanos(c0j3x, 20000L);
                            view2 = c0j3x.LJI;
                            if (view2 != null) {
                                LIZ.getClass();
                                LJIJI(view2);
                                view = view2;
                            }
                        } else {
                            view2 = c0j3x.LJI;
                            if (view2 != null) {
                                LIZ.getClass();
                                LJIJI(view2);
                                view = view2;
                            }
                        }
                    }
                    LIZ.getClass();
                    C0J3Z.LIZ.LIZJ(LJIJJ(c0j3x, i, jElapsedRealtime));
                    if (view != null && LJIIL()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("get success name = ");
                        sbLIZ.append(c0j3x.LIZLLL.LIZ);
                        C20441214yg.LJ("LayoutPreloadManager", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("LayoutPreloadManager", e);
                }
            }
        }
        return view;
    }

    public static final void LIZLLL(int i, C0J3X c0j3x) {
        c0j3x.LJIIIIZZ = false;
        if (LJIIIIZZ != null) {
            View view = c0j3x.LJI;
            if (view != null) {
                LIZ.getClass();
                LJIJI(view);
            }
        } else {
            LJ.remove(Integer.valueOf(i));
        }
        LockSupport.unpark(LIZJ);
        if (c0j3x.LJII) {
            LJ.remove(Integer.valueOf(i));
        }
    }

    public static final void LJIIJ(C0J3X c0j3x, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C485730J3b c485730J3b = c0j3x.LIZLLL;
        c485730J3b.LIZLLL = jElapsedRealtime - j;
        c485730J3b.LJ = jElapsedRealtime;
        LIZ.getClass();
        if (LJIIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inflate success name = ");
            sbLIZ.append(c0j3x.LIZLLL.LIZ);
            C20441214yg.LJ("LayoutPreloadManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static C485730J3b LJIJJ(C0J3X c0j3x, int i, long j) {
        C485730J3b c485730J3b = null;
        if (c0j3x != null) {
            c485730J3b = c0j3x.LIZLLL;
        }
        if (c485730J3b == null) {
            C485750J3d c485750J3d = LIZLLL.get(i);
            if (c485750J3d != null) {
                C485730J3b c485730J3b2 = new C485730J3b(c485750J3d.LIZ, c485750J3d.LIZIZ);
                c485730J3b2.LIZLLL = -999L;
                c485730J3b2.LJ = -999L;
                c485730J3b2.LJI = -999L;
                c485730J3b2.LJFF = -999L;
                return c485730J3b2;
            }
            return c485730J3b;
        }
        if (c0j3x != null && c0j3x.LJI != null) {
            c485730J3b.LJFF = SystemClock.elapsedRealtime() - j;
            c485730J3b.LJII = SystemClock.elapsedRealtime() - c485730J3b.LJ;
            if (LIZIZ <= 0) {
                return c485730J3b;
            }
            c485730J3b.LJI = SystemClock.elapsedRealtime() - LIZIZ;
            return c485730J3b;
        }
        c485730J3b.LIZLLL = -999L;
        c485730J3b.LJ = -999L;
        c485730J3b.LJI = -999L;
        c485730J3b.LJFF = -999L;
        return c485730J3b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(int i, View view, C485730J3b c485730J3b) {
        C0J3X c0j3x = new C0J3X(i, (ViewGroup) null, (C0J45) (0 == true ? 1 : 0), c485730J3b, false, 48);
        c0j3x.LJI = view;
        LIZ(c0j3x);
    }

    public static void LIZJ(int i, ViewGroup viewGroup, C485730J3b c485730J3b, boolean z) {
        ConcurrentHashMap<Integer, C0J3X> concurrentHashMap = LJ;
        if (!concurrentHashMap.containsKey(Integer.valueOf(i))) {
            C0J3X c0j3x = new C0J3X(i, viewGroup, LJI, c485730J3b, z, 16);
            concurrentHashMap.put(Integer.valueOf(i), c0j3x);
            if (LJIIJJI != null) {
                c0j3x.LJIIIIZZ = true;
                C0J4A c0j4a = LJIIJJI;
                if (c0j4a != null) {
                    ARunnableS18S0101000_7 aRunnableS18S0101000_7 = new ARunnableS18S0101000_7(i, c0j3x, 4);
                    C0J40 c0j40LIZIZ = c0j4a.LIZJ.LLILLL.LIZIZ();
                    if (c0j40LIZIZ == null) {
                        c0j40LIZIZ = new C0J40();
                    }
                    c0j40LIZIZ.LJIIIIZZ = aRunnableS18S0101000_7;
                    c0j4a.LIZJ.LIZJ(c0j40LIZIZ);
                }
            } else {
                C823050WQl.LIZLLL().submit(new ARunnableS2S0001000_7(i, 1));
            }
        }
        LIZLLL.put(i, new C485750J3d(c485730J3b.LIZ, c485730J3b.LIZIZ));
    }

    public static void LJIILIIL(int i, RecyclerView recyclerView, C485730J3b c485730J3b, EnumC485780J3g enumC485780J3g, boolean z) {
        if (LiveLayoutPreloadSetting.INSTANCE.enable() && LJIIIIZZ != null) {
            if (!LJIIL.isAtLeast(enumC485780J3g) && LJIJI) {
                if (LJ.containsKey(Integer.valueOf(i))) {
                    return;
                }
                ConcurrentHashMap<EnumC485780J3g, ConcurrentHashMap<Integer, C0J3X>> concurrentHashMap = LJIILIIL;
                ConcurrentHashMap<Integer, C0J3X> concurrentHashMap2 = concurrentHashMap.get(enumC485780J3g);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap<>();
                    concurrentHashMap.put(enumC485780J3g, concurrentHashMap2);
                }
                if (!concurrentHashMap2.containsKey(Integer.valueOf(i))) {
                    concurrentHashMap2.put(Integer.valueOf(i), new C0J3X(i, recyclerView, LJI, c485730J3b, z, 16));
                    return;
                }
                return;
            }
            LIZJ(i, recyclerView, c485730J3b, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final int r18, final int r19, final android.view.ViewGroup r20, final X.C485730J3b r21, final boolean r22) {
        /*
            r17 = this;
            X.0J4A r0 = X.C0J3Y.LJIIJJI
            r3 = 1
            r10 = r22
            r9 = r21
            r7 = r20
            r12 = r19
            r6 = r18
            if (r0 == 0) goto L71
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 > r12) goto L36
            r2 = 1
        L17:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<X.0J3X>> r1 = X.C0J3Y.LJFF
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            if (r0 == 0) goto L59
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < r12) goto L59
            r1.intValue()
        L36:
            X.0J4A r3 = X.C0J3Y.LJIIJJI
            if (r3 == 0) goto L58
            Y.ARunnableS18S0101000_7 r2 = new Y.ARunnableS18S0101000_7
            r0 = 5
            r2.<init>(r6, r4, r0)
            X.18JT r0 = r3.LIZJ
            X.0eME<X.0J40> r0 = r0.LLILLL
            java.lang.Object r1 = r0.LIZIZ()
            X.0J40 r1 = (X.C0J40) r1
            if (r1 != 0) goto L51
            X.0J40 r1 = new X.0J40
            r1.<init>()
        L51:
            r1.LJIIIIZZ = r2
            X.18JT r0 = r3.LIZJ
            r0.LIZJ(r1)
        L58:
            return
        L59:
            X.0J3X r5 = new X.0J3X
            X.0J45 r8 = X.C0J3Y.LJI
            r11 = 16
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r5.LJIIIIZZ = r3
            r0 = r17
            r0.LIZ(r5)
            r4.add(r5)
            if (r2 == r12) goto L36
            int r2 = r2 + 1
            goto L17
        L71:
            java.util.concurrent.ExecutorService r0 = X.C823050WQl.LIZLLL()
            X.0J3W r11 = new X.0J3W
            r13 = r6
            r14 = r7
            r15 = r9
            r16 = r10
            r11.<init>()
            r0.submit(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J3Y.LJ(int, int, android.view.ViewGroup, X.0J3b, boolean):void");
    }

    public final void LJIILL(int i, RecyclerView recyclerView, int i2, C485730J3b c485730J3b, EnumC485780J3g enumC485780J3g, boolean z) {
        if (LJIIIIZZ == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() > 0 && 1 != 0) {
            numValueOf.intValue();
            if (!LJIIL.isAtLeast(enumC485780J3g) && LJIJI) {
                CopyOnWriteArrayList<C0J3X> copyOnWriteArrayList = LJFF.get(Integer.valueOf(i));
                if (copyOnWriteArrayList != null) {
                    Integer numValueOf2 = Integer.valueOf(copyOnWriteArrayList.size());
                    if (numValueOf2.intValue() >= i2) {
                        numValueOf2.intValue();
                        return;
                    }
                }
                ConcurrentHashMap<EnumC485780J3g, ConcurrentHashMap<Integer, C0J3X>> concurrentHashMap = LJIILJJIL;
                ConcurrentHashMap<Integer, C0J3X> concurrentHashMap2 = concurrentHashMap.get(enumC485780J3g);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap<>();
                    concurrentHashMap.put(enumC485780J3g, concurrentHashMap2);
                }
                if (!concurrentHashMap2.containsKey(Integer.valueOf(i))) {
                    concurrentHashMap2.put(Integer.valueOf(i), new C0J3X(i, recyclerView, LJI, c485730J3b, i2, z));
                    return;
                }
                return;
            }
            LJ(i, i2, recyclerView, c485730J3b, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LJFF(X.C0J3Y r3, int r4, android.view.ViewGroup r5, boolean r6, android.content.Context r7, boolean r8, int r9) {
        /*
            r0 = r9 & 4
            r2 = 0
            if (r0 == 0) goto L6
            r6 = 0
        L6:
            r1 = r9 & 8
            r0 = 0
            if (r1 == 0) goto Lc
            r7 = r0
        Lc:
            r0 = r9 & 16
            if (r0 == 0) goto L11
            r8 = 0
        L11:
            r0 = r9 & 32
            if (r0 == 0) goto L16
            r2 = 1
        L16:
            r3.getClass()
            if (r2 == 0) goto L35
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAppContext r0 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r0
            boolean r0 = r0.isOffline()
            if (r0 == 0) goto L35
            if (r5 != 0) goto L35
            if (r7 != 0) goto L35
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "parent and context cannot all be null values, cause on low-end machines we did not initialize mainThreadLayoutInflater;  There maybe have exception for 'Failed to resolve attribute at xx' "
            r1.<init>(r0)
            throw r1
        L35:
            com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L4b
            android.view.View r0 = LJII(r4)
            if (r0 == 0) goto L5d
            if (r6 == 0) goto L4a
            if (r5 == 0) goto L4a
            r5.addView(r0)
        L4a:
            return r0
        L4b:
            if (r8 != 0) goto L70
            X.0J45 r1 = X.C0J3Y.LJII
            if (r1 == 0) goto L70
            boolean r0 = com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager.LJIILIIL
            if (r0 == 0) goto L58
            X.C0J43.LIZIZ(r1)
        L58:
            android.view.View r0 = r1.inflate(r4, r5, r6)
            goto L6e
        L5d:
            if (r8 != 0) goto L70
            X.0J45 r1 = X.C0J3Y.LJII
            if (r1 == 0) goto L70
            boolean r0 = com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager.LJIILIIL
            if (r0 == 0) goto L6a
            X.C0J43.LIZIZ(r1)
        L6a:
            android.view.View r0 = r1.inflate(r4, r5, r6)
        L6e:
            if (r0 != 0) goto L4a
        L70:
            if (r5 == 0) goto L78
            android.view.View r0 = X.C500260Jjc.LJIILL(r4, r5, r6)
            if (r0 != 0) goto L4a
        L78:
            if (r7 != 0) goto L7e
            android.content.Context r7 = X.C497740JfY.LJII()
        L7e:
            android.view.LayoutInflater r0 = X.C786410Ut5.ne(r7)
            android.view.View r0 = X.C786410Ut5.Td(r0, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J3Y.LJFF(X.0J3Y, int, android.view.ViewGroup, boolean, android.content.Context, boolean, int):android.view.View");
    }
}

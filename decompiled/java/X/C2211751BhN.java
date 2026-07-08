package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211751BhN {
    public static long LIZ;
    public static final ConcurrentHashMap<Integer, Set<C2211761BhO>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, Map<String, List<C2211821BhU>>> LIZJ = new ConcurrentHashMap<>();
    public static final HashSet<C2211821BhU> LIZLLL = new HashSet<>();
    public static final C01GW LJ = C452501pT.LIZIZ(new C2211891Bhb());

    public static final void LIZLLL() {
        LJ(LJIIIZ(), true);
    }

    public static int LJIIIZ() {
        Activity activity;
        WeakReference<Activity> weakReference = C2211501Bgy.LLILZIL;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return 0;
        }
        return activity.hashCode();
    }

    public static void LIZIZ(ViewGroup viewGroup) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            for (Context context = viewGroup.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    Iterator it2 = LJI(LJIIIZ()).entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Iterator it3 = ((List) entry.getValue()).iterator();
                        while (it3.hasNext()) {
                            Integer num = ((C2211821BhU) it3.next()).LJII;
                            int iHashCode = viewGroup.hashCode();
                            if (num != null && num.intValue() == iHashCode) {
                                it3.remove();
                            }
                        }
                        if (((List) entry.getValue()).size() == 0) {
                            it2.remove();
                        }
                    }
                    return;
                }
                if (!(context instanceof ContextWrapper)) {
                    return;
                }
            }
            return;
        }
        throw new Exception("clearCustomGroup must run on the main thread");
    }

    public static Map LJI(int i) {
        ConcurrentHashMap<Integer, Map<String, List<C2211821BhU>>> concurrentHashMap = LIZJ;
        Map<String, List<C2211821BhU>> map = concurrentHashMap.get(Integer.valueOf(i));
        if (map == null) {
            HashMap map2 = new HashMap();
            concurrentHashMap.put(Integer.valueOf(i), map2);
            return map2;
        }
        return map;
    }

    public static Set LJII(int i) {
        ConcurrentHashMap<Integer, Set<C2211761BhO>> concurrentHashMap = LIZIZ;
        Set<C2211761BhO> set = concurrentHashMap.get(Integer.valueOf(i));
        if (set == null) {
            HashSet hashSet = new HashSet();
            concurrentHashMap.put(Integer.valueOf(i), hashSet);
            return hashSet;
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.String r6) {
        /*
            int r0 = LJIIIZ()
            java.util.Set r5 = LJII(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.1BhO r0 = (X.C2211761BhO) r0
            java.lang.ref.WeakReference r0 = r0.getViewRef()
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L42
            X.1BhA r0 = X.C2211621BhA.LIZ
            r0.getClass()
            r0 = 0
            X.1BhC r0 = X.C2211621BhA.LIZLLL(r1, r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.LIZ
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L11
            r4.add(r2)
            goto L11
        L42:
            r0 = 0
            goto L38
        L44:
            java.util.Set r0 = X.C13LP.LLIIJI(r4)
            r5.removeAll(r0)
            int r0 = LJIIIZ()
            java.util.Map r0 = LJI(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L5b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r1.next()
            X.1BhU r0 = (X.C2211821BhU) r0
            java.lang.String r0 = r0.LJIIIIZZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L71
            r1.remove()
            goto L71
        L89:
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != 0) goto L5b
            r3.remove()
            goto L5b
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2211751BhN.LJIIJJI(java.lang.String):void");
    }

    public static void LJIIL(C2211761BhO c2211761BhO) {
        String str = null;
        if (c2211761BhO.isCommon()) {
            Iterator<T> it2 = LIZIZ.values().iterator();
            while (it2.hasNext()) {
                Set set = (Set) it2.next();
                if (!set.contains(c2211761BhO)) {
                    set.add(c2211761BhO);
                }
            }
            View view = c2211761BhO.getViewRef().get();
            if (view != null) {
                C2211621BhA.LIZ.getClass();
                C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null);
                if (c2211641BhCLIZLLL != null) {
                    str = c2211641BhCLIZLLL.LIZ;
                }
            }
            c2211761BhO.setCarrierID$btm_release(str);
            C787750UvF.LIZ(c2211761BhO, new AwS578S0100000_34(c2211761BhO, 144), new C2211781BhQ(c2211761BhO));
            return;
        }
        Set setLJII = LJII(LJIIIZ());
        c2211761BhO.setActivityID(LJIIIZ());
        setLJII.add(c2211761BhO);
        View view2 = c2211761BhO.getViewRef().get();
        if (view2 != null) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhCLIZLLL2 = C2211621BhA.LIZLLL(view2, null);
            if (c2211641BhCLIZLLL2 != null) {
                str = c2211641BhCLIZLLL2.LIZ;
            }
        }
        c2211761BhO.setCarrierID$btm_release(str);
        C787750UvF.LIZ(c2211761BhO, new AwS578S0100000_34(c2211761BhO, 145), new AwS578S0100000_34(c2211761BhO, 146));
    }

    public static void LIZ(View view, AbstractC2211791BhR abstractC2211791BhR) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            LJIIL(new C2211761BhO(new WeakReference(view), abstractC2211791BhR));
            return;
        }
        throw new Exception("Add exposure view must run on the main thread");
    }

    public static boolean LIZJ(View view, C2211761BhO c2211761BhO) {
        Function1<View, Boolean> visibilityChecker = c2211761BhO.getVisibilityChecker();
        if (visibilityChecker != null) {
            c2211761BhO.setCurrentPiv(-1.0f);
            return visibilityChecker.invoke(view).booleanValue();
        }
        int i = C2187451AjH.LIZ;
        return LJIIJ(view, c2211761BhO);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2211751BhN.LJ(int, boolean):void");
    }

    public static C2211821BhU LJIIIIZZ(C2211761BhO c2211761BhO, Map map) {
        Object next;
        String btm_cd = c2211761BhO.getBTM_CD();
        Object arrayList = map.get(btm_cd);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(btm_cd, arrayList);
        }
        List list = (List) arrayList;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C2211821BhU) next).LJIIIIZZ, c2211761BhO.getCarrierID$btm_release())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C2211821BhU c2211821BhU = (C2211821BhU) next;
        if (c2211821BhU == null) {
            C2211821BhU c2211821BhU2 = new C2211821BhU(btm_cd);
            c2211821BhU2.LJ = c2211761BhO.getRepeatedInsidePage();
            c2211821BhU2.LJFF = c2211761BhO.getRepeatedWhenBack();
            c2211821BhU2.LJI = c2211761BhO.getExposePeriodSpecification();
            c2211761BhO.getVisiblePercent();
            c2211821BhU2.LJIIIIZZ = c2211761BhO.getCarrierID$btm_release();
            list.add(c2211821BhU2);
            return c2211821BhU2;
        }
        return c2211821BhU;
    }

    public static boolean LJIIJ(View view, C2211761BhO c2211761BhO) {
        float f;
        if (view.isAttachedToWindow() && view.hasWindowFocus() && view.getWindowVisibility() == 0 && view.isShown() && view.getWidth() > 0 && view.getHeight() > 0 && view.getAlpha() > 0.0f) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return false;
            }
            float visiblePercent = c2211761BhO.getVisiblePercent();
            int measuredWidth = view.getMeasuredWidth() * view.getMeasuredHeight();
            int iHeight = rect.height() * rect.width();
            if (measuredWidth == 0) {
                f = -1.0f;
            } else {
                f = iHeight / measuredWidth;
            }
            c2211761BhO.setCurrentPiv(f);
            if (visiblePercent == 0.0f) {
                if (iHeight > 0) {
                    return true;
                }
            } else if (iHeight >= measuredWidth * visiblePercent) {
                return true;
            }
        }
        return false;
    }
}

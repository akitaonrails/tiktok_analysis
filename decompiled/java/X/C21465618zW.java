package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18zW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21465618zW {
    public static void LIZJ(View view) {
        if (C21466118zb.LIZ != null) {
            if (!C21465818zY.LJFF) {
                try {
                    if (!C21465818zY.LIZIZ) {
                        try {
                            C21465818zY.LIZ = Class.forName("android.view.GhostView");
                        } catch (ClassNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C21465818zY.LIZIZ = true;
                    }
                    Method declaredMethod = C21465818zY.LIZ.getDeclaredMethod("removeGhost", View.class);
                    C21465818zY.LJ = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C21465818zY.LJFF = true;
            }
            Method method = C21465818zY.LJ;
            if (method != null) {
                try {
                    C2204961BRm.a0(method, null, new Object[]{view}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPiLBkANhkuji6j8kPJpdXDZ+z9/CJnfdD", null));
                    return;
                } catch (IllegalAccessException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return;
                } catch (InvocationTargetException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw new RuntimeException(e4.getCause());
                }
            }
            return;
        }
        if (Build.VERSION.SDK_INT == 28) {
            if (!C21465918zZ.LJFF) {
                try {
                    if (!C21465918zZ.LIZIZ) {
                        try {
                            C21465918zZ.LIZ = Class.forName("android.view.GhostView");
                        } catch (ClassNotFoundException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                        C21465918zZ.LIZIZ = true;
                    }
                    Method declaredMethod2 = C21465918zZ.LIZ.getDeclaredMethod("removeGhost", View.class);
                    C21465918zZ.LJ = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
                C21465918zZ.LJFF = true;
            }
            Method method2 = C21465918zZ.LJ;
            if (method2 != null) {
                try {
                    C2204961BRm.a0(method2, null, new Object[]{view}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPm6pqHd97WpOLtDoFLnHUq9++cXBmKQGPs3imSw==", null));
                    return;
                } catch (IllegalAccessException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    return;
                } catch (InvocationTargetException e8) {
                    TryCatchGuardChecker.doCheck(e8);
                    throw new RuntimeException(e8.getCause());
                }
            }
            return;
        }
        C21462318yz c21462318yz = (C21462318yz) view.getTag(R.id.iv_);
        if (c21462318yz != null) {
            int i = c21462318yz.LLILLJJLI - 1;
            c21462318yz.LLILLJJLI = i;
            if (i <= 0) {
                ViewGroup viewGroup = (ViewGroup) c21462318yz.getParent();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, c21462318yz);
                viewGroup.removeView(c21462318yz);
            }
        }
    }

    public static List<C801600VcU<String, View>> LJ(C830490Whz<String, View> c830490Whz) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        while (!c830490Whz.isEmpty()) {
            for (int i = c830490Whz.LLILLL - 1; i >= 0; i--) {
                View viewLJIIIIZZ = c830490Whz.LJIIIIZZ(i);
                String strLJFF = c830490Whz.LJFF(i);
                if (z && (viewLJIIIIZZ == null || !viewLJIIIIZZ.isAttachedToWindow() || strLJFF == null)) {
                    c830490Whz.LJI(i);
                } else {
                    Object parent = viewLJIIIIZZ.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (!c830490Whz.containsValue(view)) {
                                parent = view.getParent();
                            }
                        } else {
                            arrayList.add(new C801600VcU(strLJFF, viewLJIIIIZZ));
                            c830490Whz.LJI(i);
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        return arrayList;
    }

    public static C801600VcU<List<View>, List<View>> LJFF(List<View> list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        Rect rect = new Rect();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                View view = (View) ListProtector.get(arrayList, size);
                if (!view.getGlobalVisibleRect(rect)) {
                    ListProtector.remove(arrayList, size);
                    arrayList2.add(view);
                }
            } else {
                return new C801600VcU<>(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0245, code lost:
    
        r9 = r6 - 1;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.view.View r16, android.view.ViewGroup r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21465618zW.LIZLLL(android.view.View, android.view.ViewGroup):void");
    }

    public static void LIZ(View view, View view2, List<View> list) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup() && view != view2) {
                ((ArrayList) list).add(viewGroup);
                return;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LIZ(viewGroup.getChildAt(i), view2, list);
            }
            return;
        }
        if (view.getVisibility() != 0) {
            return;
        }
        ((ArrayList) list).add(view);
    }

    public static View LIZIZ(View view, boolean z, String str) {
        View viewLIZIZ;
        if (str.equals(C14K9.LJIIJ(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt.getVisibility() == 0 || !z) && (viewLIZIZ = LIZIZ(childAt, z, str)) != null) {
                        return viewLIZIZ;
                    }
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
}

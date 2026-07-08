package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.15hZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20589915hZ {
    public static final C20590915hj LIZ = new C20590915hj();
    public static final C20590815hi LIZIZ = C20590815hi.LL;

    public static C19389510tR LIZIZ(Context context) {
        List<C20590215hc> list = C20590015ha.LIZJ;
        Activity activityLIZ = C20590515hf.LIZ(context);
        View decorView = null;
        if (activityLIZ != null) {
            Window window = activityLIZ.getWindow();
            if (window != null) {
                decorView = window.getDecorView();
            }
            C20590815hi c20590815hi = LIZIZ;
            return C20590815hi.LIZ(decorView);
        }
        C20590815hi c20590815hi2 = LIZIZ;
        return C20590815hi.LIZ(null);
    }

    public static C20590215hc LIZJ(C20590015ha c20590015ha) {
        boolean z;
        int iIdentityHashCode;
        C20590215hc c20590215hcPrevious;
        Activity activity;
        Window window;
        View decorView;
        float f;
        C20590915hj c20590915hj = LIZ;
        c20590915hj.getClass();
        View view = c20590015ha.LIZ;
        if (view != null && view.isAttachedToWindow()) {
            z = true;
        } else {
            z = false;
        }
        C20590215hc c20590215hc = null;
        if (z) {
            List<C20590215hc> list = C20590015ha.LIZJ;
            if (c20590015ha.LIZIZ.contains(EnumC20591315hn.HORIZONTAL)) {
                f = C20590815hi.LIZ(c20590015ha.LIZ).LIZ;
            } else {
                f = C20590815hi.LIZ(c20590015ha.LIZ).LIZIZ;
            }
            List<C20590215hc> list2 = C20590015ha.LIZJ;
            ListIterator<C20590215hc> listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                C20590215hc c20590215hcPrevious2 = listIterator.previous();
                if (f >= c20590215hcPrevious2.LIZ) {
                    c20590215hc = c20590215hcPrevious2;
                    break;
                }
            }
            C20590215hc c20590215hc2 = c20590215hc;
            if (c20590215hc2 == null) {
                return C20590215hc.LJII;
            }
            return c20590215hc2;
        }
        WeakReference<Activity> weakReference = c20590915hj.LL;
        if (weakReference != null && (activity = weakReference.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            iIdentityHashCode = System.identityHashCode(decorView);
        } else {
            iIdentityHashCode = 0;
        }
        C20590315hd c20590315hd = C20591015hk.LIZ.get(Integer.valueOf(iIdentityHashCode));
        if (iIdentityHashCode == 0 || c20590315hd == null) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float f2 = displayMetrics.widthPixels;
            float f3 = displayMetrics.density;
            C19389510tR c19389510tR = new C19389510tR(f2 / f3, displayMetrics.heightPixels / f3);
            List<C20590215hc> list3 = C20590015ha.LIZJ;
            ListIterator<C20590215hc> listIterator2 = list3.listIterator(list3.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    c20590215hcPrevious = listIterator2.previous();
                    if (c19389510tR.LIZ >= c20590215hcPrevious.LIZ) {
                        break;
                    }
                } else {
                    c20590215hcPrevious = null;
                    break;
                }
            }
            C20590215hc c20590215hc3 = c20590215hcPrevious;
            if (c20590215hc3 == null) {
                c20590215hc3 = C20590215hc.LJII;
            }
            List<C20590215hc> list4 = C20590015ha.LIZJ;
            ListIterator<C20590215hc> listIterator3 = list4.listIterator(list4.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C20590215hc c20590215hcPrevious3 = listIterator3.previous();
                if (c19389510tR.LIZIZ >= c20590215hcPrevious3.LIZ) {
                    c20590215hc = c20590215hcPrevious3;
                    break;
                }
            }
            C20590215hc c20590215hc4 = c20590215hc;
            if (c20590215hc4 == null) {
                c20590215hc4 = C20590215hc.LJII;
            }
            c20590315hd = new C20590315hd(EnumC20591315hn.HORIZONTAL, c20590215hc3, c20590215hc4, c19389510tR);
            C20591015hk.LIZ.put(Integer.valueOf(iIdentityHashCode), c20590315hd);
        }
        List<C20590215hc> list5 = C20590015ha.LIZJ;
        EnumC20591315hn enumC20591315hn = c20590015ha.LIZIZ;
        if (enumC20591315hn == null) {
            enumC20591315hn = EnumC20591315hn.HORIZONTAL;
        }
        if (enumC20591315hn.contains(EnumC20591315hn.VERTICAL)) {
            return c20590315hd.LIZJ;
        }
        return c20590315hd.LIZIZ;
    }

    public static void LIZLLL(Observer observer) {
        LIZ.LIZJ(observer);
    }

    public static Observer LIZ(InterfaceC1593800rZq interfaceC1593800rZq, C20590015ha c20590015ha, boolean z) {
        return LIZ.LIZ(interfaceC1593800rZq, c20590015ha, z);
    }
}

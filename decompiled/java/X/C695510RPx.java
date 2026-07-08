package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695510RPx {
    public static final C695510RPx LIZ = new C695510RPx();
    public static final Map<Integer, Integer> LIZIZ = new LinkedHashMap();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(18));

    public static long LIZJ() {
        return ((Number) LIZJ.getValue()).longValue();
    }

    public static Set LIZIZ(boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Integer.valueOf(R.id.kvd));
        boolean z2 = true;
        if (C284060BBk.LIZ() != 1 && C284060BBk.LIZ() != 3) {
            z2 = false;
        }
        if (!z || z2) {
            linkedHashSet.add(Integer.valueOf(R.id.c26));
            if (z2) {
                linkedHashSet.add(Integer.valueOf(R.id.vlf));
            }
        }
        linkedHashSet.add(Integer.valueOf(R.id.qe_));
        linkedHashSet.add(Integer.valueOf(R.id.a99));
        if (C0COM.LIZIZ()) {
            linkedHashSet.add(Integer.valueOf(R.id.m5d));
        }
        return linkedHashSet;
    }

    public static void LIZ(View view, boolean z, Set set) {
        int i;
        View childAt;
        int iHashCode;
        int id = view.getId();
        if (id == R.id.c26) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = C341940Daq.LIZ(0.0d);
            }
            C786410Ut5.W5(view, layoutParams);
            boolean z2 = view instanceof ViewGroup;
            if (z2 && (C284060BBk.LIZ() == 1 || C284060BBk.LIZ() == 3)) {
                View viewFindViewById = view.findViewById(R.id.vlf);
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams3.bottomMargin = C341940Daq.LIZ(4.0d);
                    if (z) {
                        layoutParams3.addRule(14);
                    } else {
                        layoutParams3.removeRule(14);
                    }
                    C786410Ut5.W5(viewFindViewById, layoutParams2);
                }
                if ((viewFindViewById instanceof ViewGroup) && (childAt = ((ViewGroup) viewFindViewById).getChildAt(0)) != null) {
                    ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                    if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                        if (z) {
                            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                            layoutParams5.rightMargin = C341940Daq.LIZ(12.0d);
                            layoutParams5.leftMargin = C341940Daq.LIZ(12.0d);
                        } else {
                            String strT2 = C786410Ut5.t2(Locale.getDefault());
                            if (strT2 == null || ((iHashCode = strT2.hashCode()) == 3121 ? !strT2.equals("ar") : !(iHashCode == 3374 ? strT2.equals("iw") : !(iHashCode != 3741 || !strT2.equals("ur"))))) {
                                ((FrameLayout.LayoutParams) layoutParams4).rightMargin = C341940Daq.LIZ(72.0d);
                            } else {
                                ((FrameLayout.LayoutParams) layoutParams4).leftMargin = C341940Daq.LIZ(72.0d);
                            }
                        }
                        C786410Ut5.W5(childAt, layoutParams4);
                    }
                }
            }
            if (view.getId() == R.id.c26 && z2) {
                C08QT c08qt = new C08QT(C09RB.LJIIJ(new C09RD((ViewGroup) view), new C5183020f(set, (Set<Integer>) 22)));
                while (c08qt.hasNext()) {
                    View view2 = (View) c08qt.next();
                    if (z) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, view2);
                }
                return;
            }
            return;
        }
        if (id != R.id.qe_ || view.getVisibility() != 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
        if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
            if (z) {
                ((RelativeLayout.LayoutParams) layoutParams6).addRule(12);
            } else {
                ((RelativeLayout.LayoutParams) layoutParams6).removeRule(12);
            }
        }
        C786410Ut5.W5(view, layoutParams6);
    }

    public static void LJ(View view, boolean z, boolean z2, boolean z3) {
        long j;
        if (view != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(8, view);
                C786410Ut5.T4(view, 0.0f);
                return;
            }
            C786410Ut5.T4(view, 0.0f);
            C786410Ut5.LJLLLLLL(0, view);
            if (z2) {
                ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(300L);
                if (z3) {
                    j = 200;
                } else {
                    j = 0;
                }
                duration.setStartDelay(j).start();
                return;
            }
            C786410Ut5.T4(view, 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[PHI: r14
      0x0084: PHI (r14v3 boolean) = (r14v0 boolean), (r14v4 boolean) binds: [B:35:0x0081, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(android.view.ViewGroup r15, android.view.ViewGroup r16, android.view.View r17, boolean r18, boolean r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C695510RPx.LIZLLL(android.view.ViewGroup, android.view.ViewGroup, android.view.View, boolean, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }
}

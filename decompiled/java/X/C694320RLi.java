package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694320RLi {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C693780RJg());
    public static final int LIZIZ;
    public static final int LIZJ;

    static {
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        LIZIZ = C693770RJf.LIZ() / 2;
        LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LowScreenOptimizeAB.LIZ() ? 10 : 12)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.view.View r7, kotlin.jvm.functions.Function2 r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C694320RLi.LIZ(android.view.View, kotlin.jvm.functions.Function2):boolean");
    }

    public static boolean LIZIZ(int i, View view, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i3 = marginLayoutParams3.topMargin;
        } else {
            i3 = 0;
        }
        if (i2 == i || Intrinsics.LJFF(C695740RQu.LIZLLL(R.id.elp, view), Boolean.TRUE)) {
            return false;
        }
        Object objLIZLLL = C695740RQu.LIZLLL(R.id.elq, view);
        if (!(objLIZLLL instanceof C694350RLl) || objLIZLLL == null) {
            C695740RQu.LJ(R.id.elq, view, new C694350RLl(i3, i2));
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            int marginStart = marginLayoutParams2.getMarginStart();
            int i4 = marginLayoutParams2.topMargin;
            int marginEnd = marginLayoutParams2.getMarginEnd();
            marginLayoutParams2.setMarginStart(marginStart);
            marginLayoutParams2.topMargin = i4;
            marginLayoutParams2.setMarginEnd(marginEnd);
            marginLayoutParams2.bottomMargin = i;
            if (z) {
                C786410Ut5.W5(view, marginLayoutParams2);
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean LIZJ(View view, ComponentMarginConfig componentMarginConfig, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams3.topMargin;
        } else {
            i2 = 0;
        }
        if ((i == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(componentMarginConfig.bottomGap))) && i2 == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(componentMarginConfig.topGap)))) || Intrinsics.LJFF(C695740RQu.LIZLLL(R.id.elp, view), Boolean.TRUE)) {
            return false;
        }
        Object objLIZLLL = C695740RQu.LIZLLL(R.id.elq, view);
        if (!(objLIZLLL instanceof C694350RLl) || objLIZLLL == null) {
            C695740RQu.LJ(R.id.elq, view, new C694350RLl(i2, i));
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(componentMarginConfig.bottomGap)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(componentMarginConfig.topGap)));
            int marginStart = marginLayoutParams2.getMarginStart();
            int marginEnd = marginLayoutParams2.getMarginEnd();
            marginLayoutParams2.setMarginStart(marginStart);
            marginLayoutParams2.topMargin = iLIZIZ2;
            marginLayoutParams2.setMarginEnd(marginEnd);
            marginLayoutParams2.bottomMargin = iLIZIZ;
            if (z) {
                C786410Ut5.W5(view, marginLayoutParams2);
                return true;
            }
            return true;
        }
        return true;
    }
}

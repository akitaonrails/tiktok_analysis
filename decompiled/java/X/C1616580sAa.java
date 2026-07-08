package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616580sAa implements InterfaceC1249220ic4 {
    public static int LIZIZ;
    public static final C1616580sAa LIZ = new C1616580sAa();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(31));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(707));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(708));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(30));

    public static boolean LIZJ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1249220ic4
    public final boolean LLD() {
        return (LIZIZ < 2 && ((Keva) LIZJ.getValue()).getInt("key_landscape_scroll_tooltip_count", 0) < 3) || (LIZIZ == 1 && ((Keva) LIZJ.getValue()).getInt("key_landscape_scroll_tooltip_count", 0) == 3);
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLIILZL() {
        return Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1389340mG4.LIZLLL()))) / 2);
    }

    @Override // X.InterfaceC1249220ic4
    public final boolean LLLII() {
        return ((Boolean) LJFF.getValue()).booleanValue() && ((Boolean) LJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1249220ic4
    public final boolean LJI() {
        return LIZJ();
    }

    @Override // X.InterfaceC1249220ic4
    public final boolean LJIJJLI() {
        return LIZJ();
    }

    @Override // X.InterfaceC1249220ic4
    public final boolean LJJLL() {
        return LIZJ() || LLLII();
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLILIL() {
        if (LIZJ()) {
            return 84;
        }
        return C1616510sAT.LIZ.LLILIL();
    }

    @Override // X.InterfaceC1249220ic4
    public final float LJIILJJIL(float f) {
        if (!LJ(null, null)) {
            return f;
        }
        if (LJ(null, null)) {
            if (LIZ(null, null)) {
                return C418440Gaw.LIZIZ(180);
            }
            return C418440Gaw.LIZIZ(152);
        }
        return C418440Gaw.LIZIZ(107);
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJIIZILJ(int i) {
        if (!LJ(null, null)) {
            return i;
        }
        if (LJ(null, null) && LIZ(null, null)) {
            return 42;
        }
        return 72;
    }

    @Override // X.InterfaceC1249220ic4
    public final float LJIJJ(float f) {
        if (!LJ(null, null)) {
            return f;
        }
        if (LJ(null, null)) {
            if (LIZ(null, null)) {
                return C418440Gaw.LIZIZ(6);
            }
            return C418440Gaw.LIZIZ(5);
        }
        return C418440Gaw.LIZIZ(4);
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJLJI(boolean z) {
        int iLIZIZ;
        int i = C1389340mG4.LIZJ(null, null).LIZJ;
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        } else {
            iLIZIZ = 0;
        }
        return i - iLIZIZ;
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJLLJ(int i) {
        return i - LLIILZL();
    }

    @Override // X.InterfaceC1249220ic4
    public final boolean LJZI(int i) {
        if (LLLII() && i == 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1249220ic4
    public final float LLIIJLIL(float f) {
        if (!LJ(null, null)) {
            return f;
        }
        if (LJ(null, null)) {
            if (LIZ(null, null)) {
                return C418440Gaw.LIZIZ(42);
            }
            return C418440Gaw.LIZIZ(35);
        }
        return C418440Gaw.LIZIZ(24);
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLIIL(int i) {
        if (!LJ(null, null)) {
            return i;
        }
        if (LJ(null, null)) {
            if (LIZ(null, null)) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    }

    @Override // X.InterfaceC1249220ic4
    public final float LLILLL(float f) {
        if (!LJ(null, null)) {
            return f;
        }
        if (LJ(null, null)) {
            if (LIZ(null, null)) {
                return C418440Gaw.LIZIZ(27);
            }
            return C418440Gaw.LIZIZ(23);
        }
        return C418440Gaw.LIZIZ(19);
    }

    public static boolean LIZ(Integer num, Integer num2) {
        int iLIZIZ;
        int iLIZ;
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = c1389350mG5LIZJ.LIZIZ();
        }
        if (num2 != null) {
            iLIZ = num2.intValue();
        } else {
            iLIZ = c1389350mG5LIZJ.LIZ();
        }
        if (iLIZ > 600 && iLIZIZ > 720) {
            return true;
        }
        return false;
    }

    public final boolean LJ(Integer num, Integer num2) {
        int iIntValue;
        int iLIZIZ;
        int iIntValue2;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            C844470XAv.LIZ.getClass();
            iIntValue = C844470XAv.LIZ().getResources().getConfiguration().orientation;
        }
        if (num != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
        } else {
            iLIZIZ = C1389340mG4.LIZJ(null, null).LIZIZ;
        }
        if (LLLFFI(iLIZIZ, iIntValue) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(600))) {
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                C844470XAv.LIZ.getClass();
                iIntValue2 = C844470XAv.LIZ().getResources().getConfiguration().orientation;
            }
            if ((!LLLII() || iIntValue2 != 2) && LIZJ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1249220ic4
    public final CharSequence LJJLJLI(Context context, CharSequence charSequence) {
        if (Intrinsics.LJFF(charSequence, context.getString(2131848606))) {
            return context.getString(2131849540);
        }
        if (Intrinsics.LJFF(charSequence, context.getString(2131848603))) {
            return context.getString(2131849541);
        }
        if (!Intrinsics.LJFF(charSequence, context.getString(2131848611))) {
            return charSequence;
        }
        return context.getString(2131849542);
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLFFF(int i, int i2) {
        if (C1616560sAY.LIZ("ITabletSearch.getSkeletonPreViewRes")) {
            return i2;
        }
        if (i != 4) {
            if (i != 5) {
                return R.layout.cps;
            }
            return R.layout.cpu;
        }
        return R.layout.cpt;
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLLFFI(int i, int i2) {
        if (LLLII() && i2 == 2) {
            return LLIILZL();
        }
        return i;
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLLIZZ(int i, int i2) {
        return LLJJIII(i, i2, null);
    }

    @Override // X.InterfaceC1249220ic4
    public final void LIZLLL(LinearLayout linearLayout, Integer num, Integer num2) {
        int i;
        int i2;
        if (!LIZJ()) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (LJ(num, num2)) {
            i = 8388611;
            i2 = 0;
        } else {
            i = 1;
            i2 = 1;
        }
        layoutParams.gravity = i;
        if (linearLayout != null) {
            linearLayout.setOrientation(i2);
            C786410Ut5.d6(linearLayout, layoutParams);
            linearLayout.setGravity(i);
            linearLayout.requestLayout();
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJIFFI(View view, Integer num, Integer num2) {
        int iLIZIZ;
        Resources resources;
        if (view != null && LIZ.LJJLL()) {
            if (num2 != null) {
                iLIZIZ = num2.intValue();
            } else {
                iLIZIZ = 47;
                try {
                    Context context = view.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        iLIZIZ = (int) resources.getDimension(R.dimen.a3q);
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ)));
                }
            }
            boolean z = true;
            if ((num == null || num.intValue() != 1) && C1389340mG4.LIZJ(null, null).LJFF) {
                z = false;
            }
            if (!z) {
                iLIZIZ = 0;
            }
            C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(iLIZIZ), 23);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJIIZI(FrameLayout.LayoutParams layoutParams, Integer num, Integer num2) {
        int i;
        if (!LIZJ()) {
            return;
        }
        if (LJ(num, num2)) {
            i = 8388611;
        } else {
            i = 17;
        }
        layoutParams.gravity = i;
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJJIJ(int i, int i2, Context context) {
        if (C1616560sAY.LIZ("ITabletSearch.getShareAwemeListItemHeight")) {
            return i2;
        }
        return (C1389340mG4.LIZJ(context, null).LIZIZ * 4) / (LLJJIII(i, 0, context) * 3);
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJIJIL(LinearLayout linearLayout, Integer num, Integer num2) {
        int i;
        if (!LIZJ()) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        layoutParams.gravity = 1;
        if (LJ(num, num2)) {
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            i = 8388611;
            layoutParams.gravity = 8388611;
        } else {
            i = 17;
        }
        if (linearLayout != null) {
            C786410Ut5.d6(linearLayout, layoutParams);
            linearLayout.setGravity(i);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJJJ(LinearLayout linearLayout, Integer num, Integer num2) {
        int i;
        int i2;
        int i3;
        int marginEnd;
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int i4 = 0;
        if (LJ(num, num2)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            i2 = 8388611;
            i = 8388611;
        } else {
            i = 17;
            i2 = 1;
        }
        if (linearLayout != null) {
            linearLayout.setGravity(i2);
            Integer numValueOf = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i3 = marginLayoutParams2.topMargin;
            } else {
                i3 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i3);
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i4 = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(linearLayout, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i4), false, 16);
            ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
            if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams5) != null) {
                layoutParams.gravity = i;
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJJJJL(ViewGroup viewGroup, Integer num, Integer num2) {
        int i;
        int i2;
        LinearLayout linearLayout;
        int i3;
        int marginEnd;
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int i4 = 0;
        if (LJ(num, num2)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            i = 8388611;
            i2 = 8388611;
        } else {
            i = 17;
            i2 = 1;
        }
        if ((viewGroup instanceof LinearLayout) && (linearLayout = (LinearLayout) viewGroup) != null) {
            Integer numValueOf = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i3 = marginLayoutParams2.topMargin;
            } else {
                i3 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i3);
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i4 = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(linearLayout, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i4), false, 16);
            linearLayout.setGravity(i);
            ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
            if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams5) != null) {
                layoutParams.gravity = i2;
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJJJJZI(Integer num, Integer num2, Integer num3) {
        if (!LJ(num3, null) || !LJ(num, num3) || !LIZ(num, num2)) {
            return 42;
        }
        return 33;
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJLIIIJILLIZJL(LinearLayout linearLayout, Integer num, Integer num2) {
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        if (LJ(num, num2)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        if (linearLayout != null) {
            C426750GoL.LJIIL(linearLayout, Integer.valueOf(iLIZIZ), Integer.valueOf(linearLayout.getPaddingTop()), Integer.valueOf(linearLayout.getPaddingEnd()), Integer.valueOf(linearLayout.getPaddingBottom()), 16);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJLI(ViewGroup viewGroup, Integer num, Integer num2) {
        int i;
        int i2;
        LinearLayout linearLayout;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        LinearLayout.LayoutParams layoutParams;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int i4 = 0;
        if (LJ(num, num2)) {
            i = 8388611;
            i2 = 8388611;
            iLIZIZ = 0;
        } else {
            i = 17;
            i2 = 1;
        }
        if ((viewGroup instanceof LinearLayout) && (linearLayout = (LinearLayout) viewGroup) != null) {
            linearLayout.setGravity(i);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = i2;
            }
            Integer numValueOf = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i3 = marginLayoutParams2.topMargin;
            } else {
                i3 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i3);
            Integer numValueOf3 = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i4 = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(linearLayout, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i4), false, 16);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLIIIL(TuxTextView tuxTextView, Integer num, Integer num2) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        if (!LIZJ()) {
            return;
        }
        if (LJ(num, num2)) {
            i = 8388611;
        } else {
            i = 17;
        }
        if (tuxTextView != null) {
            tuxTextView.setGravity(i);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = i;
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLILII(RelationLabelTextView relationLabelTextView, Integer num, Integer num2) {
        int i;
        LinearLayout.LayoutParams layoutParams;
        if (!LIZJ()) {
            return;
        }
        if (LJ(num, num2)) {
            i = 8388611;
        } else {
            i = 16;
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (relationLabelTextView != null) {
            layoutParams2 = relationLabelTextView.getLayoutParams();
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = i;
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLJJIII(int i, int i2, Context context) {
        if (!C1616560sAY.LIZ("ITabletSearch.getAwemeListSpanCount") && C589230N9d.LIZIZ()) {
            if (i2 <= 0) {
                i2 = C1389340mG4.LIZJ(context, null).LIZIZ;
            }
            if (((Boolean) LJ.getValue()).booleanValue() || LIZJ()) {
                i2 -= LLIILZL();
            }
            if (i2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(900))) {
                return 5;
            }
            if (i2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480))) {
                return 4;
            }
            return 3;
        }
        return i;
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLJJJ(FrameLayout frameLayout, Integer num, Integer num2) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams2 = frameLayout.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            LIZ.LJJIIZI(layoutParams, num, num2);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLJJJJLIIL(ViewGroup viewGroup, Integer num, Integer num2) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        if (!LIZJ()) {
            return;
        }
        if (LJ(num, num2)) {
            i = 8388611;
        } else {
            i = 17;
        }
        ViewGroup.LayoutParams layoutParams4 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams) != null) {
            layoutParams3.gravity = i;
        }
        if (viewGroup != null) {
            layoutParams4 = viewGroup.getLayoutParams();
        }
        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) != null) {
            layoutParams2.gravity = i;
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLJL(ViewGroup viewGroup, Integer num, Integer num2) {
        int i;
        LinearLayout linearLayout;
        if (!LIZJ()) {
            return;
        }
        if (LJ(num, num2)) {
            i = 8388611;
        } else {
            i = 17;
        }
        if ((viewGroup instanceof LinearLayout) && (linearLayout = (LinearLayout) viewGroup) != null) {
            linearLayout.setGravity(i);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLJLIL(ViewGroup viewGroup, Integer num, Integer num2) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        if (!LIZJ()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (viewGroup != null) {
            layoutParams2 = viewGroup.getLayoutParams();
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            if (LIZ.LJ(num, num2)) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                i = 8388611;
            } else {
                i = 17;
            }
            layoutParams.setMarginStart(iLIZIZ);
            layoutParams.gravity = i;
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLLIILIL(ViewGroup viewGroup, Integer num, Integer num2) {
        int i;
        LinearLayout.LayoutParams layoutParams;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (LJ(num, num2)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            i = 8388611;
        } else {
            i = 17;
        }
        if (viewGroup != null) {
            C426750GoL.LJIIL(viewGroup, Integer.valueOf(iLIZIZ), Integer.valueOf(viewGroup.getPaddingTop()), Integer.valueOf(viewGroup.getPaddingEnd()), Integer.valueOf(viewGroup.getPaddingBottom()), 16);
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = i;
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final int LIZIZ(int i, Integer num, Integer num2, Integer num3) {
        if (!LIZJ()) {
            C1616510sAT.LIZ.LIZIZ(i, null, null, null);
            return i;
        }
        if (LJ(num, num3)) {
            if (LIZ(num, num2)) {
                return 224;
            }
            return 186;
        }
        return 135;
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJFF(TuxTextView tuxTextView, Context context, Integer num, Integer num2) {
        int i;
        LinearLayout.LayoutParams layoutParams;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        if (LJ(num, num2)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            i = 8388611;
        } else {
            i = 17;
        }
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                C426750GoL.LJIIJ(layoutParams, context, Integer.valueOf(iLIZIZ), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(iLIZIZ2), Integer.valueOf(layoutParams.bottomMargin), 32);
                layoutParams.gravity = i;
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJ(C20584815gk c20584815gk, Integer num, Integer num2, Integer num3) {
        float f;
        if (!LIZJ()) {
            return;
        }
        float f2 = 0.0f;
        if (LJ(num, num3)) {
            if (LIZ(num, num2)) {
                if (!C426750GoL.LJFF()) {
                    f2 = -50.0f;
                }
                f = 70.0f;
            } else {
                if (!C426750GoL.LJFF()) {
                    f2 = -25.0f;
                }
                f = 50.0f;
            }
        } else {
            f = 0.0f;
        }
        if (c20584815gk != null) {
            C786410Ut5.Jc(c20584815gk, f2);
            C786410Ut5.ed(c20584815gk, f);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJJJJI(int i, Integer num, Integer num2, Integer num3) {
        if (!LJ(null, num3)) {
            C1616510sAT.LIZ.LJJJJI(i, null, null, null);
            return i;
        }
        if (LJ(num, num3)) {
            if (LIZ(num, num2)) {
                return 56;
            }
            return 46;
        }
        return 32;
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJJJIZL(FrameLayout frameLayout, Context context, Integer num, Integer num2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        if (LJ(num, num2)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.width = -2;
            C426750GoL.LJIIJ(marginLayoutParams, context, Integer.valueOf(iLIZIZ), Integer.valueOf(marginLayoutParams.topMargin), Integer.valueOf(marginLayoutParams.getMarginEnd()), Integer.valueOf(marginLayoutParams.bottomMargin), 32);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final int LJJJJLL(int i, Integer num, Integer num2, Integer num3) {
        if (!LJ(null, num3)) {
            C1616510sAT.LIZ.LJJJJLL(i, null, null, null);
            return i;
        }
        if (LJ(num, num3)) {
            if (LIZ(num, num2)) {
                return 42;
            }
            return 35;
        }
        return 24;
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJLI(View view, Integer num, Integer num2, Integer num3) {
        int iLIZIZ;
        if (!LIZJ()) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        if (LJ(num, num3)) {
            if (LIZ(num, num2)) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(218));
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170));
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            view.getLayoutParams().width = iLIZIZ;
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJLIIIJJI(ViewGroup viewGroup, Context context, Integer num, Integer num2) {
        if (LIZJ() && viewGroup != null) {
            if (LIZ.LJ(num, num2)) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                C426750GoL.LJIIIIZZ(layoutParams, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), true);
                C786410Ut5.X5(layoutParams, viewGroup);
            } else {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                C426750GoL.LJIIIIZZ(layoutParams2, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), true);
                C786410Ut5.X5(layoutParams2, viewGroup);
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJLIL(TuxTextView tuxTextView, boolean z, Integer num, Integer num2) {
        int i;
        int i2;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (!LIZJ()) {
            return;
        }
        int i3 = 0;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        if (LJ(num, num2)) {
            i = 8388611;
            if (!z) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
            }
        } else {
            i = 17;
        }
        if (tuxTextView != null) {
            tuxTextView.setGravity(i);
            Integer numValueOf = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i2 = marginLayoutParams2.topMargin;
            } else {
                i2 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i2);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i3 = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(tuxTextView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i3), false, 16);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJJZZIII(AvatarComponentView avatarComponentView, Integer num, Integer num2, Integer num3) {
        if (LIZJ() && avatarComponentView != null) {
            int iLIZIZ = LIZ.LIZIZ(avatarComponentView.getWidth(), num, num2, num3);
            ViewGroup.LayoutParams layoutParams = avatarComponentView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ)));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ)));
            }
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LJLIIL(TuxTextView tuxTextView, TuxTextView tuxTextView2, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams2;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        C19ME c19me2 = null;
        if (tuxTextView != null) {
            layoutParams = tuxTextView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        } else {
            c19me = null;
        }
        if (tuxTextView2 != null) {
            layoutParams2 = tuxTextView2.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof C19ME) {
            c19me2 = (C19ME) layoutParams2;
        }
        if (LJ(num, num2)) {
            if (c19me != null) {
                c19me.endToEnd = -1;
                c19me.startToStart = 0;
                c19me.setMarginStart(iLIZIZ);
            }
            if (c19me2 != null) {
                ((ViewGroup.MarginLayoutParams) c19me2).width = -2;
                c19me2.startToStart = 0;
                c19me2.endToEnd = -1;
                c19me2.setMarginStart(iLIZIZ);
            }
        } else {
            if (c19me != null) {
                c19me.endToEnd = 0;
                c19me.setMarginStart(iLIZIZ2);
            }
            if (c19me2 != null) {
                ((ViewGroup.MarginLayoutParams) c19me2).width = -1;
                c19me2.endToEnd = 0;
                c19me2.setMarginStart(iLIZIZ2);
            }
        }
        if (tuxTextView != null) {
            C786410Ut5.R6(tuxTextView, c19me);
        }
        if (tuxTextView2 != null) {
            C786410Ut5.R6(tuxTextView2, c19me2);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final int LLIIIZ(int i, Integer num, Integer num2, Integer num3) {
        if (!LJ(num, num3)) {
            C1616510sAT.LIZ.LLIIIZ(i, null, null, null);
            return i;
        }
        if (LJ(num, null)) {
            if (LIZ(num, num2)) {
                return 168;
            }
            return 140;
        }
        return 96;
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLIZLLLIL(View view, Integer num, Integer num2, Boolean bool) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout linearLayout;
        if (!LIZJ()) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        if (LJ(num, num2)) {
            i = 8388627;
        } else {
            i = 17;
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && view != null) {
            C426750GoL.LJIIL(view, Integer.valueOf(iLIZIZ), Integer.valueOf(view.getPaddingTop()), Integer.valueOf(iLIZIZ), Integer.valueOf(view.getPaddingBottom()), 16);
        }
        ViewGroup.LayoutParams layoutParams4 = null;
        if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
            linearLayout.setGravity(i);
        }
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams) != null) {
            layoutParams3.gravity = i;
        }
        if (view != null) {
            layoutParams4 = view.getLayoutParams();
        }
        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) != null) {
            layoutParams2.gravity = i;
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLJJIJI(ViewGroup viewGroup, Context context, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        int i;
        LinearLayout linearLayout;
        LinearLayout.LayoutParams layoutParams3;
        int i2;
        if (!LIZJ()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        C1616580sAa c1616580sAa = LIZ;
        int i3 = 8388611;
        if (layoutParams2 != null) {
            if (c1616580sAa.LJ(num, num2)) {
                layoutParams2.removeRule(13);
                i = 8388611;
            } else {
                layoutParams2.addRule(13);
                i = 17;
            }
        } else {
            i = 17;
        }
        if (viewGroup != null) {
            layoutParams4 = viewGroup.getLayoutParams();
        }
        if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams4) != null) {
            if (C14KI.LJI(context)) {
                i2 = 12;
            } else {
                i2 = 30;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            if (c1616580sAa.LJ(num, num2)) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            } else {
                i3 = i;
            }
            C426750GoL.LJIIIIZZ(layoutParams3, context, Integer.valueOf(iLIZIZ), Integer.valueOf(layoutParams3.topMargin), Integer.valueOf(iLIZIZ), Integer.valueOf(layoutParams3.bottomMargin), true);
            layoutParams3.gravity = i3;
            i = i3;
        }
        if ((viewGroup instanceof LinearLayout) && (linearLayout = (LinearLayout) viewGroup) != null) {
            linearLayout.setGravity(i);
        }
    }

    @Override // X.InterfaceC1249220ic4
    public final C1253900ijc LJLIIIL(Context context, TuxTextView tuxTextView, TuxIconView tuxIconView, View view, boolean z) {
        return new C1253900ijc(context, tuxTextView, tuxIconView, view, z, AFwS213S0000000_24.get$arr$(29));
    }

    @Override // X.InterfaceC1249220ic4
    public final void LLLILZJ(TuxIconView tuxIconView, TuxTextView tuxTextView, Integer num, Integer num2, Integer num3) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!LIZJ()) {
            return;
        }
        C1616580sAa c1616580sAa = LIZ;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            int i = 0;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1616580sAa.LJJJJLL(24, num, num2, num3)))));
            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(tuxIconView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i), false, 16);
            ViewGroup.LayoutParams layoutParams4 = tuxIconView.getLayoutParams();
            if (layoutParams4 != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1616580sAa.LJJJJI(32, num, num2, num3))));
                layoutParams4.width = iLIZIZ;
                layoutParams4.height = iLIZIZ;
            }
        }
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(LJJJJZI(num, num2, num3));
        }
    }
}

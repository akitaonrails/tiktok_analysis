package X;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Swj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737710Swj implements InterfaceC1388170mEB {
    public static final C737710Swj LIZ = new C737710Swj();
    public static final double LIZIZ;
    public static final C01GW LIZJ;

    static {
        C737680Swg.LIZ.getClass();
        LIZIZ = C737680Swg.LJJIJ() != EnumC737690Swh.DEFAULT ? 720.0d : 650.0d;
        LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(24));
    }

    @Override // X.InterfaceC1388170mEB
    public final void LIZJ() {
        if (C1616560sAY.LIZ("ITabletAutoScroll.isDefaultOnAutoScroll")) {
        }
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LJIILL() {
        if (C1616560sAY.LIZ("ITabletAutoScroll.isDefaultAutoScroll")) {
            return false;
        }
        return C1616670sAj.LIZ();
    }

    @Override // X.InterfaceC1388170mEB
    public final C0RRV LJJIJIIJI() {
        int iIntValue = ((Number) AnonymousClass0744.LIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? C0RRV.DISABLED : C0RRV.BUTTON_2_NO_TEXT : C0RRV.BUTTON_2 : C0RRV.SWITCH : C0RRV.DEFAULT;
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LJLIL() {
        return ((Boolean) C263960AWc.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1388170mEB
    public final void LJLL() {
        C1616560sAY.LIZ("ITabletAutoScroll.showIconOptimizeAutoScroll");
    }

    @Override // X.InterfaceC1388170mEB
    public final C0RRW LJZ() {
        if (C1616560sAY.LIZ("ITabletAutoScroll.getAutoScrollV3IconPosition") || !LJLJJLL(false)) {
            return C0RRW.DISABLED;
        }
        int iIntValue = ((Number) AnonymousClass0745.LIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? C0RRW.DISABLED : C0RRW.TOP : C0RRW.BOTTOM;
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LLIIIJ() {
        return !C1616560sAY.LIZ("ITabletAutoScroll.needInitAutoScroll");
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LLJJJJJIL() {
        return LIZJ.getValue() != C0RRW.DISABLED;
    }

    public static boolean LIZ(Integer num) {
        int iLIZIZ;
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C1389340mG4.LIZJ(null, null).LIZIZ();
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJIZ() && iLIZIZ >= C20590215hc.LIZLLL.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LJJLIIIJLLLLLLLZ(Integer num) {
        return LIZ(num);
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LJLJJLL(boolean z) {
        if (C1616560sAY.LIZ("ITabletAutoScroll.isAutoScroll")) {
            return z;
        }
        return C1616670sAj.LIZ();
    }

    @Override // X.InterfaceC1388170mEB
    public final int LJLLLLLL(int i) {
        C1616560sAY.LIZ("ITabletAutoScroll.getIconOptimizeAutoScroll");
        return i;
    }

    @Override // X.InterfaceC1388170mEB
    public final C0RRW LLIZ(int i) {
        if (i == 0) {
            return (C0RRW) LIZJ.getValue();
        }
        return C0RRW.DISABLED;
    }

    @Override // X.InterfaceC1388170mEB
    public final void LLLIL(View view) {
        if (view != null) {
            view.setBackgroundResource(R.drawable.dda);
        }
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LJJJZ(Integer num, Integer num2) {
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
        int iMax = Math.max(iLIZIZ, iLIZ);
        int iMin = Math.min(iLIZIZ, iLIZ);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || iMax <= LIZIZ || iMin <= 550.0d || LJZ() == C0RRW.DISABLED || !LJLJJLL(false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1388170mEB
    public final boolean LLJJ(C19EG c19eg, Integer num) {
        C1D0F c1d0f;
        IFeedBottomBarFacade iFeedBottomBarFacade = (IFeedBottomBarFacade) PluggableExtentionKt.pluggableSpi$default(IFeedBottomBarFacade.class, false, false, false, 14, null);
        if (!LIZ(num) || C0SXF.LJIL(c19eg) || (((c1d0f = C1D0F.LIZ) != null && c1d0f.isConnected()) || iFeedBottomBarFacade == null || !iFeedBottomBarFacade.LJJ())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1388170mEB
    public final void LLIIJI(C19EG c19eg, TuxTextView tuxTextView, TuxIconView tuxIconView) {
        String string;
        Resources resources;
        if (tuxTextView != null) {
            if (c19eg == null || (resources = c19eg.getResources()) == null || (string = resources.getString(2131839059)) == null) {
                string = "";
            }
            tuxTextView.setText(string);
        }
        LJLLLLLL(R.raw.icon_auto_scroll_fill);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_auto_scroll_fill);
        }
    }
}

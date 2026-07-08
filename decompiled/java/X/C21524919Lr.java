package X;

import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene;

/* JADX INFO: renamed from: X.19Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21524919Lr implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            case 2:
                return onBackPressed$2(this);
            case 3:
                return onBackPressed$3(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C21524919Lr c21524919Lr) {
        return ((NavigationScene) c21524919Lr.l0).LLLLLJIL(null);
    }

    public static final boolean onBackPressed$1(C21524919Lr c21524919Lr) {
        return ((TikTokSAARootFragmentGroupScene) c21524919Lr.l0).onBackPressed();
    }

    public static final boolean onBackPressed$2(C21524919Lr c21524919Lr) {
        return ((AbstractC214814194y) c21524919Lr.l0).onBackPressed();
    }

    public static final boolean onBackPressed$3(C21524919Lr c21524919Lr) {
        CreativeBottomSheetBehavior<?> behavior;
        C214800194k c214800194k = ((C214799194j) c21524919Lr.l0).LLJLIL;
        if (c214800194k != null && (behavior = c214800194k.getBehavior()) != null) {
            C214799194j c214799194j = (C214799194j) c21524919Lr.l0;
            if (c214799194j.LLJJJJLIIL && behavior.LJJI != 5) {
                if (!c214799194j.LLJJIJI) {
                    C1447800nmM.LIZIZ(c214799194j).LLLLLLLZIL(c21524919Lr);
                }
                C214799194j c214799194j2 = (C214799194j) c21524919Lr.l0;
                c214799194j2.LLLJ = C343960De6.LIZ;
                c214799194j2.LLLLILI(false);
                return true;
            }
        }
        return false;
    }

    public C21524919Lr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

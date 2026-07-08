package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeContactSelectorSheet;

/* JADX INFO: renamed from: X.0UsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785850UsB extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C785850UsB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C785850UsB c785850UsB, int i) {
        ((LiveSheetFragment) c785850UsB.l0).bS(false);
        if (C011Z.LIZ.LJJI != null && ((LiveSheetFragment) c785850UsB.l0).getView() != null) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LIZLLL(((LiveSheetFragment) c785850UsB.l0).getView().getRootView());
        }
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = ((LiveSheetFragment) c785850UsB.l0).LLJILLL;
        if (liveBottomSheetBehavior != null) {
            liveBottomSheetBehavior.LJFF();
        }
    }

    public static final void onPageSelected$1(C785850UsB c785850UsB, int i) {
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior;
        if (C19322110iZ.LIZJ(((LiveVisibleScopeContactSelectorSheet) c785850UsB.l0).getView()) != null) {
            LiveVisibleScopeContactSelectorSheet liveVisibleScopeContactSelectorSheet = (LiveVisibleScopeContactSelectorSheet) c785850UsB.l0;
            if ((liveVisibleScopeContactSelectorSheet instanceof LiveSheetFragment) && (liveBottomSheetBehavior = liveVisibleScopeContactSelectorSheet.LLJILLL) != null) {
                liveBottomSheetBehavior.LJFF();
            }
        }
    }
}

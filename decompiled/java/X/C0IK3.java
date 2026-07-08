package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.LiveInteractionMaskConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveViewTreeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IK3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IK3 {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;

    public final void LIZ() {
        View view;
        if (LiveViewTreeOptSetting.enableViewTreeOpt()) {
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setBackground(null);
                return;
            }
            return;
        }
        if (!BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getRemoveTopShadow() && (view = this.LIZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view3 = this.LIZIZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams;
        if (!LiveViewTreeOptSetting.enableViewTreeOpt()) {
            if (!BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getRemoveTopShadow()) {
                View view = this.LIZ;
                if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                    layoutParams.height = (int) C497740JfY.LIZIZ(LiveInteractionMaskConfigSetting.INSTANCE.getTopMaskHeightDp());
                    View view2 = this.LIZ;
                    if (view2 != null) {
                        C786410Ut5.W5(view2, layoutParams);
                    }
                }
                View view3 = this.LIZ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
            }
            View view4 = this.LIZIZ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
                return;
            }
            return;
        }
        C481020Itg c481020Itg = new C481020Itg();
        int iLIZIZ = (int) C497740JfY.LIZIZ(LiveInteractionMaskConfigSetting.INSTANCE.getTopMaskHeightDp());
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(276.0f);
        if (c481020Itg.LIZIZ != iLIZIZ) {
            c481020Itg.LIZIZ = iLIZIZ;
            c481020Itg.LIZJ = true;
        }
        if (c481020Itg.LJ != iLIZIZ2) {
            c481020Itg.LJ = iLIZIZ2;
            c481020Itg.LJFF = true;
        }
        if (c481020Itg.LIZJ || c481020Itg.LJFF) {
            c481020Itg.invalidateSelf();
        }
        View view5 = this.LIZJ;
        if (view5 != null) {
            view5.setBackground(c481020Itg);
        }
    }

    public C0IK3(View view) {
        if (LiveViewTreeOptSetting.enableViewTreeOpt()) {
            this.LIZJ = view.findViewById(R.id.iiv);
        } else {
            this.LIZ = view.findViewById(R.id.kvx);
            this.LIZIZ = view.findViewById(R.id.sfo);
        }
    }
}

package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Eov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376150Eov extends AbstractC1664490tPr<Unit, Unit> {
    public C1295960jpS LLJJJIL;

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C1295960jpS c1295960jpS = this.LLJJJIL;
        if (c1295960jpS != null) {
            C786410Ut5.LJLLLLLL(8, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LLJJJIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C1295960jpS c1295960jpS = this.LLJJJIL;
        if (c1295960jpS != null) {
            C786410Ut5.LJLLLLLL(0, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LLJJJIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.playAnimation();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emx, viewGroup, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int screenWidth = ScreenUtils.getScreenWidth(this.mActivity);
        layoutParams.gravity = 17;
        int i = (int) (((double) screenWidth) * 0.6d);
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.X5(layoutParams, viewGroup2);
        this.LLJJJIL = (C1295960jpS) viewGroup2.findViewById(R.id.nrl);
        return viewGroup2;
    }
}

package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ESA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ESA extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;
    public final String LLJIJIL;
    public TextView LLJILJIL;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C0ESA(C1DRG c1drg, String str) {
        this.LLJI = c1drg;
        this.LLJIJIL = str;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZ;
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (TextView) findViewById(R.id.qf3);
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            textView.setText(this.LLJIJIL);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (!C1462920oAk.LIZJ(textView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), marginLayoutParams.topMargin)) {
                Activity activity = this.mActivity;
                if (activity != null) {
                    iLIZ = Integer.valueOf(ScreenUtils.getStatusBarHeight(activity)).intValue();
                } else {
                    iLIZ = C366700EZg.LIZ(7.0d);
                }
                marginLayoutParams.topMargin = iLIZ;
                C786410Ut5.g6(textView, marginLayoutParams);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.duz, viewGroup, false);
    }
}

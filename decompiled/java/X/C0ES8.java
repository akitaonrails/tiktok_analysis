package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ES8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ES8 extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;
    public TextView LLJIJIL;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C0ES8(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        TuxTextView tuxTextView;
        super.onViewCreated(view, bundle);
        this.LLJIJIL = (TextView) findViewById(R.id.qf1);
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int iIntValue = 0;
            if (C1415610mwR.LIZ() / C1415610mwR.LIZIZ() > 2.3d) {
                z = true;
                i = 25;
            } else {
                z = false;
                i = 35;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            if (z && (textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                tuxTextView.setTuxFont(71);
            }
            if (!C1462920oAk.LIZJ(textView, iLIZIZ, marginLayoutParams.topMargin)) {
                Activity activity = this.mActivity;
                if (activity != null) {
                    iIntValue = Integer.valueOf(ScreenUtils.getStatusBarHeight(activity)).intValue();
                }
                marginLayoutParams.topMargin = iIntValue + C366700EZg.LIZ(22.0d);
                C786410Ut5.g6(textView, marginLayoutParams);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.dv0, viewGroup, false);
    }
}

package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378850EtH extends AbstractC1664490tPr<C378800EtC, C07YG> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 622));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(170));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int i;
        int i2;
        super.onViewCreated(this.mView, bundle);
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.y0m);
        int i3 = 8;
        if (((Boolean) this.LLJJJJ.getValue()).booleanValue()) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        tuxTextView.setText(this.mView.getContext().getString(2131834020));
        ConstraintLayout constraintLayout = (ConstraintLayout) requireViewById(R.id.dd6);
        if (((Boolean) this.LLJJJJ.getValue()).booleanValue()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LL(i2, constraintLayout);
        C786410Ut5.Y7(constraintLayout, new ACListenerS140S0100000_5(this, 70));
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.pp_);
        if (((Boolean) this.LLJJJJ.getValue()).booleanValue()) {
            i3 = 0;
        }
        C786410Ut5.LJZ(i3, frameLayout);
        C0EG9.LIZ(frameLayout, new AwS549S0100000_5(this, 623));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzw, viewGroup, false);
    }
}

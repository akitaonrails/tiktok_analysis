package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS41S0500000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ETH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETH extends AbstractC1664490tPr<C0ETE, C0ETF> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 612));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(167));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onViewCreated(this.mView, bundle);
        FrameLayout frameLayout = (FrameLayout) this.mView.findViewById(R.id.dd8);
        C0EG9.LIZ(frameLayout, new AwS549S0100000_5(this, 613));
        TextView textView = (TextView) this.mView.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(this.mView.getContext().getString(2131828372));
        }
        TuxIconView tuxIconView = (TuxIconView) this.mView.findViewById(R.id.jjx);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 69));
        } else {
            tuxIconView = null;
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.mView.findViewById(R.id.j2n);
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS140S0100000_5(this, 68));
        } else {
            tuxIconView2 = null;
        }
        View viewFindViewById = this.mView.findViewById(R.id.t66);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.mView.findViewById(R.id.dd6);
        C786410Ut5.Y7(constraintLayout, new ACListenerS140S0100000_5(this, 67));
        if (((Boolean) this.LLJJJJ.getValue()).booleanValue()) {
            C337180DJs.LIZJ(frameLayout);
            C337180DJs.LIZ(viewFindViewById);
            C337180DJs.LIZ(constraintLayout);
        } else {
            C337180DJs.LIZ(frameLayout);
            C337180DJs.LIZJ(viewFindViewById);
            C337180DJs.LIZJ(constraintLayout);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ETG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0ETE) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(tuxIconView, 539));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ETI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ETE) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS41S0500000_5(tuxIconView, this, tuxIconView2, constraintLayout, frameLayout, 1));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0a, viewGroup, false);
    }
}

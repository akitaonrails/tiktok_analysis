package X;

import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559150LwP extends AbstractC1664490tPr<C559140LwO, C1170504hz> {
    public View LLJJJIL;
    public View LLJJJJ;
    public C1295960jpS LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C1295960jpS c1295960jpS = this.LLJJJJJIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C1295960jpS c1295960jpS = this.LLJJJJJIL;
        if (c1295960jpS != null) {
            c1295960jpS.playAnimation();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJIL = requireViewById(R.id.o1o);
        this.LLJJJJ = requireViewById(R.id.ap0);
        this.LLJJJJJIL = (C1295960jpS) requireViewById(R.id.aoy);
        this.LLJJJJLIIL = (TuxTextView) requireViewById(R.id.ap1);
        this.LLJJL = (TuxTextView) requireViewById(R.id.ap4);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) requireViewById(R.id.ap3);
        this.LLJL = requireViewById(R.id.aqy);
        C197039127h c197039127h = (C197039127h) requireViewById(R.id.aqx);
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        c197039127h.setBackground(C800330VaR.LIZIZ(c197039127h.getContext(), R.drawable.all));
        C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 27));
        View view = this.LLJJJIL;
        if (view != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0LwS
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        }
        AbstractC1664490tPr.LLLLLIL(this, new AwS587S0100000_8(this, 109));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.fs3, viewGroup, false);
    }
}

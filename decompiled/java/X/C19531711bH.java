package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19531711bH extends AbstractC1664490tPr<C19531411bE, C19531611bG> {
    public final int LLJJJIL;
    public ViewGroup LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C437600HDy LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;

    public C19531711bH(int i) {
        this.LLJJJIL = i;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJJJIL = (LinearLayout) requireViewById(R.id.y5y);
        this.LLJJJJLIIL = (C437600HDy) requireViewById(R.id.nl9);
        this.LLJJL = (TuxTextView) requireViewById(R.id.fyd);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) requireViewById(R.id.fye);
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.apa);
        this.LLJL = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 5), tuxTextView);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11bK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19531411bE) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 54));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11bF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19531411bE) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 57));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, this.LLJJJIL, viewGroup, false);
        this.LLJJJJ = viewGroup2;
        return viewGroup2;
    }
}

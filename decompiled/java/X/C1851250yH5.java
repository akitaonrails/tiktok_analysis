package X;

import Y.ACListenerS161S0100000_27;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851250yH5 extends AbstractC1664490tPr<C1851220yH2, C1851260yH6> {
    public View LLJJJIL;
    public TuxTextView LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1221));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1222));
    public C0P0T LLJJL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        TuxTextView tuxTextView;
        super.onViewCreated(this.mView, bundle);
        if (C307460C3k.LIZIZ()) {
            C786410Ut5.LJLLLLLL(8, requireViewById(R.id.ga7));
            View viewRequireViewById = requireViewById(R.id.gaa);
            C786410Ut5.LJLLLLLL(0, viewRequireViewById);
            this.LLJJJIL = viewRequireViewById.findViewById(R.id.ga9);
            this.LLJJJJ = (TuxTextView) viewRequireViewById.findViewById(R.id.api);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJJJLIIL.getValue(), 0);
            ((TextView) this.LLJJJJLIIL.getValue()).setText((String) C2536709wr.LIZ.getValue());
        } else {
            C786410Ut5.LJLLLLLL(8, requireViewById(R.id.gaa));
            View viewRequireViewById2 = requireViewById(R.id.ga7);
            this.LLJJJIL = viewRequireViewById2;
            if (viewRequireViewById2 != null) {
                tuxTextView = (TuxTextView) viewRequireViewById2.findViewById(R.id.api);
            } else {
                tuxTextView = null;
            }
            this.LLJJJJ = tuxTextView;
        }
        View view = this.LLJJJIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 155), view);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yH1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851220yH2) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 398));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yH0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851220yH2) obj).LIZIZ;
            }
        }, new AwS606S0100000_27(this, 400));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yH3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1851220yH2) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 402));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f857ms, viewGroup, false);
    }
}

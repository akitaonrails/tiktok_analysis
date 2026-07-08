package X;

import Y.ACListenerS161S0100000_27;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851480yHS extends AbstractC1664490tPr<C1851430yHN, C1851470yHR> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1181));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onViewCreated(this.mView, bundle);
        C786410Ut5.O7((FrameLayout) this.LLJJJIL.getValue(), new ACListenerS161S0100000_27(this, 148));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yHO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851430yHN) obj).LIZ;
            }
        }, new AwS606S0100000_27(this, 405));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mp, viewGroup, false);
    }
}

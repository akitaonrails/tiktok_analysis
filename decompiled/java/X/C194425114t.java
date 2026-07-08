package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.114t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194425114t extends AbstractC1664490tPr<C11Z2, C194427114v> {
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.114u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C11Z2) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 75));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 25), requireViewById(R.id.bn2));
        if (C276180As4.LIZ()) {
            C786410Ut5.LJLLLLLL(8, requireViewById(R.id.fkk));
            return;
        }
        View viewRequireViewById = requireViewById(R.id.fkk);
        if (viewRequireViewById == null) {
            return;
        }
        C786410Ut5.I7(new C12Y7(this, 1, 42), viewRequireViewById);
        C786410Ut5.LJLLLLLL(0, viewRequireViewById);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqe, viewGroup, false);
    }
}

package X;

import Y.ACListenerS156S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416270mxV extends AbstractC1664490tPr<C1416250mxT, C1416260mxU> {
    public TuxTextView LLJJJIL;
    public LinearLayout LLJJJJ;
    public View LLJJJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mxX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1416250mxT) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 295));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mxW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1416250mxT) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 296));
        View view = this.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 27), view);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.nc, viewGroup, false);
        this.LLJJJIL = (TuxTextView) viewGroup2.findViewById(R.id.av0);
        viewGroup2.findViewById(R.id.arg);
        this.LLJJJJ = (LinearLayout) viewGroup2.findViewById(R.id.arf);
        this.LLJJJJJIL = viewGroup2.findViewById(R.id.fkq);
        return viewGroup2;
    }
}

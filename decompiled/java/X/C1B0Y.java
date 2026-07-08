package X;

import Y.ACListenerS168S0100000_34;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1B0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B0Y extends AbstractC1664490tPr<C1819740xSG, C1260304wT> {
    public View LLJJJIL;
    public C1749280vcc LLJJJJ;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.16Dv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1819740xSG) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 63));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0xdg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1819740xSG) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 64));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0xSB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1819740xSG) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 65));
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS168S0100000_34(this, 27), view2);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2s, viewGroup, false);
        this.LLJJJIL = viewGroup2.findViewById(R.id.tf5);
        this.LLJJJJ = (C1749280vcc) viewGroup2.findViewById(R.id.nnh);
        return viewGroup2;
    }
}

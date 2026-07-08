package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0H9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436400H9i extends AbstractC1664490tPr<C436440H9m, C2274891E2l> {
    public C419260GcG LLJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = (C419260GcG) this.mView.findViewById(R.id.qen);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0H9n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C436440H9m) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 167));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0H9k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C436440H9m) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 168));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0H9l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C436440H9m) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 169));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.dut, viewGroup, false);
    }
}

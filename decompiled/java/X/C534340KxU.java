package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534340KxU extends AbstractC1664490tPr<C534360KxW, C1461330o8B> {
    public TuxTextView LLJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0KxV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C534360KxW) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 72));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d5n, viewGroup, false);
        this.LLJJJIL = (TuxTextView) viewTd.findViewById(R.id.qco);
        return (ViewGroup) viewTd;
    }
}

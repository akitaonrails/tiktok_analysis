package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FCO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCO extends AbstractC1664490tPr<C0FCQ, C0FCS> {
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FCP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FCQ) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 0));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.faj, viewGroup, false);
    }
}

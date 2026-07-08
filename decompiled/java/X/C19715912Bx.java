package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19715912Bx extends AbstractC1664490tPr<C759640Tr0, C19716112Bz> {
    public View LLJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.mView.findViewById(R.id.rl9);
        this.LLJJJIL = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.findViewById(R.id.n9h);
        }
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            view2.findViewById(R.id.title);
        }
        View view3 = this.LLJJJIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 92), view3);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.dur, viewGroup, false);
    }
}

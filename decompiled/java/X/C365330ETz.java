package X;

import Y.ACListenerS137S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ETz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365330ETz extends AbstractC1664490tPr<AnonymousClass0049, C1260104wR> {
    public C365330ETz() {
        setTheme(R.style.y0);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.e1v);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS137S0100000_2(this, 51), viewFindViewById);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bz4, viewGroup, false);
    }
}

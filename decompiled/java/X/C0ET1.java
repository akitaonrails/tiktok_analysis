package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ET1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ET1 extends AbstractC1664490tPr<C365050ESx, C365060ESy> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 393));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onViewCreated(this.mView, bundle);
        if (!C357780E0y.LIZ()) {
            ((TextView) requireViewById(R.id.y36)).setText(this.mView.getContext().getString(2131834085));
        }
        C786410Ut5.a9((TuxIconView) requireViewById(R.id.jks), new ACListenerS140S0100000_5(this, 37));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        if (C357780E0y.LIZ()) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2g, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2f, viewGroup, false);
    }
}

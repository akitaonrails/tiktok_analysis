package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12DT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12DT extends AbstractC1664490tPr<C214768193e, Unit> {
    public ViewGroup LLJJJIL;

    public C12DT() {
        disableSceneRestore();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(requireSceneContext());
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LLJJJIL = linearLayout;
        return linearLayout;
    }
}

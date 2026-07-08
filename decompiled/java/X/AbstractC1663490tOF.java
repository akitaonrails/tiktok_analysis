package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0tOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1663490tOF<STATE, ACTION> extends AbstractC1664490tPr<STATE, ACTION> {
    public View LLJJJIL;

    public abstract void LLLLLJIL();

    public abstract void LLLLLJLJLL();

    public abstract void LLLLLL();

    public abstract void LLLLLLJ();

    @Override // X.AbstractC1664490tPr
    public void onHide() {
    }

    @Override // X.AbstractC1664490tPr
    public void onShow() {
    }

    public AbstractC1663490tOF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("zxzzz_");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void LLLLLLIL() {
        this.LLJJJIL = requireView();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLLLIL();
        LLLLLL();
        LLLLLJLJLL();
        LLLLLJIL();
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LLLLLLJ();
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.wn, viewGroup, false);
    }
}

package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0t6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1652330t6F<STATE, ACTION> extends AbstractC1664490tPr<STATE, ACTION> {
    public final C20088213iq LLJJJIL = C20088213iq.LIZIZ;
    public final ViewGroup.LayoutParams LLJJJJ = new ViewGroup.LayoutParams(-2, -2);

    public abstract void LLLLLJIL(STATE state, ACTION action, InterfaceC1680500tpg interfaceC1680500tpg, int i);

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireSceneContext(), null, 6);
        C786410Ut5.k6(composeView, this.LLJJJJ);
        ViewTreeViewModelStoreOwner.set(composeView, this);
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        ViewTreeLifecycleOwner.set(composeView, this);
        composeView.setViewCompositionStrategy(this.LLJJJIL);
        composeView.setContent(new C19719212De(1824588627, new AwS639S0100000_25(this, 99), true));
        return composeView;
    }
}

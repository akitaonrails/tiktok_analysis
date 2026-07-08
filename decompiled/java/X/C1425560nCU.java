package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0nCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425560nCU extends AbstractC1664490tPr<C1423910n9p, C1423920n9q> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 419));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC1427810nG7 enumC1427810nG7;
        ComposeView composeView = new ComposeView((Context) this.LLJJJIL.getValue(), null, 6);
        ViewTreeViewModelStoreOwner.set(composeView, this);
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        ViewTreeLifecycleOwner.set(composeView, this);
        if (!AbstractC1671300taq.LIZ) {
            enumC1427810nG7 = EnumC1427810nG7.Light;
        } else {
            enumC1427810nG7 = EnumC1427810nG7.Dark;
        }
        C1669670tYD.LJ(composeView, enumC1427810nG7, new C19719212De(-1771057972, new AwS639S0100000_25(this, 66), true));
        return composeView;
    }
}

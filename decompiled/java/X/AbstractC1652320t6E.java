package X;

import X.C05YF;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0t6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1652320t6E<T extends C05YF> extends AbstractC1664510tPt<T> {
    public static final int LLJILJILJ = 0;
    public final int LLJILJIL;

    public abstract void z4(InterfaceC1680500tpg interfaceC1680500tpg, int i);

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return this.LLJILJIL;
    }

    public AbstractC1652320t6E(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = R.layout.bfn;
    }

    @Override // X.AbstractC1664510tPt
    public void H3(C19A3 c19a3, View view) {
        if (!(view instanceof ComposeView)) {
            return;
        }
        ViewTreeViewModelStoreOwner.set(view, c19a3);
        view.setTag(R.id.view_tree_saved_state_registry_owner, c19a3);
        ViewTreeLifecycleOwner.set(view, c19a3);
        ComposeView composeView = (ComposeView) view;
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        composeView.setContent(new C19719212De(-1915380175, new AwS639S0100000_25(this, 100), true));
    }
}

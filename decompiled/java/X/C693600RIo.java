package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.ContainerTree;

/* JADX INFO: renamed from: X.0RIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693600RIo {
    public static ContainerTree LIZ(BaseContainer baseContainer) {
        while (true) {
            BaseContainer<?, ?> baseContainer2 = baseContainer.LLJJL;
            if (baseContainer2 == null) {
                break;
            }
            baseContainer = baseContainer2;
        }
        ContainerTree containerTree = (ContainerTree) new ViewModelProvider(baseContainer).get(ContainerTree.class);
        if (containerTree != null) {
            return containerTree;
        }
        throw new IllegalStateException("Root Container must is ViewModelStoreOwner.");
    }
}

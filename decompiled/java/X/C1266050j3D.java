package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser.FriendsV3BottomRecUserListCell;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListHeaderCell;

/* JADX INFO: renamed from: X.0j3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266050j3D implements ViewModelStoreOwner {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        switch (this.$t) {
            case 0:
                return getViewModelStore$0(this);
            case 1:
                return getViewModelStore$1(this);
            case 2:
                return getViewModelStore$2(this);
            case 3:
                return getViewModelStore$3(this);
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C1266050j3D c1266050j3D) {
        return ((FriendsV3BottomRecUserListCell) c1266050j3D.l0).LL;
    }

    public static final ViewModelStore getViewModelStore$1(C1266050j3D c1266050j3D) {
        return (ViewModelStore) ((ProfilePlatformProtocol) c1266050j3D.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C1266050j3D c1266050j3D) {
        return (ViewModelStore) ((SelectorListContactCell) c1266050j3D.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C1266050j3D c1266050j3D) {
        return (ViewModelStore) ((SelectorListHeaderCell) c1266050j3D.l0).LL.getValue();
    }

    public C1266050j3D(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

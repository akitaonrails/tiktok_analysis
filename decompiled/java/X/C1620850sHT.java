package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3LVBCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other.FriendsV3RepostEntranceCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.publish.FriendsV3PublishCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser.FriendsV3HorizontalRecUserCardCell;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaCell;

/* JADX INFO: renamed from: X.0sHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620850sHT implements ViewModelStoreOwner {
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
            case 4:
                return getViewModelStore$4(this);
            case 5:
                return getViewModelStore$5(this);
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C1620850sHT c1620850sHT) {
        return (ViewModelStore) ((FriendsV3LVBCell) c1620850sHT.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C1620850sHT c1620850sHT) {
        return (ViewModelStore) ((FriendsV3RepostEntranceCell) c1620850sHT.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C1620850sHT c1620850sHT) {
        return (ViewModelStore) ((FriendsV3PublishCell) c1620850sHT.l0).LLIZLLLIL.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C1620850sHT c1620850sHT) {
        return (ViewModelStore) ((FriendsV3HorizontalRecUserCardCell) c1620850sHT.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$4(C1620850sHT c1620850sHT) {
        return (ViewModelStore) ((MainTabStrip) c1620850sHT.l0).LLJJL.getValue();
    }

    public static final ViewModelStore getViewModelStore$5(C1620850sHT c1620850sHT) {
        return (ViewModelStore) ((DetailMediaCell) c1620850sHT.l0).LL.getValue();
    }

    public C1620850sHT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBaseCell;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent;

/* JADX INFO: renamed from: X.0Syd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738890Syd implements ViewModelStoreOwner {
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
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C738890Syd c738890Syd) {
        return (ViewModelStore) ((AssemPowerCell) c738890Syd.l0).LLILLL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C738890Syd c738890Syd) {
        return (ViewModelStore) ((ReactionBaseCell) c738890Syd.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C738890Syd c738890Syd) {
        return (ViewModelStore) ((FriendsV3BaseAwemeCell) c738890Syd.l0).LLIZ.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C738890Syd c738890Syd) {
        return (ViewModelStore) ((BaseUserFeedComponent) c738890Syd.l0).LLJLLL.getValue();
    }

    public static final ViewModelStore getViewModelStore$4(C738890Syd c738890Syd) {
        return ((LandscapeFragmentPanel) c738890Syd.l0).LLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C738890Syd(Object obj, AssemPowerCell<ReusedUISlotAssem<? extends C03H5>, InterfaceC1891350zJl> assemPowerCell) {
        this.$t = assemPowerCell;
        this.l0 = obj;
    }
}

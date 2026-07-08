package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder.SendGiftBinder;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.ui.PhotoModeCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinProfileToolkitCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchCardCell;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell;

/* JADX INFO: renamed from: X.1Amu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189701Amu implements ViewModelStoreOwner {
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

    public static final ViewModelStore getViewModelStore$0(C2189701Amu c2189701Amu) {
        return (ViewModelStore) ((SendGiftBinder) c2189701Amu.l0).LLILLJJLI.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C2189701Amu c2189701Amu) {
        return (ViewModelStore) ((PlaylistCollectionCell) c2189701Amu.l0).LLILZ.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C2189701Amu c2189701Amu) {
        return (ViewModelStore) ((PhotoModeCell) c2189701Amu.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C2189701Amu c2189701Amu) {
        return (ViewModelStore) ((BulletinProfileToolkitCell) c2189701Amu.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$4(C2189701Amu c2189701Amu) {
        return (ViewModelStore) ((WorkBenchCardCell) c2189701Amu.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$5(C2189701Amu c2189701Amu) {
        return (ViewModelStore) ((StoryGalleryCoverCell) c2189701Amu.l0).LL.getValue();
    }

    public C2189701Amu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

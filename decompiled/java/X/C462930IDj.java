package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinSelectEmojiCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinSelectEmojiPopupCell;

/* JADX INFO: renamed from: X.0IDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462930IDj implements ViewModelStoreOwner {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        switch (this.$t) {
            case 0:
                return getViewModelStore$0(this);
            case 1:
                return getViewModelStore$1(this);
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C462930IDj c462930IDj) {
        return (ViewModelStore) ((BulletinSelectEmojiCell) c462930IDj.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C462930IDj c462930IDj) {
        return (ViewModelStore) ((BulletinSelectEmojiPopupCell) c462930IDj.l0).LL.getValue();
    }

    public C462930IDj(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

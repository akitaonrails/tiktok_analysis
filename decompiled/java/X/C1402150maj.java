package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.list.PhotoModeInnerFlowCommentItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.list.PhotoModeInnerFlowCommentMoreItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.list.PhotoModeInnerFlowCommentSecondaryItemCell;

/* JADX INFO: renamed from: X.0maj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402150maj implements ViewModelStoreOwner {
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

    public static final ViewModelStore getViewModelStore$0(C1402150maj c1402150maj) {
        return (ViewModelStore) ((PhotoModeInnerFlowCommentItemCell) c1402150maj.l0).LLLLZLL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C1402150maj c1402150maj) {
        return (ViewModelStore) ((PhotoModeInnerFlowCommentMoreItemCell) c1402150maj.l0).LLJJIJI.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C1402150maj c1402150maj) {
        return (ViewModelStore) ((PhotoModeInnerFlowCommentSecondaryItemCell) c1402150maj.l0).LLLZIL.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C1402150maj c1402150maj) {
        return (ViewModelStore) ((ViewOnTouchListenerC1351130lGR) c1402150maj.l0).LLJLIL.getValue();
    }

    public C1402150maj(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

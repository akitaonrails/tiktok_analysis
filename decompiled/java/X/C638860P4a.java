package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentMoreCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentStatusFooterCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinCommentBaseCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinCommentEntryCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiActionCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiDetailContentCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiNumCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinMaskActionCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinPopSelectEmojiCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinProfileCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinQuickPostCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchMiddleBannerCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchMiddleBannerMoreCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0P4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638860P4a implements ViewModelStoreOwner {
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
            case 6:
                return getViewModelStore$6(this);
            case 7:
                return getViewModelStore$7(this);
            case 8:
                return getViewModelStore$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return getViewModelStore$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return getViewModelStore$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return getViewModelStore$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return getViewModelStore$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return getViewModelStore$13(this);
            case 14:
                return getViewModelStore$14(this);
            case 15:
                return getViewModelStore$15(this);
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinCommentMoreCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinCommentSheetCell) c638860P4a.l0).LLIZLLLIL.getValue();
    }

    public static final ViewModelStore getViewModelStore$10(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinEmojiNumCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$11(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinMaskActionCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$12(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinPopSelectEmojiCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$13(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinProfileCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$14(C638860P4a c638860P4a) {
        return (ViewModelStore) ((WorkbenchMiddleBannerCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$15(C638860P4a c638860P4a) {
        return (ViewModelStore) ((WorkbenchMiddleBannerMoreCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinCommentStatusFooterCell) c638860P4a.l0).LLILLJJLI.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinQuickPostCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$4(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinBaseCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$5(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinCommentBaseCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$6(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinCommentEntryCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$7(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinEmojiActionCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$8(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinEmojiCell) c638860P4a.l0).LL.getValue();
    }

    public static final ViewModelStore getViewModelStore$9(C638860P4a c638860P4a) {
        return (ViewModelStore) ((BulletinEmojiDetailContentCell) c638860P4a.l0).LL.getValue();
    }

    public C638860P4a(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617580OKe extends AbstractC1377610lx9 {
    public final BulletinShareModel LIZ;
    public final Activity LIZIZ;

    @Override // X.AbstractC1377630lxB
    public final String LIZJ() {
        return "bulletin_board_invite";
    }

    @Override // X.AbstractC1377630lxB
    public final ShareContentType[] LIZLLL() {
        return new ShareContentType[]{ShareContentType.LINK};
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZ() {
        return this.LIZ.shareDesc;
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZIZ() {
        return this.LIZ.bulletinId;
    }

    @Override // X.AbstractC1377630lxB
    public final ShareModel LJ() {
        return new ShareModel(this.LIZ.bulletinInfo);
    }

    @Override // X.AbstractC1377630lxB
    public final Bundle LJFF() {
        Integer num;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("app_name", this.LIZIZ.getString(R.string.drg), bundle);
        C786410Ut5.LJJJI("channel_id", this.LIZ.bulletinId, bundle);
        int i = this.LIZ.identity;
        EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_CREATOR;
        bundle.putInt("is_author", i == enumC617060OIe.getValue() ? 1 : 0);
        if (this.LIZ.identity == enumC617060OIe.getValue() || (num = this.LIZ.subscribeStatus) == null) {
            bundle.putInt("is_subscribed", -1);
        } else {
            bundle.putInt("is_subscribed", num.intValue());
        }
        C786410Ut5.LJJIZ(bundle, "bulletin_info_cover", this.LIZ.bulletinInfo.avatarUrl);
        C786410Ut5.LJJJI("enter_from", "bulletin_board_detail_page", bundle);
        return bundle;
    }

    @Override // X.AbstractC1377630lxB
    public final String LJI() {
        return this.LIZ.shareTitle;
    }

    @Override // X.AbstractC1377630lxB
    public final String LJII() {
        return this.LIZ.shareUrl;
    }

    public C617580OKe(BulletinShareModel bulletinShareModel, C19EG c19eg) {
        this.LIZ = bulletinShareModel;
        this.LIZIZ = c19eg;
    }
}

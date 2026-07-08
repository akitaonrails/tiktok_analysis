package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContentExtKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.06gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672406gk extends C06OD<C06AH> {
    public final C909290Zln LLILLL;
    public final C1671006gW LLILZ;

    @Override // X.C06OD
    public final void LIZLLL() {
        this.LLILZ.LIZIZ();
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        String strLIZLLL;
        C06AH c06ah = (C06AH) c06oo;
        C1671006gW c1671006gW = this.LLILZ;
        IMUser fromUser = this.LLILLL.getFromUser();
        if (fromUser != null) {
            IMNoticeMsgStruct iMNoticeMsgStruct = c06ah.LIZJ;
            c1671006gW.LJI(iMNoticeMsgStruct.noticeCode);
            C422800Ghy topAvatarImageView = c1671006gW.getTopAvatarImageView();
            if (topAvatarImageView != null) {
                int visibility = topAvatarImageView.getVisibility();
                topAvatarImageView.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, topAvatarImageView);
            }
            TuxTextView topFollowButton = c1671006gW.getTopFollowButton();
            if (topFollowButton != null) {
                C786410Ut5.LLLLZLL(topFollowButton, 0);
            }
            C0I98.LJFF(c1671006gW.getTopAvatarImageView(), fromUser.getDisplayAvatar(), "chatTopTip", null, null, 0, 0, true, null, false);
            c1671006gW.LJFF(SystemContentExtKt.toSystemContent(iMNoticeMsgStruct));
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            IIMAnalyticsUtil.LIZ.getClass();
            IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
            if (iIMAnalyticsUtilLIZ != null) {
                strLIZLLL = iIMAnalyticsUtilLIZ.LIZLLL(c1671006gW.getSessionInfo());
            } else {
                strLIZLLL = null;
            }
            c1260910iuv.LJJIJLIJ(strLIZLLL);
            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.SHOW;
            User user = new User();
            user.setUid(fromUser.getUid());
            user.setFollowStatus(fromUser.getFollowStatus());
            c1260910iuv.LJJJJZI(user);
            c1260910iuv.LJIILJJIL();
        }
        return c1671006gW;
    }

    public C1672406gk(C909290Zln c909290Zln, C1671006gW c1671006gW) {
        super(EnumC1596306Mv.TOP_TIP_FOLLOW);
        this.LLILLL = c909290Zln;
        this.LLILZ = c1671006gW;
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        if (!this.LL.isDebugMode() && this.LLILLL.getFromUser() == null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

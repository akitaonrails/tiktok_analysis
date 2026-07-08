package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0i4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228370i4R extends C1225970i0Z {
    public final C1226040i0g LLILLL;
    public C099G LLILZ;
    public List<? extends AbstractC1223800hx4> LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final void LJJIIJ() {
        this.LLILZ = C23250099c.LIZIZ(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C1228330i4N(this, null), 3);
    }

    public C1228370i4R(C1226040i0g c1226040i0g) {
        super(c1226040i0g);
        this.LLILLL = c1226040i0g;
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(789));
    }

    public static IMUser LJJJJJ(User user) {
        String uri;
        List<String> listLIZ;
        String uri2;
        long jLongValue;
        long followerCount;
        long followingCount;
        IMUser iMUser = new IMUser();
        iMUser.setUid(String.valueOf(user.getId()));
        iMUser.setNickName(user.getNickName());
        iMUser.setUniqueId(user.getDisplayId());
        UrlModel urlModel = new UrlModel();
        ImageModel avatarThumb = user.getAvatarThumb();
        List<String> listLIZ2 = null;
        if (avatarThumb != null) {
            uri = avatarThumb.getUri();
        } else {
            uri = null;
        }
        urlModel.setUri(uri);
        ImageModel avatarThumb2 = user.getAvatarThumb();
        if (avatarThumb2 != null) {
            listLIZ = C842240X2g.LIZ(avatarThumb2);
        } else {
            listLIZ = null;
        }
        urlModel.setUrlList(listLIZ);
        iMUser.setAvatarThumb(urlModel);
        UrlModel urlModel2 = new UrlModel();
        ImageModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium != null) {
            uri2 = avatarMedium.getUri();
        } else {
            uri2 = null;
        }
        urlModel2.setUri(uri2);
        ImageModel avatarMedium2 = user.getAvatarMedium();
        if (avatarMedium2 != null) {
            listLIZ2 = C842240X2g.LIZ(avatarMedium2);
        }
        urlModel2.setUrlList(listLIZ2);
        iMUser.setAvatarMedium(urlModel2);
        Long l = user.followStatus;
        long followStatus = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        iMUser.setFollowStatus((int) jLongValue);
        FollowInfo followInfo = user.getFollowInfo();
        if (followInfo != null) {
            followerCount = followInfo.getFollowerCount();
        } else {
            followerCount = 0;
        }
        iMUser.setFollowerCount((int) followerCount);
        FollowInfo followInfo2 = user.getFollowInfo();
        if (followInfo2 != null) {
            followingCount = followInfo2.getFollowingCount();
        } else {
            followingCount = 0;
        }
        iMUser.setFollowingCount((int) followingCount);
        FollowInfo followInfo3 = user.getFollowInfo();
        if (followInfo3 != null) {
            followStatus = followInfo3.getFollowStatus();
        }
        iMUser.setFollowerStatus((int) followStatus);
        iMUser.setBlockStatus(iMUser.isBlock() ? 1 : 0);
        iMUser.setEnterpriseVerifyReason(user.getVerifiedReason());
        iMUser.setCustomVerify(user.getVerifiedReason());
        iMUser.setUpdateTime(Long.valueOf(user.getModifyTime()));
        iMUser.setSignature(user.getAutoGraph());
        return iMUser;
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1228360i4Q(this, null), interfaceC1364105Vn);
    }

    public final C1224840hyk LJJJJIZL(IMUser iMUser, boolean z) {
        boolean zLJJJJ;
        C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, EnumC1226540i1U.TAB_KEY_FRIENDS_FOR_PRE_LIVE.getValue());
        EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
        UrlModel displayAvatar = iMUser.getDisplayAvatar();
        String strLIZ = C1226910i25.LIZ(iMUser);
        String uid = iMUser.getUid();
        if (uid == null) {
            uid = "";
        }
        String uniqueId = iMUser.getUniqueId();
        Set<String> set = this.LLILLL.LJIIJ;
        if (set != null) {
            zLJJJJ = C13LP.LJJJJ(iMUser.getUid(), set);
        } else {
            zLJJJJ = false;
        }
        return new C1224840hyk(c1224850hyl, enumC1224830hyj, "private", uid, displayAvatar, strLIZ, uniqueId, true, true, C2097608Jq.LJIIIIZZ(new Pair("contact", iMUser), new Pair("is_multi_guest_friend", Boolean.valueOf(z))), zLJJJJ, false, false, false, false, 1024);
    }
}

package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.Avatars;
import com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201771BFf {
    public static final UrlModel LIZ() {
        UrlModel urlModel = new UrlModel();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res://");
        sbLIZ.append(C1383370m6R.LIZ.getPackageName());
        sbLIZ.append('/');
        sbLIZ.append(R.raw.icon_color_default_avatar);
        urlModel.setUrlList(C1697810uHb.LJ(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).toString()));
        return urlModel;
    }

    public static final void LIZIZ(IMUser iMUser, Boolean bool) {
        if (iMUser != null) {
            if (iMUser.isBlocked() || Intrinsics.LJFF(bool, Boolean.TRUE)) {
                iMUser.setNickName(C1383370m6R.LJIIJ(2131822987));
                UrlModel urlModelLIZ = LIZ();
                iMUser.setAvatarThumb(urlModelLIZ);
                iMUser.setAvatarMedium(urlModelLIZ);
                iMUser.setFollowStatus(0);
                iMUser.setFollowerStatus(0);
            }
        }
    }

    public static final void LIZJ(IMUserBaseInfo iMUserBaseInfo, Boolean bool) {
        BlockInfo blockInfo = iMUserBaseInfo.getBlockInfo();
        if ((blockInfo != null && blockInfo.blockedBy) || Intrinsics.LJFF(bool, Boolean.TRUE)) {
            iMUserBaseInfo.setContactNickName(C1383370m6R.LJIIJ(2131822987));
            UrlModel urlModelLIZ = LIZ();
            iMUserBaseInfo.setAvatars(new Avatars(urlModelLIZ, urlModelLIZ));
            EnumC1240560iO6 enumC1240560iO6 = EnumC1240560iO6.NO_RELATION;
            iMUserBaseInfo.setFollowStatus(Integer.valueOf(enumC1240560iO6.getStatus()));
            iMUserBaseInfo.setFollowerStatus(enumC1240560iO6.getStatus());
        }
    }
}

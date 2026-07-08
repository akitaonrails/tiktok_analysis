package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1477805qS {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(888));

    public static void LIZ(ShareUserContent shareUserContent) {
        C09AE c09ae;
        if (shareUserContent != null) {
            int iHashCode = shareUserContent.hashCode();
            C01GW c01gw = LIZ;
            Reference reference = (Reference) ((ConcurrentMap) c01gw.getValue()).get(Integer.valueOf(iHashCode));
            if (reference != null && (c09ae = (C09AE) reference.get()) != null) {
                c09ae.LIZIZ(null);
            }
            ((ConcurrentMap) c01gw.getValue()).remove(Integer.valueOf(iHashCode));
        }
    }

    public static C1477705qR LIZIZ(IMUser iMUser, ShareUserContent shareUserContent) {
        String strLIZIZ;
        boolean z;
        String uid = iMUser.getUid();
        String nickName = iMUser.getNickName();
        UrlModel avatarThumb = null;
        if (iMUser.isBlocked()) {
            strLIZIZ = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(iMUser.getUniqueId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!iMUser.isBlocked()) {
            avatarThumb = iMUser.getAvatarThumb();
        }
        Integer numValueOf = Integer.valueOf(iMUser.getFollowStatus());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        List<UrlModel> awemeCoverList = shareUserContent.getAwemeCoverList();
        if (awemeCoverList == null) {
            awemeCoverList = C13BV.INSTANCE;
        }
        return new C1477705qR(uid, nickName, strLIZIZ, avatarThumb, z2, awemeCoverList);
    }
}

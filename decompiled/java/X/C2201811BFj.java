package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;

/* JADX INFO: renamed from: X.1BFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201811BFj {
    public static final /* synthetic */ int LIZ = 0;

    public static IMUserBaseInfo LIZ(C2201831BFl c2201831BFl) {
        int iIntValue;
        boolean z;
        int iIntValue2;
        IMUserBaseInfo iMUserBaseInfo = new IMUserBaseInfo();
        iMUserBaseInfo.setUserId(c2201831BFl.LIZ);
        iMUserBaseInfo.setAvatarThumbStr(c2201831BFl.LIZIZ);
        iMUserBaseInfo.setAvatarMediumStr(c2201831BFl.LIZJ);
        iMUserBaseInfo.setContactNickName(c2201831BFl.LIZLLL);
        iMUserBaseInfo.setUniqueId(c2201831BFl.LJ);
        iMUserBaseInfo.setFollowStatus(c2201831BFl.LJFF);
        iMUserBaseInfo.setFollowerCount(c2201831BFl.LJI);
        iMUserBaseInfo.setFollowingCount(c2201831BFl.LJII);
        iMUserBaseInfo.setMafStatus(c2201831BFl.LJIIIIZZ);
        iMUserBaseInfo.setRecType(c2201831BFl.LJIIIZ);
        iMUserBaseInfo.setUpdateTime(c2201831BFl.LJIIJ);
        iMUserBaseInfo.setSortWeight(c2201831BFl.LJIIJJI);
        iMUserBaseInfo.setInitialLetter(c2201831BFl.LJIIL);
        iMUserBaseInfo.setExtra(c2201831BFl.LJIILIIL);
        Integer num = c2201831BFl.LJIILJJIL;
        int iIntValue3 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        iMUserBaseInfo.setFollowerStatus(iIntValue);
        Integer num2 = c2201831BFl.LJIILL;
        boolean z2 = true;
        if (num2 != null && num2.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        Integer num3 = c2201831BFl.LJIILLIIL;
        if (num3 == null || num3.intValue() != 1) {
            z2 = false;
        }
        iMUserBaseInfo.setBlockInfo(new BlockInfo(z, z2));
        iMUserBaseInfo.setRecommendReason(c2201831BFl.LJIIZILJ);
        iMUserBaseInfo.setEnterpriseVerifyReason(c2201831BFl.LJIJ);
        iMUserBaseInfo.setUserVerifyReason(c2201831BFl.LJIJI);
        Integer num4 = c2201831BFl.LJIJJ;
        if (num4 != null) {
            iIntValue2 = num4.intValue();
        } else {
            iIntValue2 = 0;
        }
        iMUserBaseInfo.setUserVerifyType(iIntValue2);
        Integer num5 = c2201831BFl.LJIJJLI;
        if (num5 != null) {
            iIntValue3 = num5.intValue();
        }
        iMUserBaseInfo.setDeleted(iIntValue3);
        return iMUserBaseInfo;
    }
}

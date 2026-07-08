package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;

/* JADX INFO: renamed from: X.1BFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201921BFu {
    public static final IMUser LIZ(C2201931BFv c2201931BFv) {
        Object objLIZ;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z;
        boolean z2;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        Object objLIZ2 = null;
        try {
            objLIZ = C051M.LIZ(UrlModel.class, c2201931BFv.LIZIZ);
            try {
                objLIZ2 = C051M.LIZ(UrlModel.class, c2201931BFv.LIZJ);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            e = e2;
            objLIZ = null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(String.valueOf(c2201931BFv.LIZ));
        iMUser.setNickName(c2201931BFv.LIZLLL);
        iMUser.setUniqueId(c2201931BFv.LJ);
        iMUser.setAvatarThumb((UrlModel) objLIZ);
        iMUser.setAvatarMedium((UrlModel) objLIZ2);
        Integer num = c2201931BFv.LJFF;
        boolean z3 = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        iMUser.setFollowStatus(iIntValue);
        Integer num2 = c2201931BFv.LJI;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iMUser.setFollowerCount(iIntValue2);
        Integer num3 = c2201931BFv.LJII;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        iMUser.setFollowingCount(iIntValue3);
        iMUser.setRecType(c2201931BFv.LJIIIZ);
        iMUser.setSortWeight(c2201931BFv.LJIIJJI);
        iMUser.setInitialLetter(c2201931BFv.LJIIL);
        Integer num4 = c2201931BFv.LJIILIIL;
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        } else {
            iIntValue4 = 0;
        }
        iMUser.setFollowerStatus(iIntValue4);
        Integer num5 = c2201931BFv.LJIILJJIL;
        if (num5 != null && num5.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        iMUser.setBlock(z);
        Integer num6 = c2201931BFv.LJIILL;
        if (num6 != null && num6.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        iMUser.setBlocked(z2);
        Integer num7 = c2201931BFv.LJIILJJIL;
        if (num7 != null) {
            iIntValue5 = num7.intValue();
        } else {
            iIntValue5 = 0;
        }
        iMUser.setBlockStatus(iIntValue5);
        iMUser.setRecommendReason(c2201931BFv.LJIILLIIL);
        iMUser.setEnterpriseVerifyReason(c2201931BFv.LJIIZILJ);
        iMUser.setCustomVerify(c2201931BFv.LJIJ);
        Integer num8 = c2201931BFv.LJIJI;
        if (num8 != null) {
            iIntValue6 = num8.intValue();
        } else {
            iIntValue6 = 0;
        }
        iMUser.setVerificationType(iIntValue6);
        Integer num9 = c2201931BFv.LJIJJ;
        if (num9 != null) {
            iIntValue7 = num9.intValue();
        } else {
            iIntValue7 = 0;
        }
        iMUser.setShareStatus(iIntValue7);
        Integer num10 = c2201931BFv.LJIIIIZZ;
        if (num10 != null && num10.intValue() == 1) {
            z3 = true;
        }
        iMUser.setMAF(z3);
        iMUser.setUpdateTime(Long.valueOf(c2201931BFv.LJIIJ));
        return iMUser;
    }

    public static final MAFIMUser LIZIZ(C2201931BFv c2201931BFv) {
        Object objLIZ;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z;
        boolean z2;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        Object objLIZ2 = null;
        try {
            objLIZ = C051M.LIZ(UrlModel.class, c2201931BFv.LIZIZ);
            try {
                objLIZ2 = C051M.LIZ(UrlModel.class, c2201931BFv.LIZJ);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            e = e2;
            objLIZ = null;
        }
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(String.valueOf(c2201931BFv.LIZ));
        mAFIMUser.setNickName(c2201931BFv.LIZLLL);
        mAFIMUser.setUniqueId(c2201931BFv.LJ);
        mAFIMUser.setAvatarThumb((UrlModel) objLIZ);
        mAFIMUser.setAvatarMedium((UrlModel) objLIZ2);
        Integer num = c2201931BFv.LJFF;
        boolean z3 = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        mAFIMUser.setFollowStatus(iIntValue);
        Integer num2 = c2201931BFv.LJI;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        mAFIMUser.setFollowerCount(iIntValue2);
        Integer num3 = c2201931BFv.LJII;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        mAFIMUser.setFollowingCount(iIntValue3);
        mAFIMUser.setRecType(c2201931BFv.LJIIIZ);
        mAFIMUser.setSortWeight(c2201931BFv.LJIIJJI);
        mAFIMUser.setInitialLetter(c2201931BFv.LJIIL);
        Integer num4 = c2201931BFv.LJIILIIL;
        if (num4 != null) {
            iIntValue4 = num4.intValue();
        } else {
            iIntValue4 = 0;
        }
        mAFIMUser.setFollowerStatus(iIntValue4);
        Integer num5 = c2201931BFv.LJIILJJIL;
        if (num5 != null && num5.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        mAFIMUser.setBlock(z);
        Integer num6 = c2201931BFv.LJIILL;
        if (num6 != null && num6.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        mAFIMUser.setBlocked(z2);
        Integer num7 = c2201931BFv.LJIILJJIL;
        if (num7 != null) {
            iIntValue5 = num7.intValue();
        } else {
            iIntValue5 = 0;
        }
        mAFIMUser.setBlockStatus(iIntValue5);
        mAFIMUser.setRecommendReason(c2201931BFv.LJIILLIIL);
        mAFIMUser.setEnterpriseVerifyReason(c2201931BFv.LJIIZILJ);
        mAFIMUser.setCustomVerify(c2201931BFv.LJIJ);
        Integer num8 = c2201931BFv.LJIJI;
        if (num8 != null) {
            iIntValue6 = num8.intValue();
        } else {
            iIntValue6 = 0;
        }
        mAFIMUser.setVerificationType(iIntValue6);
        Integer num9 = c2201931BFv.LJIJJ;
        if (num9 != null) {
            iIntValue7 = num9.intValue();
        } else {
            iIntValue7 = 0;
        }
        mAFIMUser.setShareStatus(iIntValue7);
        Integer num10 = c2201931BFv.LJIIIIZZ;
        if (num10 != null && num10.intValue() == 1) {
            z3 = true;
        }
        mAFIMUser.setMAF(z3);
        mAFIMUser.setUpdateTime(Long.valueOf(c2201931BFv.LJIIJ));
        return mAFIMUser;
    }
}

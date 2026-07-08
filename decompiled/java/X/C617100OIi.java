package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingValue;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBadgeModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0OIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617100OIi {
    public static final BulletinFunctionSetting LIZ(List<BulletinFunctionSetting> list) {
        BulletinFunctionSetting bulletinFunctionSetting = null;
        if (list == null) {
            return null;
        }
        Iterator<BulletinFunctionSetting> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BulletinFunctionSetting next = it2.next();
            if (next.functionType == EnumC617170OIp.AUTO_SHARE_POSTS_TO_BULLETIN_BOARD.getType()) {
                bulletinFunctionSetting = next;
                break;
            }
        }
        return bulletinFunctionSetting;
    }

    public static final boolean LIZJ(BulletinGeckoResourceModel bulletinGeckoResourceModel) {
        if (bulletinGeckoResourceModel == null || !C123100dR.LIZ(bulletinGeckoResourceModel.lottiePath) || !C123100dR.LIZ(bulletinGeckoResourceModel.packageChannelId)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(BulletinStyleStruct bulletinStyleStruct) {
        BulletinStyleBadgeModel bulletinStyleBadgeModel;
        String str = bulletinStyleStruct.styleId;
        if (str == null || str.length() == 0 || (bulletinStyleBadgeModel = bulletinStyleStruct.badgeModel) == null) {
            return false;
        }
        if (!LIZJ(bulletinStyleBadgeModel.topLeftSources) && !LIZJ(bulletinStyleBadgeModel.topRightSources) && !LIZJ(bulletinStyleBadgeModel.bottomLeftSources) && !LIZJ(bulletinStyleBadgeModel.bottomRightSources)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(BulletinGeckoResourceModel bulletinGeckoResourceModel) {
        if (bulletinGeckoResourceModel == null || !C123100dR.LIZ(bulletinGeckoResourceModel.packageChannelId)) {
            return false;
        }
        if (!C123100dR.LIZ(bulletinGeckoResourceModel.imagePath) && !C123100dR.LIZ(bulletinGeckoResourceModel.lottiePath)) {
            return false;
        }
        return true;
    }

    public static final Long LJFF(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Long lValueOf = null;
        if (z) {
            return null;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return lValueOf;
        }
    }

    public static final Boolean LIZIZ(BulletinSettingList bulletinSettingList, EnumC604980No8 enumC604980No8) {
        List<BulletinSetting> list;
        BulletinSetting next;
        BulletinSettingValue bulletinSettingValue;
        if (bulletinSettingList == null || (list = bulletinSettingList.settings) == null) {
            return null;
        }
        Iterator<BulletinSetting> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = next.settingType;
                int type = enumC604980No8.getType();
                if (num != null && num.intValue() == type) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BulletinSetting bulletinSetting = next;
        if (bulletinSetting == null || (bulletinSettingValue = bulletinSetting.value) == null) {
            return null;
        }
        return bulletinSettingValue.boolValue;
    }
}

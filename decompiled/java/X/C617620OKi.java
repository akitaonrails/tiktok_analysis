package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBadgeModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;

/* JADX INFO: renamed from: X.0OKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617620OKi {
    public static final boolean LIZJ(BulletinBaseItem bulletinBaseItem) {
        BulletinStyleBadgeModel bulletinStyleBadgeModel;
        BulletinGeckoResourceModel bulletinGeckoResourceModel;
        BulletinStyleBadgeModel bulletinStyleBadgeModel2;
        BulletinGeckoResourceModel bulletinGeckoResourceModel2;
        BulletinStyleStruct bulletinStyleStructLJ = bulletinBaseItem.LJ();
        if (bulletinStyleStructLJ != null && (bulletinStyleBadgeModel2 = bulletinStyleStructLJ.badgeModel) != null && (bulletinGeckoResourceModel2 = bulletinStyleBadgeModel2.topLeftSources) != null && C617100OIi.LJ(bulletinGeckoResourceModel2)) {
            return true;
        }
        BulletinStyleStruct bulletinStyleStructLJ2 = bulletinBaseItem.LJ();
        if (bulletinStyleStructLJ2 != null && (bulletinStyleBadgeModel = bulletinStyleStructLJ2.badgeModel) != null && (bulletinGeckoResourceModel = bulletinStyleBadgeModel.topRightSources) != null && C617100OIi.LJ(bulletinGeckoResourceModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZ(BulletinBaseItem bulletinBaseItem, BulletinCommonAbility bulletinCommonAbility) {
        BulletinStyleBadgeModel bulletinStyleBadgeModel;
        BulletinGeckoResourceModel bulletinGeckoResourceModel;
        BulletinStyleBadgeModel bulletinStyleBadgeModel2;
        BulletinGeckoResourceModel bulletinGeckoResourceModel2;
        if (bulletinCommonAbility != null && !bulletinCommonAbility.To()) {
            BulletinStyleStruct bulletinStyleStructLJ = bulletinBaseItem.LJ();
            if (bulletinStyleStructLJ != null && (bulletinStyleBadgeModel2 = bulletinStyleStructLJ.badgeModel) != null && (bulletinGeckoResourceModel2 = bulletinStyleBadgeModel2.topRightSources) != null && C617100OIi.LJ(bulletinGeckoResourceModel2)) {
                return true;
            }
            BulletinStyleStruct bulletinStyleStructLJ2 = bulletinBaseItem.LJ();
            if (bulletinStyleStructLJ2 != null && (bulletinStyleBadgeModel = bulletinStyleStructLJ2.badgeModel) != null && (bulletinGeckoResourceModel = bulletinStyleBadgeModel.bottomRightSources) != null && C617100OIi.LJ(bulletinGeckoResourceModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(BulletinBaseItem bulletinBaseItem, BulletinCommonAbility bulletinCommonAbility) {
        BulletinStyleStruct bulletinStyleStructLJ;
        BulletinStyleBadgeModel bulletinStyleBadgeModel;
        BulletinGeckoResourceModel bulletinGeckoResourceModel;
        BulletinStyleBadgeModel bulletinStyleBadgeModel2;
        BulletinGeckoResourceModel bulletinGeckoResourceModel2;
        if (bulletinCommonAbility == null || !bulletinCommonAbility.To()) {
            return false;
        }
        BulletinStyleStruct bulletinStyleStructLJ2 = bulletinBaseItem.LJ();
        if ((bulletinStyleStructLJ2 == null || (bulletinStyleBadgeModel2 = bulletinStyleStructLJ2.badgeModel) == null || (bulletinGeckoResourceModel2 = bulletinStyleBadgeModel2.topLeftSources) == null || !C617100OIi.LJ(bulletinGeckoResourceModel2)) && ((bulletinStyleStructLJ = bulletinBaseItem.LJ()) == null || (bulletinStyleBadgeModel = bulletinStyleStructLJ.badgeModel) == null || (bulletinGeckoResourceModel = bulletinStyleBadgeModel.bottomLeftSources) == null || !C617100OIi.LJ(bulletinGeckoResourceModel))) {
            return false;
        }
        return true;
    }
}

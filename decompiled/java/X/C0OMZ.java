package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelBase;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelContent;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelSetting;
import com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model.SimpleBulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OMZ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BulletinPublishAction bulletinPublishAction = (BulletinPublishAction) it2.next();
            arrayList.add(bulletinPublishAction.copy(bulletinPublishAction.publishActionType, bulletinPublishAction.text, bulletinPublishAction.iconUrlModel, bulletinPublishAction.schema, bulletinPublishAction.extra, null));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1227904rF.LIZ.getClass();
        return C1227904rF.LJI(arrayList);
    }

    public static List LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            return (List) C2240408qA.LIZ(str, new TypeToken<List<? extends BulletinPublishAction>>() { // from class: X.0OMa
            }.getType());
        }
        return null;
    }

    public static C618110OMf LIZJ(SimpleBulletinBoardInfo simpleBulletinBoardInfo) {
        BulletinChannelBase bulletinChannelBase;
        String strLJI;
        Integer numValueOf;
        BulletinChannelContent bulletinChannelContent;
        String strLJI2;
        String strLJI3;
        String strLJI4;
        BulletinChannelSetting bulletinChannelSetting;
        BulletinBoardInfo bulletinBoardInfo = simpleBulletinBoardInfo.accountInfo;
        if (bulletinBoardInfo == null) {
            bulletinChannelBase = null;
        } else {
            String strValueOf = String.valueOf(bulletinBoardInfo.bulletinId);
            String strLIZJ = C619400ORe.LIZJ(bulletinBoardInfo.channelOwner);
            Integer num = bulletinBoardInfo.status;
            Integer numValueOf2 = Integer.valueOf(simpleBulletinBoardInfo.identity);
            BulletinChannelAccessControl bulletinChannelAccessControl = simpleBulletinBoardInfo.channelAccessControl;
            if (bulletinChannelAccessControl == null) {
                strLJI = null;
            } else {
                C1227904rF.LIZ.getClass();
                strLJI = C1227904rF.LJI(bulletinChannelAccessControl);
            }
            BulletinSubscriptionInfo bulletinSubscriptionInfo = simpleBulletinBoardInfo.subscriptionInfo;
            if (bulletinSubscriptionInfo != null) {
                numValueOf = Integer.valueOf(bulletinSubscriptionInfo.subscribeStatus);
            } else {
                numValueOf = null;
            }
            bulletinChannelBase = new BulletinChannelBase(strValueOf, 0L, 0L, strLIZJ, num, numValueOf2, strLJI, numValueOf, Long.valueOf(bulletinBoardInfo.accountType));
        }
        BulletinBoardInfo bulletinBoardInfo2 = simpleBulletinBoardInfo.accountInfo;
        if (bulletinBoardInfo2 == null) {
            bulletinChannelContent = null;
        } else {
            String strValueOf2 = String.valueOf(bulletinBoardInfo2.bulletinId);
            String str = bulletinBoardInfo2.name;
            String str2 = bulletinBoardInfo2.description;
            UrlModel urlModel = bulletinBoardInfo2.avatarUrl;
            if (urlModel == null) {
                strLJI2 = null;
            } else {
                C1227904rF.LIZ.getClass();
                strLJI2 = C1227904rF.LJI(urlModel);
            }
            Long l = bulletinBoardInfo2.subscriberCount;
            TuxImageModel tuxImageModel = bulletinBoardInfo2.accountIcon;
            if (tuxImageModel == null) {
                strLJI3 = null;
            } else {
                C1227904rF.LIZ.getClass();
                strLJI3 = C1227904rF.LJI(tuxImageModel);
            }
            Boolean bool = simpleBulletinBoardInfo.commentEnable;
            if (bool != null) {
                bool.booleanValue();
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("comment_enable", bool));
                c1227904rF.getClass();
                strLJI4 = C1227904rF.LJI(mapLIZJ);
            } else {
                strLJI4 = null;
            }
            bulletinChannelContent = new BulletinChannelContent(strValueOf2, str, str2, strLJI2, l, strLJI3, strLJI4);
        }
        BulletinBoardInfo bulletinBoardInfo3 = simpleBulletinBoardInfo.accountInfo;
        if (bulletinBoardInfo3 == null) {
            bulletinChannelSetting = null;
        } else {
            bulletinChannelSetting = new BulletinChannelSetting(String.valueOf(bulletinBoardInfo3.bulletinId), bulletinBoardInfo3.reopenDeadline, bulletinBoardInfo3.quota, bulletinBoardInfo3.editQuota, LIZ(simpleBulletinBoardInfo.quickPostSettingList), LIZ(simpleBulletinBoardInfo.plusPostSettingList));
        }
        return new C618110OMf(bulletinChannelBase, bulletinChannelContent, bulletinChannelSetting);
    }
}

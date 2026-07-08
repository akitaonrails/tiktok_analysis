package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestSettingItem;

/* JADX INFO: renamed from: X.0OJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617350OJh {
    public static final BulletinPeriodicRequestSettingItem LIZ;

    static {
        BulletinPeriodicRequestSettingItem bulletinPeriodicRequestSettingItem = new BulletinPeriodicRequestSettingItem(180000L, 10000L);
        BulletinPeriodicRequestSettingItem bulletinPeriodicRequestSettingItem2 = (BulletinPeriodicRequestSettingItem) C0C64.LJIILLIIL().LJJII(BulletinPeriodicRequestSettingItem.class, bulletinPeriodicRequestSettingItem, "bulletin_periodic_request_setting", true);
        if (bulletinPeriodicRequestSettingItem2 != null) {
            bulletinPeriodicRequestSettingItem = bulletinPeriodicRequestSettingItem2;
        }
        LIZ = bulletinPeriodicRequestSettingItem;
    }
}

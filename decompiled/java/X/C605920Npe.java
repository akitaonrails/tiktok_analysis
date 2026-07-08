package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestConfig;

/* JADX INFO: renamed from: X.0Npe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605920Npe {
    public static final BulletinPeriodicRequestConfig LIZ;

    static {
        BulletinPeriodicRequestConfig bulletinPeriodicRequestConfig = new BulletinPeriodicRequestConfig(1, 3000L, 60000L);
        BulletinPeriodicRequestConfig bulletinPeriodicRequestConfig2 = (BulletinPeriodicRequestConfig) C0C64.LJIILLIIL().LJJII(BulletinPeriodicRequestConfig.class, bulletinPeriodicRequestConfig, "bulletin_create_channel_periodic_request_setting", true);
        if (bulletinPeriodicRequestConfig2 != null) {
            bulletinPeriodicRequestConfig = bulletinPeriodicRequestConfig2;
        }
        LIZ = bulletinPeriodicRequestConfig;
    }
}

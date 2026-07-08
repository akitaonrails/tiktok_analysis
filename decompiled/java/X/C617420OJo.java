package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinWithDrawConfig;

/* JADX INFO: renamed from: X.0OJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617420OJo {
    public static final BulletinWithDrawConfig LIZ;

    static {
        BulletinWithDrawConfig bulletinWithDrawConfig = new BulletinWithDrawConfig(0, 180000L);
        BulletinWithDrawConfig bulletinWithDrawConfig2 = (BulletinWithDrawConfig) C0C64.LJIILLIIL().LJJII(BulletinWithDrawConfig.class, bulletinWithDrawConfig, "bulletin_withdraw_config", true);
        if (bulletinWithDrawConfig2 != null) {
            bulletinWithDrawConfig = bulletinWithDrawConfig2;
        }
        LIZ = bulletinWithDrawConfig;
    }
}

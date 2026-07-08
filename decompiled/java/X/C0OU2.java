package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPageFETaskNames;

/* JADX INFO: renamed from: X.0OU2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OU2 {
    public static final BulletinPageFETaskNames LIZ;

    static {
        BulletinPageFETaskNames bulletinPageFETaskNames = new BulletinPageFETaskNames(C1697810uHb.LJIIJJI("publish_bulletin", "content_interaction"));
        BulletinPageFETaskNames bulletinPageFETaskNames2 = (BulletinPageFETaskNames) C0C64.LJIILLIIL().LJJII(BulletinPageFETaskNames.class, bulletinPageFETaskNames, "bulletin_page_start_fe_task_names", true);
        if (bulletinPageFETaskNames2 != null) {
            bulletinPageFETaskNames = bulletinPageFETaskNames2;
        }
        LIZ = bulletinPageFETaskNames;
    }
}

package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SingleBulletinItemCreateInfo;

/* JADX INFO: renamed from: X.0OOW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOW {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final SingleBulletinItemCreateInfo LIZLLL;
    public final BulletinBaseItem LJ;

    public C0OOW() {
        this(null, null, null, null, null, 63);
    }

    public C0OOW(String str, String str2, String str3, SingleBulletinItemCreateInfo singleBulletinItemCreateInfo, BulletinBaseItem bulletinBaseItem, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        singleBulletinItemCreateInfo = (i & 8) != 0 ? null : singleBulletinItemCreateInfo;
        bulletinBaseItem = (i & 16) != 0 ? null : bulletinBaseItem;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = singleBulletinItemCreateInfo;
        this.LJ = bulletinBaseItem;
    }
}

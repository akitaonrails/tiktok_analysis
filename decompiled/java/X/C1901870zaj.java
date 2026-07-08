package X;

import com.ss.android.ugc.aweme.inbox.experiment.FriendTabNoticeConfigSetting;

/* JADX INFO: renamed from: X.0zaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901870zaj {
    public static final C1901870zaj LJI = new C1901870zaj(-1, -1, "", "", "", "");
    public static final C1901870zaj LJII;
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    static {
        C01GW c01gw = FriendTabNoticeConfigSetting.LIZIZ;
        int i = ((FriendTabNoticeConfigSetting.NoticeGroupTypeModel) c01gw.getValue()).group;
        int i2 = ((FriendTabNoticeConfigSetting.NoticeGroupTypeModel) c01gw.getValue()).filterType;
        C844470XAv.LIZ.getClass();
        LJII = new C1901870zaj(i, i2, C844470XAv.LIZ().getString(2131824848), C844470XAv.LIZ().getString(2131824847), "homepage_friends", "friendstab_notice");
    }

    public C1901870zaj(int i, int i2, String str, String str2, String str3, String str4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
    }
}

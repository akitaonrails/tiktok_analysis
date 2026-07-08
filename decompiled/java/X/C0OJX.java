package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinBoardDatabaseConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0OJX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJX {
    public static volatile boolean LIZ;

    public static C0CTA LIZ() {
        BulletinBoardDatabaseConfig bulletinBoardDatabaseConfig = C0OJW.LIZ;
        Integer num = bulletinBoardDatabaseConfig.firstFetchCount;
        int iIntValue = num != null ? num.intValue() : 20;
        Long l = bulletinBoardDatabaseConfig.delayTime;
        return new C0CTA((l != null ? l.longValue() : 0L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), iIntValue);
    }

    public static boolean LIZIZ() {
        Integer num = C0OJW.LIZ.enable;
        return num != null && num.intValue() > 0 && C290770BaV.LIZ();
    }
}

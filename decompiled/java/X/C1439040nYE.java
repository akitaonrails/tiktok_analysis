package X;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.scheduler.PublishService;

/* JADX INFO: renamed from: X.0nYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439040nYE {
    public static final C1439040nYE LIZ = new C1439040nYE();
    public static PublishService LIZIZ;

    public static void LIZ(String str) {
        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishNotificationManager ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1433730nPf.getClass();
        C1433730nPf.LJIJJLI(strLIZIZ);
    }

    public static void LIZIZ(String str) {
        Object objS3;
        LIZ("show publishId:" + str);
        Application application = C0CHQ.LIZ;
        Intent intent = new Intent(application, (Class<?>) PublishService.class);
        intent.putExtra("PUBLISH_ID", str);
        PublishService publishService = LIZIZ;
        if (publishService != null) {
            publishService.LIZ(str);
            objS3 = true;
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && i < 31 && (i < 33 || new C815520Vyw(C786410Ut5.M3(C0CHQ.LIZ)).LIZ())) {
                objS3 = C2204961BRm.LJJJJL(application, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmra5rKyT4H/Vl1RooP7KZ2Lr0K63fcWPgmL4mMe7cut/Howwx9am1ahAtNOj9kvjE=", null));
            } else {
                objS3 = C786410Ut5.s3(application, intent);
            }
        }
        LIZ("start result=" + objS3);
    }
}

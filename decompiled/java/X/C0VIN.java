package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetSyncWorker;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VIN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j, Context context) {
        LIZ(context, "bonus_widget_refresh_periodic", C13LZ.LJFF(j, 900L, 86400L), C0VI0.REPLACE);
    }

    public static void LIZ(Context context, String str, long j, C0VI0 c0vi0) {
        C0VIQ c0viq = new C0VIQ();
        c0viq.LIZIZ = EnumC794930VGh.CONNECTED;
        C0VIK c0vik = new C0VIK(c0viq);
        C0VIO c0vio = new C0VIO(BonusWidgetSyncWorker.class);
        c0vio.LIZJ.LJIIIZ = c0vik;
        if (j > 0) {
            c0vio.LIZLLL(j, TimeUnit.SECONDS);
        }
        C0VIR c0virLIZ = c0vio.LIZ();
        C0VI1 c0vi1LJII = C0VI1.LJII(context);
        c0vi1LJII.getClass();
        c0vi1LJII.LIZLLL(str, c0vi0, Collections.singletonList(c0virLIZ));
    }
}

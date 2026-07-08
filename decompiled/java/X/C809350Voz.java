package X;

import android.content.Context;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0Voz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809350Voz {
    public static volatile C809350Voz LIZIZ;
    public final C809320Vow LIZ;

    public C809350Voz(Context context) {
        this.LIZ = PushMultiProcessSharedProvider.LJ(C786410Ut5.N3(context));
    }

    public static synchronized C809350Voz LIZ(Context context) {
        if (LIZIZ == null) {
            LIZIZ = new C809350Voz(context);
        }
        return LIZIZ;
    }

    public final void LIZIZ(long j) {
        C809340Voy c809340VoyLIZ = this.LIZ.LIZ();
        c809340VoyLIZ.LIZIZ.put("red_badge_last_request_time", Long.valueOf(j));
        c809340VoyLIZ.LIZ();
    }
}

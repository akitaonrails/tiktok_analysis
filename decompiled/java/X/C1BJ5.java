package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.1BJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJ5 {
    public static Bundle LIZ(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        C786410Ut5.LJJJI("0_auth_logger_id", str, bundle);
        C786410Ut5.LJJJI("3_method", "", bundle);
        C786410Ut5.LJJJI("2_result", "", bundle);
        C786410Ut5.LJJJI("5_error_message", "", bundle);
        C786410Ut5.LJJJI("4_error_code", "", bundle);
        C786410Ut5.LJJJI("6_extras", "", bundle);
        return bundle;
    }
}

package X;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Vud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812850Vud extends C0W4V {
    public int getErrorCode() {
        return super.getStatusCode();
    }

    public C812850Vud(int i) {
        super(new Status(i, C786410Ut5.k4(Locale.getDefault(), "Age Signals Error: %d", new Object[]{Integer.valueOf(i)})));
        if (i != 0) {
        } else {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public C812850Vud(Status status) {
        super(status);
    }
}

package X;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Vuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812840Vuc extends C0W4V {
    public int getErrorCode() {
        return super.getStatusCode();
    }

    @Override // X.C0W4V
    public int getStatusCode() {
        return super.getStatusCode();
    }

    public C812840Vuc(int i) {
        super(new Status(i, C786410Ut5.k4(Locale.getDefault(), "App Engage Service Error: %d", new Object[]{Integer.valueOf(i)})));
        if (i != 0) {
        } else {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public C812840Vuc(int i, String str) {
        super(new Status(i, C786410Ut5.k4(Locale.getDefault(), "App Engage Service Error: %d", new Object[]{Integer.valueOf(i)}) + "\n" + str));
        if (i != 0) {
        } else {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}

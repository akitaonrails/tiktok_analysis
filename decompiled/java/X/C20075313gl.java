package X;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: renamed from: X.13gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20075313gl {
    public final Object LIZ;
    public final View LIZIZ;

    public final AutofillId LIZ(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.LIZ;
            C20078613hI c20078613hILIZ = C20077413h6.LIZ(this.LIZIZ);
            Objects.requireNonNull(c20078613hILIZ);
            return contentCaptureSession.newAutofillId((AutofillId) c20078613hILIZ.LIZ, j);
        }
        return null;
    }

    public C20075313gl(ContentCaptureSession contentCaptureSession, View view) {
        this.LIZ = contentCaptureSession;
        this.LIZIZ = view;
    }
}

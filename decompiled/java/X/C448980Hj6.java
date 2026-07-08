package X;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Hj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448980Hj6 {
    public final WeakReference<TextView> LIZ;

    public C448980Hj6(TextView textView) {
        this.LIZ = new WeakReference<>(textView);
    }

    public static TextView LIZ(Spanned spanned) {
        C448980Hj6[] c448980Hj6Arr = (C448980Hj6[]) spanned.getSpans(0, spanned.length(), C448980Hj6.class);
        if (c448980Hj6Arr != null && c448980Hj6Arr.length > 0) {
            return c448980Hj6Arr[0].LIZ.get();
        }
        return null;
    }
}

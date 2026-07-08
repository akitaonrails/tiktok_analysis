package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0k0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303050k0t {
    public static final Bundle LIZ(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No valid saved state was found for the key '");
        sbLIZ.append(str);
        sbLIZ.append("'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}

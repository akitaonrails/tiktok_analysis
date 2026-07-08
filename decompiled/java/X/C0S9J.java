package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0S9J, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9J {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle, String str, int i) {
        String string;
        if ((i & 1) != 0) {
            bundle = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if (bundle != null && (string = bundle.getString("photo_shared_vm_unique_key")) != null) {
            return string;
        }
        if (str == null) {
            return "photo_shared_vm_unique_key";
        }
        return str;
    }
}

package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0lOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355950lOD {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("photo_shared_vm_unique_key")) == null) {
            return "photo_shared_vm_unique_key";
        }
        return string;
    }
}

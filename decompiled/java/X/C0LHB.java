package X;

import android.content.Intent;

/* JADX INFO: renamed from: X.0LHB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LHB {
    public static final boolean LIZ(Intent intent) {
        int intExtra = intent.getIntExtra("extra_ttep_enter_preview_page", 0);
        if (intExtra != 1 && intExtra != 2) {
            return false;
        }
        return true;
    }
}

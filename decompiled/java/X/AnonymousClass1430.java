package X;

import android.content.Intent;
import androidx.activity.ComponentActivity;

/* JADX INFO: renamed from: X.1430, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1430 extends AnonymousClass1433<String, Boolean> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass1433
    public final Intent LIZ(ComponentActivity componentActivity, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{obj});
    }

    @Override // X.AnonymousClass1433
    public final AnonymousClass1431 LIZIZ(ComponentActivity componentActivity, Object obj) {
        if (C838410Wul.LIZ(componentActivity, (String) obj) == 0) {
            return new AnonymousClass1431(Boolean.TRUE);
        }
        return null;
    }

    @Override // X.AnonymousClass1433
    public final Boolean LIZJ(int i, Intent intent) {
        if (intent != null && i == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}

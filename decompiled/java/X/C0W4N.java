package X;

import android.util.Log;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W4N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4N {
    public final String LIZ;

    public C0W4N(String str, String... strArr) {
        int length = strArr.length;
        if (length != 0) {
            StringBuilder sb = new StringBuilder(e3.e);
            int i = 0;
            do {
                String str2 = strArr[i];
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
                i++;
            } while (i < length);
            sb.append("] ");
        }
        this.LIZ = str;
        new C1264404x8(str);
        int i2 = 2;
        while (!Log.isLoggable(this.LIZ, i2) && (i2 = i2 + 1) <= 7) {
        }
    }
}

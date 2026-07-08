package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813680Vvy {
    public final String LIZ;
    public final LocusId LIZIZ;

    public final int hashCode() {
        String str = this.LIZ;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocusIdCompat[");
        int length = this.LIZ.length();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(length);
        sbLIZ2.append("_chars");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C813680Vvy(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.LIZIZ = new LocusId(str);
                return;
            } else {
                this.LIZIZ = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C813680Vvy.class != obj.getClass()) {
            return false;
        }
        C813680Vvy c813680Vvy = (C813680Vvy) obj;
        String str = this.LIZ;
        if (str == null) {
            if (c813680Vvy.LIZ == null) {
                return true;
            }
            return false;
        }
        return str.equals(c813680Vvy.LIZ);
    }
}

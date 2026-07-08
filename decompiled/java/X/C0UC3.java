package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0UC3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UC3 {
    public final String LIZ;
    public boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0UC3)) {
            return false;
        }
        return TextUtils.equals(((C0UC3) obj).LIZ, this.LIZ);
    }

    public C0UC3(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}

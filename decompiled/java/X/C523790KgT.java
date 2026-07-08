package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;

/* JADX INFO: renamed from: X.0KgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523790KgT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final TokenCert LIZ() {
        int i = Build.VERSION.SDK_INT;
        return new TokenCert(i >= 34 ? this.LIZ : i >= 33 ? this.LIZIZ : this.LIZJ);
    }

    public C523790KgT(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}

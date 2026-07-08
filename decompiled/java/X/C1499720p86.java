package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;

/* JADX INFO: renamed from: X.0p86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499720p86 {
    public final String LIZ;
    public String LIZIZ;
    public final TypedOutput LIZJ;
    public final String LIZLLL;

    public C1499720p86(String str, TypedOutput typedOutput, String str2) {
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = typedOutput;
        this.LIZLLL = str2;
        try {
            URI uri = new URI(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            String str3 = this.LIZLLL;
            sbLIZ.append(str3 == null ? uri.getPath() : str3);
            sbLIZ.append(uri.getQuery());
            TypedOutput typedOutput2 = this.LIZJ;
            sbLIZ.append(typedOutput2 != null ? typedOutput2.md5Stub() : null);
            this.LIZIZ = String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ = "error";
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = "error";
        }
    }
}

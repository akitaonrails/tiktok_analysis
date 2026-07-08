package X;

import android.util.Base64;
import net.bytedance.zdplib.Delta;
import net.bytedance.zdplib.DeltaSignerVerifier;

/* JADX INFO: renamed from: X.08R6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08R6 extends C08R7 {
    public final DeltaSignerVerifier LIZIZ;
    public final String LIZJ;

    public C08R6(boolean z, String str, DeltaSignerVerifier deltaSignerVerifier) {
        super(z);
        this.LIZIZ = deltaSignerVerifier;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ree public key=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = Base64.encodeToString(Delta.LIZIZ(str), 2);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162908df {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("romType: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", systemProperty: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", versionCodeStr: ");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2162908df(String str, String str2) {
        Object c098200Yq;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = "0.0.0";
        try {
            if (!Intrinsics.LJFF(str, "color_os")) {
                c098200Yq = "0.0.0";
            } else {
                String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str2, e3.e, "", false), "V", "", false), e3.f, "", false);
                C2162808de.LIZ.getClass();
                c098200Yq = C2162808de.LIZ(strLJJIFFI);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str3 = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LIZJ = str3 != null ? str3 : "0.0.0";
    }
}

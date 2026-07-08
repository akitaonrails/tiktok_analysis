package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8B, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8B {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<C869590Y9l> LIZ;
    public final C0YMW LIZIZ;
    public final EnumC872590YKz LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y8B)) {
            return false;
        }
        C0Y8B c0y8b = (C0Y8B) obj;
        return Intrinsics.LJFF(this.LIZ, c0y8b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0y8b.LIZIZ) && this.LIZJ == c0y8b.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0YMW c0ymw = this.LIZIZ;
        return ((iHashCode + (c0ymw == null ? 0 : c0ymw.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetMessagePreviewResult(messages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadOlderResult=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0Y8B(List<? extends C869590Y9l> list, C0YMW c0ymw, EnumC872590YKz enumC872590YKz) {
        this.LIZ = list;
        this.LIZIZ = c0ymw;
        this.LIZJ = enumC872590YKz;
    }
}

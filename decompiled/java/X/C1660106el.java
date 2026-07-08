package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06el, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1660106el extends AbstractC1493005su {
    public final String LIZLLL;
    public final EnumC738160SxS LJ;
    public final Map<String, String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660106el)) {
            return false;
        }
        C1660106el c1660106el = (C1660106el) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1660106el.LIZLLL) && this.LJ == c1660106el.LJ && Intrinsics.LJFF(this.LJFF, c1660106el.LJFF);
    }

    public final int hashCode() {
        return (((this.LIZLLL.hashCode() * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAssemLifecyclePerformanceBody(host=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lifecycle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1660106el(String str, EnumC738160SxS enumC738160SxS) {
        this(str, enumC738160SxS, C2097608Jq.LJ());
    }

    public C1660106el(String str, EnumC738160SxS enumC738160SxS, Map<String, String> map) {
        super(null, C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("host", str), new Pair("lifecycle_stage", enumC738160SxS.name())), map), null, 5);
        this.LIZLLL = str;
        this.LJ = enumC738160SxS;
        this.LJFF = map;
    }
}

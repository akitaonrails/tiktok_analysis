package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C213900s5 implements InterfaceC214000s6 {
    public final String LIZ;
    public final Function0<? extends Map<String, ? extends Object>> LIZIZ;
    public final Function0<? extends Map<String, ? extends Object>> LIZJ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Function0<? extends Map<String, ? extends Object>> function0 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<? extends Map<String, ? extends Object>> function02 = this.LIZJ;
        return iHashCode2 + (function02 != null ? function02.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetricScene(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", infoBeforeDiagnosisCallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", infoAfterDiagnosisCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214000s6
    public final Function0<Map<String, Object>> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC214000s6
    public final Function0<Map<String, Object>> LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C213900s5)) {
            return false;
        }
        C213900s5 c213900s5 = (C213900s5) obj;
        if (Intrinsics.LJFF(this.LIZ, c213900s5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c213900s5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c213900s5.LIZJ)) {
            return true;
        }
        return false;
    }

    public C213900s5(String str, Function0<? extends Map<String, ? extends Object>> function0, Function0<? extends Map<String, ? extends Object>> function02) {
        this.LIZ = str;
        this.LIZIZ = function0;
        this.LIZJ = function02;
    }
}

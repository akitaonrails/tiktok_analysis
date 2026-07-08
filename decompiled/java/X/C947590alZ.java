package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0alZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947590alZ {
    public final String LIZ;
    public final EnumC947600ala LIZIZ;
    public final EnumC942260acy LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C947590alZ)) {
            return false;
        }
        C947590alZ c947590alZ = (C947590alZ) obj;
        return Intrinsics.LJFF(this.LIZ, c947590alZ.LIZ) && this.LIZIZ == c947590alZ.LIZIZ && this.LIZJ == c947590alZ.LIZJ && Intrinsics.LJFF(this.LIZLLL, c947590alZ.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerSnapshot(playerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C947590alZ(String str, EnumC947600ala enumC947600ala, EnumC942260acy enumC942260acy) {
        this(str, enumC947600ala, enumC942260acy, C2097608Jq.LJ());
    }

    public C947590alZ(String str, EnumC947600ala enumC947600ala, EnumC942260acy enumC942260acy, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = enumC947600ala;
        this.LIZJ = enumC942260acy;
        this.LIZLLL = map;
    }
}

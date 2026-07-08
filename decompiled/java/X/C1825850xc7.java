package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825850xc7 {
    public final Context LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final EnumC1420700n4e LIZLLL;
    public final InterfaceC665370Q7z LJ;
    public final C01GW LJFF;

    public C1825850xc7() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1825850xc7)) {
            return false;
        }
        C1825850xc7 c1825850xc7 = (C1825850xc7) obj;
        return Intrinsics.LJFF(this.LIZ, c1825850xc7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1825850xc7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1825850xc7.LIZJ) && this.LIZLLL == c1825850xc7.LIZLLL && Intrinsics.LJFF(this.LJ, c1825850xc7.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        EnumC1420700n4e enumC1420700n4e = this.LIZLLL;
        int iHashCode2 = (iHashCode + (enumC1420700n4e == null ? 0 : enumC1420700n4e.hashCode())) * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LJ;
        return iHashCode2 + (interfaceC665370Q7z != null ? interfaceC665370Q7z.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenThirdPartyParams(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", additionalParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clickMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", vScope=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1825850xc7(Context context, String str, EnumC1420700n4e enumC1420700n4e, InterfaceC665370Q7z interfaceC665370Q7z) {
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = mapLJ;
        this.LIZLLL = enumC1420700n4e;
        this.LJ = interfaceC665370Q7z;
        this.LJFF = C452501pT.LIZIZ(new C1826040xcQ(this));
    }
}

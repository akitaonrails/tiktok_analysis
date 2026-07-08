package X;

import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1238730iL9 {
    public boolean LIZ;
    public Country LIZIZ;
    public Country LIZJ;

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.LIZ), this.LIZIZ, this.LIZJ);
    }

    public C1238730iL9() {
        this(false, new Country("", ""), null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseEntranceInfo(visibility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverCountryInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", userSelectCountry=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        C1238730iL9 c1238730iL9;
        if (obj instanceof C1238730iL9) {
            c1238730iL9 = (C1238730iL9) obj;
        } else {
            c1238730iL9 = null;
        }
        if (c1238730iL9 == null || this.LIZ != c1238730iL9.LIZ || !Intrinsics.LJFF(this.LIZIZ, c1238730iL9.LIZIZ) || !Intrinsics.LJFF(this.LIZJ, c1238730iL9.LIZJ)) {
            return false;
        }
        return true;
    }

    public C1238730iL9(boolean z, Country country, Country country2) {
        this.LIZ = z;
        this.LIZIZ = country;
        this.LIZJ = country2;
    }
}

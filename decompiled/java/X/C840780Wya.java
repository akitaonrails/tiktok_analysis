package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840780Wya implements InterfaceC823460WSa {
    public C840710WyT LIZ;
    public final Map<Object, ? extends Object> LIZIZ;
    public final JSONObject LIZJ;
    public Set<String> LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840780Wya)) {
            return false;
        }
        C840780Wya c840780Wya = (C840780Wya) obj;
        return Intrinsics.LJFF(this.LIZ, c840780Wya.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840780Wya.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840780Wya.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840780Wya.LIZLLL) && Intrinsics.LJFF(this.LJ, c840780Wya.LJ) && Intrinsics.LJFF(this.LJFF, c840780Wya.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<Object, ? extends Object> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        JSONObject jSONObject = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkContentEvent(baseEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mapContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", jsonObjectContent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentKeys=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", subType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C840780Wya() {
        this(new C840710WyT(0), null, null, new LinkedHashSet(), null, null);
    }

    @Override // X.InterfaceC823460WSa
    public final C840710WyT LIZ() {
        return this.LIZ;
    }

    public final C840780Wya LIZIZ(C840750WyX c840750WyX) {
        C840780Wya c840780Wya = new C840780Wya(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        c840780Wya.LIZLLL = new LinkedHashSet();
        C840710WyT c840710WyTLIZ = C840710WyT.LIZ(this.LIZ);
        c840780Wya.LIZ = c840710WyTLIZ;
        c840710WyTLIZ.LIZIZ(c840750WyX);
        return c840780Wya;
    }

    public C840780Wya(C840710WyT c840710WyT, Map<Object, ? extends Object> map, JSONObject jSONObject, Set<String> set, String str, String str2) {
        this.LIZ = c840710WyT;
        this.LIZIZ = map;
        this.LIZJ = jSONObject;
        this.LIZLLL = set;
        this.LJ = str;
        this.LJFF = str2;
    }
}

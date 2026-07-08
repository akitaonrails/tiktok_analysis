package X;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825210WYt {
    public int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Object LIZLLL;
    public final Object[] LJ;
    public final boolean LJFF;
    public final String LJI;
    public final Object LJII;
    public Map<String, Object> LJIIIIZZ;
    public final C01GW LJIIIZ;
    public C1280804zm LJIIJ;

    public C825210WYt() {
        throw null;
    }

    public final String toString() {
        return "ApiCallingContext(id=" + this.LIZ + ", className=" + this.LIZIZ + ", memberName=" + this.LIZJ + ", thisOrClass=" + this.LIZLLL + ", parameters=" + Arrays.toString(this.LJ) + ", isReflection=" + this.LJFF + ", returnType=" + this.LJI + ", result=" + this.LJII + ", extraContextValues=" + this.LJIIIIZZ + ")";
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Object obj = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object[] objArr = this.LJ;
        int iHashCode4 = (((iHashCode3 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        String str3 = this.LJI;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj2 = this.LJII;
        int iHashCode6 = (iHashCode5 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.LJIIIIZZ;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C825210WYt)) {
            return false;
        }
        C825210WYt c825210WYt = (C825210WYt) obj;
        if (this.LIZ != c825210WYt.LIZ || !Intrinsics.LJFF(this.LIZIZ, c825210WYt.LIZIZ) || !Intrinsics.LJFF(this.LIZJ, c825210WYt.LIZJ) || !Intrinsics.LJFF(this.LIZLLL, c825210WYt.LIZLLL)) {
            return false;
        }
        Object[] objArr = this.LJ;
        if (objArr != null) {
            Object[] objArr2 = c825210WYt.LJ;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (c825210WYt.LJ != null) {
            return false;
        }
        if (this.LJFF == c825210WYt.LJFF && Intrinsics.LJFF(this.LJI, c825210WYt.LJI) && Intrinsics.LJFF(this.LJII, c825210WYt.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c825210WYt.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public final void LIZ(Object obj, String str) {
        Map linkedHashMap = this.LJIIIIZZ;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.LJIIIIZZ = linkedHashMap;
        }
        linkedHashMap.put(str, obj);
    }

    public C825210WYt(int i, String str, String str2, Object obj, Object[] objArr, boolean z, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = obj;
        this.LJ = objArr;
        this.LJFF = z;
        this.LJI = str3;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS557S0100000_13(this, 147));
    }
}

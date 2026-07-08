package X;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840750WyX {
    public final int LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final transient Object LJ;
    public final transient Object[] LJFF;
    public final String LJI;
    public final transient Object LJII;
    public final boolean LJIIIIZZ;
    public final transient Object LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final Set<String> LJIIL;
    public final C0WSC LJIILIIL;

    public C840750WyX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840750WyX)) {
            return false;
        }
        C840750WyX c840750WyX = (C840750WyX) obj;
        return this.LIZ == c840750WyX.LIZ && Intrinsics.LJFF(this.LIZIZ, c840750WyX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840750WyX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840750WyX.LIZLLL) && Intrinsics.LJFF(this.LJ, c840750WyX.LJ) && Intrinsics.LJFF(this.LJFF, c840750WyX.LJFF) && Intrinsics.LJFF(this.LJI, c840750WyX.LJI) && Intrinsics.LJFF(this.LJII, c840750WyX.LJII) && this.LJIIIIZZ == c840750WyX.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c840750WyX.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c840750WyX.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c840750WyX.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c840750WyX.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c840750WyX.LJIILIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35 */
    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Object obj = this.LJ;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object[] objArr = this.LJFF;
        int iHashCode3 = (((iHashCode2 + (objArr == null ? 0 : Arrays.hashCode(objArr))) * 31) + this.LJI.hashCode()) * 31;
        Object obj2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        boolean z = this.LJIIIIZZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode4 + r0) * 31;
        Object obj3 = this.LJIIIZ;
        int iHashCode5 = (((((((i + (obj3 == null ? 0 : obj3.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31;
        C0WSC c0wsc = this.LJIILIIL;
        return iHashCode5 + (c0wsc != null ? c0wsc.hashCode() : 0);
    }

    public final String toString() {
        return "OriginalInvokeContext(id=" + this.LIZ + ", invokeType=" + this.LIZIZ + ", className=" + this.LIZJ + ", memberName=" + this.LIZLLL + ", thisOrClass=" + this.LJ + ", parameters=" + Arrays.toString(this.LJFF) + ", returnType=" + this.LJI + ", result=" + this.LJII + ", isOriginalCalled=" + this.LJIIIIZZ + ", extraInfo=" + this.LJIIIZ + ", resourceId=" + this.LJIIJ + ", resourceName=" + this.LJIIJJI + ", dataTypes=" + this.LJIIL + ", performanceNode=" + this.LJIILIIL + ')';
    }

    public /* synthetic */ C840750WyX(int i) {
        this(0, "", "", "", null, null, "", null, true, null, "", "", new LinkedHashSet(), null);
    }

    public static C840750WyX LIZ(C840750WyX c840750WyX) {
        int i = c840750WyX.LIZ;
        String str = c840750WyX.LIZJ;
        String str2 = c840750WyX.LIZLLL;
        Object obj = c840750WyX.LJ;
        Object[] objArr = c840750WyX.LJFF;
        String str3 = c840750WyX.LJI;
        Object obj2 = c840750WyX.LJII;
        boolean z = c840750WyX.LJIIIIZZ;
        Object obj3 = c840750WyX.LJIIIZ;
        String str4 = c840750WyX.LJIIJ;
        String str5 = c840750WyX.LJIIJJI;
        Set<String> set = c840750WyX.LJIIL;
        C0WSC c0wsc = c840750WyX.LJIILIIL;
        c840750WyX.getClass();
        return new C840750WyX(i, "after", str, str2, obj, objArr, str3, obj2, z, obj3, str4, str5, set, c0wsc);
    }

    public C840750WyX(int i, String str, String str2, String str3, Object obj, Object[] objArr, String str4, Object obj2, boolean z, Object obj3, String str5, String str6, Set<String> set, C0WSC c0wsc) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = obj;
        this.LJFF = objArr;
        this.LJI = str4;
        this.LJII = obj2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = obj3;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
        this.LJIIL = set;
        this.LJIILIIL = c0wsc;
    }
}

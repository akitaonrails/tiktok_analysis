package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20152313tB {
    public boolean LIZ;
    public boolean LIZIZ;
    public List<? extends InterfaceC20153313tL> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20152313tB)) {
            return false;
        }
        C20152313tB c20152313tB = (C20152313tB) obj;
        return Intrinsics.LJFF(this.LIZLLL, c20152313tB.LIZLLL) && Intrinsics.LJFF(this.LJ, c20152313tB.LJ) && Intrinsics.LJFF(this.LJFF, c20152313tB.LJFF) && Intrinsics.LJFF(this.LJI, c20152313tB.LJI);
    }

    public final int hashCode() {
        List<String> list = this.LIZLLL;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.LJ;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LJI;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public C20152313tB(List<String> list, List<String> list2, String str, String str2) {
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = str;
        this.LJI = str2;
    }
}

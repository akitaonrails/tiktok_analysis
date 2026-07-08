package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385060F7w {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final float LJFF;
    public final List<Float> LJI;
    public final List<Float> LJII;
    public final float LJIIIIZZ;
    public final List<Float> LJIIIZ;
    public final float LJIIJ;
    public final List<Float> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385060F7w)) {
            return false;
        }
        C385060F7w c385060F7w = (C385060F7w) obj;
        return Intrinsics.LJFF(this.LIZ, c385060F7w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c385060F7w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c385060F7w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c385060F7w.LIZLLL) && Intrinsics.LJFF(this.LJ, c385060F7w.LJ) && Float.compare(this.LJFF, c385060F7w.LJFF) == 0 && Intrinsics.LJFF(this.LJI, c385060F7w.LJI) && Intrinsics.LJFF(this.LJII, c385060F7w.LJII) && Float.compare(this.LJIIIIZZ, c385060F7w.LJIIIIZZ) == 0 && Intrinsics.LJFF(this.LJIIIZ, c385060F7w.LJIIIZ) && Float.compare(this.LJIIJ, c385060F7w.LJIIJ) == 0 && Intrinsics.LJFF(this.LJIIJJI, c385060F7w.LJIIJJI);
    }

    public final String toString() {
        return "NleServerRichTextSnapshot(text=" + this.LIZ + ", fontId=" + this.LIZIZ + ", fontPath=" + this.LIZJ + ", effectStyleId=" + this.LIZLLL + ", effectStylePath=" + this.LJ + ", sizePt=" + this.LJFF + ", textColor=" + this.LJI + ", outlineColor=" + this.LJII + ", outlineWidth=" + this.LJIIIIZZ + ", shadowColor=" + this.LJIIIZ + ", shadowSmooth=" + this.LJIIJ + ", bgColor=" + this.LJIIJJI + ')';
    }

    public C385060F7w() {
        this("", "", "", "", "", 0.0f, null, null, 0.0f, null, 0.2f, null);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF)) * 31;
        List<Float> list = this.LJI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.LJII;
        int iHashCode3 = (((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31;
        List<Float> list3 = this.LJIIIZ;
        int iHashCode4 = (((iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31) + Float.floatToIntBits(this.LJIIJ)) * 31;
        List<Float> list4 = this.LJIIJJI;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public C385060F7w(String str, String str2, String str3, String str4, String str5, float f, List<Float> list, List<Float> list2, float f2, List<Float> list3, float f3, List<Float> list4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = f;
        this.LJI = list;
        this.LJII = list2;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = list3;
        this.LJIIJ = f3;
        this.LJIIJJI = list4;
    }
}

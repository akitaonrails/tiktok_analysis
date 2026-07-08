package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860330Xp1 extends C860480XpG {
    public Long LJJIFFI;
    public Double LJJII;
    public Integer LJJIII;
    public Integer LJJIIJ;
    public Long LJJIIJZLJL;
    public Integer LJJIIZ;
    public Long LJJIIZI;
    public Integer LJJIJ;
    public Double LJJIJIIJI;
    public Integer LJJIJIIJIL;
    public Integer LJJIJIL;
    public Integer LJJIJL;
    public Integer LJJIJLIJ;
    public Integer LJJIL;
    public Long LJJIZ;

    public C860330Xp1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C860330Xp1)) {
            return false;
        }
        C860330Xp1 c860330Xp1 = (C860330Xp1) obj;
        return Intrinsics.LJFF(this.LJJIFFI, c860330Xp1.LJJIFFI) && Intrinsics.LJFF(this.LJJII, c860330Xp1.LJJII) && Intrinsics.LJFF(this.LJJIII, c860330Xp1.LJJIII) && Intrinsics.LJFF(this.LJJIIJ, c860330Xp1.LJJIIJ) && Intrinsics.LJFF(this.LJJIIJZLJL, c860330Xp1.LJJIIJZLJL) && Intrinsics.LJFF(this.LJJIIZ, c860330Xp1.LJJIIZ) && Intrinsics.LJFF(this.LJJIIZI, c860330Xp1.LJJIIZI) && Intrinsics.LJFF(this.LJJIJ, c860330Xp1.LJJIJ) && Intrinsics.LJFF(this.LJJIJIIJI, c860330Xp1.LJJIJIIJI) && Intrinsics.LJFF(this.LJJIJIIJIL, c860330Xp1.LJJIJIIJIL) && Intrinsics.LJFF(this.LJJIJIL, c860330Xp1.LJJIJIL) && Intrinsics.LJFF(this.LJJIJL, c860330Xp1.LJJIJL) && Intrinsics.LJFF(this.LJJIJLIJ, c860330Xp1.LJJIJLIJ) && Intrinsics.LJFF(this.LJJIL, c860330Xp1.LJJIL) && Intrinsics.LJFF(this.LJJIZ, c860330Xp1.LJJIZ);
    }

    public final int hashCode() {
        Long l = this.LJJIFFI;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.LJJII;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.LJJIII;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJJIIJ;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.LJJIIJZLJL;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.LJJIIZ;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l3 = this.LJJIIZI;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num4 = this.LJJIJ;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d2 = this.LJJIJIIJI;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num5 = this.LJJIJIIJIL;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LJJIJIL;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.LJJIJL;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.LJJIJLIJ;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.LJJIL;
        int iHashCode14 = (iHashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Long l4 = this.LJJIZ;
        return iHashCode14 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        return "ToolsFluencyEvent(duration=" + this.LJJIFFI + ", fps=" + this.LJJII + ", dropMax=" + this.LJJIII + ", weightedDropCount=" + this.LJJIIJ + ", blockDuration=" + this.LJJIIJZLJL + ", blockCount=" + this.LJJIIZ + ", drop3Dur=" + this.LJJIIZI + ", drop3=" + this.LJJIJ + ", drop3DurRatio=" + this.LJJIJIIJI + ", level1=" + this.LJJIJIIJIL + ", level2=" + this.LJJIJIL + ", level3=" + this.LJJIJL + ", level4=" + this.LJJIJLIJ + ", drop7=" + this.LJJIL + ", drop7Dur=" + this.LJJIZ + ')';
    }

    public /* synthetic */ C860330Xp1(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C860330Xp1(Long l, Double d, Integer num, Integer num2, Long l2, Integer num3, Long l3, Integer num4, Double d2, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l4) {
        this.LJJIFFI = l;
        this.LJJII = d;
        this.LJJIII = num;
        this.LJJIIJ = num2;
        this.LJJIIJZLJL = l2;
        this.LJJIIZ = num3;
        this.LJJIIZI = l3;
        this.LJJIJ = num4;
        this.LJJIJIIJI = d2;
        this.LJJIJIIJIL = num5;
        this.LJJIJIL = num6;
        this.LJJIJL = num7;
        this.LJJIJLIJ = num8;
        this.LJJIL = num9;
        this.LJJIZ = l4;
    }
}

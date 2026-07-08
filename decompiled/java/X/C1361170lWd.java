package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361170lWd implements InterfaceC0148002o {
    public final C291001Au<C1383980m7Q> LL;
    public final C291001Au<C1384300m7w> LLILLJJLI;
    public final C291001Au<C1384680m8Y> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<C1384300m7w> LLILZIL;
    public final C291001Au<C1384300m7w> LLILZLL;
    public final C291001Au<C1384300m7w> LLIZ;
    public final C291001Au<C1384300m7w> LLIZLLLIL;
    public final EnumC1361070lWT LLJ;

    public C1361170lWd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361170lWd)) {
            return false;
        }
        C1361170lWd c1361170lWd = (C1361170lWd) obj;
        return Intrinsics.LJFF(this.LL, c1361170lWd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1361170lWd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1361170lWd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1361170lWd.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1361170lWd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1361170lWd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1361170lWd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1361170lWd.LLIZLLLIL) && this.LLJ == c1361170lWd.LLJ;
    }

    public final int hashCode() {
        C291001Au<C1383980m7Q> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C1384300m7w> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C1384680m8Y> c291001Au3 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        C291001Au<C1384300m7w> c291001Au4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C1384300m7w> c291001Au5 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<C1384300m7w> c291001Au6 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<C1384300m7w> c291001Au7 = this.LLIZLLLIL;
        return ((iHashCode6 + (c291001Au7 != null ? c291001Au7.hashCode() : 0)) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuState(dataUpdateEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onItemInsertEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", playEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", lazyLoadPresentAssemEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onItemPauseEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onItemResumeEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onFakeItemDeleteEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onFakeItemInsertEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", danmakuSwitchState=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1361170lWd(int i) {
        this(null, null, null, new C291001Au(Boolean.FALSE), null, null, null, null, EnumC1361070lWT.DISABLED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1361170lWd(C291001Au<C1383980m7Q> c291001Au, C291001Au<? extends C1384300m7w> c291001Au2, C291001Au<C1384680m8Y> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<? extends C1384300m7w> c291001Au5, C291001Au<? extends C1384300m7w> c291001Au6, C291001Au<? extends C1384300m7w> c291001Au7, C291001Au<? extends C1384300m7w> c291001Au8, EnumC1361070lWT enumC1361070lWT) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
        this.LLIZLLLIL = c291001Au8;
        this.LLJ = enumC1361070lWT;
    }

    public static C1361170lWd LIZ(C1361170lWd c1361170lWd, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, EnumC1361070lWT enumC1361070lWT, int i) {
        EnumC1361070lWT enumC1361070lWT2 = enumC1361070lWT;
        C291001Au c291001Au9 = c291001Au8;
        C291001Au c291001Au10 = c291001Au7;
        C291001Au c291001Au11 = c291001Au6;
        C291001Au c291001Au12 = c291001Au5;
        C291001Au c291001Au13 = c291001Au4;
        C291001Au c291001Au14 = c291001Au3;
        C291001Au c291001Au15 = c291001Au2;
        C291001Au c291001Au16 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au16 = c1361170lWd.LL;
        }
        if ((i & 2) != 0) {
            c291001Au15 = c1361170lWd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au14 = c1361170lWd.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au13 = c1361170lWd.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au12 = c1361170lWd.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au11 = c1361170lWd.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au10 = c1361170lWd.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au9 = c1361170lWd.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            enumC1361070lWT2 = c1361170lWd.LLJ;
        }
        c1361170lWd.getClass();
        return new C1361170lWd(c291001Au16, c291001Au15, c291001Au14, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9, enumC1361070lWT2);
    }
}

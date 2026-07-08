package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322320CkI implements InterfaceC0148002o, InterfaceC111300bX {
    public final EnumC322330CkJ LL;
    public final EnumC322300CkG LLILLJJLI;
    public final C322450CkV LLILLL;
    public final C291001Au<C322420CkS> LLILZ;
    public final C291001Au<C322240CkA> LLILZIL;

    public C322320CkI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C322320CkI)) {
            return false;
        }
        C322320CkI c322320CkI = (C322320CkI) obj;
        return this.LL == c322320CkI.LL && this.LLILLJJLI == c322320CkI.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c322320CkI.LLILLL) && Intrinsics.LJFF(this.LLILZ, c322320CkI.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c322320CkI.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<C322420CkS> c291001Au = this.LLILZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C322240CkA> c291001Au2 = this.LLILZIL;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectDraftDetailState(selectMode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectAllStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rvData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", jumpToAMEBeforeCheckEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cardDeleteEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C322320CkI(int i) {
        this(EnumC322330CkJ.NOT_SET, EnumC322300CkG.SELECT_ALL, new C322450CkV(0), null, null);
    }

    public C322320CkI(EnumC322330CkJ enumC322330CkJ, EnumC322300CkG enumC322300CkG, C322450CkV c322450CkV, C291001Au<C322420CkS> c291001Au, C291001Au<C322240CkA> c291001Au2) {
        this.LL = enumC322330CkJ;
        this.LLILLJJLI = enumC322300CkG;
        this.LLILLL = c322450CkV;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
    }

    public static C322320CkI LIZ(C322320CkI c322320CkI, EnumC322330CkJ enumC322330CkJ, EnumC322300CkG enumC322300CkG, C322450CkV c322450CkV, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        C322450CkV c322450CkV2 = c322450CkV;
        EnumC322300CkG enumC322300CkG2 = enumC322300CkG;
        EnumC322330CkJ enumC322330CkJ2 = enumC322330CkJ;
        if ((i & 1) != 0) {
            enumC322330CkJ2 = c322320CkI.LL;
        }
        if ((i & 2) != 0) {
            enumC322300CkG2 = c322320CkI.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c322450CkV2 = c322320CkI.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c322320CkI.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c322320CkI.LLILZIL;
        }
        c322320CkI.getClass();
        return new C322320CkI(enumC322330CkJ2, enumC322300CkG2, c322450CkV2, c291001Au4, c291001Au3);
    }
}

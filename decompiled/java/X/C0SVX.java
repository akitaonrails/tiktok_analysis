package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVX implements C07XH {
    public final C0SVT LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final C722300SUy LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0SVX() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SVX)) {
            return false;
        }
        C0SVX c0svx = (C0SVX) obj;
        return Intrinsics.LJFF(this.LIZ, c0svx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0svx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0svx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0svx.LIZLLL);
    }

    public final int hashCode() {
        C0SVT c0svt = this.LIZ;
        int iHashCode = (c0svt == null ? 0 : c0svt.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C722300SUy c722300SUy = this.LIZLLL;
        return iHashCode3 + (c722300SUy != null ? c722300SUy.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardMaskModel(background=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titleFont=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0SVX(C0SVT c0svt, C722300SUy c722300SUy, int i) {
        this((i & 1) != 0 ? null : c0svt, null, null, (i & 8) != 0 ? null : c722300SUy);
    }

    public C0SVX(C0SVT c0svt, String str, Integer num, C722300SUy c722300SUy) {
        this.LIZ = c0svt;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = c722300SUy;
    }
}

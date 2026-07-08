package X;

import X.C0DV5;
import X.C0F1T;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549530Lgt<API extends C0F1T, CONFIG extends C0DV5<CONFIG>> {
    public final String LIZ;
    public final int LIZIZ;
    public final Class<API> LIZJ;
    public final CONFIG LIZLLL;
    public final Function2<C539960LFq, C19A3, Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C549530Lgt)) {
            return false;
        }
        C549530Lgt c549530Lgt = (C549530Lgt) obj;
        return Intrinsics.LJFF(this.LIZ, c549530Lgt.LIZ) && this.LIZIZ == c549530Lgt.LIZIZ && Intrinsics.LJFF(this.LIZJ, c549530Lgt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c549530Lgt.LIZLLL) && Intrinsics.LJFF(this.LJ, c549530Lgt.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotPluginBuilder(slotName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", featureApi=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", componentProvider=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C549530Lgt(String str, int i, Class<API> cls, CONFIG config, Function2<? super C539960LFq, ? super C19A3, Unit> function2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = cls;
        this.LIZLLL = config;
        this.LJ = function2;
    }
}

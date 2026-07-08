package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.141F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C141F {
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ;
    public final int LIZIZ;
    public final C694070RKj LIZJ;

    public C141F() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141F)) {
            return false;
        }
        C141F c141f = (C141F) obj;
        return Intrinsics.LJFF(this.LIZ, c141f.LIZ) && this.LIZIZ == c141f.LIZIZ && Intrinsics.LJFF(this.LIZJ, c141f.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotConfig(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotLayoutId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", assembleMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C141F(C19719912Dl c19719912Dl, int i) {
        C694070RKj c694070RKj = C694070RKj.LIZ;
        this.LIZ = c19719912Dl;
        this.LIZIZ = i;
        this.LIZJ = c694070RKj;
    }
}

package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887540Yro {
    public boolean LIZ;
    public boolean LIZIZ;
    public List<String> LIZJ;

    public C887540Yro() {
        this(false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C887540Yro)) {
            return false;
        }
        C887540Yro c887540Yro = (C887540Yro) obj;
        return this.LIZ == c887540Yro.LIZ && this.LIZIZ == c887540Yro.LIZIZ && Intrinsics.LJFF(this.LIZJ, c887540Yro.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        List<String> list = this.LIZJ;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public C887540Yro(boolean z, boolean z2, List<String> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = list;
    }
}

package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05FV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05FV {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final C05FX LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05FV)) {
            return false;
        }
        C05FV c05fv = (C05FV) obj;
        return Intrinsics.LJFF(this.LIZ, c05fv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c05fv.LIZIZ) && this.LIZJ == c05fv.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public C05FV(String str, List<String> list, C05FX c05fx) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c05fx;
    }
}

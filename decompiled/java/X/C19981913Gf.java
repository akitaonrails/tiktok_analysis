package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981913Gf extends C13GN {
    public final boolean LL;
    public final InterfaceC19983313Gt LLILLJJLI = null;
    public final String LLILLL;

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLL.hashCode();
    }

    @Override // X.C13GN
    public final String toString() {
        if (!this.LL) {
            return this.LLILLL;
        }
        StringBuilder sb = new StringBuilder();
        C2342709Fx.LIZ(this.LLILLL, sb);
        return sb.toString();
    }

    @Override // X.C13GN
    public final String LIZJ() {
        return this.LLILLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19981913Gf.class != obj.getClass()) {
            return false;
        }
        C19981913Gf c19981913Gf = (C19981913Gf) obj;
        if (this.LL == c19981913Gf.LL && Intrinsics.LJFF(this.LLILLL, c19981913Gf.LLILLL)) {
            return true;
        }
        return false;
    }

    public C19981913Gf(Object obj, boolean z) {
        this.LL = z;
        this.LLILLL = obj.toString();
    }
}

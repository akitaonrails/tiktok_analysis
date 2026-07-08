package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362180lYG {
    public final EnumC1362480lYk LIZ;
    public final C1362510lYn LIZIZ;
    public final boolean LIZJ;

    public C1362180lYG() {
        this((C1362510lYn) null, false, 7);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZJ) * 31) + this.LIZ.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareItemUIState(iconState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", grayOut=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1362180lYG.class, cls) || !(obj instanceof C1362180lYG)) {
            return false;
        }
        C1362180lYG c1362180lYG = (C1362180lYG) obj;
        if (this.LIZ == c1362180lYG.LIZ && Intrinsics.LJFF(this.LIZIZ, c1362180lYG.LIZIZ) && this.LIZJ == c1362180lYG.LIZJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1362180lYG(C1362510lYn c1362510lYn, boolean z, int i) {
        EnumC1362480lYk enumC1362480lYk;
        if ((i & 1) != 0) {
            enumC1362480lYk = EnumC1362480lYk.NONE;
        } else {
            enumC1362480lYk = null;
        }
        this(enumC1362480lYk, (i & 2) != 0 ? new C1362510lYn(false, false, 7) : c1362510lYn, (i & 4) != 0 ? true : z);
    }

    public C1362180lYG(EnumC1362480lYk enumC1362480lYk, C1362510lYn c1362510lYn, boolean z) {
        this.LIZ = enumC1362480lYk;
        this.LIZIZ = c1362510lYn;
        this.LIZJ = z;
    }
}

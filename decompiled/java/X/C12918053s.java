package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.053s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12918053s {
    public static final C12918053s LJ;
    public final String LIZ;
    public final EnumC12928054c LIZIZ;
    public final EnumC1502105uN LIZJ;
    public final EnumC12929054d LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12918053s)) {
            return false;
        }
        C12918053s c12918053s = (C12918053s) obj;
        return Intrinsics.LJFF(this.LIZ, c12918053s.LIZ) && this.LIZIZ == c12918053s.LIZIZ && this.LIZJ == c12918053s.LIZJ && this.LIZLLL == c12918053s.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new Object() { // from class: X.053t
        };
        LJ = new C12918053s("", null, EnumC1502105uN.NONE, 0 == true ? 1 : 0, 10);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZJ.getTag());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12918053s(String str, EnumC12928054c enumC12928054c, EnumC1502105uN enumC1502105uN, EnumC12929054d enumC12929054d) {
        this.LIZ = str;
        this.LIZIZ = enumC12928054c;
        this.LIZJ = enumC1502105uN;
        this.LIZLLL = enumC12929054d;
    }

    public /* synthetic */ C12918053s(String str, EnumC12928054c enumC12928054c, EnumC1502105uN enumC1502105uN, EnumC12929054d enumC12929054d, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EnumC12928054c.NULL : enumC12928054c, enumC1502105uN, (i & 8) != 0 ? EnumC12929054d.NO_RUNTIME_TYPE : enumC12929054d);
    }
}

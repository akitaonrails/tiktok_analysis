package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169640gXi implements InterfaceC447510Hgj {
    public final C291001Au<C1169820gY0> LIZ;

    public C1169640gXi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1169640gXi) && Intrinsics.LJFF(this.LIZ, ((C1169640gXi) obj).LIZ);
    }

    public final int hashCode() {
        C291001Au<C1169820gY0> c291001Au = this.LIZ;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarAndNicknameCommonData(activityResultEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1169640gXi(C291001Au<C1169820gY0> c291001Au) {
        this.LIZ = c291001Au;
    }
}

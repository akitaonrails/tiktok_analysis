package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458250Hy3 {
    public final boolean LIZ;
    public final InterfaceC456610HvP LIZIZ;
    public final EnumC458500HyS LIZJ;

    public C458250Hy3() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C458250Hy3)) {
            return false;
        }
        C458250Hy3 c458250Hy3 = (C458250Hy3) obj;
        return this.LIZ == c458250Hy3.LIZ && Intrinsics.LJFF(this.LIZIZ, c458250Hy3.LIZIZ) && this.LIZJ == c458250Hy3.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordTipUiState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C458250Hy3(EnumC458500HyS enumC458500HyS, int i) {
        C456600HvO c456600HvO;
        if ((i & 2) != 0) {
            c456600HvO = new C456600HvO(new C1258904wF(""));
        } else {
            c456600HvO = null;
        }
        this(false, c456600HvO, (i & 4) != 0 ? EnumC458500HyS.TAKE_UP_SPACE_WHEN_TIP : enumC458500HyS);
    }

    public C458250Hy3(boolean z, InterfaceC456610HvP interfaceC456610HvP, EnumC458500HyS enumC458500HyS) {
        this.LIZ = z;
        this.LIZIZ = interfaceC456610HvP;
        this.LIZJ = enumC458500HyS;
    }

    public static C458250Hy3 LIZ(C458250Hy3 c458250Hy3, boolean z, InterfaceC456610HvP interfaceC456610HvP, int i) {
        EnumC458500HyS enumC458500HyS;
        if ((i & 1) != 0) {
            z = c458250Hy3.LIZ;
        }
        if ((i & 2) != 0) {
            interfaceC456610HvP = c458250Hy3.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC458500HyS = c458250Hy3.LIZJ;
        } else {
            enumC458500HyS = null;
        }
        c458250Hy3.getClass();
        return new C458250Hy3(z, interfaceC456610HvP, enumC458500HyS);
    }
}

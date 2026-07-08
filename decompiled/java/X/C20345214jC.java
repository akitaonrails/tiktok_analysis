package X;

/* JADX INFO: renamed from: X.14jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20345214jC implements InterfaceC20345414jE {
    public final EnumC852660Xce LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20345214jC) && this.LIZ == ((C20345214jC) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickMobileActionParam(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20345214jC() {
        this(EnumC852660Xce.NONE);
    }

    public C20345214jC(EnumC852660Xce enumC852660Xce) {
        this.LIZ = enumC852660Xce;
    }
}

package X;

/* JADX INFO: renamed from: X.1CyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247841CyU {
    public static final C2247841CyU LIZJ = new C2247841CyU(EnumC2247821CyS.NONE);
    public static final C2247841CyU LIZLLL = new C2247841CyU(EnumC2247821CyS.END);
    public final EnumC2247821CyS LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2247841CyU)) {
            return false;
        }
        C2247841CyU c2247841CyU = (C2247841CyU) obj;
        return this.LIZ == c2247841CyU.LIZ && this.LIZIZ == c2247841CyU.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraggedHandle(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", centerX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2247841CyU(EnumC2247821CyS enumC2247821CyS) {
        this(enumC2247821CyS, Integer.MIN_VALUE);
    }

    public C2247841CyU(EnumC2247821CyS enumC2247821CyS, int i) {
        this.LIZ = enumC2247821CyS;
        this.LIZIZ = i;
    }
}

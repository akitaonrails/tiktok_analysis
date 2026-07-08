package X;

/* JADX INFO: renamed from: X.0iv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261040iv8 extends AbstractC1261010iv5 {
    public final EnumC1070410dxf LLILLJJLI;

    public final C1261040iv8 copy(EnumC1070410dxf enumC1070410dxf) {
        return new C1261040iv8(enumC1070410dxf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1261040iv8) && this.LLILLJJLI == ((C1261040iv8) obj).LLILLJJLI;
    }

    public int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthMatch(platform=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC1070410dxf getPlatform() {
        return this.LLILLJJLI;
    }

    public C1261040iv8(EnumC1070410dxf enumC1070410dxf) {
        super("AuthMatch", null);
        this.LLILLJJLI = enumC1070410dxf;
    }
}

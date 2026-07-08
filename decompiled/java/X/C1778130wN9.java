package X;

/* JADX INFO: renamed from: X.0wN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778130wN9 {
    public final EnumC1778380wNY LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogPage(page=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isGoNetPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778130wN9(EnumC1778380wNY enumC1778380wNY, boolean z) {
        this.LIZ = enumC1778380wNY;
        this.LIZIZ = z;
    }
}

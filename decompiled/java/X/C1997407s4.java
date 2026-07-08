package X;

/* JADX INFO: renamed from: X.07s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1997407s4 {
    public final EnumC1997107s1 LIZ;
    public final EnumC1997207s2 LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiContext(allowOpenCamera = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allowOpenMic = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1997407s4(EnumC1997107s1 enumC1997107s1, EnumC1997207s2 enumC1997207s2) {
        this.LIZ = enumC1997107s1;
        this.LIZIZ = enumC1997207s2;
    }
}

package X;

/* JADX INFO: renamed from: X.0jkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292800jkM implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final EnumC1292820jkO LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MergePaths{mode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1292800jkM(String str, EnumC1292820jkO enumC1292820jkO) {
        this.LIZ = str;
        this.LIZIZ = enumC1292820jkO;
    }

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5) {
        if (!c1291430ji9.LLJI) {
            C1291650jiV.LIZIZ("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C1292790jkL(this);
    }
}

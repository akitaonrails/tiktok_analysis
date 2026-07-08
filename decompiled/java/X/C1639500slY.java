package X;

/* JADX INFO: renamed from: X.0slY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639500slY implements InterfaceC1639550sld {
    public final String LIZ;

    @Override // X.InterfaceC1639550sld
    public final String LIZIZ() {
        return this.LIZ;
    }

    public C1639500slY(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1639550sld
    public final String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".zip");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1639550sld
    public final String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1489060oqu.LIZ(this.LIZ));
        sbLIZ.append(str);
        return C1489060oqu.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1639550sld
    public final String LJFF(String str) {
        return this.LIZ;
    }
}

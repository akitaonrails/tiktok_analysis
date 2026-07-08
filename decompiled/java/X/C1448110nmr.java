package X;

/* JADX INFO: renamed from: X.0nmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448110nmr implements C198L {
    public final String LIZ;
    public final EnumC992420bvs LIZIZ;

    @Override // X.C198L
    public final void onCreate() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("@onCreate");
        C1448090nmp.LIZ(this.LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C198L
    public final void onResume() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("@onResume");
        C1448090nmp.LIZ(this.LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C198L
    public final void onStart() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("@onStart");
        C1448090nmp.LIZ(this.LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1448110nmr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = C1448090nmp.LIZIZ(str2);
    }
}

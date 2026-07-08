package X;

/* JADX INFO: renamed from: X.0U36, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U36 extends C0U3A {
    public static final C0U36 LJFF = new C0U36("lyric_dummy", "", -1);
    public final int LJ;

    @Override // X.C0U3A
    public final String LIZ() {
        String str = this.LJ == 3 ? ".krc" : ".lrc";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0U36(String str, String str2, int i) {
        super(str, str2);
        this.LJ = i;
    }
}

package X;

/* JADX INFO: renamed from: X.0mel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404650mel {
    public final String LIZ;
    public final EnumC2007207te LIZIZ;
    public float LIZJ = 0.0f;
    public final float LIZLLL = 0.0f;
    public float LJ = 0.0f;
    public float LJFF = 0.0f;
    public String LJI = "";
    public boolean LJII = true;
    public float LJIIIIZZ = 0.0f;
    public float LJIIIZ = 0.0f;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Record(creationId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initMB=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", beforeCompileMB=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", afterCompileMB=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", compileFileMB=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1404650mel(String str, EnumC2007207te enumC2007207te) {
        this.LIZ = str;
        this.LIZIZ = enumC2007207te;
    }
}

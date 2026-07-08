package X;

/* JADX INFO: renamed from: X.0x9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808300x9o {
    public final String LIZ;
    public final EnumC1808320x9q LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApiInfo(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", suspectDuplicatePattern=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeSinceLastRequest=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1808300x9o(String str, EnumC1808320x9q enumC1808320x9q, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = enumC1808320x9q;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}

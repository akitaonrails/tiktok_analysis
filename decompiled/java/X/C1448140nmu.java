package X;

/* JADX INFO: renamed from: X.0nmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448140nmu {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstFrameData(frameTimeMillis=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectTimeMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uiCurrentTimeMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", uiDoneTimeMillis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1448140nmu(long j, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
    }
}

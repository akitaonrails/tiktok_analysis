package X;

/* JADX INFO: renamed from: X.1D84, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D84 {
    public volatile C1D8K LIZ = new C1D8K() { // from class: X.1D8G
        @Override // X.C1D8K
        public final void LIZ(C1436910nUn c1436910nUn) {
        }

        @Override // X.C1D8K
        public final void log(String str) {
        }
    };

    public final void LIZ(String str) {
        C1D8K c1d8k = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveDetail: ");
        sbLIZ.append(str);
        c1d8k.log(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(int i, String str, Throwable th) {
        String strValueOf = String.valueOf(i);
        C1D8K c1d8k = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveReporter | msg:");
        sbLIZ.append(str);
        c1d8k.LIZ(new C1436910nUn(C2188811AlT.LIZIZ(sbLIZ), strValueOf, th));
    }
}

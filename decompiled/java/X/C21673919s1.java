package X;

/* JADX INFO: renamed from: X.19s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21673919s1 {
    public int LIZIZ;
    public int LIZJ;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public int LIZ = -1;
    public int LIZLLL = 1;

    public final int LIZIZ() {
        return this.LJI ? this.LIZIZ - this.LIZJ : this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State{mTargetPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mData=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mItemCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mIsMeasuring=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mPreviousLayoutItemCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mStructureChanged=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mInPreLayout=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mRunSimpleAnimations=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mRunPredictiveAnimations=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(int i) {
        if ((this.LIZLLL & i) != 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Layout state should be one of ");
        sbLIZ.append(Integer.toBinaryString(i));
        sbLIZ.append(" but it is ");
        sbLIZ.append(Integer.toBinaryString(this.LIZLLL));
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}

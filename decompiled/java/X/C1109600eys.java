package X;

import cu0.a;

/* JADX INFO: renamed from: X.0eys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1109600eys<MODEL extends a> {
    public MODEL LIZ;
    public Object LIZIZ;
    public boolean LIZJ = true;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinnedModel(");
        sbLIZ.append(hashCode());
        sbLIZ.append(", messageModel=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFolded=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bindCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasPined=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isUnPin=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasExpanded=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MODEL LIZ() {
        return this.LIZ;
    }

    public C1109600eys(MODEL model) {
        this.LIZ = model;
    }

    public void LIZIZ(MODEL model) {
        this.LIZ = model;
    }
}

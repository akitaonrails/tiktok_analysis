package X;

/* JADX INFO: renamed from: X.0muk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414560muk {
    public final C1414640mus LIZ;

    public C1414560muk(C1414640mus c1414640mus) {
        this.LIZ = c1414640mus;
    }

    public final void LIZ(int i, int i2, C1412800mru c1412800mru, C1412860ms0 c1412860ms0, boolean z, boolean z2, boolean z3) {
        if (!C0BYM.LIZ()) {
            this.LIZ.LLLFF.LIZ(false, c1412860ms0, false, -1, false);
        }
        C0CNO.LIZLLL(0L, new C1414540mui(c1412860ms0, z, this, i, i2, z2, c1412800mru, z3));
        C1414640mus c1414640mus = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download success (");
        sbLIZ.append(i2);
        sbLIZ.append("), autoApply=");
        sbLIZ.append(z2);
        sbLIZ.append(", previous=");
        sbLIZ.append(i);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(z);
        c1414640mus.R5(C2188811AlT.LIZIZ(sbLIZ));
    }
}

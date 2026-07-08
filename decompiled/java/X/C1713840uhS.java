package X;

import com.google.gson.n;

/* JADX INFO: renamed from: X.0uhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713840uhS {
    public final n LIZ;
    public final C00IO LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SourceInfo(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizTrackingParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1713840uhS(n nVar, int i) {
        this((i & 1) != 0 ? new n() : nVar, (C00IO) null);
    }

    public C1713840uhS(n nVar, C00IO c00io) {
        this.LIZ = nVar;
        this.LIZIZ = c00io;
    }
}

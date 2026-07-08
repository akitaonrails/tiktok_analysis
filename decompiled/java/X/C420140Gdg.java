package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420140Gdg extends AbstractC420130Gdf {
    public final C420150Gdh LIZJ;
    public final AbstractC577050MkB LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C420140Gdg)) {
            return false;
        }
        C420140Gdg c420140Gdg = (C420140Gdg) obj;
        return Intrinsics.LJFF(this.LIZJ, c420140Gdg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c420140Gdg.LIZLLL);
    }

    public final int hashCode() {
        C420150Gdh c420150Gdh = this.LIZJ;
        return ((c420150Gdh == null ? 0 : c420150Gdh.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("On(iconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cameraLayoutType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC420130Gdf
    public final C420150Gdh LIZ() {
        return this.LIZJ;
    }

    public C420140Gdg(C420150Gdh c420150Gdh, AbstractC577050MkB abstractC577050MkB) {
        super(null, c420150Gdh, 1);
        this.LIZJ = c420150Gdh;
        this.LIZLLL = abstractC577050MkB;
    }
}

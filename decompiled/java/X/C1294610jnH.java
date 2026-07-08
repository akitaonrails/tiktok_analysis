package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294610jnH implements InterfaceC1294510jn7 {
    public final String LIZ;
    public final InterfaceC1294490jn5<PointF, PointF> LIZIZ;
    public final InterfaceC1294490jn5<PointF, PointF> LIZJ;
    public final C1295020jnw LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RectangleShape{position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, AbstractC1295030jnx abstractC1295030jnx) {
        return new C1294600jnG(c1295950jpR, abstractC1295030jnx, this);
    }

    public C1294610jnH(String str, InterfaceC1294490jn5 interfaceC1294490jn5, C1294640jnK c1294640jnK, C1295020jnw c1295020jnw, boolean z) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1294490jn5;
        this.LIZJ = c1294640jnK;
        this.LIZLLL = c1295020jnw;
        this.LJ = z;
    }
}

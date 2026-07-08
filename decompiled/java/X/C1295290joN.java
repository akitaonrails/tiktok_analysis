package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0joN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295290joN implements InterfaceC1294510jn7 {
    public final boolean LIZ;
    public final Path.FillType LIZIZ;
    public final String LIZJ;
    public final C1295450jod LIZLLL;
    public final C1295460joe LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShapeFill{color=, fillEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, AbstractC1295030jnx abstractC1295030jnx) {
        return new C1295170joB(c1295950jpR, abstractC1295030jnx, this);
    }

    public C1295290joN(String str, boolean z, Path.FillType fillType, C1295450jod c1295450jod, C1295460joe c1295460joe, boolean z2) {
        this.LIZJ = str;
        this.LIZ = z;
        this.LIZIZ = fillType;
        this.LIZLLL = c1295450jod;
        this.LJ = c1295460joe;
        this.LJFF = z2;
    }
}

package X;

import androidx.emoji2.text.e;

/* JADX INFO: renamed from: X.0uEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695770uEJ {
    public C05P1<Boolean> LIZ;

    public C1695770uEJ() {
        this.LIZ = e.LJ() ? LIZ() : null;
    }

    public final C05P1<Boolean> LIZ() {
        e eVarLIZ = e.LIZ();
        if (eVarLIZ.LIZJ() == 1) {
            return new C1695790uEL(true);
        }
        final C05P0 c05p0LJI = C20028913Yh.LJI(Boolean.FALSE);
        eVarLIZ.LJIIJ(new AbstractC20101313kx() { // from class: X.0uEK
            @Override // X.AbstractC20101313kx
            public final void LIZ() {
                this.LIZ = C1695760uEI.LIZ;
            }

            @Override // X.AbstractC20101313kx
            public final void LIZIZ() {
                c05p0LJI.setValue(Boolean.TRUE);
                this.LIZ = new C1695790uEL(true);
            }
        });
        return c05p0LJI;
    }
}

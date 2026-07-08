package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.18hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21354218hY implements InterfaceC1488770oqR {
    public final /* synthetic */ C21353418hQ LIZ;

    @Override // X.InterfaceC1488770oqR
    public final void LIZ(float f) {
    }

    public C21354218hY(C21353418hQ c21353418hQ) {
        this.LIZ = c21353418hQ;
    }

    @Override // X.InterfaceC1488770oqR
    public final void LIZIZ(String str) {
        C21353418hQ c21353418hQ = C21353118hN.LLILLL;
        C21353418hQ c21353418hQ2 = this.LIZ;
        if (c21353418hQ != c21353418hQ2 && !c21353418hQ2.LJII) {
            return;
        }
        c21353418hQ2.LJ(str);
        C21353418hQ c21353418hQ3 = this.LIZ;
        long duration = c21353418hQ3.LIZIZ.getPlayer().LJIIIZ().getDuration();
        if (duration > 0) {
            c21353418hQ3.LJIILLIIL = duration;
        }
    }

    @Override // X.InterfaceC1488770oqR
    public final void onError(String str) {
        C21353418hQ c21353418hQ = C21353118hN.LLILLL;
        C21353418hQ c21353418hQ2 = this.LIZ;
        if (c21353418hQ != c21353418hQ2 && !c21353418hQ2.LJII) {
            return;
        }
        c21353418hQ2.getClass();
        c21353418hQ2.LIZLLL = EnumC1569640qws.INVALID;
        c21353418hQ2.LJIILJJIL = 5;
        c21353418hQ2.LJIILL = 3;
        a0.LJJJIL(str);
    }
}

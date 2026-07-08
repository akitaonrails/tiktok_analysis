package X;

/* JADX INFO: renamed from: X.0bUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975540bUe {
    public final /* synthetic */ C975500bUa LIZ;

    public C975540bUe(C975500bUa c975500bUa) {
        this.LIZ = c975500bUa;
    }

    public final void LIZ(boolean z) {
        EnumC975850bV9 enumC975850bV9;
        C20441214yg.LIZIZ("LiveMatchManager", "onDrawRematchCountdownEnd");
        if (!this.LIZ.LIZJ) {
            return;
        }
        if (z) {
            enumC975850bV9 = EnumC975850bV9.DRAW_REMATCH_BUTTON_CLICK;
        } else {
            enumC975850bV9 = EnumC975850bV9.DRAW_COUNTDOWN_END;
        }
        C974540bT2.LIZ.LJJIZ(EnumC975850bV9.DRAW_COUNTDOWN_END.getSource());
        InterfaceC975520bUc interfaceC975520bUc = this.LIZ.LJ;
        if (interfaceC975520bUc != null) {
            interfaceC975520bUc.r3(EnumC964170bCJ.MATCH_END, enumC975850bV9, null, null);
        }
    }
}

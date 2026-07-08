package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0dJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045730dJr extends C1045660dJk {
    public C1045730dJr(InterfaceC1045930dKB interfaceC1045930dKB) {
        super(interfaceC1045930dKB);
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIJJI(C1045720dJq c1045720dJq, Context context) {
        super.LJIIJJI(c1045720dJq, context);
        C1045030dIj.LJ(c1045720dJq.LJIIIZ, "bufferStart", null);
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LIZ(C1045720dJq c1045720dJq, Context context, int i) {
        super.LIZ(c1045720dJq, context, i);
        C1045030dIj.LJ(c1045720dJq.LJIIIZ, "resume", null);
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIJ(C1045720dJq c1045720dJq, Context context, int i) {
        super.LJIIJ(c1045720dJq, context, i);
        C1045030dIj.LJ(c1045720dJq.LJIIIZ, "pause", null);
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIILIIL(C1045720dJq c1045720dJq, Context context, int i) {
        super.LJIILIIL(c1045720dJq, context, i);
        C1045030dIj.LJ(c1045720dJq.LJIIIZ, "complete", "play_over");
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJFF(C1045720dJq c1045720dJq, Context context, int i, View view) {
        super.LJFF(c1045720dJq, context, i, view);
        if (i == 0 && c1045720dJq.LJII) {
            C1045030dIj.LJ(c1045720dJq.LJIIIZ, "playerExpand", null);
            C1045030dIj.LJ(c1045720dJq.LJIIIZ, "fullscreen", null);
        }
    }
}

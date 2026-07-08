package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: X.0dJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045630dJh extends C1045660dJk {
    public C1045720dJq LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;

    public C1045630dJh(InterfaceC1045930dKB interfaceC1045930dKB) {
        super(interfaceC1045930dKB);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045630dJh.LJIILL(java.lang.String):void");
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIJJI(C1045720dJq c1045720dJq, Context context) {
        super.LJIIJJI(c1045720dJq, context);
        LJIILL("bufferStart");
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIL(Context context, C1045720dJq c1045720dJq) {
        super.LJIIL(context, c1045720dJq);
        LJIILL("sessionFinish");
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LIZ(C1045720dJq c1045720dJq, Context context, int i) {
        super.LIZ(c1045720dJq, context, i);
        if (i == 0) {
            LJIILL("resume");
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIJ(C1045720dJq c1045720dJq, Context context, int i) {
        super.LJIIJ(c1045720dJq, context, i);
        if (i == 0) {
            LJIILL("pause");
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIILIIL(C1045720dJq c1045720dJq, Context context, int i) {
        super.LJIILIIL(c1045720dJq, context, i);
        if (i == 1) {
            LJIILL("complete");
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJFF(C1045720dJq c1045720dJq, Context context, int i, View view) {
        super.LJFF(c1045720dJq, context, i, view);
        if (i != 0) {
            return;
        }
        this.LIZIZ = c1045720dJq;
        LJIILL("mediaStart");
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJII(C1045720dJq c1045720dJq, View view, List<? extends View> list, String str) {
        super.LJII(c1045720dJq, view, list, str);
        this.LIZIZ = c1045720dJq;
        LJIILL("sessionStart");
    }
}

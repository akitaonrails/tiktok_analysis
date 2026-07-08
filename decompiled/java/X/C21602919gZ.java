package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19gZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21602919gZ implements InterfaceC466620IRo {
    public final InterfaceC21605719h1 LIZ;
    public final C21602019gQ LIZIZ = new C21602019gQ(new InterfaceC21604919gt() { // from class: X.19gY
        @Override // X.InterfaceC21604919gt
        public final int getChildCount() {
            return this.LL.LIZ.getChildCount();
        }

        @Override // X.InterfaceC21604919gt
        public final View LIZ(int i) {
            return ((ViewGroup) this.LL.LIZ).getChildAt(i);
        }

        @Override // X.InterfaceC21604919gt
        public final boolean LIZIZ(View view) {
            C21601619gM c21601619gM = (C21601619gM) this.LL.LIZ;
            C21603219gc c21603219gcLJIIIIZZ = c21601619gM.LJIIIIZZ(view);
            if (c21603219gcLJIIIIZZ != null && c21603219gcLJIIIIZZ.LIZIZ != c21601619gM.LLIZLLLIL) {
                return false;
            }
            return true;
        }
    });

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19gY] */
    public C21602919gZ(InterfaceC21605719h1 interfaceC21605719h1) {
        this.LIZ = interfaceC21605719h1;
    }

    public final void LIZ(int i) {
        C21602019gQ c21602019gQ = this.LIZIZ;
        if (!c21602019gQ.LIZJ) {
            int i2 = c21602019gQ.LJFF;
            if (i2 == -1) {
                c21602019gQ.LJFF = i;
            } else {
                if (i2 == i) {
                    return;
                }
                c21602019gQ.LIZJ = true;
            }
        }
    }
}

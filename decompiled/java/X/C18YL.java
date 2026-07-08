package X;

import android.view.View;

/* JADX INFO: renamed from: X.18YL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YL {
    public final InterfaceC789250Uxf LIZ;
    public final EnumC912790ZrR LIZIZ;
    public final C18WK LIZJ;
    public final boolean LIZLLL;

    public final View LIZ() {
        InterfaceC789250Uxf interfaceC789250Uxf = this.LIZ;
        if (interfaceC789250Uxf instanceof C789240Uxe) {
            return ((C789240Uxe) interfaceC789250Uxf).LIZ;
        }
        if (interfaceC789250Uxf instanceof C789260Uxg) {
            return ((C789260Uxg) interfaceC789250Uxf).LIZ;
        }
        throw new C1954807lC();
    }

    public C18YL(View view, EnumC912790ZrR enumC912790ZrR, C18WK c18wk) {
        this(new C789240Uxe(view), enumC912790ZrR, c18wk, false);
    }

    public C18YL(InterfaceC789250Uxf interfaceC789250Uxf, EnumC912790ZrR enumC912790ZrR, C18WK c18wk, boolean z) {
        this.LIZ = interfaceC789250Uxf;
        this.LIZIZ = enumC912790ZrR;
        this.LIZJ = c18wk;
        this.LIZLLL = z;
    }
}

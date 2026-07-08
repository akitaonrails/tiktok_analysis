package X;

import android.view.View;

/* JADX INFO: renamed from: X.06gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1671606gc implements InterfaceC899400ZQc {
    public final View LIZIZ;

    @Override // X.InterfaceC899400ZQc
    public final boolean LIZIZ() {
        return true;
    }

    public C1671606gc(View view) {
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC899400ZQc
    public final void LIZ(int i) {
        View viewFindViewById = this.LIZIZ.findViewById(i);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    @Override // X.InterfaceC899400ZQc
    public final <T extends View> T LIZJ(int i) {
        return (T) this.LIZIZ.findViewById(i);
    }
}

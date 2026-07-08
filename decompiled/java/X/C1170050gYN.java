package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170050gYN implements InterfaceC1749320vcg {
    public final View LIZ;
    public final View LIZIZ;
    public final C1390410mHn LIZJ;

    @Override // X.InterfaceC1749320vcg
    public final void hide() {
        C786410Ut5.LJLLLLLL(8, this.LIZ);
    }

    @Override // X.InterfaceC1749320vcg
    public final void show() {
        C786410Ut5.LJLLLLLL(0, this.LIZ);
        C786410Ut5.LJLLLLLL(8, this.LIZJ);
        this.LIZJ.LIZLLL();
        C786410Ut5.LJLLLLLL(0, this.LIZIZ);
    }

    public C1170050gYN(Context context) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.av5, null, false);
        this.LIZ = viewTd;
        this.LIZIZ = viewTd.findViewById(R.id.th4);
        this.LIZJ = (C1390410mHn) viewTd.findViewById(R.id.nle);
    }
}

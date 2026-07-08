package X;

import android.content.res.ColorStateList;

/* JADX INFO: renamed from: X.0Uek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC777520Uek implements InterfaceC778710Ugf {
    public abstract int LIZ();

    public abstract int LIZIZ();

    @Override // X.InterfaceC778710Ugf
    public final C778580UgS getIcon() {
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(LIZIZ(), C497740JfY.LJII());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(LIZ());
        } else {
            c20743516FdLIZLLL = null;
        }
        return new C778580UgS(c20743516FdLIZLLL, ColorStateList.valueOf(LIZ()));
    }
}

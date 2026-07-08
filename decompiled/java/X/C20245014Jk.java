package X;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: X.14Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245014Jk extends C14K2 {
    @Override // X.C20244514Jf
    public final C20244614Jg LIZ() {
        return C20244614Jg.LIZLLL(null, this.LIZLLL.consumeDisplayCutout());
    }

    @Override // X.C20244514Jf
    public final C1155260gAW LJ() {
        DisplayCutout displayCutout = this.LIZLLL.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1155260gAW(displayCutout);
    }

    @Override // X.C20244514Jf
    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    @Override // X.C20244714Jh, X.C20244514Jf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20245014Jk)) {
            return false;
        }
        C20244714Jh c20244714Jh = (C20244714Jh) obj;
        if (Objects.equals(this.LIZLLL, c20244714Jh.LIZLLL) && Objects.equals(this.LJII, c20244714Jh.LJII)) {
            return true;
        }
        return false;
    }

    public C20245014Jk(C20244614Jg c20244614Jg, WindowInsets windowInsets) {
        super(c20244614Jg, windowInsets);
    }
}

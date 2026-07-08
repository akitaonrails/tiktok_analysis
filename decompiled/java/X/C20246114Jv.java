package X;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: X.14Jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20246114Jv extends C14K1 {
    @Override // X.C20245614Jq
    public C20246014Ju LIZ() {
        return C20246014Ju.LJIIJJI(null, this.LIZJ.consumeDisplayCutout());
    }

    @Override // X.C20245614Jq
    public C1683900tvA LJFF() {
        DisplayCutout displayCutout = this.LIZJ.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1683900tvA(displayCutout);
    }

    @Override // X.C20245614Jq
    public int hashCode() {
        return this.LIZJ.hashCode();
    }

    @Override // X.C20245514Jp, X.C20245614Jq
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20246114Jv)) {
            return false;
        }
        C20245514Jp c20245514Jp = (C20245514Jp) obj;
        if (Objects.equals(this.LIZJ, c20245514Jp.LIZJ) && Objects.equals(this.LJI, c20245514Jp.LJI)) {
            return true;
        }
        return false;
    }

    public C20246114Jv(C20246014Ju c20246014Ju, C20246114Jv c20246114Jv) {
        super(c20246014Ju, c20246114Jv);
    }

    public C20246114Jv(C20246014Ju c20246014Ju, WindowInsets windowInsets) {
        super(c20246014Ju, windowInsets);
    }
}

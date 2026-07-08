package X;

import X.C0Q78;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Q78, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0Q78<T extends C0Q78<T>> extends AbstractC1386130mAt<T> {
    public final HashMap<String, String> LJIILLIIL;

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIILIIL() {
        super.LJIILIIL();
        ((HashMap) this.LIZIZ).putAll(this.LJIILLIIL);
    }

    public C0Q78(String str) {
        super(str);
        this.LJIILLIIL = new HashMap<>();
    }

    public final void LJIILLIIL(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            this.LJIILLIIL.put(str, str2);
        }
    }

    public final void LJIIZILJ(String str, String str2) {
        this.LJIILLIIL.put(str, str2);
    }
}

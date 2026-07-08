package androidx.compose.ui.input.key;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1209870hab;
import X.C1692970u9n;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class KeyInputElement extends AbstractC1685820tyG<C1692970u9n> {
    public final Function1<C1209870hab, Boolean> LIZIZ;
    public final Function1<C1209870hab, Boolean> LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1692970u9n(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        Function1<C1209870hab, Boolean> function1 = this.LIZIZ;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<C1209870hab, Boolean> function12 = this.LIZJ;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1692970u9n c1692970u9n = (C1692970u9n) abstractC20055413dY;
        c1692970u9n.LLJJ = this.LIZIZ;
        c1692970u9n.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (this.LIZIZ == keyInputElement.LIZIZ && this.LIZJ == keyInputElement.LIZJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(Function1<? super C1209870hab, Boolean> function1, Function1<? super C1209870hab, Boolean> function12) {
        this.LIZIZ = function1;
        this.LIZJ = function12;
    }
}

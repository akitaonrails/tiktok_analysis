package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1689390u41;
import X.C1691480u7O;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class ScrollingLayoutElement extends AbstractC1685820tyG<C1691480u7O> {
    public final C1689390u41 LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1691480u7O(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1691480u7O c1691480u7O = (C1691480u7O) abstractC20055413dY;
        c1691480u7O.LLJJ = this.LIZIZ;
        c1691480u7O.LLJJI = this.LIZJ;
        c1691480u7O.LLJJIII = this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!Intrinsics.LJFF(this.LIZIZ, scrollingLayoutElement.LIZIZ) || this.LIZJ != scrollingLayoutElement.LIZJ || this.LIZLLL != scrollingLayoutElement.LIZLLL) {
            return false;
        }
        return true;
    }

    public ScrollingLayoutElement(C1689390u41 c1689390u41, boolean z, boolean z2) {
        this.LIZIZ = c1689390u41;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}

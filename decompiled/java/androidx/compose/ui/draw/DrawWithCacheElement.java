package androidx.compose.ui.draw;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1681020tqW;
import X.C1681030tqX;
import X.C1681040tqY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class DrawWithCacheElement extends AbstractC1685820tyG<C1681020tqW> {
    public final Function1<C1681030tqX, C1681040tqY> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.LJFF(this.LIZIZ, ((DrawWithCacheElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawWithCacheElement(onBuildDrawCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1681020tqW(new C1681030tqX(), this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(Function1<? super C1681030tqX, C1681040tqY> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1681020tqW c1681020tqW = (C1681020tqW) abstractC20055413dY;
        c1681020tqW.LLJJIJI = this.LIZIZ;
        c1681020tqW.LJLLLLLL();
    }
}

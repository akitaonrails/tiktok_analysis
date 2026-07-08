package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689990u4z extends AbstractC20055413dY implements InterfaceC1695680uEA {
    public LazyLayoutItemAnimator<?> LLJJ;

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1689990u4z) && Intrinsics.LJFF(this.LLJJ, ((C1689990u4z) obj).LLJJ);
    }

    public final int hashCode() {
        return this.LLJJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayingDisappearingItemsNode(animator=");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        this.LLJJ.LJIIIZ = this;
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.LLJJ;
        lazyLayoutItemAnimator.LJ();
        lazyLayoutItemAnimator.LIZIZ = null;
        lazyLayoutItemAnimator.LIZJ = -1;
    }

    public C1689990u4z(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        this.LLJJ = lazyLayoutItemAnimator;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        ArrayList arrayList = (ArrayList) this.LLJJ.LJIIIIZZ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1686480tzK c1686480tzK = (C1686480tzK) ListProtector.get(arrayList, i);
            C1695970uEd c1695970uEd = c1686480tzK.LJIILIIL;
            if (c1695970uEd != null) {
                long j = c1686480tzK.LJIIL;
                float f = (int) (j >> 32);
                float fLIZJ = C1676820tjk.LIZJ(j);
                long j2 = c1695970uEd.LJIJI;
                float f2 = f - ((int) (j2 >> 32));
                float fLIZJ2 = fLIZJ - C1676820tjk.LIZJ(j2);
                interfaceC1669010tX9.LJLJI().LIZ.LJII(f2, fLIZJ2);
                try {
                    C1695960uEc.LIZ(interfaceC1669010tX9, c1695970uEd);
                    interfaceC1669010tX9.LJLJI().LIZ.LJII(-f2, -fLIZJ2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC1669010tX9.LJLJI().LIZ.LJII(-f2, -fLIZJ2);
                    throw th;
                }
            }
        }
        interfaceC1669010tX9.LLIIJLIL();
    }
}

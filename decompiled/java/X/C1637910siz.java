package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0siz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637910siz implements InterfaceC21360618ia {
    public final /* synthetic */ C1637900siy LIZ;

    @Override // X.InterfaceC21360618ia
    public final void LIZ() {
    }

    @Override // X.InterfaceC21360618ia
    public final void LIZJ(C21356918hz c21356918hz) {
    }

    @Override // X.InterfaceC21360618ia
    public final void LIZLLL() {
    }

    public C1637910siz(C1637900siy c1637900siy) {
        this.LIZ = c1637900siy;
    }

    @Override // X.InterfaceC21360618ia
    public final void LIZIZ(List<String> list) {
        Iterator<InterfaceC1637930sj1> it2 = this.LIZ.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().f(list);
        }
    }
}

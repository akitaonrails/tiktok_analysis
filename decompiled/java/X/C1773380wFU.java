package X;

import X.InterfaceC1774050wGZ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wFU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773380wFU<T extends InterfaceC1774050wGZ<T>> extends AbstractC21342018fa {
    public final List<T> LIZ;
    public final List<T> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return ((ArrayList) this.LIZIZ).size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return ((ArrayList) this.LIZ).size();
    }

    public C1773380wFU(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        arrayList.addAll(c13bv);
    }

    public final void LJFF(List list) {
        ((ArrayList) this.LIZ).clear();
        ((ArrayList) this.LIZ).addAll(this.LIZIZ);
        ((ArrayList) this.LIZIZ).clear();
        ((ArrayList) this.LIZIZ).addAll(list);
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        return ((InterfaceC1774050wGZ) ListProtector.get(this.LIZ, i)).LIZIZ((InterfaceC1774050wGZ) ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        return ((InterfaceC1774050wGZ) ListProtector.get(this.LIZ, i)).LIZLLL((InterfaceC1774050wGZ) ListProtector.get(this.LIZIZ, i2));
    }
}

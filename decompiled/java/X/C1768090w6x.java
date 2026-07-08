package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768090w6x implements InterfaceC21155217qY, InterfaceC1774150wGj {
    public final List<InterfaceC1768080w6w> LL = new ArrayList();
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;

    @Override // X.InterfaceC1774150wGj
    public final void LJIIZILJ() {
        Iterator<InterfaceC1768080w6w> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
    }

    @Override // X.InterfaceC21155217qY
    public final Pair<Boolean, Integer> N4() {
        return new Pair<>(Boolean.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ));
    }

    @Override // X.InterfaceC21155217qY
    public final boolean K4() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC21155217qY
    public final void L4(InterfaceC1768080w6w interfaceC1768080w6w) {
        ((ArrayList) this.LL).add(interfaceC1768080w6w);
    }

    @Override // X.InterfaceC21155217qY
    public final void M4(InterfaceC1768080w6w interfaceC1768080w6w) {
        ((ArrayList) this.LL).remove(interfaceC1768080w6w);
    }

    @Override // X.InterfaceC1774150wGj
    public final void LJIIL(int i, boolean z) {
        this.LLILLL = z;
        this.LLILZ = i;
        Iterator<InterfaceC1768080w6w> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(i, z);
        }
    }
}

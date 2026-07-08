package X;

import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655440tBG implements InterfaceC577370Mkh, InterfaceC1649070t0z, InterfaceC1655990tC9, InterfaceC1649080t10 {
    public final List<InterfaceC1655700tBg> LL = new ArrayList();
    public final List<InterfaceC1655690tBf> LLILLJJLI = new ArrayList();
    public final List<InterfaceC1888407aU> LLILLL = new ArrayList();
    public final List<InterfaceC1655620tBY> LLILZ = new ArrayList();
    public final List<InterfaceC1655400tBC> LLILZIL = new ArrayList();
    public final List<C07YN> LLILZLL = new ArrayList();
    public final List<InterfaceC1269304xv> LLIZ = new ArrayList();

    public final void LIZJ() {
        Iterator<InterfaceC1888407aU> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
        ((ArrayList) this.LLILZLL).add(C07YO.LIZ);
    }

    public final boolean LIZ(NavigationScene navigationScene) {
        List<InterfaceC1655620tBY> list = this.LLILZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1655620tBY) it2.next()).LJFF()) {
                    return true;
                }
            }
        }
        if (navigationScene != null && navigationScene.LLLLLJIL(null)) {
            return true;
        }
        List<InterfaceC1655620tBY> list2 = this.LLILZ;
        if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
            Iterator it3 = ((ArrayList) list2).iterator();
            while (it3.hasNext()) {
                ((InterfaceC1655620tBY) it3.next()).LJ();
            }
        }
        List<InterfaceC1655620tBY> list3 = this.LLILZ;
        if ((list3 instanceof Collection) && ((ArrayList) list3).isEmpty()) {
            return false;
        }
        Iterator it4 = ((ArrayList) list3).iterator();
        while (it4.hasNext()) {
            if (((InterfaceC1655620tBY) it4.next()).onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ(boolean z) {
        Iterator<InterfaceC1888407aU> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(z);
        }
        ((ArrayList) this.LLILZLL).add(new C07YL(z));
    }

    public final void LIZLLL(boolean z) {
        Iterator<InterfaceC1888407aU> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(z);
        }
        ((ArrayList) this.LLILZLL).add(new C07YM(z));
    }

    @Override // X.InterfaceC577370Mkh
    public final void LJIIZILJ(InterfaceC1655690tBf interfaceC1655690tBf) {
        ((ArrayList) this.LLILLJJLI).remove(interfaceC1655690tBf);
    }

    @Override // X.InterfaceC577370Mkh
    public final void LJIJ(InterfaceC1655700tBg interfaceC1655700tBg) {
        ((ArrayList) this.LL).remove(interfaceC1655700tBg);
    }

    @Override // X.InterfaceC1655990tC9
    public final void LJIJI(InterfaceC1655620tBY interfaceC1655620tBY) {
        ((ArrayList) this.LLILZ).add(interfaceC1655620tBY);
    }

    @Override // X.InterfaceC1649080t10
    public final void LJJJZ(C1649060t0y c1649060t0y) {
        ((ArrayList) this.LLILZIL).add(c1649060t0y);
        c1649060t0y.getClass();
        new C1939807im().LIZ(this.LLIZ, new AwS604S0100000_25(c1649060t0y, 579));
    }

    @Override // X.InterfaceC1649070t0z
    public final void LJJLIL(InterfaceC1888407aU interfaceC1888407aU) {
        ((ArrayList) this.LLILLL).add(interfaceC1888407aU);
        InterfaceC1939907in interfaceC1939907inLIZ = interfaceC1888407aU.LIZ();
        if (interfaceC1939907inLIZ != null) {
            interfaceC1939907inLIZ.LIZ(this.LLILZLL, new AwS582S0100000_3(interfaceC1888407aU, 100));
        }
    }

    @Override // X.InterfaceC577370Mkh
    public final void LJLJJL(InterfaceC1655690tBf interfaceC1655690tBf) {
        ((ArrayList) this.LLILLJJLI).add(interfaceC1655690tBf);
    }

    @Override // X.InterfaceC1655990tC9
    public final void LJLLL(InterfaceC1655620tBY interfaceC1655620tBY) {
        ((ArrayList) this.LLILZ).remove(interfaceC1655620tBY);
    }

    @Override // X.InterfaceC1649080t10
    public final void LJLLLLLL(C1649060t0y c1649060t0y) {
        ((ArrayList) this.LLILZIL).remove(c1649060t0y);
    }

    @Override // X.InterfaceC577370Mkh
    public final void LLI(InterfaceC1655700tBg interfaceC1655700tBg) {
        ((ArrayList) this.LL).add(interfaceC1655700tBg);
    }

    @Override // X.InterfaceC1649070t0z
    public final void LLJJ(InterfaceC1888407aU interfaceC1888407aU) {
        ((ArrayList) this.LLILLL).remove(interfaceC1888407aU);
    }
}

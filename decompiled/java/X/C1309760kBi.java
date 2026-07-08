package X;

import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxEnv;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309760kBi extends C1309830kBp<C1309760kBi> implements InterfaceC1309820kBo {
    public final AbstractC1310390kCj LJJII;
    public Object LJJIII;
    public InterfaceC1299780jvc LJJIIJ;
    public AbstractC1301120jxm LJJIIJZLJL;
    public final boolean LJJIIZ = LynxEnv.inst().isLayoutOnlyEnabled();
    public Map<String, String> LJJIIZI;
    public Map<String, String> LJJIJ;
    public LynxBackgroundRuntime LJJIJIIJI;
    public InterfaceC1300010jvz LJJIJIIJIL;

    public final C1309830kBp LJIILL() {
        this.LIZLLL.LIZ = true;
        return this;
    }

    @Override // X.InterfaceC1309820kBo
    public final int LIZ() {
        if (this.LJIIJJI) {
            return this.LJIILJJIL;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LIZ() : this.LJIILJJIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final C1299340juu LIZIZ() {
        C1299340juu c1299340juu = this.LIZLLL.LIZJ;
        if (c1299340juu != null) {
            return c1299340juu;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final AbstractC1299960jvu LIZJ() {
        AbstractC1299960jvu abstractC1299960jvu = this.LIZLLL.LJII;
        if (abstractC1299960jvu != null) {
            return abstractC1299960jvu;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final int LIZLLL() {
        if (this.LJIIJJI) {
            return this.LJIILL;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LIZLLL() : this.LJIILL;
    }

    @Override // X.InterfaceC1309820kBo
    public final C1289430jev LJ() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJ() : this.LIZJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJFF() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJFF() : this.LJI;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJI() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJI();
        }
        return false;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIIIIZZ() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIIIIZZ() : this.LJFF;
    }

    @Override // X.InterfaceC1309820kBo
    public final String LJIIIZ() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIIIZ() : "50px";
    }

    @Override // X.InterfaceC1309820kBo
    public final HashMap LJIIJJI() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJIIJJI();
        }
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJIIL();
        }
        return false;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIILIIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIILIIL() : this.LJII;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIILLIIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJIILLIIL();
        }
        if (this.LJIILIIL) {
            return false;
        }
        return this.LJIIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIJI() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIJI() : this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIJJ() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIJJ() : this.LJIILIIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final int LJIJJLI() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIJJLI() : this.LJJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final InterfaceC1299640jvO LJIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJIL() : this.LJIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final float LJJ() {
        if (this.LJIIZILJ) {
            return this.LJIILLIIL;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJ() : this.LJIILLIIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final InterfaceC1299290jup LJJII() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJJII();
        }
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIIJ() {
        if (this.LJIIJ) {
            return this.LJIIIZ;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJJIIJ();
        }
        return false;
    }

    @Override // X.InterfaceC1309820kBo
    public final C1299310jur LJJIIJZLJL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJIIJZLJL() : this.LIZLLL;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIIZ() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJIIZ() : this.LJJI;
    }

    @Override // X.InterfaceC1309820kBo
    public final AbstractC1299950jvt LJJIJIIJIL() {
        AbstractC1299950jvt abstractC1299950jvt = this.LIZLLL.LJIIIZ;
        if (abstractC1299950jvt != null) {
            return abstractC1299950jvt;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJJIJIIJIL();
        }
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIJIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJIJIL() : this.LIZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final EnumC665490Q8l LJJIJL() {
        EnumC665490Q8l enumC665490Q8l = this.LJIJI;
        if (enumC665490Q8l != null) {
            return enumC665490Q8l;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJIJL() : EnumC665490Q8l.ALL_ON_UI;
    }

    @Override // X.InterfaceC1309820kBo
    public final EnumC1299430jv3 LJJIJLIJ() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJIJLIJ() : this.LIZLLL.LJIIJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJIL() : this.LJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final AbstractC1301590jyX LJJIZ() {
        AbstractC1301590jyX abstractC1301590jyX = this.LIZLLL.LJIIIIZZ;
        if (abstractC1301590jyX != null) {
            return abstractC1301590jyX;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.LJJIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJJIL() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.LJJJIL() : this.LJIJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final Float getDensity() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.getDensity() : this.LIZIZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final int getScreenHeight() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.getScreenHeight() : this.LJIJJLI;
    }

    @Override // X.InterfaceC1309820kBo
    public final int getScreenWidth() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        return interfaceC1300010jvz != null ? interfaceC1300010jvz.getScreenWidth() : this.LJIJJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean isDebuggable() {
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            return interfaceC1300010jvz.isDebuggable();
        }
        return false;
    }

    public C1309760kBi() {
        LynxEnv.inst().lazyInitIfNeeded();
        this.LJJII = LynxEnv.inst().getTemplateProvider();
    }

    public final void LJIIJ(List list) {
        C1289430jev c1289430jev = this.LIZJ;
        c1289430jev.getClass();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c1289430jev.LIZ((C1311670kEn) it2.next());
            }
        }
    }

    public final void LJIILJJIL(String str, Class<? extends LynxModule> cls, Object obj) {
        this.LIZLLL.LIZJ(str, cls, obj);
    }
}

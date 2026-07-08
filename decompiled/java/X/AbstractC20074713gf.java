package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20074713gf extends AbstractC20055413dY implements InterfaceC1697480uH4, InterfaceC20056213dg, InterfaceC1693210uAB {
    public C1696090uEp LLJJ;
    public InterfaceC1693130uA3 LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ void LJJIIZ() {
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ boolean LJL() {
        return false;
    }

    public abstract void LLJJI(InterfaceC1693130uA3 interfaceC1693130uA3);

    public abstract boolean LLJJIII(int i);

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        C1696090uEp c1696090uEp = this.LLJJ;
        return c1696090uEp != null ? c1696090uEp.LIZ(C20052513d5.LJFF(this).LLJJJJLIIL) : C20082213hs.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJ() {
        InterfaceC1693130uA3 interfaceC1693130uA3;
        C259800zU c259800zU = new C259800zU();
        C20050913cp.LIZIZ(this, new AwS609S0100000_30(c259800zU, (C259800zU<AbstractC20074713gf>) 191));
        AbstractC20074713gf abstractC20074713gf = (AbstractC20074713gf) c259800zU.element;
        if (abstractC20074713gf == null || (interfaceC1693130uA3 = abstractC20074713gf.LLJJI) == null) {
            interfaceC1693130uA3 = this.LLJJI;
        }
        LLJJI(interfaceC1693130uA3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJIJI() {
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            if (this.LLJILLL) {
                C259800zU c259800zU = new C259800zU();
                C20050913cp.LIZIZ(this, new AwS609S0100000_30(c259800zU, (C259800zU<AbstractC20074713gf>) 188));
                AbstractC20074713gf abstractC20074713gf = (AbstractC20074713gf) c259800zU.element;
                if (abstractC20074713gf != null) {
                    abstractC20074713gf.LLJJ();
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
                LLJJI(null);
            }
        }
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LLIIIILZ();
    }

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        LLJJIJI();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        LLIIIILZ();
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        LLJJIJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJIJIIJIL(boolean z) {
        if (this.LLJJIII != z) {
            this.LLJJIII = z;
            if (z) {
                if (this.LLJJIJI) {
                    LLJJ();
                }
            } else {
                if (!this.LLJJIJI) {
                    return;
                }
                C259800zU c259800zU = new C259800zU();
                C20050913cp.LIZJ(this, new AwS609S0100000_30(c259800zU, (C259800zU<AbstractC20074713gf>) 190));
                AbstractC20074713gf abstractC20074713gf = (AbstractC20074713gf) c259800zU.element;
                if (abstractC20074713gf == null) {
                    abstractC20074713gf = this;
                }
                abstractC20074713gf.LLJJ();
            }
        }
    }

    public AbstractC20074713gf(InterfaceC1693130uA3 interfaceC1693130uA3, boolean z, C1696090uEp c1696090uEp) {
        this.LLJJ = c1696090uEp;
        this.LLJJI = interfaceC1693130uA3;
        this.LLJJIII = z;
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        if (enumC20065813fE == EnumC20065813fE.Main) {
            List<C20066813fO> list = c20067313fT.LIZ;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (LLJJIII(((C20066813fO) ListProtector.get(list, i)).LJIIIIZZ)) {
                    int i2 = c20067313fT.LIZLLL;
                    if (i2 == 4) {
                        this.LLJJIJI = true;
                        C013C c013c = new C013C();
                        c013c.element = true;
                        if (!this.LLJJIII) {
                            C20050913cp.LIZJ(this, new AwS609S0100000_30(c013c, 189));
                        }
                        if (c013c.element) {
                            LLJJ();
                            return;
                        }
                        return;
                    }
                    if (i2 != 5) {
                        return;
                    }
                    LLJJIJI();
                    return;
                }
            }
        }
    }
}

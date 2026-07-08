package X;

import Y.AfS157S0200000_22;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1434490nQt extends C1D8B {
    public C11JF LL;
    public int LLILLJJLI;
    public InterfaceC1434300nQa LLILLL;
    public C1431070nLN LLILZ;
    public boolean LLILZIL;

    public abstract void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN);

    public int LJIIJ() {
        return 0;
    }

    public abstract EnumC1434810nRP LJIIJJI();

    public final void LJI() {
        C11JF c11jf = this.LL;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        C11JF c11jf2 = this.LL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LL = null;
    }

    public final C1431070nLN LJIIIIZZ() {
        C1431070nLN c1431070nLN = this.LLILZ;
        if (c1431070nLN != null) {
            return c1431070nLN;
        }
        return null;
    }

    public final InterfaceC1434300nQa LJIIIZ() {
        InterfaceC1434300nQa interfaceC1434300nQa = this.LLILLL;
        if (interfaceC1434300nQa != null) {
            return interfaceC1434300nQa;
        }
        return null;
    }

    public final String LJIILIIL() {
        return LJIIJJI().getDesc();
    }

    @Override // X.C1D8B
    public boolean LIZLLL(Object obj) {
        this.LLILZIL = true;
        LJI();
        return false;
    }

    @Override // X.C1D8B
    public void LJ(Object obj) {
        this.LLILZIL = false;
        LJIIL(LJIIIIZZ());
    }

    public final void LJIIL(C1431070nLN c1431070nLN) {
        int iLJIIJ = LJIIJ();
        if (iLJIIJ > 0) {
            this.LL = (C11JF) C11NZ.LJJJJLI(iLJIIJ, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(new C19501611Rm(EnumC2272608vM.LL)).LJJLJLI(new AfS157S0200000_22(c1431070nLN, this, 10));
        }
    }

    @Override // X.C1D8B
    public boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        LJI();
        interfaceC1434410nQl.LIZ(null);
        return false;
    }

    @Override // X.C1D8B
    public void LJFF(C1404610meh c1404610meh, C1D85 c1d85) {
        Object next;
        int i;
        PublishModel publishModel;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof InterfaceC1434300nQa) {
                if (next2 != null) {
                    this.LLILLL = (InterfaceC1434300nQa) next2;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (next instanceof C1434970nRf) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (next instanceof C1434970nRf) {
                        obj = next;
                    }
                    C1434970nRf c1434970nRf = (C1434970nRf) obj;
                    if (c1434970nRf != null && (publishModel = c1434970nRf.LIZ) != null) {
                        i = publishModel.publishType;
                    } else {
                        i = 0;
                    }
                    this.LLILLJJLI = i;
                    this.LLILZ = new C1431070nLN(c1d85, new AwS566S0100000_22(this, 973));
                    LJIIL(LJIIIIZZ());
                    LJII(c1404610meh, LJIIIIZZ());
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
    }
}

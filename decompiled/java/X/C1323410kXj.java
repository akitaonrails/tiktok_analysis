package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS25S1100000_20;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigImagePolicy;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323410kXj extends C1315750kLN implements InterfaceC2173208fK, InterfaceC1507880pLG {
    public String LJJLIIIJJI;
    public final FlattenUIImage LJJLIIIJJIZ;
    public final EcomLoadRetreatConfigImagePolicy LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public volatile boolean LJJLIIIJLLLLLLLZ;
    public volatile boolean LJJLIIJ;
    public boolean LJJLIL;
    public RunnableC1323420kXk LJJLJ;
    public final ARunnableS120S0100000_20 LJJLJLI;
    public final BPEAHandler LJJLL;
    public final WeakReference<InterfaceC1541990qEH> LJJZ;
    public C1323390kXh LJJZZI;
    public C1323400kXi LJJZZIII;
    public String LJL;
    public volatile boolean LJLI;

    @Override // X.InterfaceC1507880pLG
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1507880pLG
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC2173208fK
    public final void LJI(String str) {
    }

    public final void LJIJJLI() {
        C1323400kXi c1323400kXi;
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        if (this.LJLI) {
            return;
        }
        this.LJLI = true;
        this.LJJLL.removeCallbacks(this.LJJLJLI);
        this.LJJLIIIJLLLLLLLZ = false;
        this.LJJLIIJ = false;
        this.LJJLJ = null;
        this.LJJLIIIJLJLI = false;
        C1323390kXh c1323390kXh = this.LJJZZI;
        if (c1323390kXh != null) {
            WeakReference<InterfaceC1541990qEH> weakReference = this.LJJZ;
            if (weakReference != null && (interfaceC1541990qEH = weakReference.get()) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
                hybridContext.LJJIIJ(AbstractC1539020q9U.class, c1323390kXh);
            }
            this.LJJZZI = null;
        }
        String str = this.LJL;
        if (str == null || (c1323400kXi = this.LJJZZIII) == null) {
            return;
        }
        C1507830pLB.LJII(c1323400kXi, str);
        CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet = C1507830pLB.LJIIJ.get(str);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.remove(c1323400kXi);
        }
        this.LJL = null;
        this.LJJZZIII = null;
    }

    @Override // X.C1315750kLN
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        this.LJJLIL = true;
    }

    @Override // X.C1315750kLN
    public final void LJIILL() {
        super.LJIILL();
        this.LJJLIL = false;
    }

    @Override // X.InterfaceC2173208fK
    public final void LIZ(List<String> list) {
        if (!C13LP.LJJJJ(this.LJJLIIIJJI, list)) {
            return;
        }
        this.LJJLIIIJLLLLLLLZ = true;
        C786410Ut5.LJJZZIII(this.LJJLL, new ARunnableS120S0100000_20(this, 328));
    }

    @Override // X.InterfaceC1507880pLG
    public final void LIZIZ(String str) {
        if (!Intrinsics.LJFF(str, this.LJJLIIIJJI)) {
            return;
        }
        LJIJJLI();
    }

    @Override // X.InterfaceC1507880pLG
    public final void LJFF(String str) {
        RunnableC1323420kXk runnableC1323420kXk;
        if (!Intrinsics.LJFF(str, this.LJJLIIIJJI) || this.LJLI) {
            return;
        }
        this.LJJLL.removeCallbacks(this.LJJLJLI);
        if (this.LJJLIIIJLLLLLLLZ) {
            this.LJJLIIIJLLLLLLLZ = false;
            Integer num = this.LJJLIIIJL.lynxImageUpdate;
            if (num != null && num.intValue() == 1) {
                if (!this.LJJLIIJ && (runnableC1323420kXk = this.LJJLJ) != null) {
                    runnableC1323420kXk.run();
                }
                this.LJJLJ = null;
            }
        }
        if (this.LJJLIIJ) {
            this.LJJLIIJ = false;
            if (!this.LJJLIL) {
                this.LJJLIIIJJIZ.onAttach();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1323410kXj(s sVar, FlattenUIImage flattenUIImage) {
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        sVar.getClass();
        super(sVar, c1320810kTXLIZJ, flattenUIImage, false);
        this.LJJLIIIJL = C1507840pLC.LIZIZ().imagePolicy;
        this.LJJLJLI = new ARunnableS120S0100000_20(this, 327);
        this.LJJLL = C1507830pLB.LIZJ;
        this.LJJLIIIJJIZ = flattenUIImage;
        LynxView lynxViewLJIILJJIL = sVar.LJIILJJIL();
        WeakReference<InterfaceC1541990qEH> weakReference = null;
        if ((lynxViewLJIILJJIL instanceof InterfaceC1541990qEH) && lynxViewLJIILJJIL != null) {
            weakReference = new WeakReference<>(lynxViewLJIILJJIL);
        }
        this.LJJZ = weakReference;
    }

    @Override // X.InterfaceC2173208fK
    public final void LJ(String str, String str2) {
        if (!Intrinsics.LJFF(str, this.LJJLIIIJJI)) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LJJLL, new ARunnableS25S1100000_20(this, str2, 27));
    }

    @Override // X.C1315750kLN
    public final void LJIILIIL(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.LJJLIIIJLJLI && this.LJJLIIIJLLLLLLLZ) {
            C1507860pLE c1507860pLE = C1507830pLB.LJFF;
            if (c1507860pLE != null) {
                c1507860pLE.LJIIIZ++;
            }
            this.LJJLJ = new RunnableC1323420kXk(this, i, i2, i3, i4, i5, i6);
            return;
        }
        this.LJJLJ = null;
        super.LJIILIIL(i, i2, i3, i4, i5, i6);
    }
}

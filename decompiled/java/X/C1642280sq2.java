package X;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642280sq2 extends AbstractC1643610ssB<FilterPanelViewModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C19A3 LLIZ;
    public final C1DRG LLIZLLLIL;
    public final int LLJ;
    public final String LLJI;
    public final InterfaceC1640280smo LLJIJIL;
    public final InterfaceC1642150spp LLJILJIL;
    public final boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final AwS569S0100000_25 LLJJI;
    public final C1642290sq3 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1642280sq2.class, "context", "getContext()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C1642280sq2() {
        throw null;
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        C1641920spS c1641920spS = (C1641920spS) this.LLJJ.getValue();
        if (c1641920spS.LLJJIJIL) {
            C1642210spv c1642210spv = c1641920spS.LLJJIJIIJIL;
            if (c1642210spv == null) {
                c1642210spv = null;
            }
            c1642210spv.hide();
        }
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        if (!this.LLJILLL) {
            this.LLIZ.add(this.LLJ, (Scene) this.LLJJ.getValue(), "RecordFilterPanelScene");
            this.LLJILLL = true;
        }
        C1641920spS c1641920spS = (C1641920spS) this.LLJJ.getValue();
        c1641920spS.getClass();
        new AwS569S0100000_25(c1641920spS, 987).invoke();
        if (!c1641920spS.LLJJJJLIIL || C20510015Ni.LIZ.LJIIIIZZ()) {
            return;
        }
        c1641920spS.LLJJJJLIIL = false;
        C1627000sRO.LIZIZ(c1641920spS.requireApplicationContext(), true);
    }

    public final C1643870ssb w2() {
        LiveData<List<C1643870ssb>> liveDataEI1;
        List<C1643870ssb> value;
        List<C1643870ssb> value2;
        C1643870ssb next = null;
        if (this.LLJILJILJ) {
            LiveData<List<C1643870ssb>> liveDataEI12 = ((InterfaceC1644770su3) this.LLIZLLLIL.LJII(InterfaceC1644770su3.class, null)).EI1();
            if (liveDataEI12 != null && (value2 = liveDataEI12.getValue()) != null) {
                Iterator<C1643870ssb> it2 = value2.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, this.LLJI)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } else {
            InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) ((C0ETY) this.LLIZLLLIL.LJII(C0ETY.class, null)).MY1(InterfaceC1644770su3.class);
            if (interfaceC1644770su3 != null && (liveDataEI1 = interfaceC1644770su3.EI1()) != null && (value = liveDataEI1.getValue()) != null) {
                for (C1643870ssb c1643870ssb : value) {
                    if (Intrinsics.LJFF(c1643870ssb.LIZ, this.LLJI)) {
                        return c1643870ssb;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return next;
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FilterPanelViewModel> W1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZ;
    }

    public C1642280sq2(C19A3 c19a3, C1DRG c1drg, int i, C1640270smn c1640270smn, InterfaceC1642150spp interfaceC1642150spp, boolean z, AFwS266S0000000_25 aFwS266S0000000_25) {
        this.LLIZ = c19a3;
        this.LLIZLLLIL = c1drg;
        this.LLJ = i;
        this.LLJI = "build_in";
        this.LLJIJIL = c1640270smn;
        this.LLJILJIL = interfaceC1642150spp;
        this.LLJILJILJ = z;
        C1664770tQJ.LIZ(c1drg, Activity.class, null);
        this.LLJJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 980));
        this.LLJJI = new AwS569S0100000_25(this, 982);
        C1642290sq3 c1642290sq3 = new C1642290sq3(0);
        this.LLJJIII = c1642290sq3;
        if (aFwS266S0000000_25 != null) {
            aFwS266S0000000_25.invoke(c1642290sq3);
        }
    }
}

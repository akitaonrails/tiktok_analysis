package X;

import Y.AObjectS306S0200000_25;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import iyl.i3;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1659090tH9 implements InterfaceC1651590t53<i3, InterfaceC1651550t4z> {
    public final LifecycleOwner LL;
    public final List<View> LLILLJJLI;
    public final AtomicReference<InterfaceC1651550t4z> LLILLL = new AtomicReference<>();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 844));
    public boolean LLILZIL;

    public final C1659140tHE LJII() {
        return (C1659140tHE) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1657880tFC
    public final C1654400t9a LIZLLL() {
        return LJII().LIZLLL();
    }

    @Override // X.InterfaceC1657880tFC
    public final void LJ() {
        LJII().LJ();
    }

    @Override // X.InterfaceC1657880tFC
    public final View getItemView() {
        return LJII().LLILZ;
    }

    @Override // X.InterfaceC1657880tFC
    public final void LIZ(i3 i3Var) {
        C1651520t4w c1651520t4w = i3Var.LLJJJJLIIL;
        if (c1651520t4w == null) {
            return;
        }
        i3 i3Var2 = (i3) c1651520t4w.LIZJ;
        this.LLILLL.set((InterfaceC1651550t4z) c1651520t4w.LJ);
        LJII().LIZJ(i3Var2);
    }

    @Override // X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        C1651520t4w c1651520t4w = i3Var.LLJJJJLIIL;
        if (c1651520t4w == null) {
            return;
        }
        InterfaceC1659130tHD<Object> interfaceC1659130tHD = c1651520t4w.LJ;
        i3 i3Var2 = (i3) c1651520t4w.LIZJ;
        interfaceC1659130tHD.LIZIZ(i3Var2);
        this.LLILLL.set((InterfaceC1651550t4z) interfaceC1659130tHD);
        LJII().LIZJ(i3Var2);
    }

    public C1659140tHE LJFF(C1659120tHC c1659120tHC) {
        return new C1659140tHE(this.LL, this.LLILLJJLI, c1659120tHC);
    }

    @Override // X.InterfaceC1651590t53
    public final void LJI(C1657780tF2 c1657780tF2) {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        C1659140tHE c1659140tHELJII = LJII();
        c1659140tHELJII.LLJJJJLIIL = true;
        c1657780tF2.LIZ.LIZ(c1659140tHELJII, new AObjectS306S0200000_25((Object) c1659140tHELJII, (Object) c1657780tF2, (InterfaceC1648570t0B) 25));
        c1657780tF2.LIZIZ.LIZ(c1659140tHELJII, new AObjectS306S0200000_25((Object) c1659140tHELJII, (Object) c1657780tF2, (InterfaceC1648570t0B) 26));
    }

    public C1659090tH9(LifecycleOwner lifecycleOwner, List<View> list) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = list;
    }

    @Override // X.InterfaceC1657880tFC
    public final View LIZIZ(int i, ViewGroup viewGroup) {
        return LJII().LIZIZ(i, viewGroup);
    }
}

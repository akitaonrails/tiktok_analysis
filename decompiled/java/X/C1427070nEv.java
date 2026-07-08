package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS47S0301000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0nEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427070nEv implements C113D {
    public final /* synthetic */ C1427030nEr LIZ;

    @Override // X.C113D
    public final void LIZ() {
    }

    @Override // X.C113D
    public final void LIZIZ() {
    }

    @Override // X.C113D
    public final boolean LJ(int i) {
        return true;
    }

    @Override // X.C113D
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C113D
    public final boolean LJII(int i, int i2) {
        return true;
    }

    @Override // X.C113D
    public final void LJIIIIZZ() {
    }

    @Override // X.C113D
    public final void LJIIIZ() {
    }

    @Override // X.C113D
    public final void LJIIJ(EffectModel effectModel, String str, boolean z, EffectSearchModel effectSearchModel) {
    }

    @Override // X.C113D
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.C113D
    public final void LJIILIIL(String str, boolean z) {
    }

    @Override // X.C113D
    public final void LJIILJJIL(EffectModel effectModel) {
    }

    @Override // X.C113D
    public final boolean LJIILL(EffectModel effectModel) {
        return true;
    }

    @Override // X.C113D
    public final void LJIILLIIL() {
    }

    @Override // X.C113D
    public final void LJIIZILJ(EffectModel effectModel) {
    }

    @Override // X.C113D
    public final List<EffectModel> LJIJI(int i, String str) {
        return null;
    }

    @Override // X.C113D
    public final void LJIJJ(C364270EPx c364270EPx) {
    }

    @Override // X.C113D
    public final void LJIJJLI(String str, List<? extends EffectPointModel> list) {
    }

    @Override // X.C113D
    public final void LJIL(int i, EffectModel effectModel) {
    }

    @Override // X.C113D
    public final boolean LJJ(EffectModel effectModel) {
        return true;
    }

    public C1427070nEv(C1427030nEr c1427030nEr) {
        this.LIZ = c1427030nEr;
    }

    @Override // X.C113D
    public final boolean LIZJ(EffectModel effectModel) {
        C1427080nEw c1427080nEw;
        boolean z;
        C1427080nEw next;
        List<C1427080nEw> list = this.LIZ.LLLLILI().LIZ.LJ;
        String str = null;
        if (list != null) {
            Iterator<C1427080nEw> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ.key, effectModel.key)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c1427080nEw = next;
        } else {
            c1427080nEw = null;
        }
        C1427030nEr c1427030nEr = this.LIZ;
        IntRange intRange = c1427030nEr.LLJJLIIIJLLLLLLLZ;
        InterfaceC1631630sYr<EffectModel, Integer, String, Boolean, Boolean> interfaceC1631630sYr = c1427030nEr.LLLLIL().LIZJ;
        Integer numValueOf = Integer.valueOf(effectModel.index);
        if (c1427080nEw != null) {
            str = c1427080nEw.LIZLLL;
        }
        if (intRange != null && intRange.LJLJL(effectModel.index)) {
            z = true;
        } else {
            z = false;
        }
        return interfaceC1631630sYr.invoke(effectModel, numValueOf, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // X.C113D
    public final void LJIIJJI(String str) {
        C1427080nEw next;
        List<C1427080nEw> list = this.LIZ.LLLLILI().LIZ.LJ;
        if (list != null) {
            Iterator<C1427080nEw> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ.key, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1427080nEw c1427080nEw = next;
            if (c1427080nEw != null) {
                C1427030nEr c1427030nEr = this.LIZ;
                c1427030nEr.LLLLLJLJLL(new AwS388S0200000_22(c1427030nEr, c1427080nEw, 10));
            }
        }
    }

    @Override // X.C113D
    public final boolean LJIJ(String str) {
        return this.LIZ.LLLLIL().LJI.invoke(str).booleanValue();
    }

    @Override // X.C113D
    public final void LJI(int i, EffectModel effectModel) {
        List<C1427080nEw> list = this.LIZ.LLLLILI().LIZ.LJ;
        C1427080nEw c1427080nEw = null;
        if (list != null) {
            Iterator<C1427080nEw> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1427080nEw next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.key, effectModel.key)) {
                    c1427080nEw = next;
                    break;
                }
            }
            c1427080nEw = c1427080nEw;
        }
        C1427030nEr c1427030nEr = this.LIZ;
        c1427030nEr.LLLLLJLJLL(new AwS47S0301000_22(c1427030nEr, effectModel, i, c1427080nEw, 0));
    }

    @Override // X.C113D
    public final boolean LIZLLL(EffectModel effectModel, int i, boolean z) {
        C1427080nEw c1427080nEw;
        boolean z2;
        C1427080nEw next;
        List<C1427080nEw> list = this.LIZ.LLLLILI().LIZ.LJ;
        String str = null;
        if (list != null) {
            Iterator<C1427080nEw> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ.key, effectModel.key)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c1427080nEw = next;
        } else {
            c1427080nEw = null;
        }
        C1427030nEr c1427030nEr = this.LIZ;
        IntRange intRange = c1427030nEr.LLJJLIIIJLLLLLLLZ;
        InterfaceC1685420txc<EffectModel, Integer, Boolean, String, Boolean, Boolean> interfaceC1685420txc = c1427030nEr.LLLLIL().LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        Boolean boolValueOf = Boolean.valueOf(z);
        if (c1427080nEw != null) {
            str = c1427080nEw.LIZLLL;
        }
        if (intRange != null && intRange.LJLJL(effectModel.index)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return interfaceC1685420txc.invoke(effectModel, numValueOf, boolValueOf, str, Boolean.valueOf(z2)).booleanValue();
    }
}

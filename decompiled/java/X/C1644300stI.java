package X;

import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0stI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644300stI extends AbstractC1643610ssB<EditFilterViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ;
    public final InterfaceC1639870sm9 LLJI;
    public final InterfaceC1635390sev LLJIJIL;
    public final InterfaceC1644080ssw LLJILJIL;
    public final InterfaceC1640220smi LLJILJILJ;
    public final Function1<C1644610stn, Unit> LLJILLL;
    public C1644140st2 LLJJ;
    public final AwS569S0100000_25 LLJJI;

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        C19A3 c19a3 = this.LLIZLLLIL;
        C1644140st2 c1644140st2 = this.LLJJ;
        if (c1644140st2 == null) {
            c1644140st2 = null;
        }
        if (c19a3.isAdded(c1644140st2)) {
            return;
        }
        C19A3 c19a32 = this.LLIZLLLIL;
        int i = this.LLJ;
        C1644140st2 c1644140st22 = this.LLJJ;
        c19a32.add(i, c1644140st22 != null ? c1644140st22 : null, "EditFilterScene");
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        this.LLJJ = new C1644140st2(this.LLIZ, this.LLJI, this.LLJIJIL, this.LLJILLL);
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EditFilterViewModel> W1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public /* synthetic */ C1644300stI(C1DRG c1drg, C19A3 c19a3, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1644080ssw interfaceC1644080ssw, Function1 function1) {
        this(c1drg, c19a3, interfaceC1639870sm9, interfaceC1635410sex, interfaceC1644080ssw, null, function1);
    }

    public C1644300stI(C1DRG c1drg, C19A3 c19a3, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1644080ssw interfaceC1644080ssw, InterfaceC1640220smi interfaceC1640220smi, Function1 function1) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJ = R.id.mhi;
        this.LLJI = interfaceC1639870sm9;
        this.LLJIJIL = interfaceC1635390sev;
        this.LLJILJIL = interfaceC1644080ssw;
        this.LLJILJILJ = interfaceC1640220smi;
        this.LLJILLL = function1;
        this.LLJJI = new AwS569S0100000_25(this, 500);
    }
}

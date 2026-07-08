package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20736716Cn extends AbstractC1643610ssB<EditFilterIndicatorViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final FilterBean LLJI;
    public final InterfaceC1639870sm9 LLJIJIL;
    public final int LLJ = R.id.gpr;
    public final boolean LLJILJIL = true;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1541));
    public final AFwS221S0000000_31 LLJILLL = AFwS221S0000000_31.get$arr$(521);

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        if (this.LLIZLLLIL.isAdded((Scene) this.LLJILJILJ.getValue())) {
            this.LLIZLLLIL.hide((Scene) this.LLJILJILJ.getValue());
        }
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        if (this.LLIZLLLIL.isAdded((Scene) this.LLJILJILJ.getValue())) {
            return;
        }
        this.LLIZLLLIL.add(this.LLJ, (Scene) this.LLJILJILJ.getValue(), "EditFilterIndicatorScene");
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EditFilterIndicatorViewModel> W1() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C20736716Cn(C1DRG c1drg, C19A3 c19a3, FilterBean filterBean, InterfaceC1639870sm9 interfaceC1639870sm9) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJI = filterBean;
        this.LLJIJIL = interfaceC1639870sm9;
    }
}

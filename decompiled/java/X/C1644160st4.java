package X;

import com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story.StoryEditFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0st4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644160st4 extends AbstractC1643610ssB<StoryEditFilterViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final InterfaceC1639870sm9 LLJI;
    public final InterfaceC1635390sev LLJIJIL;
    public final InterfaceC1644080ssw LLJILJIL;
    public final Function1<C1644330stL, Unit> LLJILJILJ;
    public C1644130st1 LLJILLL;
    public final int LLJ = R.id.mhi;
    public final AwS569S0100000_25 LLJJ = new AwS569S0100000_25(this, 358);

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        C19A3 c19a3 = this.LLIZLLLIL;
        C1644130st1 c1644130st1 = this.LLJILLL;
        if (c1644130st1 == null) {
            c1644130st1 = null;
        }
        if (c19a3.isAdded(c1644130st1)) {
            return;
        }
        C19A3 c19a32 = this.LLIZLLLIL;
        int i = this.LLJ;
        C1644130st1 c1644130st12 = this.LLJILLL;
        c19a32.add(i, c1644130st12 != null ? c1644130st12 : null, "StoryEditFilterScene");
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        this.LLJI.LJIJI(-1, false);
        this.LLJILLL = new C1644130st1(this.LLIZ, this.LLJI, this.LLJIJIL, this.LLJILJILJ);
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<StoryEditFilterViewModel> W1() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1644160st4(C1DRG c1drg, C19A3 c19a3, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1644080ssw interfaceC1644080ssw, Function1 function1) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJI = interfaceC1639870sm9;
        this.LLJIJIL = interfaceC1635390sev;
        this.LLJILJIL = interfaceC1644080ssw;
        this.LLJILJILJ = function1;
    }
}

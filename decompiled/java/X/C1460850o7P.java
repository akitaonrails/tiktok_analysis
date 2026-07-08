package X;

import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460850o7P extends AbstractC1643610ssB<EditToolbarViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ = R.id.gsr;
    public final AFwS210S0000000_22 LLJI = AFwS210S0000000_22.get$arr$(265);

    @Override // X.AbstractC1643600ssA
    public final void o2() {
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        this.LLIZLLLIL.add(this.LLJ, new C1166930gTL(this.LLIZ), "EditSideToolbarComponent");
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EditToolbarViewModel> W1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1460850o7P(C1DRG c1drg, C1455260nyO c1455260nyO) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c1455260nyO;
    }
}

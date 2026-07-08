package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19770912Xb extends AbstractC1643610ssB<FTCEditVolumeViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ = R.id.mhi;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 908));
    public final AFwS218S0000000_29 LLJIJIL = AFwS218S0000000_29.get$arr$(361);

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        this.LLIZLLLIL.show((Scene) this.LLJI.getValue());
        ((C12XS) this.LLJI.getValue()).LLLIILIL(true);
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditVolumeViewModel> W1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C19770912Xb(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
    }
}

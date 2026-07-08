package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462370o9r extends AbstractC1643610ssB<FTCEditTextStickerViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final C124C LLJI;
    public final int LLJIJIL;
    public final int LLJ = R.id.xqt;
    public final AFwS210S0000000_22 LLJILJIL = AFwS210S0000000_22.get$arr$(340);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 856));

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        this.LLIZLLLIL.add(this.LLJ, (Scene) this.LLJILJILJ.getValue(), "FTCEditTextStickerScene");
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditTextStickerViewModel> W1() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1462370o9r(C1DRG c1drg, C1460790o7J c1460790o7J, C1462360o9q c1462360o9q, int i) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c1460790o7J;
        this.LLJI = c1462360o9q;
        this.LLJIJIL = i;
    }
}

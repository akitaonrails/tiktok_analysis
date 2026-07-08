package X;

import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.121l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196887121l extends AbstractC1643610ssB<FTCEditInfoStickerViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final FrameLayout LLJI;
    public final int LLJ = R.id.kmr;
    public final AwS573S0100000_29 LLJIJIL = new AwS573S0100000_29(this, 820);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 819));

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        if (this.LLIZLLLIL.isAdded((Scene) this.LLJILJIL.getValue())) {
            return;
        }
        this.LLIZLLLIL.add(this.LLJ, (Scene) this.LLJILJIL.getValue(), "FTCEditInfoStickerScene");
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditInfoStickerViewModel> W1() {
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

    public C196887121l(C1DRG c1drg, C1460790o7J c1460790o7J, FrameLayout frameLayout) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c1460790o7J;
        this.LLJI = frameLayout;
    }
}

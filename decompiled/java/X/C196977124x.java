package X;

import com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.124x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196977124x extends AbstractC1643610ssB<EditCaptionFontViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final InterfaceC387610FHr LLJI;
    public final int LLJ = R.id.ncw;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1106));
    public final AFwS218S0000000_29 LLJILJIL = AFwS218S0000000_29.get$arr$(455);

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        if (this.LLIZLLLIL.isAdded(w2())) {
            this.LLIZLLLIL.hide(w2());
        }
        w2().LLJL = false;
        C0FI2.LJIJJ().LJIIIIZZ = null;
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        if (this.LLIZLLLIL.isAdded(w2())) {
            this.LLIZLLLIL.show(w2());
        } else {
            this.LLIZLLLIL.add(this.LLJ, w2(), "EditCaptionFontScene");
        }
    }

    public final ViewOnClickListenerC196973124t w2() {
        return (ViewOnClickListenerC196973124t) this.LLJIJIL.getValue();
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EditCaptionFontViewModel> W1() {
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

    public C196977124x(C1DRG c1drg, EditCaptionScene editCaptionScene, C1462790oAX c1462790oAX) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = editCaptionScene;
        this.LLJI = c1462790oAX;
    }
}

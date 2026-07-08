package X;

import Y.AObserverS227S0100000_25;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629960sWA implements InterfaceC1622080sJS, InterfaceC1159800gHq, InterfaceC1635880sfi {
    public final C19EG LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final InterfaceC1625220sOW LLILLL;
    public final InterfaceC1635560sfC LLILZ;
    public final C1641120soA LLILZIL;
    public final InterfaceC1629870sW1 LLILZLL;
    public final LifecycleOwner LLIZ;
    public final CreativeModel LLIZLLLIL;
    public C1629980sWC LLJ;
    public Effect LLJI;
    public C1627370sRz LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        C1629980sWC c1629980sWC = this.LLJ;
        if (c1629980sWC != null) {
            c1629980sWC.LJ(false);
            this.LLJILJIL = false;
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        C1629980sWC c1629980sWC;
        if (!Intrinsics.LJFF(this.LLILLJJLI.LLILIL(), this.LLJI) || (c1629980sWC = this.LLJ) == null) {
            return;
        }
        c1629980sWC.LIZIZ();
        this.LLJILJIL = true;
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        if (!this.LLJILJIL && C1624570sNT.LJIJJLI(this.LLJI)) {
            LJIIJ();
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        C1629980sWC c1629980sWC = new C1629980sWC(this.LL, view, this.LLILLJJLI, this.LLILZ, this.LLILZLL, this.LLILZIL, this.LLIZ, this.LLIZLLLIL);
        this.LLJ = c1629980sWC;
        c1629980sWC.LIZIZ.LLILLJJLI = this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    @Override // X.InterfaceC1622080sJS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1623370sLX LJIILL(X.InterfaceC1622070sJR r10, X.AbstractC1627380sS0 r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1629960sWA.LJIILL(X.0sJR, X.0sS0):X.0sLX");
    }

    public C1629960sWA(C19GS c19gs, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625220sOW interfaceC1625220sOW, C1635530sf9 c1635530sf9, C1641120soA c1641120soA, MultiStickerListViewModel multiStickerListViewModel, LifecycleOwner lifecycleOwner, CreativeModel creativeModel) {
        this.LL = c19gs;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = interfaceC1625220sOW;
        this.LLILZ = c1635530sf9;
        this.LLILZIL = c1641120soA;
        this.LLILZLL = multiStickerListViewModel;
        this.LLIZ = lifecycleOwner;
        this.LLIZLLLIL = creativeModel;
        multiStickerListViewModel.LLIZLLLIL.observe(this.LLIZ, new AObserverS227S0100000_25(this, 0));
    }
}

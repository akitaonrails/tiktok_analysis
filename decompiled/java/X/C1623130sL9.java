package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1623130sL9 extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1635880sfi {
    public final C19GS LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC1628180sTI LLILZ;
    public final InterfaceC1624480sNK LLILZIL;
    public final InterfaceC1625220sOW LLILZLL;
    public final InterfaceC1630220sWa LLIZ;
    public final Function2<Effect, Boolean, Unit> LLIZLLLIL;
    public final Function1<Effect, Boolean> LLJ;
    public final Function0<C1635820sfc> LLJI;
    public InterfaceC1623100sL6 LLJIJIL;
    public boolean LLJILJIL;
    public Effect LLJILJILJ;

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.AbstractC1622390sJx
    public boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLJILJILJ = null;
        InterfaceC1623100sL6 interfaceC1623100sL6 = this.LLJIJIL;
        if (interfaceC1623100sL6 != null) {
            LJJIIJ(interfaceC1623100sL6, false);
            interfaceC1623100sL6.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
        InterfaceC1623100sL6 interfaceC1623100sL6 = this.LLJIJIL;
        if (interfaceC1623100sL6 != null) {
            LJJIIJ(interfaceC1623100sL6, false);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        InterfaceC1623100sL6 interfaceC1623100sL6 = this.LLJIJIL;
        if (interfaceC1623100sL6 != null) {
            LJJIIJ(interfaceC1623100sL6, true);
        }
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        if (!LJJIIJZLJL(this.LLJILJILJ, new AwS569S0100000_25(this, 816)) && enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE) {
            if (this.LLJILJILJ != null && !this.LLJILJIL && this.LLILZIL.LJJLJ()) {
                LJIIJ();
            }
            InterfaceC1623100sL6 interfaceC1623100sL6 = this.LLJIJIL;
            if (interfaceC1623100sL6 != null) {
                interfaceC1623100sL6.LIZIZ(this.LLJILJILJ);
            }
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        this.LLJIJIL = LJJIIZ(view);
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        InterfaceC1623100sL6 interfaceC1623100sL6;
        if (ChangeImagePickerUIExperiment.isEnabled() && (interfaceC1623100sL6 = this.LLJIJIL) != null) {
            LJJIIJ(interfaceC1623100sL6, false);
        }
    }

    public InterfaceC1623100sL6 LJJIIZ(View view) {
        return new FavoriteSticker(this.LLILLJJLI, this.LLILLL, this.LLILZIL, this.LLILZLL, this.LLILZ, (FrameLayout) view.findViewById(R.id.mfm), (C1695930uEZ) view.findViewById(R.id.khe), this.LLIZ, this.LLJI, this.LLIZLLLIL);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        InterfaceC1623100sL6 interfaceC1623100sL6;
        if (C1625940sPg.LJIIJ(this.LLILZIL, c1627370sRz.LIZ)) {
            return;
        }
        Effect effect = c1627370sRz.LIZ;
        this.LLJILJILJ = effect;
        if (LJJIIJZLJL(effect, new AwS569S0100000_25(this, 817))) {
            return;
        }
        if (c1627370sRz.LIZJ == EnumC1448980noG.UI_CLICK) {
            this.LLILZIL.LJJJJLI(true);
        }
        if (this.LLILZIL.LJJLJ() && (interfaceC1623100sL6 = this.LLJIJIL) != null) {
            LJJIIJ(interfaceC1623100sL6, true);
            interfaceC1623100sL6.LIZIZ(c1627370sRz.LIZ);
        }
    }

    public final void LJJIIJ(InterfaceC1623100sL6 interfaceC1623100sL6, boolean z) {
        this.LLJILJIL = z;
        interfaceC1623100sL6.LIZ(z);
    }

    public final boolean LJJIIJZLJL(Effect effect, Function0<Unit> function0) {
        Function1<Effect, Boolean> function1 = this.LLJ;
        if (function1 == null || effect == null || !function1.invoke(effect).booleanValue()) {
            C1446130njf.LIZ.getClass();
            if (!C1446130njf.LIZIZ(effect, "forbid_favorite", false)) {
                return false;
            }
        }
        function0.invoke();
        return true;
    }

    public C1623130sL9(C19GS c19gs, LifecycleOwner lifecycleOwner, InterfaceC1628180sTI interfaceC1628180sTI, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1630220sWa interfaceC1630220sWa, Function2 function2, AwS604S0100000_25 awS604S0100000_25, Function0 function0, int i) {
        function2 = (i & 64) != 0 ? null : function2;
        awS604S0100000_25 = (i & 128) != 0 ? null : awS604S0100000_25;
        this.LLILLJJLI = c19gs;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = interfaceC1628180sTI;
        this.LLILZIL = interfaceC1624480sNK;
        this.LLILZLL = interfaceC1625220sOW;
        this.LLIZ = interfaceC1630220sWa;
        this.LLIZLLLIL = function2;
        this.LLJ = awS604S0100000_25;
        this.LLJI = function0;
    }
}

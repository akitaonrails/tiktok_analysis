package X;

import Y.ARunnableS40S0101000_29;
import Y.AfS198S0100000_29;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19673011y4 extends C122P {
    public final C19EG LLLILZJ;
    public final C124T LLLILZLLLI;
    public final C1DRG LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public boolean LLLJL;

    @Override // X.C122P
    public final void LJIILJJIL() {
    }

    @Override // X.C122P
    public final boolean LJJIJIIJI() {
        return false;
    }

    @Override // X.C122P
    public final int LJIIJ() {
        return this.LLLILZLLLI.LJIIJJI(20);
    }

    @Override // X.C122P
    public final void LJIJ() {
        ((C11NJ) this.LLLJIL.getValue()).LIZ(((C11NZ) this.LLLJ.getValue()).LJIL(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLJLI(new AfS198S0100000_29(this, 0)));
    }

    @Override // X.C122P
    public final void LJIJI() {
        super.LJIJI();
        ((C11NJ) this.LLLJIL.getValue()).dispose();
    }

    @Override // X.C122P
    public final void LJIJJ() {
        super.LJIJJ();
        this.LLLJL = this.LLLFZ;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.11y5] */
    @Override // X.C122P
    public final C196925122x LJIIIZ(TextStickerData textStickerData) {
        boolean z;
        if (textStickerData != null && textStickerData.isCaption()) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass1233 anonymousClass1233 = new AnonymousClass1233(this.LLLILZJ, LJIIJJI(), textStickerData, !z, new C124G() { // from class: X.11y5
            @Override // X.C124G
            public final boolean LIZ() {
                return this.LIZ.LJIIL().LLLLZLLIL();
            }
        }, this.LLLIZZ);
        anonymousClass1233.setSafeAreaHeight(this.LLLILZLLLI.getSafeAreaHeight());
        return anonymousClass1233;
    }

    @Override // X.C122P
    public final boolean LJIILLIIL(List<TextStickerTextWrap> list) {
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (textStickerTextWrap.getStrMap().isEmpty() || textStickerTextWrap.isReplaceString()) {
                break;
            }
            for (TextStickerString textStickerString : textStickerTextWrap.getStickerStringArray()) {
                if (textStickerString.getStr().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C122P, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(this, i, 1);
        if (this.LLLJL) {
            ((C11PQ) this.LLLJ.getValue()).onNext(aRunnableS40S0101000_29);
        } else {
            aRunnableS40S0101000_29.run();
        }
    }

    @Override // X.C122P, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(this, i, 0);
        if (this.LLLJL) {
            ((C11PQ) this.LLLJ.getValue()).onNext(aRunnableS40S0101000_29);
        } else {
            aRunnableS40S0101000_29.run();
        }
    }

    public C19673011y4(C19EG c19eg, InterfaceC1461390o8H interfaceC1461390o8H, InterfaceC1455860nzM interfaceC1455860nzM, FrameLayout frameLayout, C124T c124t, C121O c121o, LiveData<InterfaceC1452170ntP> liveData, InterfaceC196906122e interfaceC196906122e, int i, InterfaceC1453510nvZ interfaceC1453510nvZ, boolean z, C0FVR c0fvr, AnonymousClass1240 anonymousClass1240, TTSVoiceModel tTSVoiceModel, Function0<Unit> function0, C1DRG c1drg) {
        super(c19eg, interfaceC1461390o8H, interfaceC1455860nzM, frameLayout, c124t, c121o, liveData, interfaceC196906122e, i, interfaceC1453510nvZ, z, c0fvr, anonymousClass1240, tTSVoiceModel, function0, c1drg, 512);
        this.LLLILZJ = c19eg;
        this.LLLILZLLLI = c124t;
        this.LLLIZZ = c1drg;
        this.LLLJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(5));
        this.LLLJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(4));
    }
}

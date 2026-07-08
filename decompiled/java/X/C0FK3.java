package X;

import Y.AObjectS240S0100000_5;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveStateTransformationsKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FK3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FK3 extends C0FKG {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final C390420FSm LIZLLL;
    public final FrameLayout LJ;
    public final C385340F8y LJFF;
    public C0FL4 LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C385340F8y LJIIIZ;
    public C0FKB LJIIJ;
    public final List<C0FLJ> LJIIJJI;
    public C388650FLr LJIIL;
    public C388650FLr LJIILIIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0FKB, android.text.TextWatcher] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        C0FL4 c0fl4;
        ?? r1 = new C0FK4() { // from class: X.0FKB
            {
                super(this.LLILLJJLI);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!this.LLILLJJLI.LJIILJJIL().isVERenderSticker()) {
                    C786410Ut5.c2(this.LLILLJJLI.LJFF, 0);
                    C786410Ut5.T5(this.LLILLJJLI.LJFF, 1.0f);
                    this.LLILLJJLI.LJFF.requestFocus();
                }
            }
        };
        this.LJIIJ = r1;
        C0FL4 c0fl42 = this.LJI;
        if (c0fl42 != 0) {
            c0fl42.addTextChangedListener(r1);
        }
        if (((C0FK0) this.LJIIIIZZ.getValue()).LJJ.LIZJ && (c0fl4 = this.LJI) != null) {
            c0fl4.setEditTextListener(new C0F9G() { // from class: X.0FLE
                @Override // X.C0F9G
                public final InputConnection LIZIZ(InputConnection inputConnection) {
                    this.LIZ.LJIILIIL = new C388650FLr(inputConnection, this.LIZ.LJIILIIL(), this.LIZ.LJIIJJI);
                    return this.LIZ.LJIILIIL;
                }

                @Override // X.C0F9G
                public final void LIZ(int i, int i2) {
                    C388650FLr c388650FLr;
                    C0FLJ c0flj;
                    C388650FLr c388650FLr2 = this.LIZ.LJIILIIL;
                    if (c388650FLr2 != null && (c0flj = c388650FLr2.LIZLLL) != null && c0flj.LIZJ(i, i2)) {
                        return;
                    }
                    C0FLJ c0fljLIZ = C0FLI.LIZ(i, i2, this.LIZ.LJIIJJI);
                    if (c0fljLIZ != null && c0fljLIZ.LIZIZ == i2 && (c388650FLr = this.LIZ.LJIILIIL) != null) {
                        c388650FLr.LIZJ = false;
                    }
                    for (C0FLJ c0flj2 : (ArrayList) this.LIZ.LJIIJJI) {
                        if (c0flj2.LIZLLL(i, i2)) {
                            try {
                                if (i == i2) {
                                    this.LIZ.LJIILIIL().setSelection(c0flj2.LIZIZ(i));
                                    return;
                                }
                                if (i2 < c0flj2.LIZIZ) {
                                    this.LIZ.LJIILIIL().setSelection(i, c0flj2.LIZIZ);
                                }
                                if (i > c0flj2.LIZ) {
                                    this.LIZ.LJIILIIL().setSelection(c0flj2.LIZ, i2);
                                    return;
                                }
                                return;
                            } catch (IndexOutOfBoundsException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return;
                            }
                        }
                    }
                }
            });
        }
        C21410318qb c21410318qbLJIILIIL = LJIILIIL();
        if (c21410318qbLJIILIIL != null) {
            C0FMV.LIZJ(this.LIZJ.LJ.LIZ.getMentionList(), this.LIZJ.LJ.LIZ.getHashtagList(), c21410318qbLJIILIIL);
        }
    }

    public final C21410318qb LJIILIIL() {
        C0FL4 c0fl4 = this.LJI;
        return c0fl4 == null ? this.LJFF : c0fl4;
    }

    public final TextStickerModel LJIILJJIL() {
        return this.LIZJ.LJ.LIZ;
    }

    public final C0FKM LJIILL() {
        return (C0FKM) LJII(C13LE.LIZ(C0FKM.class));
    }

    public final void LJIJ() {
        C0FL4 c0fl4;
        TextStickerModel textStickerModel = this.LIZJ.LJ.LIZ;
        if (textStickerModel.getTextTemplateModel().enableTextTemplate) {
            return;
        }
        String strValueOf = (!LJIIZILJ() || (c0fl4 = this.LJI) == null) ? String.valueOf(C2204961BRm.G(this.LJFF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zIAUAG2oQVhOMrEv10LUP+HGg=", null))) : String.valueOf(C2204961BRm.A(c0fl4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zIAUAG2oQVhOMrEv10LUP+HGg=", null)));
        C0F8J.LIZ("inspiration", "syncViewDataToModel: ".concat(strValueOf));
        if (Intrinsics.LJFF(textStickerModel.getTextStr(), strValueOf)) {
            return;
        }
        this.LIZJ.LJ.LIZLLL(new AwS56S1000000_5(strValueOf, 18), true);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        LJIJ();
        this.LJFF.LLJJL.LIZJ = 0;
        C0FL4 c0fl4 = this.LJI;
        if (c0fl4 != null) {
            c0fl4.removeTextChangedListener(this.LJIIJ);
        }
        C0FL4 c0fl42 = this.LJI;
        if (c0fl42 != null) {
            c0fl42.LLIZ = null;
            c0fl42.LLIZLLLIL = null;
        }
        this.LJI = null;
    }

    public final boolean LJIIL() {
        TextStyleModel textStyle = LJIILJJIL().getTextStyle();
        return (textStyle != null && textStyle.isEffectStyle && ((C0FK0) this.LJIIIIZZ.getValue()).LJJIIZ) || LJIILJJIL().getForceEffectRender() || LJIIZILJ() || this.LIZJ.LJIL || LJIILJJIL().getTextTemplateModel().fromInspirationPanel;
    }

    public final void LJIILLIIL() {
        C0FGA c0fgaCo;
        if (LJIILJJIL().getTextTemplateModel().enableTextTemplate) {
            return;
        }
        C786410Ut5.c2(this.LJFF, 0);
        C0FF8 c0ff8LIZ = ((InterfaceC388760FMc) this.LIZJ.LIZ.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZ();
        if (c0ff8LIZ == null || (c0fgaCo = c0ff8LIZ.Co()) == null) {
            return;
        }
        c0fgaCo.LIZJ();
    }

    public final boolean LJIIZILJ() {
        return Intrinsics.LJFF(LJIILJJIL().getCompatModel().getShowPunctuation(), Boolean.FALSE) || !C1697810uHb.LJIIJJI(EnumC363350EMj.NONE, EnumC363350EMj.DEFAULT).contains(LJIILJJIL().getCompatModel().getCapitalizationState());
    }

    @Override // X.C0FKG
    public final C385340F8y LJIIIIZZ() {
        return this.LJIIIZ;
    }

    @Override // X.C0FKG
    public final List<C0FLJ> LJIIIZ() {
        return this.LJIIJJI;
    }

    @Override // X.C0FKG
    public final C385340F8y LJIIJ() {
        return this.LJFF;
    }

    @Override // X.C0FKG
    public final void LJIIJJI(C0FL4 c0fl4) {
        this.LJI = c0fl4;
    }

    public C0FK3(ViewGroup viewGroup, C388200FJy c388200FJy, C390420FSm c390420FSm, C1664680tQA<TextStickerModel> c1664680tQA, FrameLayout frameLayout) {
        TextWatcher textWatcherLJIIIZ;
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = c390420FSm;
        this.LJ = frameLayout;
        C385340F8y c385340F8y = new C385340F8y(viewGroup.getContext());
        c385340F8y.LJIIIZ(c388200FJy.LJ, c388200FJy.LIZLLL, c388200FJy.LJIIIZ, new C0FK7(c388200FJy.LJIIIIZZ), new C0FK5(c388200FJy.LJIIIIZZ));
        C0FF8 c0ff8 = c388200FJy.LJFF;
        if (c0ff8 != null && (textWatcherLJIIIZ = c0ff8.LJIIIZ()) != null) {
            c385340F8y.addTextChangedListener(textWatcherLJIIIZ);
        }
        this.LJFF = c385340F8y;
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1572));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1571));
        this.LJIIIIZZ = c01gwLIZIZ;
        C385340F8y c385340F8y2 = new C385340F8y(frameLayout.getContext());
        c385340F8y2.LJIIIZ(c1664680tQA, c388200FJy.LIZLLL, c388200FJy.LJIIIZ, new C0FK6(c388200FJy.LJIIIIZZ), new C0FK2(c388200FJy.LJIIIIZZ));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c385340F8y2.setForAnimation(true);
        frameLayout.addView(c385340F8y2, layoutParams);
        this.LJIIIZ = c385340F8y2;
        this.LJIIJJI = new ArrayList();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        c385340F8y.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)));
        viewGroup.addView(c385340F8y, 0, layoutParams2);
        c385340F8y.addTextChangedListener(new C0FK4() { // from class: X.0FK8
            {
                super(this.LLILLJJLI);
            }

            @Override // X.C0FK4, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (this.LLILLJJLI.LJIIL()) {
                    return;
                }
                super.afterTextChanged(editable);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!this.LLILLJJLI.LJIIL()) {
                    C786410Ut5.c2(this.LLILLJJLI.LJFF, 0);
                    C786410Ut5.T5(this.LLILLJJLI.LJFF, 1.0f);
                    this.LLILLJJLI.LJFF.requestFocus();
                }
            }

            @Override // X.C0FK4, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (this.LLILLJJLI.LJIIL()) {
                    return;
                }
                super.onTextChanged(charSequence, i, i2, i3);
            }
        });
        if (((C0FK0) c01gwLIZIZ.getValue()).LJJ.LIZJ) {
            c385340F8y.setTextListener(new C0F9G() { // from class: X.0FLF
                @Override // X.C0F9G
                public final InputConnection LIZIZ(InputConnection inputConnection) {
                    this.LIZ.LJIIL = new C388650FLr(inputConnection, this.LIZ.LJIILIIL(), this.LIZ.LJIIJJI);
                    return this.LIZ.LJIIL;
                }

                @Override // X.C0F9G
                public final void LIZ(int i, int i2) {
                    C388650FLr c388650FLr;
                    C0FLJ c0flj;
                    C388650FLr c388650FLr2 = this.LIZ.LJIIL;
                    if (c388650FLr2 != null && (c0flj = c388650FLr2.LIZLLL) != null && c0flj.LIZJ(i, i2)) {
                        return;
                    }
                    C0FLJ c0fljLIZ = C0FLI.LIZ(i, i2, this.LIZ.LJIIJJI);
                    if (c0fljLIZ != null && c0fljLIZ.LIZIZ == i2 && (c388650FLr = this.LIZ.LJIIL) != null) {
                        c388650FLr.LIZJ = false;
                    }
                    for (C0FLJ c0flj2 : (ArrayList) this.LIZ.LJIIJJI) {
                        if (c0flj2.LIZLLL(i, i2)) {
                            try {
                                if (i == i2) {
                                    this.LIZ.LJIILIIL().setSelection(c0flj2.LIZIZ(i));
                                    return;
                                }
                                if (i2 < c0flj2.LIZIZ) {
                                    this.LIZ.LJIILIIL().setSelection(i, c0flj2.LIZIZ);
                                }
                                if (i > c0flj2.LIZ) {
                                    this.LIZ.LJIILIIL().setSelection(c0flj2.LIZ, i2);
                                    return;
                                }
                                return;
                            } catch (IndexOutOfBoundsException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return;
                            }
                        }
                    }
                }
            });
        }
        c388200FJy.LJ.LIZ(new C2217371BqR() { // from class: X.0FIh
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FEw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextFontModel) obj).fileName;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1125));
        c388200FJy.LJ.LIZ(new C2217371BqR() { // from class: X.0FIi
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0F9H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextFontModel) obj).fontSize);
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1130));
        c388200FJy.LJ.LIZ(new C2217381BqS() { // from class: X.0F9V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getAlign());
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1134));
        c388200FJy.LJ.LIZ(new C2217381BqS() { // from class: X.0F9S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getColor());
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1113));
        c388200FJy.LJ.LIZ(new C2217371BqR() { // from class: X.0ERi
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextStyle();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setTextStyle((TextStyleModel) obj2);
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1117));
        c388200FJy.LJ.LIZ(new C2217381BqS() { // from class: X.0F9T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getMode());
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1120));
        LiveStateTransformationsKt.LIZ(c388200FJy.LJ.LIZ(new C2217371BqR() { // from class: X.0F9C
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getCompatModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setCompatModel((TextStickerCompatModel) obj2);
            }
        }), AFwS234S0000000_5.get$arr$(531)).LIZ(c388200FJy.LIZLLL, new AObjectS240S0100000_5(this, 162));
    }
}

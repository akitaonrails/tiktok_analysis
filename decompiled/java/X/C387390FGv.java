package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387390FGv extends i<InterfaceC385940FBg, C0FH4, C387410FGx, C0FH1> implements InterfaceC379610EuV, InterfaceC385940FBg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public InterfaceC386120FBy LLJJ;
    public TextStickerModel LLJJI;
    public final Function0<C0FH1> LLJJIII;
    public final C385670FAf<EnumC371580EhY> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C387390FGv.class, "textMobService", "getTextMobService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/ITextStickerMobService;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = 8;
    }

    private final C0FGR F4() {
        return (C0FGR) this.LLJILLL.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // X.InterfaceC385940FBg
    public void Dw1() {
        i3(AFwS234S0000000_5.get$arr$(75));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C387410FGx> o2() {
        return AFwS191S0000000_5.get$arr$(67);
    }

    @Override // X.InterfaceC385940FBg
    public void xx1() {
        show();
        i3(new AwS584S0100000_5(this, 132));
    }

    @Override // X.InterfaceC385940FBg
    public C385670FAf<EnumC371580EhY> LLL() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FH1> w2() {
        return this.LLJJIII;
    }

    public final void H4(int i) {
        InterfaceC386120FBy interfaceC386120FBy = this.LLJJ;
        if (interfaceC386120FBy != null) {
            interfaceC386120FBy.LIZ(i);
        }
        if (this.LLJJI.getTextTemplateModel().enableTextTemplate) {
            C0FAS.LIZIZ(this.LLJJI);
        }
        if (!this.LLJJI.getTextTemplateModel().enableTextTemplate) {
            this.LLJJI.getTextTemplateModel().editedColor = true;
        }
        C0FGR c0fgrF4 = F4();
        if (c0fgrF4 != null) {
            c0fgrF4.LJIIZILJ(this.LLJJI, C0FHF.CLICK.getValue());
        }
    }

    public final void K4(int i) {
        C0FGR c0fgrF4 = F4();
        if (c0fgrF4 != null) {
            c0fgrF4.LIZ(i);
        }
    }

    @Override // X.InterfaceC385940FBg
    public void LJJLIIIJJIZ(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModel2 = this.LLJJI;
        this.LLJJI = textStickerModel;
        if (textStickerModel.getBaseStickerModel().getId() != C364540EQy.LIZ(textStickerModel2)) {
            i3(new AwS584S0100000_5(textStickerModel, 133));
        }
    }

    @Override // X.InterfaceC385940FBg
    public void X62(InterfaceC386120FBy interfaceC386120FBy) {
        this.LLJJ = interfaceC386120FBy;
    }

    public C387390FGv(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0FGR.class, null);
        this.LLJJI = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        this.LLJJIII = new AwS549S0100000_5(this, 145);
        this.LLJJIJI = Z1(new C2217381BqS() { // from class: X.0FGw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387410FGx) obj).LIZ;
            }
        });
    }
}

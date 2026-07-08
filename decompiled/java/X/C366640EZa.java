package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0EZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366640EZa extends C09AY implements Function1<TextStickerTextWrap, Unit> {
    public final /* synthetic */ TextStickerData LL;
    public final /* synthetic */ C0EZZ LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366640EZa(TextStickerData textStickerData, C0EZZ c0ezz, C118300cf c118300cf, boolean z, boolean z2, Integer num) {
        super(1);
        this.LL = textStickerData;
        this.LLILLJJLI = c0ezz;
        this.LLILLL = c118300cf;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextStickerTextWrap textStickerTextWrap) {
        C0FVT c0fvtKR;
        if (!this.LL.getAutoLineBreak()) {
            String[] strArr = new String[1];
            String textStr = this.LL.getTextStr();
            if (textStr == null) {
                textStr = "";
            }
            strArr[0] = textStr;
            this.LL.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(strArr)));
        }
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = this.LLILLJJLI.G2().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null && (c0fvtKR = interfaceC1461660o8iLIZJ.kR()) != null) {
            c0fvtKR.Pj(this.LL, true, new AwS93S0110000_5(this.LLILZIL, this.LLILZLL, 13));
        }
        C118300cf c118300cf = this.LLILLL;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0 && this.LLILZ) {
            this.LLILLJJLI.H2().Tx0(new AwS584S0100000_5(this.LLILLJJLI, 793));
        }
        return Unit.LIZ;
    }
}

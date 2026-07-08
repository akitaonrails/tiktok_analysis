package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391350FWb extends C09AY implements Function1<TextStickerTextWrap, Unit> {
    public final /* synthetic */ TextStickerModel LL;
    public final /* synthetic */ AbstractC19531111bB<API_COMPONENT> LLILLJJLI;
    public final /* synthetic */ TTSModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391350FWb(TextStickerModel textStickerModel, AbstractC19531111bB<API_COMPONENT> abstractC19531111bB, TTSModel tTSModel, String str, Function0<Unit> function0) {
        super(1);
        this.LL = textStickerModel;
        this.LLILLJJLI = abstractC19531111bB;
        this.LLILLL = tTSModel;
        this.LLILZ = str;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextStickerTextWrap textStickerTextWrap) {
        C0FWP c0fwpRi;
        boolean z;
        String str;
        this.LL.setTextStrWithLineBreak(C13LQ.LJJJ(textStickerTextWrap.getStickerStringArray(), "\n", null, null, AFwS234S0000000_5.get$arr$(22), 30));
        InterfaceC391240FVq interfaceC391240FVqQj = this.LLILLJJLI.qj();
        if (interfaceC391240FVqQj != null) {
            interfaceC391240FVqQj.k3(this.LL, EnumC356070Dxd.COMMIT);
        }
        TTSModel tTSModel = this.LLILLL;
        if (tTSModel != null && Intrinsics.LJFF(tTSModel.audioText, this.LLILZ)) {
            AbstractC19531111bB.Z4(this.LLILLJJLI, this.LL, this.LLILLL, false, null, 12, null);
        } else {
            C0FVT c0fvtD6 = this.LLILLJJLI.d6();
            if (c0fvtD6 != null && (c0fwpRi = c0fvtD6.Ri()) != null) {
                TextStickerModel textStickerModel = this.LL;
                TTSModel tTSModel2 = this.LLILLL;
                if (c0fwpRi.LJFF(textStickerModel)) {
                    if (tTSModel2 != null && (str = tTSModel2.speakerID) != null && str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0fwpRi.LJIIJ(textStickerModel, z);
                }
            }
        }
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F7F, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7F extends C09AY implements Function1<TextStickerModel, TextStickerModel> {
    public final /* synthetic */ C388170FJv LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ TTSModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F7F(C388170FJv c388170FJv, float f, float f2, TTSModel tTSModel) {
        super(1);
        this.LL = c388170FJv;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = tTSModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextStickerModel invoke(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModel2 = textStickerModel;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        return TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(c1664680tQA.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.LLILLJJLI, this.LLILLL, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -100663297, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, this.LLILZ, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -32770, 65535, null);
    }
}

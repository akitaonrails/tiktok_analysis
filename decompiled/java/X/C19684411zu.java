package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19684411zu extends C2217421BqW implements Function1<TextStickerModel, Unit> {
    public C19684411zu(C19684111zr c19684111zr) {
        super(1, c19684111zr, C19684111zr.class, "onTextStickerModelChange", "onTextStickerModelChange(Lcom/ss/android/ugc/aweme/tools/sticker/core/text/model/TextStickerModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextStickerModel textStickerModel) {
        ((C19684111zr) this.receiver).K4(textStickerModel);
        return Unit.LIZ;
    }
}

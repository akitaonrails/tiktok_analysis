package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591511kv extends C09AY implements Function1<BaseStickerModel, BaseStickerModel> {
    public final /* synthetic */ BaseStickerModel LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19591511kv(BaseStickerModel baseStickerModel, float f, float f2, float f3, float f4) {
        super(1);
        this.LL = baseStickerModel;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseStickerModel invoke(BaseStickerModel baseStickerModel) {
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, this.LL.getTranslateX() + (this.LLILLJJLI * this.LLILLL), this.LL.getTranslateY() + (this.LLILZ * this.LLILLL), this.LL.getScale() + (this.LLILZIL * this.LLILLL), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -14680065, 15, null);
    }
}

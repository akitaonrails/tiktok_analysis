package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386960FFe extends C09AY implements Function1<BaseStickerModel, BaseStickerModel> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ float LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C386960FFe(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = i6;
        this.LLIZ = i7;
        this.LLIZLLLIL = i8;
        this.LLJ = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseStickerModel invoke(BaseStickerModel baseStickerModel) {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, this.LLILLL, this.LLILZ, i / 2.0f, i2 / 2.0f, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, i, i2, i, i2, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.LLJ, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16809977, 15, null);
    }
}

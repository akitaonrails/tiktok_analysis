package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ERc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364580ERc extends C09AY implements Function1<BaseStickerModel, BaseStickerModel> {
    public final /* synthetic */ Rect LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C364580ERc(Rect rect, int i, int i2, float f, int i3, int i4) {
        super(1);
        this.LL = rect;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = f;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseStickerModel invoke(BaseStickerModel baseStickerModel) {
        Rect rect = this.LL;
        int i = rect.left;
        int i2 = rect.top;
        int iWidth = rect.width();
        int iHeight = this.LL.height();
        int i3 = this.LLILLJJLI;
        int i4 = this.LLILLL;
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, i, i2, i3 / 2.0f, i4 / 2.0f, iWidth, iHeight, this.LLILZIL, this.LLILZLL, i3, i4, i3, i4, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (-this.LLILZ) % 360, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16809977, 15, null);
    }
}

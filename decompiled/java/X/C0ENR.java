package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ENR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENR extends C09AY implements Function1<BaseStickerModel, BaseStickerModel> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ NLETrackSlot LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ENR(float f, float f2, C118300cf c118300cf, C118300cf c118300cf2, int i, int i2, NLETrackSlot nLETrackSlot, int i3, int i4) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = c118300cf;
        this.LLILZ = c118300cf2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = nLETrackSlot;
        this.LLIZLLLIL = i3;
        this.LLJ = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseStickerModel invoke(BaseStickerModel baseStickerModel) {
        int i = (int) this.LL;
        int i2 = (int) this.LLILLJJLI;
        int i3 = this.LLILLL.element;
        int i4 = this.LLILZ.element;
        float f = this.LLILZIL / 2.0f;
        float f2 = this.LLILZLL / 2.0f;
        float f3 = (-this.LLIZ.getRotation()) % 360;
        int i5 = this.LLIZLLLIL;
        int i6 = this.LLJ;
        int i7 = this.LLILZIL;
        int i8 = this.LLILZLL;
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, i, i2, f, f2, i3, i4, i5, i6, i7, i8, i7, i8, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16809977, 15, null);
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.TextSizeSliderAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485600J2o extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ TextSizeSliderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C485600J2o(TextSizeSliderAssem textSizeSliderAssem) {
        super(1);
        this.LL = textSizeSliderAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        if (((C01DP) this.LL.LLJ.getValue()).LLIZ == 1) {
            C01DX.LIZIZ("click", ((C01DP) this.LL.LLJ.getValue()).LLILZ, ((C01DP) this.LL.LLJ.getValue()).LLIZLLLIL, ((C01DP) this.LL.LLJ.getValue()).LLJ, "text_font_size", false);
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.TextSizeSliderAssem;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491440JPa extends C09AY implements Function2<UIAssem, C291001Au<? extends C229200uY>, Unit> {
    public final /* synthetic */ TextSizeSliderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491440JPa(TextSizeSliderAssem textSizeSliderAssem) {
        super(2);
        this.LL = textSizeSliderAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C229200uY> c291001Au) {
        RichTextStyle richTextStyleLIZ;
        C229200uY c229200uY = (C229200uY) c291001Au.LIZ;
        if (c229200uY != null && (richTextStyleLIZ = c229200uY.LIZ()) != null) {
            int i = richTextStyleLIZ.fontSize;
            TextSizeSliderAssem textSizeSliderAssem = this.LL;
            if (i > textSizeSliderAssem.LLJILJIL) {
                textSizeSliderAssem.LLJILJIL = i;
            }
            if (i < textSizeSliderAssem.LLJIJIL) {
                textSizeSliderAssem.LLJIJIL = i;
            }
            C0GYF c0gyf = textSizeSliderAssem.LLJI;
            if (c0gyf != null) {
                int iLJ = C13LZ.LJ(i, textSizeSliderAssem.LLJIJIL, textSizeSliderAssem.LLJILJIL);
                int i2 = textSizeSliderAssem.LLJIJIL;
                float f = iLJ - i2;
                float f2 = textSizeSliderAssem.LLJILJIL - i2;
                int iLJ2 = 0;
                if (f2 > 0.0f) {
                    iLJ2 = C13LZ.LJ(C814420VxA.LIZIZ((f / f2) * 100), 0, 100);
                }
                c0gyf.setInitialTextSizeParams(iLJ2);
            }
        }
        return Unit.LIZ;
    }
}

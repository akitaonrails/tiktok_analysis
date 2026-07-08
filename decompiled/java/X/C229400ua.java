package X;

import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.model.StrokeStyle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229400ua extends C09AY implements Function1<C2880019q, C2880019q> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ RichTextStyle LLILLJJLI;
    public final /* synthetic */ RichTextStyle LLILLL;
    public final /* synthetic */ C229200uY LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ StrokeStyle LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ ColorBackground LLJI;
    public final /* synthetic */ ColorBackground LLJIJIL;
    public final /* synthetic */ Float LLJILJIL;
    public final /* synthetic */ EdgeInsets LLJILJILJ;
    public final /* synthetic */ Float LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229400ua(boolean z, RichTextStyle richTextStyle, RichTextStyle richTextStyle2, C229200uY c229200uY, Integer num, Integer num2, String str, StrokeStyle strokeStyle, String str2, ColorBackground colorBackground, ColorBackground colorBackground2, Float f, EdgeInsets edgeInsets, Float f2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = richTextStyle;
        this.LLILLL = richTextStyle2;
        this.LLILZ = c229200uY;
        this.LLILZIL = num;
        this.LLILZLL = num2;
        this.LLIZ = str;
        this.LLIZLLLIL = strokeStyle;
        this.LLJ = str2;
        this.LLJI = colorBackground;
        this.LLJIJIL = colorBackground2;
        this.LLJILJIL = f;
        this.LLJILJILJ = edgeInsets;
        this.LLJILLL = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2880019q invoke(C2880019q c2880019q) {
        int iIntValue;
        boolean z;
        int iIntValue2;
        float fFloatValue;
        float fFloatValue2;
        C2880019q c2880019q2 = c2880019q;
        if (this.LL) {
            RichTextStyle richTextStyle = this.LLILLJJLI;
            richTextStyle.colorBackground = null;
            richTextStyle.inlineBackground = null;
            richTextStyle.stroke = null;
            richTextStyle.padding = null;
            RichTextStyle richTextStyle2 = this.LLILLL;
            if (richTextStyle2 != null) {
                richTextStyle2.colorBackground = null;
                richTextStyle2.inlineBackground = null;
                richTextStyle2.stroke = null;
                richTextStyle2.padding = null;
            }
        }
        RichTextStyle richTextStyle3 = this.LLILLJJLI;
        Integer num = this.LLILZIL;
        Integer num2 = this.LLILZLL;
        String str = this.LLIZ;
        StrokeStyle strokeStyle = this.LLIZLLLIL;
        String str2 = this.LLJ;
        ColorBackground colorBackground = this.LLJI;
        ColorBackground colorBackground2 = this.LLJIJIL;
        Float f = this.LLJILJIL;
        EdgeInsets edgeInsets = this.LLJILJILJ;
        Float f2 = this.LLJILLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = richTextStyle3.textStyle;
        }
        richTextStyle3.textStyle = iIntValue;
        if (num2 != null && num2.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (Boolean.valueOf(z).booleanValue() && num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = richTextStyle3.contentAlignX;
        }
        richTextStyle3.contentAlignX = iIntValue2;
        if (str == null) {
            str = richTextStyle3.fontFamily;
        }
        richTextStyle3.fontFamily = str;
        if (strokeStyle == null) {
            strokeStyle = richTextStyle3.stroke;
        }
        richTextStyle3.stroke = strokeStyle;
        if (str2 == null) {
            str2 = richTextStyle3.color;
        }
        richTextStyle3.color = str2;
        if (colorBackground == null) {
            colorBackground = richTextStyle3.colorBackground;
        }
        richTextStyle3.colorBackground = colorBackground;
        if (colorBackground2 == null) {
            colorBackground2 = richTextStyle3.inlineBackground;
        }
        richTextStyle3.inlineBackground = colorBackground2;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = richTextStyle3.lineSpacing;
        }
        richTextStyle3.lineSpacing = fFloatValue;
        if (edgeInsets == null) {
            edgeInsets = richTextStyle3.padding;
        }
        richTextStyle3.padding = edgeInsets;
        if (f2 != null) {
            fFloatValue2 = f2.floatValue();
        } else {
            fFloatValue2 = richTextStyle3.lineHeight;
        }
        richTextStyle3.lineHeight = fFloatValue2;
        return C2880019q.LIZ(c2880019q2, new C291001Au(this.LLILZ), 0, null, null, null, 61);
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.model.StrokeStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229500ub extends C09AY implements Function1<C2880019q, Unit> {
    public final /* synthetic */ RichTextStyleEditViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ StrokeStyle LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ ColorBackground LLIZLLLIL;
    public final /* synthetic */ ColorBackground LLJ;
    public final /* synthetic */ Float LLJI;
    public final /* synthetic */ EdgeInsets LLJIJIL;
    public final /* synthetic */ Float LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229500ub(RichTextStyleEditViewModel richTextStyleEditViewModel, boolean z, Integer num, Integer num2, String str, StrokeStyle strokeStyle, String str2, ColorBackground colorBackground, ColorBackground colorBackground2, Float f, EdgeInsets edgeInsets, Float f2) {
        super(1);
        this.LL = richTextStyleEditViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = str;
        this.LLILZLL = strokeStyle;
        this.LLIZ = str2;
        this.LLIZLLLIL = colorBackground;
        this.LLJ = colorBackground2;
        this.LLJI = f;
        this.LLJIJIL = edgeInsets;
        this.LLJILJIL = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2880019q c2880019q) {
        RichTextStyle richTextStyleLIZ;
        C229200uY c229200uY = this.LL.getState().LLILLJJLI.LIZ;
        if (c229200uY != null && (richTextStyleLIZ = c229200uY.LIZ()) != null) {
            this.LL.setState(new C229400ua(this.LLILLJJLI, richTextStyleLIZ, c229200uY.LIZIZ, c229200uY, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL));
        }
        return Unit.LIZ;
    }
}

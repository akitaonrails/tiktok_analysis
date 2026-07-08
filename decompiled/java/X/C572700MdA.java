package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$triggerAISummary$2", f = "Text2ImageGenerator.kt", l = {}, m = "invokeSuspend")
public final class C572700MdA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ Text2ImageGenerator LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C572700MdA(VideoPublishEditModel videoPublishEditModel, Text2ImageGenerator text2ImageGenerator, InterfaceC1364105Vn<? super C572700MdA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = text2ImageGenerator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C572700MdA c572700MdA = new C572700MdA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c572700MdA.LL = obj;
        return c572700MdA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageGenerator@4a7d.triggerAISummary$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        if (C064S.LIZ() && this.LLILLJJLI.creativeModel.text2ImageModel.fromCommentId.length() != 0) {
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            if (videoPublishEditModel.creativeModel.text2ImageModel.commentSummary == null) {
                Text2ImageGenerator text2ImageGenerator = this.LLILLL;
                if (text2ImageGenerator.LJIIL == null) {
                    text2ImageGenerator.LJI = videoPublishEditModel;
                    Text2ImageGenerator text2ImageGenerator2 = this.LLILLL;
                    text2ImageGenerator2.LJIIL = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C572710MdB(this.LLILLJJLI, text2ImageGenerator2, null), 3);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("Text2ImageGenerator@4a7d.triggerAISummary$2");
                    return unit;
                }
            }
            this.LLILLL.LJI = videoPublishEditModel;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("Text2ImageGenerator@4a7d.triggerAISummary$2");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.triggerAISummary$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

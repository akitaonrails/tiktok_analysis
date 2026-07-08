package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem$subscribeToDefaultReplyAndPhotoCommentData$1", f = "TypingRecommendationPanelAssem.kt", l = {390}, m = "invokeSuspend")
public final class C447910HhN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<List<StickerItem>> LLILLJJLI;
    public final /* synthetic */ C05YD<C447990HhV> LLILLL;
    public final /* synthetic */ C05YD<C448000HhW> LLILZ;
    public final /* synthetic */ TypingRecommendationPanelAssem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C447910HhN(C05YD<? extends List<StickerItem>> c05yd, C05YD<C447990HhV> c05yd2, C05YD<C448000HhW> c05yd3, TypingRecommendationPanelAssem typingRecommendationPanelAssem, InterfaceC1364105Vn<? super C447910HhN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = c05yd2;
        this.LLILZ = c05yd3;
        this.LLILZIL = typingRecommendationPanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447910HhN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationPanelAssem@d8fd.subscribeToDefaultReplyAndPhotoCommentData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C515901zh c515901zhLJIIIIZZ = C09IC.LJIIIIZZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, new C447920HhO(this.LLILZIL, null));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILZIL, 70);
            this.LL = 1;
            if (c515901zhLJIIIIZZ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.subscribeToDefaultReplyAndPhotoCommentData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.subscribeToDefaultReplyAndPhotoCommentData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM$loadDefaultStickers$1", f = "TypingRecommendationVM.kt", l = {288}, m = "invokeSuspend")
public final class C451300Hmq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<List<StickerItem>> LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<AbstractC450030Hkn<List<StickerItem>>> LLILLL;
    public final /* synthetic */ TypingRecommendationVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C451300Hmq(InterfaceC346201Wa<? extends List<StickerItem>> interfaceC346201Wa, InterfaceC346201Wa<? extends AbstractC450030Hkn<List<StickerItem>>> interfaceC346201Wa2, TypingRecommendationVM typingRecommendationVM, InterfaceC1364105Vn<? super C451300Hmq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = interfaceC346201Wa2;
        this.LLILZ = typingRecommendationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C451300Hmq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationVM@7aaa.loadDefaultStickers$1");
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
            C414301jJ c414301jJ = new C414301jJ(this.LLILLJJLI, this.LLILLL, new C451290Hmp(this.LLILZ, null));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILZ, 102);
            this.LL = 1;
            if (c414301jJ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationVM@7aaa.loadDefaultStickers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingRecommendationVM@7aaa.loadDefaultStickers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

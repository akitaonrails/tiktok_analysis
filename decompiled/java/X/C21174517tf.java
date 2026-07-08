package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$dealNewAtmosphereTags$2", f = "AbsUsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
public final class C21174517tf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC21194117wp LL;
    public final /* synthetic */ AtmosphereTagInfo LLILLJJLI;
    public final /* synthetic */ AtmosphereTag LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21174517tf(AbstractC21194117wp abstractC21194117wp, AtmosphereTagInfo atmosphereTagInfo, AtmosphereTag atmosphereTag, InterfaceC1364105Vn<? super C21174517tf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC21194117wp;
        this.LLILLJJLI = atmosphereTagInfo;
        this.LLILLL = atmosphereTag;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21174517tf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.dealNewAtmosphereTags$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIJIIJI().LJJIII(this.LLILLJJLI.tagType, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.dealNewAtmosphereTags$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

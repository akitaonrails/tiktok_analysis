package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$requestPopFromMessage$1$1", f = "AbsUsECLiveExplanationCardWidget.kt", l = {1082}, m = "invokeSuspend")
public final class C1735540vGS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ ECommerceMessage LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ AbstractC21194117wp LLILZIL;
    public final /* synthetic */ C1563990qnl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735540vGS(boolean z, ECommerceMessage eCommerceMessage, long j, AbstractC21194117wp abstractC21194117wp, C1563990qnl c1563990qnl, InterfaceC1364105Vn<? super C1735540vGS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = eCommerceMessage;
        this.LLILZ = j;
        this.LLILZIL = abstractC21194117wp;
        this.LLILZLL = c1563990qnl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735540vGS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.requestPopFromMessage$1$1");
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
            if (this.LLILLJJLI) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(400L, this) == objLJFF) {
                    C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.requestPopFromMessage$1$1");
                    return objLJFF;
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C110400bO c110400bO = C110400bO.LIZ;
        ECommerceMessage eCommerceMessage = this.LLILLL;
        Long lLJFF = C2286608xc.LJFF(this.LLILZ);
        Long lLJFF2 = C2286608xc.LJFF(jCurrentTimeMillis);
        c110400bO.getClass();
        C110400bO.LIZ(eCommerceMessage, lLJFF, lLJFF2);
        AbstractC21194117wp abstractC21194117wp = this.LLILZIL;
        ECommerceMessage eCommerceMessage2 = this.LLILLL;
        AbstractC21194117wp.LJJLI(abstractC21194117wp, false, eCommerceMessage2, this.LLILZLL, false, C2286608xc.LJ(eCommerceMessage2.cardType), 8);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.requestPopFromMessage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

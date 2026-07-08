package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRequestManager$requestPopReal$2$onResponse$3$2", f = "UsPopCardRequestManager.kt", l = {229}, m = "invokeSuspend")
public final class C1734010vDz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC1685430txd<PopProductResp, Boolean, Boolean, ECommerceMessage, Boolean, JSONObject, Unit> LLILLL;
    public final /* synthetic */ PopProductResp LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ECommerceMessage LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ JSONObject LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1734010vDz(boolean z, InterfaceC1685430txd<? super PopProductResp, ? super Boolean, ? super Boolean, ? super ECommerceMessage, ? super Boolean, ? super JSONObject, Unit> interfaceC1685430txd, PopProductResp popProductResp, boolean z2, ECommerceMessage eCommerceMessage, boolean z3, JSONObject jSONObject, InterfaceC1364105Vn<? super C1734010vDz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1685430txd;
        this.LLILZ = popProductResp;
        this.LLILZIL = z2;
        this.LLILZLL = eCommerceMessage;
        this.LLIZ = z3;
        this.LLIZLLLIL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1734010vDz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsPopCardRequestManager@b922.requestPopReal$2$onResponse$3$2");
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
                    C1C7U.LIZIZ("UsPopCardRequestManager@b922.requestPopReal$2$onResponse$3$2");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.invoke(this.LLILZ, Boolean.valueOf(this.LLILZIL), false, this.LLILZLL, Boolean.valueOf(this.LLIZ), this.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsPopCardRequestManager@b922.requestPopReal$2$onResponse$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

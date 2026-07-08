package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagTooltipConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController$onMessage$1$1", f = "BagGuideTooltipController.kt", l = {439}, m = "invokeSuspend")
public final class C19516911Xj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BagGuideTooltipController LLILLJJLI;
    public final /* synthetic */ EcShopBagTooltipConfig LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19516911Xj(BagGuideTooltipController bagGuideTooltipController, EcShopBagTooltipConfig ecShopBagTooltipConfig, JSONObject jSONObject, int i, int i2, String str, InterfaceC1364105Vn<? super C19516911Xj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bagGuideTooltipController;
        this.LLILLL = ecShopBagTooltipConfig;
        this.LLILZ = jSONObject;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19516911Xj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19516911Xj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

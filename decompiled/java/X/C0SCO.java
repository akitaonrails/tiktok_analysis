package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SCO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt$requestAmazonRealtimeInfo$1$1$1$1", f = "CommerceVideoDelegateKt.kt", l = {}, m = "invokeSuspend")
public final class C0SCO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SCO(CommerceVideoDelegateKt commerceVideoDelegateKt, JSONObject jSONObject, InterfaceC1364105Vn<? super C0SCO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commerceVideoDelegateKt;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SCO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CommerceVideoDelegateKt@740c.requestAmazonRealtimeInfo$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1008930cMV interfaceC1008930cMVLLLLJI = this.LL.LLLLJI();
        if (interfaceC1008930cMVLLLLJI != null) {
            interfaceC1008930cMVLLLLJI.LJIILL(new C0SCL(this.LLILLJJLI));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt@740c.requestAmazonRealtimeInfo$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

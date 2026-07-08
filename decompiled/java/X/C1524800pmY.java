package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.NetWorkSystemRequestJSWrap$request$1$2", f = "NetWorkModule.kt", l = {}, m = "invokeSuspend")
public final class C1524800pmY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1525170pn9 LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524800pmY(C1525170pn9 c1525170pn9, JSONObject jSONObject, InterfaceC1364105Vn<? super C1524800pmY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1525170pn9;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1524800pmY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C1C7U.LIZ("NetWorkSystemRequestJSWrap@5e78.request$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1525060pmy c1525060pmy = this.LL.LIZ;
        if (c1525060pmy != null && (interfaceC1525090pn1 = c1525060pmy.LIZIZ) != null) {
            interfaceC1525090pn1.emitJSAPIEvent("innerRequestTaskStateChange", this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetWorkSystemRequestJSWrap@5e78.request$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

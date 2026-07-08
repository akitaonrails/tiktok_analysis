package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01X0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.model.StarshipModelPredict$onDeviceModelPredict$2$1", f = "StarshipModelPredict.kt", l = {}, m = "invokeSuspend")
public final class C01X0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C259800zU<JSONObject> LLILZ;
    public final /* synthetic */ C259800zU<C1309260kAu> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01X0(String str, JSONObject jSONObject, long j, C259800zU<JSONObject> c259800zU, C259800zU<C1309260kAu> c259800zU2, InterfaceC1364105Vn<? super C01X0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
        this.LLILLL = j;
        this.LLILZ = c259800zU;
        this.LLILZIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01X0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StarshipModelPredict@1c32.onDeviceModelPredict$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1307940k8m.LIZJ().LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, new C01X1(this.LLILZ, this.LLILZIL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StarshipModelPredict@1c32.onDeviceModelPredict$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

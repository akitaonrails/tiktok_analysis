package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.StorageJSWrapOld$getStorageInfo$1", f = "StorageModule.kt", l = {}, m = "invokeSuspend")
public final class C1848810yD9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1848770yD5 LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1848810yD9(C1848770yD5 c1848770yD5, JSONObject jSONObject, int i, InterfaceC1364105Vn<? super C1848810yD9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1848770yD5;
        this.LLILLJJLI = jSONObject;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1848810yD9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C1C7U.LIZ("StorageJSWrapOld@981b.getStorageInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2220181Buy c2220181BuyLIZJ = this.LL.LIZJ();
        C1848840yDC c1848840yDC = this.LL.LIZ;
        if (c1848840yDC != null && (interfaceC1525090pn1 = c1848840yDC.LIZIZ) != null) {
            interfaceC1525090pn1.LJJLIIJ(C2286608xc.LJ(this.LLILLL), c2220181BuyLIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorageJSWrapOld@981b.getStorageInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

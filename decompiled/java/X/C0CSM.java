package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CSM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.impl.GamePreregisterService$callUpdateData$1$1$2", f = "GamePreregisterService.kt", l = {}, m = "invokeSuspend")
public final class C0CSM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1882050z4l LL;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CSM(C1882050z4l c1882050z4l, Function1<? super JSONObject, Unit> function1, JSONObject jSONObject, InterfaceC1364105Vn<? super C0CSM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1882050z4l;
        this.LLILLJJLI = function1;
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSM(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GamePreregisterService@ff4c.callUpdateData$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set set = (Set) this.LL.LLILLL.getValue();
        JSONObject jSONObject = this.LLILLL;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(jSONObject);
        }
        this.LLILLJJLI.invoke(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GamePreregisterService@ff4c.callUpdateData$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

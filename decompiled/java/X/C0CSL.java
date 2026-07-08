package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CSL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.impl.GameDownloadService$callUpdateData$1$1$2", f = "GameDownloadService.kt", l = {}, m = "invokeSuspend")
public final class C0CSL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1882060z4m LL;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CSL(C1882060z4m c1882060z4m, Function1<? super JSONObject, Unit> function1, JSONObject jSONObject, InterfaceC1364105Vn<? super C0CSL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1882060z4m;
        this.LLILLJJLI = function1;
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameDownloadService@d24c.callUpdateData$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set set = (Set) this.LL.LLILLJJLI.getValue();
        JSONObject jSONObject = this.LLILLL;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(jSONObject);
        }
        this.LLILLJJLI.invoke(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameDownloadService@d24c.callUpdateData$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

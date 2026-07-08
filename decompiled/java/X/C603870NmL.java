package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.PipoContainerEventUtils$sendBlankDetectEvent$1", f = "PipoContainerEventUtils.kt", l = {696}, m = "invokeSuspend")
public final class C603870NmL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C603870NmL(JSONObject jSONObject, InterfaceC1364105Vn<? super C603870NmL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C603870NmL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoContainerEventUtils@c75.sendBlankDetectEvent$1");
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
            C1725270uzt c1725270uzt = C1725270uzt.LIZ;
            JSONObject jSONObject = this.LLILLJJLI;
            this.LL = 1;
            if (c1725270uzt.LIZIZ(jSONObject, this) == objLJFF) {
                C1C7U.LIZIZ("PipoContainerEventUtils@c75.sendBlankDetectEvent$1");
                return objLJFF;
            }
        }
        C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_blank_detect", this.LLILLJJLI, null, 12);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoContainerEventUtils@c75.sendBlankDetectEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

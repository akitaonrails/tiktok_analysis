package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08VT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.outreach.dispersion.monitor.OutreachVideoPlayTimer$onEventV3$2", f = "OutreachVideoPlayTimer.kt", l = {}, m = "invokeSuspend")
public final class C08VT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VT(String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08VT(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("OutreachVideoPlayTimer@c37a.onEventV3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = C080M.LIZJ;
        if (list != null && list.contains(this.LL)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean z2 = C080M.LIZ;
            AnonymousClass0956 anonymousClass0956 = C080M.LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C080M.LJFF = null;
        }
        List<String> list2 = C080M.LIZIZ;
        if (list2 != null && list2.contains(this.LL)) {
            boolean z3 = C080M.LIZ;
            String str = this.LL;
            JSONObject jSONObject = this.LLILLJJLI;
            if (C080M.LIZLLL.isEmpty()) {
                C20571615ec.LIZ.getClass();
                C20571615ec.LIZIZ("startTimer return. timing list is empty");
            } else {
                AnonymousClass0956 anonymousClass09562 = C080M.LJFF;
                if (anonymousClass09562 != null && anonymousClass09562.isActive()) {
                    AnonymousClass0956 anonymousClass09563 = C080M.LJFF;
                    if (anonymousClass09563 != null) {
                        anonymousClass09563.LIZIZ(null);
                    }
                    C080M.LJFF = null;
                }
                C080M.LJFF = C23250099c.LIZLLL(C080M.LJ, null, null, new C08VU(str, null, jSONObject), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OutreachVideoPlayTimer@c37a.onEventV3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

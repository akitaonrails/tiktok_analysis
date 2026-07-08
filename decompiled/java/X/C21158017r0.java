package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.bubble.pool.EcMixMallBubblePool$submitBubble$4", f = "EcMixMallBubblePool.kt", l = {}, m = "invokeSuspend")
public final class C21158017r0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21155417qa LL;
    public final /* synthetic */ InterfaceC21155017qW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21158017r0(C21155417qa c21155417qa, InterfaceC21155017qW interfaceC21155017qW, InterfaceC1364105Vn<? super C21158017r0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21155417qa;
        this.LLILLJJLI = interfaceC21155017qW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21158017r0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strOptString;
        C1C7U.LIZ("EcMixMallBubblePool@a8df.submitBubble$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            JSONArray jSONArray = new JSONArray();
            for (InterfaceC21155017qW interfaceC21155017qW : this.LL.LIZJ) {
                JSONObject jSONObject = new JSONObject();
                AnonymousClass0507.LIZ("item_id", interfaceC21155017qW.LJII().LIZJ, jSONObject);
                AnonymousClass0507.LIZ("tab_id", interfaceC21155017qW.LJII().LIZLLL, jSONObject);
                AnonymousClass0507.LIZ("anchor_id", interfaceC21155017qW.LJII().LJ, jSONObject);
                JSONObject jSONObject2 = interfaceC21155017qW.LJII().LJIJ;
                if (jSONObject2 == null) {
                    strOptString = null;
                } else {
                    strOptString = jSONObject2.optString("target_resource_name");
                }
                AnonymousClass0507.LIZ("target_resource_name", strOptString, jSONObject);
                jSONArray.put(jSONObject.put("visible", interfaceC21155017qW.isVisible()));
            }
            C1557000qcU.LIZ("bubble", "over_threshold", C2097608Jq.LJIIJ(new Pair("item_id", this.LLILLJJLI.LJII().LIZJ), new Pair("tab_id", this.LLILLJJLI.LJII().LIZLLL), new Pair("anchor_id", this.LLILLJJLI.LJII().LJ), new Pair("schema", this.LLILLJJLI.LJII().LIZ), new Pair("quantity", C2286608xc.LJ(this.LL.LIZJ.size())), new Pair("extra_data", jSONArray.toString())));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallBubblePool@a8df.submitBubble$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

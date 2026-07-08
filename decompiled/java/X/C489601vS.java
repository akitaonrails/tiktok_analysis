package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01vS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.StoryImmersiveTopAreaComponent$onMonitorFcpPolicyDone$1", f = "StoryImmersiveTopAreaComponent.kt", l = {}, m = "invokeSuspend")
public final class C489601vS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C489601vS(int i, InterfaceC1364105Vn<? super C489601vS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C489601vS c489601vS = new C489601vS(this.LLILLJJLI, interfaceC1364105Vn);
        c489601vS.LL = obj;
        return c489601vS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryImmersiveTopAreaComponent@471a.onMonitorFcpPolicyDone$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LLILLJJLI;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("story_top_fcp_result", i);
            C20684815ws.LJIJ("story_top_area_fcp_policy_res_monitor", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryImmersiveTopAreaComponent@471a.onMonitorFcpPolicyDone$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

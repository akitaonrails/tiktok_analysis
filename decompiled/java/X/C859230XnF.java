package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver$doClick$1", f = "BottomPublishObserver.kt", l = {235}, m = "invokeSuspend")
public final class C859230XnF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BottomPublishObserver LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859230XnF(BottomPublishObserver bottomPublishObserver, InterfaceC1364105Vn<? super C859230XnF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bottomPublishObserver;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859230XnF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomPublishObserver@8f34.doClick$1");
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
            BottomPublishObserver bottomPublishObserver = this.LLILLJJLI;
            bottomPublishObserver.LLIZLLLIL = true;
            bottomPublishObserver.LLJ = System.currentTimeMillis();
            C1483410ohn.LJLJJI().LIZ();
            long jLongValue = ((Number) C0ASJ.LIZ.getValue()).longValue();
            C859220XnE c859220XnE = new C859220XnE(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C099A.LIZJ(jLongValue, c859220XnE, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BottomPublishObserver@8f34.doClick$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            this.LLILLJJLI.LLIZLLLIL = false;
            IAVMobService aVMobService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "tool_performance_pause_video_player_time_out");
            aVMobService.onEventV3("tool_performance_operation_cost_time", c2344009Gk.LIZ);
            this.LLILLJJLI.LIZJ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomPublishObserver@8f34.doClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

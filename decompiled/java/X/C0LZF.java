package X;

import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.aigc.offline.push.system.AIGCOfflineRouteInterceptor;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.offline.push.system.AIGCOfflineRouteInterceptor$onInterceptRoute$1", f = "AIGCOfflineRouteInterceptor.kt", l = {64, 80}, m = "invokeSuspend")
public final class C0LZF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LZK LLILLJJLI;
    public final /* synthetic */ AIGCOfflineRouteInterceptor LLILLL;
    public final /* synthetic */ RouteIntent LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZF(C0LZK c0lzk, AIGCOfflineRouteInterceptor aIGCOfflineRouteInterceptor, RouteIntent routeIntent, Context context, InterfaceC1364105Vn<? super C0LZF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lzk;
        this.LLILLL = aIGCOfflineRouteInterceptor;
        this.LLILZ = routeIntent;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = obj;
        C1C7U.LIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJFF);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJFF);
        } else {
            C155000ia.LIZIZ(objLJFF);
            C545090LZj c545090LZj = C545090LZj.LIZ;
            String str = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            objLJFF = c545090LZj.LJFF(str, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
                return objLJFF2;
            }
        }
        C0LY5 c0ly5 = (C0LY5) objLJFF;
        if (c0ly5 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getTaskInfoByServerTaskId returned null, serverTaskId=");
            sbLIZ.append(this.LLILLJJLI.LIZIZ);
            C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_workflow_refactor_push_ab", true, true)) {
                AIGCOfflineRouteInterceptor aIGCOfflineRouteInterceptor = this.LLILLL;
                RouteIntent routeIntent = this.LLILZ;
                Context context = this.LLILZIL;
                aIGCOfflineRouteInterceptor.getClass();
                AIGCOfflineRouteInterceptor.LIZ(context, routeIntent);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
            return unit2;
        }
        AwemeDraft awemeDraftLJI = ((C0M6F) this.LLILLL.LLILLJJLI.getValue()).LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(c0ly5.LIZIZ, 0, null, 6, null), false, false, false, 14));
        if (awemeDraftLJI != null && ((C0LZB) this.LLILLL.LL.getValue()).LIZLLL(awemeDraftLJI)) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - c0ly5.LJIIJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enterGenerationDraftActivity taskId=");
            sbLIZ2.append(c0ly5.LIZ);
            sbLIZ2.append(", taskStatus=");
            sbLIZ2.append(c0ly5.LJ);
            sbLIZ2.append(", elapsedWaitingTime=");
            sbLIZ2.append(jCurrentTimeMillis);
            C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0LZG c0lzg = new C0LZG(awemeDraftLJI, this.LLILZIL, this.LLILLJJLI, c0ly5, jCurrentTimeMillis, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0lzg) == objLJFF2) {
                C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
                return objLJFF2;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
            return unit3;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Draft is null or invalid, creationId=");
        sbLIZ3.append(c0ly5.LIZIZ);
        C0LC0.LIZ("AIGCOfflineRouteInterceptor", C2188811AlT.LIZIZ(sbLIZ3));
        AIGCOfflineRouteInterceptor aIGCOfflineRouteInterceptor2 = this.LLILLL;
        RouteIntent routeIntent2 = this.LLILZ;
        Context context2 = this.LLILZIL;
        aIGCOfflineRouteInterceptor2.getClass();
        AIGCOfflineRouteInterceptor.LIZ(context2, routeIntent2);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

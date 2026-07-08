package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoItemInfoModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.notify.route.AITheaterCameoNotifyRoutePayload;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LON, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.notify.route.AITheaterCameoNotifyRouteProcessor$process$1", f = "AITheaterCameoNotifyRouteProcessor.kt", l = {76}, m = "invokeSuspend")
public final class C0LON extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC542330LOt LLILLJJLI;
    public final /* synthetic */ C542200LOg LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ AITheaterProfileService LLILZIL;
    public final /* synthetic */ C542230LOj LLILZLL;
    public final /* synthetic */ AITheaterCameoNotifyRoutePayload LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LON(InterfaceC542330LOt interfaceC542330LOt, C542200LOg c542200LOg, Activity activity, AITheaterProfileService aITheaterProfileService, C542230LOj c542230LOj, AITheaterCameoNotifyRoutePayload aITheaterCameoNotifyRoutePayload, InterfaceC1364105Vn<? super C0LON> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC542330LOt;
        this.LLILLL = c542200LOg;
        this.LLILZ = activity;
        this.LLILZIL = aITheaterProfileService;
        this.LLILZLL = c542230LOj;
        this.LLIZ = aITheaterCameoNotifyRoutePayload;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LON(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0LNF c0lnf;
        Object objLJIILIIL;
        C1C7U.LIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIILIIL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            if (currentUserID != null && currentUserID.length() != 0) {
                C542200LOg c542200LOg = this.LLILLL;
                Activity activity = this.LLILZ;
                C0LOK c0lok = C0LOK.LIZ;
                c542200LOg.getClass();
                C546230LbZ c546230LbZLIZ = C546330Lbj.LIZ(c0lok);
                if (c546230LbZLIZ != null && (c0lnf = (C0LNF) c546230LbZLIZ.LJIIJJI.getValue()) != null) {
                    if (!c0lnf.LIZ.invoke().booleanValue()) {
                        C421570Gfz.LIZ(new AwS157S1100000_8(activity, c0lnf.LIZIZ.invoke(activity), 0));
                    } else {
                        InterfaceC550750Lir interfaceC550750LirG9 = this.LLILZIL.g9();
                        this.LL = 1;
                        objLJIILIIL = interfaceC550750LirG9.LJIILIIL(currentUserID, false, null, this);
                        if (objLJIILIIL == objLJFF) {
                            C1C7U.LIZIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
                            return objLJFF;
                        }
                    }
                }
                this.LLILLJJLI.LIZ("navigation is not enabled, skip routing");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
                return unit;
            }
            this.LLILLJJLI.LIZ("current user id is null, skip routing");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
            return unit2;
        }
        String message = null;
        if (C189200o6.m7isFailureimpl(objLJIILIIL)) {
            InterfaceC542330LOt interfaceC542330LOt = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestCameoInfo failed: ");
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIILIIL);
            if (thM5exceptionOrNullimpl != null) {
                message = thM5exceptionOrNullimpl.getMessage();
            }
            sbLIZ.append(message);
            interfaceC542330LOt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            SmartRouter.buildRoute(this.LLILZLL.LIZ, "aweme://profile_edit").open();
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
            return unit3;
        }
        InterfaceC549230LgP interfaceC549230LgPLIZLLL = this.LLILZIL.g9().LIZLLL();
        if (Intrinsics.LJFF(this.LLIZ.success, false)) {
            this.LLILLJJLI.i("payload.success is false, launch with navigateToProfileScreen");
            this.LLILZIL.Y8(this.LLILZ, new C531080KsE(true, null, null, null, null, new AITheaterProfileEventModel(C0LQY.AI_THEATER, C528840Koc.LIZ(), "push_cameo", null, this.LLIZ.recallWay, null, null, null, null, null, null, false, 4072), false, false, false, null, 990), null);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
            return unit4;
        }
        if (interfaceC549230LgPLIZLLL instanceof C549290LgV) {
            this.LLILLJJLI.i("payload.success is true, currentState is available, launch with navigateToProfileScreen");
            C549290LgV c549290LgV = (C549290LgV) interfaceC549230LgPLIZLLL;
            this.LLILZIL.Y8(this.LLILZ, new C531080KsE(false, "ai_theater_profile_management", new AITheaterCameoItemInfoModel(c549290LgV.LIZ, c549290LgV.LIZIZ, null), null, null, new AITheaterProfileEventModel(C0LQY.AI_THEATER, null, "push_cameo", null, this.LLIZ.recallWay, null, null, null, null, null, null, false, 4074), Intrinsics.LJFF(c549290LgV.LIZ, this.LLIZ.cameoId), false, false, null, 920), null);
        } else {
            this.LLILLJJLI.i("payload.success is true, currentState is not available, launch with profile route");
            SmartRouter.buildRoute(this.LLILZLL.LIZ, "aweme://profile_edit").open();
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoNotifyRouteProcessor@403c.process$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

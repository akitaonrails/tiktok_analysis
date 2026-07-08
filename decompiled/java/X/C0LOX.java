package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.AITaskService;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.DraftDetailData;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetDraftDetailResponse;
import com.ss.android.ugc.aweme.theater.notify.route.AITheaterCastPostDeleteNotifyRoutePayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.notify.route.AITheaterCastDraftDeleteNotifyRouteProcessor$process$1", f = "AITheaterCastDraftDeleteNotifyRouteProcessor.kt", l = {39}, m = "invokeSuspend")
public final class C0LOX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AITheaterCastPostDeleteNotifyRoutePayload LLILLJJLI;
    public final /* synthetic */ C542230LOj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOX(AITheaterCastPostDeleteNotifyRoutePayload aITheaterCastPostDeleteNotifyRoutePayload, C542230LOj c542230LOj, InterfaceC1364105Vn<? super C0LOX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aITheaterCastPostDeleteNotifyRoutePayload;
        this.LLILLL = c542230LOj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CameoDraft cameoDraft;
        DraftDetailData draftDetailData;
        Object objLIZ = obj;
        C1C7U.LIZ("AITheaterCastDraftDeleteNotifyRouteProcessor@db16.process$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C547860LeC.LIZ.getClass();
            AITaskService aITaskServiceLJII = C547860LeC.LJII();
            String str = this.LLILLJJLI.draftVideoId;
            if (str == null) {
                str = "";
            }
            this.LL = 1;
            objLIZ = aITaskServiceLJII.LIZ(str, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AITheaterCastDraftDeleteNotifyRouteProcessor@db16.process$1");
                return objLJFF;
            }
        }
        GetDraftDetailResponse getDraftDetailResponse = (GetDraftDetailResponse) objLIZ;
        C0LOK c0lok = C0LOK.LIZ;
        if (getDraftDetailResponse != null && (draftDetailData = getDraftDetailResponse.data) != null) {
            cameoDraft = draftDetailData.cameoDraft;
        } else {
            cameoDraft = null;
        }
        AIGCEntranceInfo aIGCEntranceInfoLIZ = C550740Liq.LIZ("aivideo_deleted_notice", AIGC.AICreationSceneName.AIVIDEO_DELETED_NOTICE.INSTANCE, AIGC.RefPageName.CreatedVideoUnavailablePage.INSTANCE, false);
        C542160LOc c542160LOc = AIGC.RecallWay.Companion;
        String str2 = this.LLILLJJLI.recallWay;
        c542160LOc.getClass();
        AIGCDraft aIGCDraft = new AIGCDraft(c0lok, true, "", AIGCEntranceInfo.LIZ(aIGCEntranceInfoLIZ, null, null, 0, null, null, false, false, false, null, null, null, null, C542160LOc.LIZ(str2), null, false, false, 1040383), cameoDraft, null);
        C547860LeC.LIZ.getClass();
        C547860LeC.LJFF().LIZLLL(this.LLILLL.LIZ, aIGCDraft);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCastDraftDeleteNotifyRouteProcessor@db16.process$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

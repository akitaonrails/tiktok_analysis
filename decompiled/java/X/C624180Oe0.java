package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Oe0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.cache.InboxEntrancePreloadManager$preloadWorkBenchData$1", f = "InboxEntrancePreloadManager.kt", l = {30}, m = "invokeSuspend")
public final class C624180Oe0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C624180Oe0(InterfaceC1364105Vn<? super C624180Oe0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624180Oe0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objFetchNoticeBrandPartnership = obj;
        C1C7U.LIZ("InboxEntrancePreloadManager@408.preloadWorkBenchData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objFetchNoticeBrandPartnership);
            } else {
                C155000ia.LIZIZ(objFetchNoticeBrandPartnership);
                WorkBenchApiManager.Api apiLIZ = WorkBenchApiManager.LIZ();
                this.LL = 1;
                objFetchNoticeBrandPartnership = apiLIZ.fetchNoticeBrandPartnership(0, null, 20, null, null, null, true, null, null, this);
                if (objFetchNoticeBrandPartnership == objLJFF) {
                    C1C7U.LIZIZ("InboxEntrancePreloadManager@408.preloadWorkBenchData$1");
                    return objLJFF;
                }
            }
            WorkBenchNoticeResponse workBenchNoticeResponse = (WorkBenchNoticeResponse) objFetchNoticeBrandPartnership;
            C624110Odt.LIZ.getClass();
            if (workBenchNoticeResponse != null) {
                C23250099c.LIZLLL(C624110Odt.LIZJ, null, null, new C624020Odk(workBenchNoticeResponse, false, null), 3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1720106oR.LIZ("InboxEntrancePreloadManager", message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxEntrancePreloadManager@408.preloadWorkBenchData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C624180Oe0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

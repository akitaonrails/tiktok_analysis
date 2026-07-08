package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Noy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.tasks.ListDbLoadTask$execute$dbResponse$1", f = "ListDbLoadTask.kt", l = {49}, m = "invokeSuspend")
public final class C605500Noy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BulletinListResponse>, Object> {
    public int LL;
    public final /* synthetic */ C605490Nox LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605500Noy(C605490Nox c605490Nox, InterfaceC1364105Vn<? super C605500Noy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c605490Nox;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605500Noy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BulletinListResponse bulletinListResponse;
        C1C7U.LIZ("ListDbLoadTask@e21b.execute$dbResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [ListDbLoadTask] DB query failed: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
            if (iBulletinBoardDataService != null) {
                String str = this.LLILLJJLI.LIZLLL;
                this.LL = 1;
                obj = iBulletinBoardDataService.LJIIIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ListDbLoadTask@e21b.execute$dbResponse$1");
                    return objLJFF;
                }
            }
            bulletinListResponse = null;
            C1C7U.LIZIZ("ListDbLoadTask@e21b.execute$dbResponse$1");
            return bulletinListResponse;
        }
        bulletinListResponse = (BulletinListResponse) obj;
        C1C7U.LIZIZ("ListDbLoadTask@e21b.execute$dbResponse$1");
        return bulletinListResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BulletinListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

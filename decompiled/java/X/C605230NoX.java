package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.tasks.ProfileDbLoadTask$execute$dbResponse$1", f = "ProfileDbLoadTask.kt", l = {51}, m = "invokeSuspend")
public final class C605230NoX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BulletinAccountInfoResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605230NoX(String str, InterfaceC1364105Vn<? super C605230NoX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605230NoX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileDbLoadTask@824.execute$dbResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        BulletinAccountInfoResponse bulletinAccountInfoResponse = null;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [ProfileDbLoadTask] DB query failed: ");
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
                String str = this.LLILLJJLI;
                this.LL = 1;
                obj = iBulletinBoardDataService.LIZJ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ProfileDbLoadTask@824.execute$dbResponse$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("ProfileDbLoadTask@824.execute$dbResponse$1");
            return bulletinAccountInfoResponse;
        }
        bulletinAccountInfoResponse = (BulletinAccountInfoResponse) obj;
        C1C7U.LIZIZ("ProfileDbLoadTask@824.execute$dbResponse$1");
        return bulletinAccountInfoResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

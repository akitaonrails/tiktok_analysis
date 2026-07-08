package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.tasks.ListNetworkLoadTask$execute$3", f = "ListNetworkLoadTask.kt", l = {64}, m = "invokeSuspend")
public final class C605680NpG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinListResponse LLILLJJLI;
    public final /* synthetic */ C605670NpF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605680NpG(BulletinListResponse bulletinListResponse, C605670NpF c605670NpF, InterfaceC1364105Vn<? super C605680NpG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinListResponse;
        this.LLILLL = c605670NpF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605680NpG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IBulletinBoardDataService iBulletinBoardDataService;
        C1C7U.LIZ("ListNetworkLoadTask@cec.execute$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                List<BulletinItem> list = this.LLILLJJLI.bulletinItems;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && (iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null)) != null) {
                    String str = this.LLILLL.LIZLLL;
                    BulletinListResponse bulletinListResponse = this.LLILLJJLI;
                    this.LL = 1;
                    if (iBulletinBoardDataService.LJIILJJIL(bulletinListResponse, str, this, false) == objLJFF) {
                        C1C7U.LIZIZ("ListNetworkLoadTask@cec.execute$3");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [ListNetworkLoadTask] saveToDb failed: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListNetworkLoadTask@cec.execute$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

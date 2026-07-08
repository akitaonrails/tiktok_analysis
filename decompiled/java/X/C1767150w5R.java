package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.MovePartialAssetsData;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.MovePartialAssetsRepository;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.MovePartialAssetsRequest;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.MovePartialAssetsResponse;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.ShopEntranceMigrationManager$requestMovePartialAssetsData$1", f = "ShopEntranceMigrationManager.kt", l = {67}, m = "invokeSuspend")
public final class C1767150w5R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767150w5R(int i, long j, InterfaceC1364105Vn<? super C1767150w5R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1767150w5R(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("ShopEntranceMigrationManager@4ec8.requestMovePartialAssetsData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                MovePartialAssetsRequest movePartialAssetsRequest = new MovePartialAssetsRequest(C2286608xc.LJ(this.LLILLJJLI));
                C1767240w5a c1767240w5a = MovePartialAssetsRepository.LLILLJJLI.getValue().LL;
                this.LL = 1;
                obj = c1767240w5a.getMovePartialAssets(movePartialAssetsRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShopEntranceMigrationManager@4ec8.requestMovePartialAssetsData$1");
                    return objLJFF;
                }
            }
            MovePartialAssetsResponse movePartialAssetsResponse = (MovePartialAssetsResponse) obj;
            C1767130w5P.LJI = System.currentTimeMillis() - this.LLILLL;
            MovePartialAssetsData movePartialAssetsData = movePartialAssetsResponse.data;
            if (movePartialAssetsData != null) {
                C1767130w5P.LJFF = EnumC1767140w5Q.SUCCESS_WITH_DATA;
                C1767130w5P.LIZ.getClass();
                C1767130w5P.LIZJ = movePartialAssetsData;
            }
            if (movePartialAssetsResponse.data == null) {
                C1767130w5P.LJFF = EnumC1767140w5Q.SUCCESS_EMPTY_DATA;
            }
            C1767130w5P.LJII = C2286608xc.LJ(movePartialAssetsResponse.error_code);
            C1767130w5P.LJIIIIZZ = movePartialAssetsResponse.message;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1767130w5P.LJI = System.currentTimeMillis() - this.LLILLL;
            C1767130w5P.LJFF = EnumC1767140w5Q.ERROR_RESPONSE;
            C1767130w5P.LJII = C2286608xc.LJ(-1);
            C1767130w5P.LJIIIIZZ = e.getMessage();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).commonLogE("chengongguo/ShopEntranceMigrationManager", "requestMovePartialAssetsData() error");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopEntranceMigrationManager@4ec8.requestMovePartialAssetsData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

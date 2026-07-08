package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.GetEntranceInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.OrderEntranceType;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750760vf0 {
    public static final C1750760vf0 LIZ = new C1750760vf0();
    public static final Keva LIZIZ;
    public static final TradeEntranceInfo LIZJ;

    static {
        TradeEntranceInfo tradeEntranceInfo;
        Keva repo = Keva.getRepo("ec_order_center_entrance_infos");
        LIZIZ = repo;
        String string = repo.getString(LIZIZ(), null);
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<TradeEntranceInfo>() { // from class: X.0vez
            }.getType() : C2371409Qy.LIZJ(C13LE.LJ(TradeEntranceInfo.class)));
            if (!(objFromJson instanceof TradeEntranceInfo)) {
                objFromJson = null;
            }
            tradeEntranceInfo = (TradeEntranceInfo) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (tradeEntranceInfo == null) {
            tradeEntranceInfo = new TradeEntranceInfo(Integer.valueOf(OrderEntranceType.CLOSE.ordinal()), "", "", null, null, null, null, 0);
        }
        LIZJ = tradeEntranceInfo;
    }

    public static String LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        return (userId == null || userId.length() == 0) ? "unknown" : userId;
    }

    public static void LIZ(String str) {
        LIZIZ.storeString(LIZIZ(), C1741890vQh.LJIIIIZZ(new TradeEntranceInfo(Integer.valueOf(OrderEntranceType.CLOSE.ordinal()), "", str, null, null, null, null, 0)));
    }

    public static void LIZJ(final Function1 function1) {
        Object c098200Yq;
        InterfaceC1750790vf3.LIZ.getClass();
        try {
            c098200Yq = ((InterfaceC1750790vf3) C1750780vf2.LIZIZ.create(InterfaceC1750790vf3.class)).getEntranceInfo().LJL(C11S5.LIZ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C098D c098d = (C11NZ) c098200Yq;
        if (c098d == null) {
            c098d = C11IR.LL;
        }
        c098d.LIZIZ(new C11N2<GetEntranceInfoResponse>() { // from class: X.0vf1
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                dispose();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th2) {
                dispose();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                Function1<GetEntranceInfoResponse, Unit> function12;
                Response response = (Response) obj;
                if (response.isCodeOK() && (function12 = function1) != null) {
                    function12.invoke((GetEntranceInfoResponse) response);
                }
                dispose();
            }
        });
    }
}

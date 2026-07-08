package X;

import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVStatusPreloadTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVStatusPreloadTask$run$1", f = "FBVStatusPreloadTask.kt", l = {44}, m = "invokeSuspend")
public final class C1916230zxt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FBVStatusPreloadTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1916230zxt(FBVStatusPreloadTask fBVStatusPreloadTask, InterfaceC1364105Vn<? super C1916230zxt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fBVStatusPreloadTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1916230zxt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        Object objLJI = obj;
        C1C7U.LIZ("FBVStatusPreloadTask@24da.run$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
            if (iGatekeeperService != null) {
                eligibilityModelLIZ = iGatekeeperService.LIZ("fbv_info_access");
            } else {
                eligibilityModelLIZ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FBVStatusPreloadTask run eligibleData: ");
            sbLIZ.append(eligibilityModelLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C1915100zw4.LIZ(eligibilityModelLIZ).LIZ) {
                C1916250zxv c1916250zxv = (C1916250zxv) this.LLILLJJLI.LL.getValue();
                if (!c1916250zxv.LIZIZ().contains(c1916250zxv.LIZIZ)) {
                    C1518520pcQ c1518520pcQ = (C1518520pcQ) this.LLILLJJLI.LLILLJJLI.getValue();
                    this.LL = 1;
                    c1518520pcQ.getClass();
                    objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1518540pcS(c1518520pcQ, null));
                    if (objLJI == objLJFF) {
                        C1C7U.LIZIZ("FBVStatusPreloadTask@24da.run$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FBVStatusPreloadTask@24da.run$1");
            return unit;
        }
        FBVCheckResponse fBVCheckResponse = (FBVCheckResponse) objLJI;
        if (fBVCheckResponse != null) {
            FBVStatusPreloadTask fBVStatusPreloadTask = this.LLILLJJLI;
            if (fBVCheckResponse.status == 0) {
                if (fBVStatusPreloadTask.LLILZ.getValue() != null) {
                    EnumC683800Qry enumC683800Qry = EnumC683800Qry.DATA_BIO_FBV;
                    if (C1915720zx4.LIZ(enumC683800Qry.getKey(), null) == EnumC1876780ywG.NOTDETERMINED) {
                        C793770VBv.LJII("fbv_consent_migration", new JSONObject(C2097908Jt.LIZJ(new Pair("from", "fbv_preload_task"))), null, null);
                        if (fBVStatusPreloadTask.LLILZ.getValue() != null) {
                            C1915720zx4.LJIIIIZZ(null, "migrate_existing_record", Collections.singletonList(new C1876860ywO(enumC683800Qry.getKey(), EnumC1876780ywG.APPROVE, "migrate_existing_record", null, null, null, 120)));
                        }
                    }
                }
                C1916250zxv c1916250zxv2 = (C1916250zxv) fBVStatusPreloadTask.LL.getValue();
                c1916250zxv2.LIZIZ().storeBoolean(c1916250zxv2.LIZIZ, true);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FBVStatusPreloadTask@24da.run$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

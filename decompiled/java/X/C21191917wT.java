package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.ab.ECRegionSyncSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.ECRegionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.ECRegionService$updateRegionInfo$1$2", f = "ECRegionService.kt", l = {}, m = "invokeSuspend")
public final class C21191917wT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC21192017wU LL;
    public final /* synthetic */ ECRegionService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21191917wT(EnumC21192017wU enumC21192017wU, ECRegionService eCRegionService, String str, String str2, InterfaceC1364105Vn<? super C21191917wT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC21192017wU;
        this.LLILLJJLI = eCRegionService;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21191917wT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ECRegionService@b529.updateRegionInfo$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC21192017wU enumC21192017wU = this.LL;
        if (enumC21192017wU != EnumC21192017wU.ROOM && enumC21192017wU != EnumC21192017wU.ECOM_API) {
            z = false;
        } else {
            z = true;
        }
        C21191817wS c21191817wS = C21191817wS.LIZ;
        this.LLILLJJLI.getClass();
        String strLJII = ECRegionService.LJII();
        String strLIZJ = this.LLILLJJLI.LIZJ(Boolean.valueOf(z));
        ECRegionService eCRegionService = this.LLILLJJLI;
        String str = eCRegionService.LIZIZ;
        String str2 = eCRegionService.LIZJ;
        String str3 = eCRegionService.LIZ;
        int i = eCRegionService.LJ;
        String str4 = this.LLILLL;
        String str5 = this.LLILZ;
        c21191817wS.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("local_code_region", strLJII);
            jSONObject.put("manager_code_region", strLIZJ);
            jSONObject.put("api_route_region", str);
            jSONObject.put("api_code_region", str2);
            jSONObject.put("region_from", str3);
            jSONObject.put("request_id", str4);
            jSONObject.put("update_count", i);
            jSONObject.put("api_path", str5);
            jSONObject.put("region_update_type", ECRegionSyncSettings.LIZ.regionUpdateType);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_region_update", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECRegionService@b529.updateRegionInfo$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

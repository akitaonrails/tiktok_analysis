package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.changeregion.model.StoreRegionResponseData;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionDep;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.manager.ChangeRegionManager$Companion$resetStoreRegion$2", f = "ChangeRegionManager.kt", l = {}, m = "invokeSuspend")
public final class C1703550uQr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1703550uQr(InterfaceC1364105Vn<? super C1703550uQr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703550uQr(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeRegionManager$Companion@fb5f.resetStoreRegion$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Gson gson = C1703500uQm.LIZ;
        IPNSChangeRegionDep iPNSChangeRegionDep = (IPNSChangeRegionDep) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionDep.class, false, false, false, 14, null);
        if (iPNSChangeRegionDep != null) {
            iPNSChangeRegionDep.LJI();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0XH0.LIZLLL().LIZIZ("/passport/app/store_region/", Collections.emptyMap(), new C0XH7<C846060XGy>() { // from class: X.0uR6
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                int i;
                JSONObject jSONObject;
                boolean z;
                String str;
                C846060XGy c846060XGy = (C846060XGy) c0xga;
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("isSuccess", "1");
                pairArr[1] = new Pair("service", "/passport/app/store_region/");
                if (c846060XGy != null) {
                    i = c846060XGy.LIZLLL;
                } else {
                    i = 0;
                }
                pairArr[2] = new Pair("code", String.valueOf(i));
                pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                interfaceC1519030pdFLIZJ.LIZ("compliance_api_status", C2097608Jq.LJIIIIZZ(pairArr));
                String str2 = null;
                if (c846060XGy != null) {
                    jSONObject = c846060XGy.LJIILJJIL;
                } else {
                    jSONObject = null;
                }
                IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                if (iPNSChangeRegionService != null) {
                    Gson gson2 = C1703500uQm.LIZ;
                    StoreRegionResponseData storeRegionResponseData = (StoreRegionResponseData) GsonProtectorUtils.fromJson(gson2, String.valueOf(jSONObject), StoreRegionResponseData.class);
                    if (storeRegionResponseData != null) {
                        str = storeRegionResponseData.storeRegion;
                    } else {
                        str = null;
                    }
                    StoreRegionResponseData storeRegionResponseData2 = (StoreRegionResponseData) GsonProtectorUtils.fromJson(gson2, String.valueOf(jSONObject), StoreRegionResponseData.class);
                    if (storeRegionResponseData2 != null) {
                        str2 = storeRegionResponseData2.countryName;
                    }
                    iPNSChangeRegionService.LJIIIZ(0, str, str2, "passport_api");
                }
                try {
                    StoreRegionResponseData storeRegionResponseData3 = (StoreRegionResponseData) C1703500uQm.LIZ.LJII(String.valueOf(jSONObject), StoreRegionResponseData.class);
                    if (storeRegionResponseData3 != null) {
                        z = storeRegionResponseData3.enabledRegionOption;
                    } else {
                        z = true;
                    }
                    C1703500uQm.LIZLLL = z;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Gson gson3 = C1703500uQm.LIZ;
                String strLIZIZ = C1703490uQl.LIZIZ();
                if (strLIZIZ != null && strLIZIZ.length() > 0) {
                    C100C.LIZ.LIZJ().LIZ("store_region_accuracy", C2097608Jq.LJIIIIZZ(new Pair("is_accurate", String.valueOf(u.LJIJI(C1703490uQl.LIZIZ(), C1703490uQl.LIZ(), true) ? 1 : 0)), new Pair("reg_region", String.valueOf(C1703490uQl.LIZIZ()))));
                }
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                Pair[] pairArr = new Pair[4];
                int i2 = 0;
                pairArr[0] = new Pair("isSuccess", CardStruct.IStatusCode.DEFAULT);
                pairArr[1] = new Pair("service", "/passport/app/store_region/");
                if (c0xga != null) {
                    i2 = c0xga.LIZLLL;
                }
                pairArr[2] = new Pair("code", String.valueOf(i2));
                pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                interfaceC1519030pdFLIZJ.LIZ("compliance_api_status", C2097608Jq.LJIIIIZZ(pairArr));
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeRegionManager$Companion@fb5f.resetStoreRegion$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1703550uQr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

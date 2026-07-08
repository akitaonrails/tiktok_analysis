package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0QUW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.service.EcomSearchServiceImpl$doEcSearchPreloadTaskInMall$1", f = "EcomSearchServiceImpl.kt", l = {839}, m = "invokeSuspend")
public final class C0QUW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0QUW(InterfaceC1364105Vn<? super C0QUW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QUW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        EcSearchSugResponse ecSearchSugResponse;
        C1C7U.LIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C671110QUb.LIZ.getClass();
            long j = C671110QUb.LIZ().requestDelayTime;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$1");
                return objLJFF;
            }
        }
        C0QUX.LIZ.getClass();
        if (((Number) C0BIY.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
            InterfaceC2188711AlJ interfaceC2188711AlJ = (InterfaceC2188711AlJ) C0QUX.LJFF.getValue();
            c2188561Al4.getClass();
            C2188561Al4.LJII(interfaceC2188711AlJ);
        }
        if (C0QUX.LIZLLL && !C0QUX.LIZJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            System.currentTimeMillis();
            String string = "";
            if (!C0QUX.LIZJ()) {
                string = ((Keva) C0QUX.LJ.getValue()).getString("ec_cache_response", "");
            }
            if (string.length() <= 0) {
                z3 = false;
            }
            if (z3) {
                try {
                    ecSearchSugResponse = (EcSearchSugResponse) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, EcSearchSugResponse.class);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    ecSearchSugResponse = null;
                }
                C0QUX.LIZIZ(ecSearchSugResponse);
            } else {
                C671110QUb.LIZ.getClass();
                int i2 = C671110QUb.LIZ().sugCacheWordCount;
                C0QTW.LIZ.getClass();
                ((InterfaceC668610QKl) C0QTW.LIZIZ.getValue()).LIZIZ(i2).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0QUY
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        EcSearchSugResponse ecSearchSugResponse2;
                        List<SearchSugEntity> list;
                        C1C7U.LIZ("ECSugTrieCacheManager@ea16.prepareSugCacheTire$1");
                        if (c15o7.LJIILJJIL()) {
                            String str = (String) c15o7.LJIIL();
                            if (!TextUtils.isEmpty(str)) {
                                System.currentTimeMillis();
                                C0QUX.LIZ.getClass();
                                Integer numValueOf = null;
                                try {
                                    ecSearchSugResponse2 = (EcSearchSugResponse) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, EcSearchSugResponse.class);
                                    if (ecSearchSugResponse2 != null && (!ecSearchSugResponse2.sugList.isEmpty())) {
                                        C1302050jzH.LIZ.getClass();
                                        long jLIZ = C1302050jzH.LIZ();
                                        C01GW c01gw = C0QUX.LJ;
                                        ((Keva) c01gw.getValue()).storeLong("ec_cache_time", System.currentTimeMillis());
                                        ((Keva) c01gw.getValue()).storeString("ec_cache_response", str);
                                        long jLIZJ = C1302080jzK.LIZJ(jLIZ);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("storeCost:");
                                        sbLIZ.append((Object) C19990113Jj.LJIJJ(jLIZJ));
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                } catch (JSONException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    ecSearchSugResponse2 = null;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("get cache from server:");
                                if (ecSearchSugResponse2 != null && (list = ecSearchSugResponse2.sugList) != null) {
                                    numValueOf = Integer.valueOf(list.size());
                                }
                                sbLIZ2.append(numValueOf);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                C0QUX.LIZIZ(ecSearchSugResponse2);
                            }
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ECSugTrieCacheManager@ea16.prepareSugCacheTire$1");
                        return unit;
                    }
                });
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0QUW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

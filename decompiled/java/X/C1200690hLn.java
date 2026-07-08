package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimMapAssem;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.view.PoiClaimMapAssem$recoverMarkerAndPoiFromCache$1", f = "PoiClaimMapAssem.kt", l = {}, m = "invokeSuspend")
public final class C1200690hLn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiClaimMapAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200690hLn(PoiClaimMapAssem poiClaimMapAssem, InterfaceC1364105Vn<? super C1200690hLn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiClaimMapAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1200690hLn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        Double d;
        double dDoubleValue;
        String str4;
        Double d2;
        C1C7U.LIZ("PoiClaimMapAssem@161b.recoverMarkerAndPoiFromCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1200710hLp.LIZ.getClass();
            String string = C1200710hLp.LIZIZ.getString(C1200710hLp.LIZ(), "");
            C1227904rF.LIZ.getClass();
            Object obj2 = ((Map) C1227904rF.LIZLLL().LJIIIIZZ(string, new TypeToken<Map<String, Object>>() { // from class: X.0hLq
            }.getType())).get("poi_list_page");
            String str5 = null;
            if (C19719512Dh.LJII(obj2)) {
                Map map = (Map) obj2;
                if (map != null) {
                    try {
                        PoiClaimMapAssem poiClaimMapAssem = this.LL;
                        Object obj3 = map.get(FollowStatusChangeMethod.PARAM_UID);
                        if (obj3 instanceof String) {
                            str = (String) obj3;
                        } else {
                            str = null;
                        }
                        Object obj4 = map.get("name");
                        if (obj4 instanceof String) {
                            str2 = (String) obj4;
                        } else {
                            str2 = null;
                        }
                        Object obj5 = map.get("formatted_address");
                        if (obj5 instanceof String) {
                            str3 = (String) obj5;
                        } else {
                            str3 = null;
                        }
                        Object obj6 = map.get("longitude");
                        if (obj6 instanceof Double) {
                            d = (Double) obj6;
                        } else {
                            d = null;
                        }
                        double dDoubleValue2 = 0.0d;
                        if (d == null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = d.doubleValue();
                        }
                        Object obj7 = map.get("latitude");
                        if ((obj7 instanceof Double) && (d2 = (Double) obj7) != null) {
                            dDoubleValue2 = d2.doubleValue();
                        }
                        Object obj8 = map.get("category");
                        if (obj8 instanceof String) {
                            str4 = (String) obj8;
                        } else {
                            str4 = null;
                        }
                        Object obj9 = map.get("poi_title_img");
                        if (obj9 instanceof String) {
                            str5 = (String) obj9;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("{\"tt_type_name_tiny\": \"");
                        sbLIZ.append(str4);
                        sbLIZ.append("\"}");
                        PoiData poiData = new PoiData(null, str2, dDoubleValue2, dDoubleValue, null, null, null, null, null, null, str3, null, null, str, C2188811AlT.LIZIZ(sbLIZ), null, null, null, null, null, null, null, null, null, str5, null);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("recover poi=");
                        sbLIZ2.append(poiData);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        poiClaimMapAssem.LLJILJILJ = true;
                        poiClaimMapAssem.LLJILLL = str;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("recoverMarkerAndPoiFromCache, poiData=");
                        sbLIZ3.append(poiData);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        ((PoiClaimPoiListViewModel) poiClaimMapAssem.LLIZLLLIL.getValue()).setState(new AwS597S0100000_18(poiData, 926));
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("something was wrong when recoverMarkerAndPoiFromCache, e=");
                        sbLIZ4.append(e.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C1200770hLv.LIZ.LIZLLL("deserialization_poi_claim_cache", e.getMessage());
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiClaimMapAssem@161b.recoverMarkerAndPoiFromCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

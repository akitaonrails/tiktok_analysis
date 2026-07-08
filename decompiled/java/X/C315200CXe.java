package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.ecommerce.useract.UserActManagerNew$reportUserActionMetrics$1", f = "UserActManagerNew.kt", l = {}, m = "invokeSuspend")
public final class C315200CXe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315200CXe(String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C315200CXe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315200CXe(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C313600CRa c313600CRa;
        Map<String, Object> map;
        Map mapLJIIZILJ;
        Map linkedHashMap;
        C1C7U.LIZ("UserActManagerNew@7129.reportUserActionMetrics$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL;
        if (Intrinsics.LJFF(str2, "goods_view_action")) {
            C2232408os c2232408os = C341050DYp.LIZ;
            str = "search_goods_action";
        } else {
            if (Intrinsics.LJFF(str2, "live_view_action")) {
                C2232408os c2232408os2 = C341050DYp.LIZ;
                str = "search_live_action";
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UserActManagerNew@7129.reportUserActionMetrics$1");
            return unit;
        }
        String str3 = this.LL;
        String str4 = this.LLILLJJLI;
        Map<String, String> map2 = this.LLILLL;
        Map map3 = (Map) ((LinkedHashMap) C341050DYp.LJ).get(str3);
        if (map3 != null && (c313600CRa = (C313600CRa) map3.get(str4)) != null && (map = c313600CRa.LIZ) != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map)) != null) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : mapLJIIZILJ.entrySet()) {
                    if (!Intrinsics.LJFF(entry.getValue(), true) && !Intrinsics.LJFF(entry.getValue(), "true")) {
                        if (!Intrinsics.LJFF(entry.getValue(), false) && !Intrinsics.LJFF(entry.getValue(), "false")) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        } else {
                            jSONObject.put((String) entry.getKey(), CardStruct.IStatusCode.DEFAULT);
                        }
                    } else {
                        jSONObject.put((String) entry.getKey(), "1");
                    }
                }
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("user_id", C315220CXg.LIZ().getUserId());
                C1766860w4y.LIZ.getClass();
                String strLIZIZ = C1766860w4y.LIZIZ("ec_search_action");
                if (C123100dR.LIZ(strLIZIZ)) {
                    try {
                        linkedHashMap = (Map) C7740030o.LIZ().getGson().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, String>>() { // from class: X.0CXf
                        }.getType());
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        jSONObject.put((String) entry3.getKey(), entry3.getValue());
                    }
                    C1766860w4y.LIZ.getClass();
                    String strLIZIZ2 = C1766860w4y.LIZIZ("ec_search_enter_method");
                    if (C123100dR.LIZ(strLIZIZ2)) {
                        jSONObject.put("enter_method", strLIZIZ2);
                    }
                }
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1AF0.LIZJ("UserActManagerNew report error");
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UserActManagerNew@7129.reportUserActionMetrics$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.gecko.EcGeckoManager$reportLoadLynx$1", f = "EcGeckoManager.kt", l = {}, m = "invokeSuspend")
public final class C684610QtH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684610QtH(String str, Integer num, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C684610QtH(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        int i;
        long jLongValue;
        String string;
        HashMap<String, Integer> map;
        Type type;
        C1C7U.LIZ("EcGeckoManager@9460.reportLoadLynx$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String str = "";
            if (C682630Qq5.LIZLLL.isEmpty()) {
                if (C682630Qq5.LIZJ == null) {
                    C682630Qq5.LIZJ = Keva.getRepo("ecom_gecko_keva_repo");
                }
                Keva keva = C682630Qq5.LIZJ;
                if (keva != null) {
                    string = keva.getString("is_first_launch_app", "");
                } else {
                    string = null;
                }
                if (C123100dR.LIZ(string)) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            C13JX c13jx = KTypeProjection.LIZJ;
                            C13JW c13jwLJII = C13LE.LJII(String.class);
                            c13jx.getClass();
                            type = C2371409Qy.LIZJ(C13LE.LJI(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Integer.TYPE))));
                        } else {
                            type = new TypeToken<HashMap<String, Integer>>() { // from class: X.0QtI
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                        if (!(objLJIIIIZZ instanceof HashMap)) {
                            objLJIIIIZZ = null;
                        }
                        map = (HashMap) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    C682630Qq5.LIZLLL = map;
                }
            }
            if (Intrinsics.LJFF(this.LL, C682630Qq5.LIZIZ)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EcGeckoManager@9460.reportLoadLynx$1");
                return unit;
            }
            C682630Qq5.LIZIZ = this.LL;
            Uri uri = UriProtector.parse(this.LLILLJJLI);
            String strLIZIZ = C1942307jB.LIZIZ(uri, "surl");
            if (strLIZIZ == null || strLIZIZ.length() == 0) {
                String strLIZIZ2 = C1942307jB.LIZIZ(uri, "url");
                if (strLIZIZ2 != null) {
                    str = strLIZIZ2;
                }
                strLIZIZ = str;
            }
            try {
                strLIZIZ = URLDecoder.decode(strLIZIZ, StandardCharsets.UTF_8.name());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "null_channel";
            C1533720q0w.LIZ.getClass();
            C1533510q0b c1533510q0bLIZLLL = C1533720q0w.LIZLLL(strLIZIZ, null, true);
            if (c1533510q0bLIZLLL != null) {
                c259800zU.element = c1533510q0bLIZLLL.LIZIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) c259800zU.element);
            sbLIZ.append('_');
            sbLIZ.append(this.LLILLL);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
            HashMap<String, Integer> map2 = C682630Qq5.LIZ;
            Integer num = map2.get(strLIZIZ3);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            Integer num2 = C682630Qq5.LIZLLL.get(c259800zU.element);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 1;
            }
            Long lLIZLLL = C1550610qSB.LIZLLL(C1553670qX7.LIZ(), (String) c259800zU.element);
            if (lLIZLLL != null) {
                i = 1;
            } else {
                i = 0;
            }
            map2.put(strLIZIZ3, C2286608xc.LJ(0));
            if (iIntValue2 == 1) {
                C682630Qq5.LIZLLL.put((String) c259800zU.element, C2286608xc.LJ(0));
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(C682630Qq5.LIZLLL);
                Keva keva2 = C682630Qq5.LIZJ;
                if (keva2 != null) {
                    keva2.storeString("is_first_launch_app", strLJIIIIZZ);
                }
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            String str2 = this.LLILLJJLI;
            Integer num3 = this.LLILLL;
            jSONObject.put("step", "load_lynx");
            jSONObject.put("schema", str2);
            jSONObject.put("channel", c259800zU.element);
            if (num3 != null) {
                jSONObject.put("root_enter_from_type", num3.intValue());
            }
            jSONObject.put("is_hit_offline_gecko", i);
            jSONObject.put("is_first_load_in_launch", iIntValue);
            jSONObject.put("is_first_load_in_download", iIntValue2);
            if (lLIZLLL != null) {
                jLongValue = lLIZLLL.longValue();
            } else {
                jLongValue = -1;
            }
            jSONObject.put("inner_latest_channel_version", jLongValue);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_gecko", jSONObject);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            Unit.LIZ.getClass();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcGeckoManager@9460.reportLoadLynx$1");
        return unit2;
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.047w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10478047w {
    public static C10481047z LIZ;
    public static C10394044q LIZIZ = new C10394044q(0, 0, 0);
    public static C10480047y LIZJ = new C10480047y(null, null, null, 63);
    public static final Keva LIZLLL;

    static {
        HashMap map;
        Type type;
        Keva repo = Keva.getRepo("app_level_algorithm_metrics");
        LIZLLL = repo;
        String string = repo.getString("pdp_cache_date", "");
        String str = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault()).format(new Date());
        if (!Intrinsics.LJFF(string, str)) {
            repo.storeString("pdp_cache_date", str);
            repo.storeInt("pdp_daily_pv", 0);
            repo.storeString("pdp_daily_visits", C1741890vQh.LJIIIIZZ(new HashMap()));
        }
        int i = repo.getInt("pdp_daily_pv", 0);
        String string2 = repo.getString("pdp_daily_visits", "");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<HashMap<String, Integer>>() { // from class: X.047x
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Integer.TYPE))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string2, type);
            if (!(objFromJson instanceof HashMap)) {
                objFromJson = null;
            }
            map = (HashMap) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (map == null) {
            map = new HashMap();
        }
        LIZ = new C10481047z(i, map);
    }

    public static String LIZ(List list, C0NL6 c0nl6) {
        Object next;
        Integer numValueOf;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = ((NextRequestScene) next).sceneKey;
                if (c0nl6 != null) {
                    numValueOf = Integer.valueOf(c0nl6.getValue());
                } else {
                    numValueOf = null;
                }
                if (Intrinsics.LJFF(num, numValueOf)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NextRequestScene nextRequestScene = (NextRequestScene) next;
        if (nextRequestScene == null) {
            return null;
        }
        return nextRequestScene.sceneValue;
    }
}

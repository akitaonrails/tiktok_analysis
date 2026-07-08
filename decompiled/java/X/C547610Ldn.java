package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaCache;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ldn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547610Ldn {
    public static final C547610Ldn LIZ = new C547610Ldn();
    public static final Keva LIZIZ = Keva.getRepo("AIGC_NEW_QUOTA_MANAGER");
    public static final Gson LIZJ = new Gson();
    public static final Map<Source, QuotaRequestParam> LIZLLL = new LinkedHashMap();
    public static final Map<Source, QuotaCache> LJ = new LinkedHashMap();
    public static final MutableLiveData<QuotaCache> LJFF = new MutableLiveData<>();
    public static String LJI = "";

    static {
        LIZJ();
    }

    public static void LIZJ() {
        try {
            Keva keva = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("USER_CACHE_KEY_");
            sbLIZ.append(LIZ());
            Object objLJIIIIZZ = null;
            String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            if (string == null || string.length() == 0) {
                return;
            }
            Type type = new TypeToken<Map<Source, ? extends QuotaCache>>() { // from class: X.0Ldq
            }.getType();
            Gson gson = LIZJ;
            if (string != null && string.length() != 0) {
                try {
                    objLJIIIIZZ = gson.LJIIIIZZ(string, type);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Map map = (Map) objLJIIIIZZ;
            if (map != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) LJ;
                linkedHashMap.clear();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    C547610Ldn c547610Ldn = LIZ;
                    QuotaCache quotaCache = (QuotaCache) entry.getValue();
                    c547610Ldn.getClass();
                    if (!LIZIZ(quotaCache)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZLLL() {
        try {
            Keva keva = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("USER_CACHE_KEY_");
            sbLIZ.append(LIZ());
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ), LIZJ.LJIILL(LJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LIZ() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        if (!Intrinsics.LJFF(LJI, currentUserID)) {
            LJI = currentUserID;
            C19719612Di.LJJIII(((LinkedHashMap) LJ).entrySet(), AFwS239S0000000_8.get$arr$(318), true);
            LIZJ();
        }
        return LJI;
    }

    public static boolean LIZIZ(QuotaCache quotaCache) {
        if (quotaCache.tsp != null && (!C1387310mCn.LJFF(r0.longValue()))) {
            return true;
        }
        return false;
    }
}

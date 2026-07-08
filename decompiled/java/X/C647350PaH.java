package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.config.LynxCardsCacheConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647350PaH {
    public static final Keva LIZ = KevaImpl.getRepo("search_lynx_cards_cache", 1);

    public static List LIZ(String str) {
        boolean z;
        C13BV c13bv = C13BV.INSTANCE;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return c13bv;
        }
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search_lynx_cards_schema");
        sbLIZ.append(str);
        String stringJustDisk = keva.getStringJustDisk(C2188811AlT.LIZIZ(sbLIZ), "");
        if (!TextUtils.isEmpty(stringJustDisk)) {
            try {
                return a0.LJJLIIIJILLIZJL(stringJustDisk, new String[]{"__"}, 0, 6);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c13bv;
    }

    public static List LIZIZ(String str) {
        if (LIZJ(str)) {
            C647420PaO.LIZ.getClass();
            if (((LynxCardsCacheConfig) C647420PaO.LIZJ.getValue()).enableCacheData) {
                try {
                    Keva keva = LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("search_lynx_cards_rawdata_commondata");
                    C647500PaW.LIZ.getClass();
                    sbLIZ.append(C647500PaW.LJIIJ(str, false));
                    return a0.LJJLIIIJILLIZJL(keva.getStringJustDisk(C2188811AlT.LIZIZ(sbLIZ), null), new String[]{"__search_lynx_jsonstring_separator__"}, 0, 6);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public static boolean LIZJ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        C647420PaO.LIZ.getClass();
        C01GW c01gw = C647420PaO.LIZJ;
        if (!((LynxCardsCacheConfig) c01gw.getValue()).enable) {
            return false;
        }
        return ((LynxCardsCacheConfig) c01gw.getValue()).cacheCardWhiteList.contains(C649470Pdh.LJ(str));
    }

    public static void LIZLLL(List list, Map map) {
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (entry.getValue() != null && C19719512Dh.LJII(entry.getValue())) {
                LIZLLL(list, C19719512Dh.LIZJ(entry.getValue()));
            } else if (list.contains(entry.getKey())) {
                it2.remove();
            }
        }
    }
}

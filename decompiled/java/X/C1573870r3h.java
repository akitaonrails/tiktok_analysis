package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.ss.android.ugc.aweme.service.MiniDramaRouterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573870r3h {
    public static final C1573870r3h LIZ = new C1573870r3h();

    public static void LIZLLL(String str, Map map) {
        Unit unit;
        Set setEntrySet;
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            HashMap map2 = new HashMap();
            MiniDramaHostService.LIZ.getClass();
            MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
            if (miniDramaHostServiceLIZ != null) {
                miniDramaHostServiceLIZ.LIZ();
            }
            if (map != null && (setEntrySet = map.entrySet()) != null) {
                ArrayList<Map.Entry> arrayList = new ArrayList();
                for (Object obj : setEntrySet) {
                    if (((Map.Entry) obj).getValue() != null) {
                        arrayList.add(obj);
                    }
                }
                for (Map.Entry entry : arrayList) {
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        map2.put(entry.getKey(), value);
                    } else {
                        builderBuildUpon.appendQueryParameter((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            MiniDramaRouterService.LIZ.getClass();
            MiniDramaRouterService miniDramaRouterServiceLIZ = C1573900r3k.LIZ();
            if (miniDramaRouterServiceLIZ != null) {
                miniDramaRouterServiceLIZ.LIZIZ(builderBuildUpon.build().toString(), map2);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(String str, Long l, Long l2, Boolean bool, Map map, boolean z, String str2, boolean z2) {
        String strLIZIZ;
        LinkedHashMap linkedHashMap;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://paidcontent/innerfeed?enter_from=");
            sbLIZ.append(str);
            if (str2.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("&enter_method=");
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = "";
            }
            sbLIZ.append(strLIZIZ);
            Uri.Builder builderBuildUpon = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon();
            if (l != null) {
                builderBuildUpon.appendQueryParameter("collection_id", String.valueOf(l.longValue()));
            }
            if (l2 != null) {
                builderBuildUpon.appendQueryParameter("category", String.valueOf(l2.longValue()));
            }
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put("is_limited_free", Boolean.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE)));
            linkedHashMap.put("is_from_innerfeed_discover", Boolean.valueOf(z));
            if (z2) {
                linkedHashMap.put("is_from_series_cover", "1");
            }
            LIZLLL(builderBuildUpon.build().toString(), linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(C1573870r3h c1573870r3h, String str, Long l, SeriesCategory seriesCategory, Boolean bool, Map map, boolean z, String str2, boolean z2, int i) {
        long j;
        boolean z3 = z2;
        Boolean bool2 = bool;
        String str3 = str2;
        Long l2 = l;
        boolean z4 = z;
        String str4 = str;
        if ((i & 2) != 0) {
            str4 = "homepage_series";
        }
        Map map2 = null;
        if ((i & 4) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) == 0) {
            map2 = map;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        if ((i & 128) != 0) {
            str3 = "";
        }
        if ((i & 256) != 0) {
            z3 = false;
        }
        c1573870r3h.getClass();
        if (seriesCategory == SeriesCategory.MINI_DRAMA) {
            j = 1;
        } else {
            j = 0;
        }
        LIZ(str4, l2, Long.valueOf(j), bool2, map2, z4, str3, z3);
    }
}

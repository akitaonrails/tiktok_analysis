package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfigExtra;
import java.util.HashMap;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ssc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643880ssc {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static final HashMap<String, FilterConfig> LIZIZ = new HashMap<>();
    public static Gson LIZJ = new Gson();

    public static final FilterConfig LIZ(FilterBean filterBean) {
        boolean z;
        FilterConfigExtra filterConfigExtra;
        String str;
        HashMap<String, FilterConfig> map = LIZIZ;
        FilterConfig filterConfig = map.get(filterBean.getId());
        if (filterConfig != null) {
            return filterConfig;
        }
        String extra = filterBean.getExtra();
        if (extra != null && !a0.LJJJIL(extra)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            if (LIZJ == null) {
                LIZJ = new Gson();
            }
            Gson gson = LIZJ;
            if (gson == null || (filterConfigExtra = (FilterConfigExtra) gson.LJII(extra, FilterConfigExtra.class)) == null || (str = filterConfigExtra.filterconfig) == null) {
                return null;
            }
            FilterConfig filterConfig2 = (FilterConfig) gson.LJII(str, FilterConfig.class);
            map.put(filterBean.getId(), filterConfig2);
            return filterConfig2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String LIZJ(FilterBean filterBean) {
        List<FilterConfig.FilterConfigItem> list;
        FilterConfig filterConfigLIZ = LIZ(filterBean);
        if (filterConfigLIZ != null && (list = filterConfigLIZ.items) != null && (!list.isEmpty())) {
            return ((FilterConfig.FilterConfigItem) ListProtector.get(list, 0)).tag;
        }
        return "Filter_intensity";
    }

    public static final float LIZLLL(FilterBean filterBean) {
        List<FilterConfig.FilterConfigItem> list;
        FilterConfig.FilterConfigItem filterConfigItem;
        int i;
        FilterConfig filterConfigLIZ = LIZ(filterBean);
        if (filterConfigLIZ == null || (list = filterConfigLIZ.items) == null || (filterConfigItem = (FilterConfig.FilterConfigItem) C13LP.LJJJLL(list)) == null || (i = filterConfigItem.max - filterConfigItem.min) == 0) {
            return 0.0f;
        }
        return filterConfigItem.value / i;
    }

    public static final boolean LJ(FilterBean filterBean) {
        HashMap<String, Boolean> map = LIZ;
        Boolean bool = map.get(filterBean.getId());
        if (bool != null) {
            return bool.booleanValue();
        }
        String filterFolder = filterBean.getFilterFolder();
        if (filterFolder == null) {
            return false;
        }
        try {
            C0VSP c0vsp = new C0VSP(new C0VSJ(filterFolder, "config.json"));
            Throwable th = null;
            try {
                boolean zHas = new JSONObject(C2286708xd.LJIILJJIL(c0vsp)).has("effect");
                map.put(filterBean.getId(), Boolean.valueOf(zHas));
                C2107108Nh.LIZ(c0vsp, null);
                return zHas;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final String LIZIZ(FilterBean filterBean, float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(filterBean.getFilterFolder());
        sbLIZ.append(':');
        sbLIZ.append(LIZJ(filterBean));
        sbLIZ.append(':');
        sbLIZ.append(f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

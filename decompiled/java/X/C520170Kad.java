package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ConfigTransToRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520170Kad {
    public static final PageFinder LIZ(Context context) {
        Unit unit;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!C07MW.LIZ()) {
            return PageFinder.via(context);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(context);
        if (abstractC1387200mCcLIZJ != null) {
            if (abstractC1387200mCcLIZJ instanceof C1397950mTx) {
                return PageFinder.via(((C1397950mTx) abstractC1387200mCcLIZJ).LIZLLL);
            }
            if (abstractC1387200mCcLIZJ instanceof C1844400y62) {
                return PageFinder.via((Fragment) ((C1844400y62) abstractC1387200mCcLIZJ).LIZLLL);
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
        return PageFinder.via(context);
    }

    public static final Map LIZIZ(List list, Map map) {
        boolean z;
        Object next;
        String str;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((ConfigTransToRequest) next).keyInPageParams, key)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ConfigTransToRequest configTransToRequest = (ConfigTransToRequest) next;
                if (configTransToRequest != null && (str = configTransToRequest.keyToRequest) != null) {
                    linkedHashMap.put(str, value);
                }
            }
        }
        return linkedHashMap;
    }
}

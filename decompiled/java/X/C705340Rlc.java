package X;

import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Rlc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705340Rlc {
    public final Map<String, List<AbstractC705350Rld>> LIZ = new LinkedHashMap();
    public final Map<String, FcpTemplateActionGroup> LIZIZ = new LinkedHashMap();

    public final void LIZ(String str) {
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((AbstractC705350Rld) it2.next()).LIZJ();
            }
        }
    }

    public final void LIZIZ(String str) {
        List<AbstractC705350Rld> list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list != null) {
            for (AbstractC705350Rld abstractC705350Rld : list) {
                abstractC705350Rld.LJI();
                abstractC705350Rld.LIZLLL();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final boolean onTimingSignal(C2038007yc c2038007yc) {
        Map<String, FcpTemplateActionGroup> map = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            List<String> list = ((FcpTemplateActionGroup) entry.getValue()).timings;
            if (list != null && !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        List<String> list2 = c2038007yc.LIZ;
                        if (list2 != null && list2.contains(next)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            break;
                        }
                    }
                }
            }
        }
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            LIZIZ((String) ((Map.Entry) it3.next()).getKey());
        }
        return !linkedHashMap.isEmpty();
    }
}

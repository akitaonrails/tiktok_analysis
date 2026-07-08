package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256400yw {
    public static final Map<String, WeakReference<PdpViewModel>> LIZ = new LinkedHashMap();

    public static void LIZ() {
        Iterator it2 = ((LinkedHashMap) LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            if (((Reference) ((Map.Entry) it2.next()).getValue()).get() == null) {
                it2.remove();
            }
        }
    }
}

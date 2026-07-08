package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256300yv {
    public static final Map<String, WeakReference<SeaPdpViewModel>> LIZ = new LinkedHashMap();

    public static void LIZ() {
        Iterator it2 = ((LinkedHashMap) LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            if (((Reference) ((Map.Entry) it2.next()).getValue()).get() == null) {
                it2.remove();
            }
        }
    }
}

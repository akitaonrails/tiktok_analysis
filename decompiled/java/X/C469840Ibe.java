package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ibe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469840Ibe {
    public static final List<Dialog> LIZ = new ArrayList();
    public static final Map<Long, List<DialogFragment>> LIZIZ = new LinkedHashMap();

    public static final void LIZ(long j) {
        Iterator it2;
        Iterator it3 = ((ArrayList) LIZ).iterator();
        while (it3.hasNext()) {
            C500260Jjc.LJJLIIIJL((Dialog) it3.next());
        }
        ((ArrayList) LIZ).clear();
        List list = (List) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j));
        if (list != null && (it2 = list.iterator()) != null) {
            while (it2.hasNext()) {
                try {
                    ((DialogFragment) it2.next()).dismiss();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        List list2 = (List) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j));
        if (list2 != null) {
            list2.clear();
        }
    }
}

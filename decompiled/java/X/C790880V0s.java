package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0V0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790880V0s {
    public static void LIZ(Fragment fragment) {
        String name;
        ArrayList arrayList;
        List<String> list = ViewOnAttachStateChangeListenerC790870V0r.LLIZLLLIL;
        synchronized (list) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C19EG activity = fragment.getActivity();
                if (activity != null) {
                    name = activity.getClass().getName();
                } else {
                    name = null;
                }
                sbLIZ.append(name);
                sbLIZ.append('@');
                sbLIZ.append(fragment.getClass().getName());
                ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
                arrayList = new ArrayList(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String str = C813160Vv8.LIZ;
        C813160Vv8.LIZ(arrayList.toString());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ViewOnAttachStateChangeListenerC790870V0r.LLIZ;
        if (concurrentHashMap.size() > 15) {
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (((ViewOnAttachStateChangeListenerC790870V0r) entry.getValue()).LL.get() == null) {
                    List<String> list2 = ViewOnAttachStateChangeListenerC790870V0r.LLIZLLLIL;
                    synchronized (list2) {
                        try {
                            ((ArrayList) list2).remove(((ViewOnAttachStateChangeListenerC790870V0r) entry.getValue()).LLILLJJLI);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    it2.remove();
                }
            }
        }
    }

    public static ViewOnAttachStateChangeListenerC790870V0r LIZIZ(Fragment fragment) {
        return (ViewOnAttachStateChangeListenerC790870V0r) ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC790870V0r.LLIZ).get(Integer.valueOf(fragment.hashCode()));
    }
}

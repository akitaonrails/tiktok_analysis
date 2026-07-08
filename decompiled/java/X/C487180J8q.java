package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0J8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487180J8q implements FluencyOpt {
    public static volatile int LIZIZ;
    public static volatile int LIZJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C487190J8r());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C487210J8t());
    public static final C01GW LJ = C452501pT.LIZIZ(new C487200J8s());

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
    }

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZ.getValue();
    }

    public static boolean LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (TextUtils.equals(str, "homepage_hot")) {
            if (LIZIZ == 0) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(str, "homepage_follow") && LIZJ == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ().get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return (View) C19719612Di.LJJIJ(copyOnWriteArrayList);
        }
        return null;
    }

    public static void LIZ(Runnable runnable, String str) {
        if (str != null && str.length() != 0) {
            if (TextUtils.equals(str, "homepage_hot")) {
                if (LIZIZ == 0) {
                    runnable.run();
                    return;
                } else {
                    ((LinkedList) LIZLLL.getValue()).addLast(runnable);
                    return;
                }
            }
            if (!TextUtils.equals(str, "homepage_follow")) {
                return;
            }
            if (LIZJ == 0) {
                runnable.run();
            } else {
                ((LinkedList) LJ.getValue()).addLast(runnable);
            }
        }
    }
}

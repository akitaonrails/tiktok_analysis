package X;

import android.view.View;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0kCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310450kCp {
    public final ConcurrentHashMap<String, WeakReference<View>> LIZ = new ConcurrentHashMap<>();
    public final WeakHashMap<LynxUI, C1313370kHX> LIZIZ = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, C1313370kHX> LIZJ = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, C1313370kHX> LIZLLL = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, C1313370kHX> LJ = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, String> LJFF = new WeakHashMap<>();
    public volatile boolean LJI = true;

    public static void LIZ(Map map, LynxView lynxView) {
        Iterator it2 = ((WeakHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ((Map.Entry) it2.next()).getKey();
            if (lynxBaseUI != null && lynxBaseUI.mContext.LLJILJILJ.LL == lynxView) {
                it2.remove();
            }
        }
    }
}

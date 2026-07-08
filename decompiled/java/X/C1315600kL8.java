package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315600kL8 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(114));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(112));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(113));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(111));

    public static void LIZ(ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl) {
        try {
            View view = viewOnAttachStateChangeListenerC1521210pgl.LL.get();
            if (view != null && (view instanceof LynxView)) {
                LynxView lynxView = (LynxView) view;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] strArr = {"open_time", "container_init_start", "container_init_end", "prepare_template_start", "prepare_template_end"};
                int i = 0;
                do {
                    String str = strArr[i];
                    Object obj = ((LinkedHashMap) viewOnAttachStateChangeListenerC1521210pgl.LLILZ).get(str);
                    if (obj instanceof Number) {
                        linkedHashMap.put(str, Long.valueOf(((Number) obj).longValue()));
                    }
                    i++;
                } while (i < 5);
                lynxView.setExtraTiming(linkedHashMap);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0jwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300290jwR {
    public final ArrayList<JavaOnlyMap> LIZ = new ArrayList<>();
    public final Set<String> LIZIZ = new HashSet();

    public static String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "style_update" : "update" : "detach" : "remove" : "insert";
    }

    public final void LIZ(int i, LynxBaseUI lynxBaseUI, String str) {
        if (lynxBaseUI != null && !LIZIZ(i).isEmpty()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putInt("target", lynxBaseUI.getSign());
            javaOnlyMap.putString("action", LIZIZ(i));
            javaOnlyMap.putString("a11y-id", lynxBaseUI.mAccessibilityId);
            if (i == 4) {
                if (!((HashSet) this.LIZIZ).contains(str)) {
                    return;
                } else {
                    javaOnlyMap.putString("style", str);
                }
            }
            this.LIZ.add(javaOnlyMap);
        }
    }
}

package X;

import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0R0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0Y {
    public final LynxBaseUI LIZ;
    public final Set<String> LIZIZ;

    public C0R0Y(LynxBaseUI lynxBaseUI, Set<String> set) {
        this.LIZ = lynxBaseUI;
        this.LIZIZ = set;
    }

    public static void LIZ(C0R0Y c0r0y, String str, Map map) {
        LynxBaseUI lynxBaseUI = c0r0y.LIZ;
        C1298720jtu c1298720jtu = lynxBaseUI.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(lynxBaseUI.getSign(), str);
        for (Map.Entry entry : map.entrySet()) {
            c1289960jfm.LIZIZ(entry.getValue(), (String) entry.getKey());
        }
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.sdui.components.list.a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.0kNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1317300kNs implements Runnable {
    public final WeakReference<C1317310kNt> LL;

    public final void LIZ() {
        C1314690kJf c1314690kJf;
        Map<String, C1297940jse> map;
        C1317310kNt c1317310kNt = this.LL.get();
        if (c1317310kNt == null) {
            return;
        }
        c1317310kNt.LIZJ = null;
        int i = a.LLLZLZ;
        while (c1317310kNt.LIZLLL.size() > 0) {
            C1317320kNu c1317320kNuRemoveFirst = c1317310kNt.LIZLLL.removeFirst();
            if (C1317310kNt.LIZLLL(c1317320kNuRemoveFirst)) {
                for (C1317320kNu c1317320kNu : c1317310kNt.LIZLLL) {
                    String str = c1317320kNuRemoveFirst.LIZLLL;
                    if (str != null || c1317320kNu.LIZLLL != null) {
                        if (TextUtils.equals(str, c1317320kNu.LIZLLL)) {
                            c1317310kNt.LIZLLL.remove(c1317320kNu);
                            break;
                        }
                    } else {
                        if (c1317320kNuRemoveFirst.LIZJ == c1317320kNu.LIZJ) {
                            c1317310kNt.LIZLLL.remove(c1317320kNu);
                            break;
                            break;
                        }
                    }
                }
                for (C1317320kNu c1317320kNu2 : c1317310kNt.LJ) {
                    String str2 = c1317320kNuRemoveFirst.LIZLLL;
                    if (str2 != null || c1317320kNu2.LIZLLL != null) {
                        if (TextUtils.equals(str2, c1317320kNu2.LIZLLL)) {
                            c1317310kNt.LJ.remove(c1317320kNu2);
                            break;
                        }
                    } else {
                        if (c1317320kNuRemoveFirst.LIZJ == c1317320kNu2.LIZJ) {
                            c1317310kNt.LJ.remove(c1317320kNu2);
                            break;
                        }
                    }
                }
                if (C1317310kNt.LIZLLL(c1317320kNuRemoveFirst) && (c1314690kJf = c1317320kNuRemoveFirst.LIZ.LL.LLILLJJLI) != null && (map = c1314690kJf.LLJIJIL) != null && map.containsKey(c1317320kNuRemoveFirst.LIZIZ)) {
                    if (C1317310kNt.LIZLLL(c1317320kNuRemoveFirst)) {
                        int i2 = a.LLLZLZ;
                        C1314730kJj c1314730kJj = new C1314730kJj(c1317320kNuRemoveFirst.LJ, c1317320kNuRemoveFirst.LIZIZ);
                        c1314730kJj.LIZJ(Integer.valueOf(c1317320kNuRemoveFirst.LIZJ), "position");
                        c1314730kJj.LIZJ(c1317320kNuRemoveFirst.LIZLLL, "key");
                        c1317310kNt.LIZ.LIZJ(c1314730kJj);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sendNodeEvent no valid");
                        sbLIZ.append(c1317320kNuRemoveFirst.LIZIZ);
                        sbLIZ.append("  ");
                        sbLIZ.append(c1317320kNuRemoveFirst.LIZJ);
                        sbLIZ.append(" ");
                        sbLIZ.append(c1317320kNuRemoveFirst.LIZLLL);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
        }
        c1317310kNt.LIZLLL = c1317310kNt.LJ;
        c1317310kNt.LJ = new LinkedList<>();
        if (c1317310kNt.LIZLLL.size() > 0) {
            c1317310kNt.LIZJ();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AppearEventCourierImpl$Callback@23d4.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppearEventCourierImpl$Callback@23d4.run");
    }

    public RunnableC1317300kNs(C1317310kNt c1317310kNt) {
        this.LL = new WeakReference<>(c1317310kNt);
    }
}

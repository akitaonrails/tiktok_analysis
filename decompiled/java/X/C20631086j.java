package X;

import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.086j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20631086j {
    public final Map<Long, String> LIZ = new HashMap();
    public final Map<Integer, String> LIZIZ = new HashMap();
    public final List<String> LIZJ = new ArrayList();
    public final Map<Long, Long> LIZLLL = new HashMap();

    public final String LIZ(long j) {
        return (String) ((HashMap) this.LIZ).get(Long.valueOf(j));
    }

    public final long LIZIZ(String str) {
        if (str != null && !str.isEmpty()) {
            Iterator it2 = ((HashMap) this.LIZ).keySet().iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Long) it2.next()).longValue();
                if (TextUtils.equals(str, (String) ((HashMap) this.LIZ).get(Long.valueOf(jLongValue)))) {
                    return jLongValue;
                }
            }
        }
        return 0L;
    }

    public final void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        ((HashMap) this.LIZ).clear();
        ((HashMap) this.LIZIZ).clear();
        ((ArrayList) this.LIZJ).clear();
        ((HashMap) this.LIZLLL).clear();
    }

    public final void LIZLLL(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveInteractId -> interactIdStr = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.LIZ).put(Long.valueOf(j), str);
        }
    }

    public final void LJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveMicPostion ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = 1;
        if (i == 0) {
            i = 1;
        }
        if (((HashMap) this.LIZIZ).containsKey(Integer.valueOf(i))) {
            C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", "saveMicPosition contains key");
            while (true) {
                if (!((HashMap) this.LIZIZ).containsKey(Integer.valueOf(i2))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("saveMicPosition contains key update to ");
                    sbLIZ2.append(i2);
                    C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ2));
                    ((HashMap) this.LIZIZ).put(Integer.valueOf(i2), str);
                    break;
                }
                i2++;
                if (i2 > 3) {
                    break;
                }
            }
        } else {
            ((HashMap) this.LIZIZ).put(Integer.valueOf(i), str);
        }
        ((ArrayList) this.LIZJ).add(str);
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        int i3 = 2;
        do {
            if (i3 < stackTrace.length) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("logPositionMap trace");
                sbLIZ3.append(i3);
                sbLIZ3.append(stackTrace[i3].getClassName());
                sbLIZ3.append(" ");
                sbLIZ3.append(stackTrace[i3].getMethodName());
                C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ3));
            }
            i3++;
        } while (i3 < 6);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("fixPositionToInteractIdMap: ");
        sbLIZ4.append(this.LIZIZ);
        C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("nonFixPositionToInteractIdList: ");
        sbLIZ5.append(this.LIZJ);
        C20441214yg.LIZIZ("InteractALog_UserInteractIdDataHolder", C2188811AlT.LIZIZ(sbLIZ5));
    }
}

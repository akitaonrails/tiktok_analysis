package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10WF, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public enum C10WF {
    PASS(0),
    US_FTC(1),
    EU_EEA(2);

    public static final C10WI Companion = new Object() { // from class: X.10WI
    };
    public static final Map<Integer, C10WF> MAP;
    public final int LL;

    public static C10WF valueOf(String str) {
        return (C10WF) C08FF.LIZ(C10WF.class, str);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.10WI] */
    static {
        C10WF[] c10wfArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c10wfArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C10WF c10wf : c10wfArrValues) {
            linkedHashMap.put(Integer.valueOf(c10wf.LL), c10wf);
        }
        MAP = linkedHashMap;
    }

    public final int getValue() {
        return this.LL;
    }

    C10WF(int i) {
        this.LL = i;
    }
}

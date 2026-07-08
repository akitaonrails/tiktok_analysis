package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.0WDK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WDK {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    public final int LL;

    static {
        C0WDK c0wdk = DEFAULT;
        C0WDK c0wdk2 = UNMETERED_ONLY;
        C0WDK c0wdk3 = UNMETERED_OR_DAILY;
        C0WDK c0wdk4 = FAST_IF_RADIO_AWAKE;
        C0WDK c0wdk5 = NEVER;
        C0WDK c0wdk6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, c0wdk);
        sparseArray.put(1, c0wdk2);
        sparseArray.put(2, c0wdk3);
        sparseArray.put(3, c0wdk4);
        sparseArray.put(4, c0wdk5);
        sparseArray.put(-1, c0wdk6);
    }

    public final int getNumber() {
        return this.LL;
    }

    public static C0WDK forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public static C0WDK valueOf(String str) {
        return (C0WDK) C08FF.LIZ(C0WDK.class, str);
    }

    C0WDK(int i) {
        this.LL = i;
    }
}

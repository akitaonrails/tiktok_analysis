package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.14PE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14PE {
    FLEX_START,
    CENTER,
    FLEX_END,
    SPACE_BETWEEN,
    SPACE_AROUND,
    SPACE_EVENLY,
    STRETCH,
    START,
    END;

    public static final C14Q2 Companion = new Object() { // from class: X.14Q2
    };

    public static C14PE valueOf(String str) {
        return (C14PE) C08FF.LIZ(C14PE.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C14PF.LIZ[ordinal()]) {
            case 1:
                return "flex-start";
            case 2:
                return "center";
            case 3:
                return "flex-end";
            case 4:
                return "space-between";
            case 5:
                return "space-around";
            case 6:
                return "space-evenly";
            case 7:
                return "stretch";
            case 8:
                return "start";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "end";
            default:
                throw new C1954807lC();
        }
    }
}

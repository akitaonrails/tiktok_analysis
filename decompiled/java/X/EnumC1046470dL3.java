package X;

/* JADX INFO: renamed from: X.0dL3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1046470dL3 {
    VIEWABLE_1S(1),
    VIEWABLE_2S(2),
    VIEWABLE_6S(4),
    VIEWABLE_15S(8);

    public final int LL;

    public static EnumC1046470dL3 valueOf(String str) {
        return (EnumC1046470dL3) C08FF.LIZ(EnumC1046470dL3.class, str);
    }

    public final long getDuration() {
        int i = C1046490dL5.LIZ[ordinal()];
        if (i == 1) {
            return 1000L;
        }
        if (i == 2) {
            return 2000L;
        }
        if (i == 3) {
            return 6000L;
        }
        if (i == 4) {
            return 15000L;
        }
        throw new C1954807lC();
    }

    public final String getLabel() {
        int i = C1046490dL5.LIZ[ordinal()];
        if (i == 1) {
            return "1s";
        }
        if (i == 2) {
            return "2s";
        }
        if (i == 3) {
            return "6s";
        }
        if (i == 4) {
            return "15s";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC1046470dL3(int i) {
        this.LL = i;
    }
}

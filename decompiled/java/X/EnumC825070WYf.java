package X;

/* JADX INFO: renamed from: X.0WYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC825070WYf {
    ORIGIN(0),
    FILE_PATH(1);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC825070WYf fromValue(int i) {
        EnumC825070WYf enumC825070WYf = ORIGIN;
        if (i == enumC825070WYf.getValue()) {
            return enumC825070WYf;
        }
        EnumC825070WYf enumC825070WYf2 = FILE_PATH;
        if (i == enumC825070WYf2.getValue()) {
            return enumC825070WYf2;
        }
        return null;
    }

    public static EnumC825070WYf valueOf(String str) {
        return (EnumC825070WYf) C08FF.LIZ(EnumC825070WYf.class, str);
    }

    EnumC825070WYf(int i) {
        this.LL = i;
    }
}

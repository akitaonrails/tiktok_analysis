package X;

/* JADX INFO: renamed from: X.0jIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1275390jIH {
    ASR_TASK_MODE_DEFAULT(0),
    ASR_TASK_MODE_AI_EXPLANATION(1);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1275390jIH fromValue(int i) {
        for (EnumC1275390jIH enumC1275390jIH : values()) {
            if (enumC1275390jIH.getValue() == i) {
                return enumC1275390jIH;
            }
        }
        return ASR_TASK_MODE_DEFAULT;
    }

    public static EnumC1275390jIH valueOf(String str) {
        return (EnumC1275390jIH) C08FF.LIZ(EnumC1275390jIH.class, str);
    }

    EnumC1275390jIH(int i) {
        this.LL = i;
    }
}

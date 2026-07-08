package X;

/* JADX INFO: renamed from: X.0jDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1272290jDH {
    ROI_SWITCH_REASON_DEFAULT(0),
    ROI_SWITCH_REASON_SERVER_CONFIG(1),
    ROI_SWITCH_REASON_HARDWARE_SUPPORT(2),
    ROI_SWITCH_REASON_SCENE_AVAILABLE(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1272290jDH valueOf(String str) {
        return (EnumC1272290jDH) C08FF.LIZ(EnumC1272290jDH.class, str);
    }

    EnumC1272290jDH(int i) {
        this.LL = i;
    }
}

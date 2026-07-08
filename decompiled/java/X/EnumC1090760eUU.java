package X;

/* JADX INFO: renamed from: X.0eUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public enum EnumC1090760eUU {
    UNKNOWN("unknown"),
    ANCHOR_CLOSED("gift_disable_anchor"),
    SPECIAL_ACCOUNT("special_account"),
    GIFT_FEATURE_DOES_NOT_SUPPORT("country_disable"),
    AGE_GATE("l1_anchor");

    public final String description;

    public String getDescription() {
        return this.description;
    }

    public static EnumC1090760eUU parseEnum(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        return null;
    }

    public static EnumC1090760eUU valueOf(String str) {
        return (EnumC1090760eUU) C08FF.LIZ(EnumC1090760eUU.class, str);
    }

    EnumC1090760eUU(String str) {
        this.description = str;
    }
}

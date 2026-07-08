package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC570120MXq {
    public static final EnumC570120MXq CAROUSEL;
    public static final EnumC570120MXq CUSTOM_STYLE;
    public static final EnumC570120MXq CUSTOM_STYLE_REC;
    public static final EnumC570120MXq FOLLOW_ANCHOR;
    public static final /* synthetic */ EnumC570120MXq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC570120MXq TWO_COLUMN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC570120MXq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC570120MXq enumC570120MXq = new EnumC570120MXq("CAROUSEL", 0, "carousel");
        CAROUSEL = enumC570120MXq;
        EnumC570120MXq enumC570120MXq2 = new EnumC570120MXq("TWO_COLUMN", 1, "two_column");
        TWO_COLUMN = enumC570120MXq2;
        EnumC570120MXq enumC570120MXq3 = new EnumC570120MXq("FOLLOW_ANCHOR", 2, "follow_anchor");
        FOLLOW_ANCHOR = enumC570120MXq3;
        EnumC570120MXq enumC570120MXq4 = new EnumC570120MXq("CUSTOM_STYLE", 3, "custom_style");
        CUSTOM_STYLE = enumC570120MXq4;
        EnumC570120MXq enumC570120MXq5 = new EnumC570120MXq("CUSTOM_STYLE_REC", 4, "custom_style_rec");
        CUSTOM_STYLE_REC = enumC570120MXq5;
        EnumC570120MXq[] enumC570120MXqArr = {enumC570120MXq, enumC570120MXq2, enumC570120MXq3, enumC570120MXq4, enumC570120MXq5};
        LLILLJJLI = enumC570120MXqArr;
        LLILLL = new C2254308sP(enumC570120MXqArr);
    }

    public static EnumC570120MXq[] values() {
        return (EnumC570120MXq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC570120MXq valueOf(String str) {
        return (EnumC570120MXq) C08FF.LIZ(EnumC570120MXq.class, str);
    }

    public EnumC570120MXq(String str, int i, String str2) {
        this.LL = str2;
    }
}

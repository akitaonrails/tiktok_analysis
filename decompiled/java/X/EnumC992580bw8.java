package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992580bw8 {
    public static final EnumC992580bw8 AUTO_CUT_CHANGE_TITLE_CONTENT;
    public static final EnumC992580bw8 AUTO_CUT_CHANGE_TITLE_FONT;
    public static final EnumC992580bw8 AUTO_CUT_CHANGE_TITLE_LOCATION;
    public static final EnumC992580bw8 AUTO_CUT_CHANGE_TITLE_NONE;
    public static final /* synthetic */ EnumC992580bw8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992580bw8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992580bw8 enumC992580bw8 = new EnumC992580bw8("AUTO_CUT_CHANGE_TITLE_NONE", 0, 0);
        AUTO_CUT_CHANGE_TITLE_NONE = enumC992580bw8;
        EnumC992580bw8 enumC992580bw82 = new EnumC992580bw8("AUTO_CUT_CHANGE_TITLE_CONTENT", 1, 1);
        AUTO_CUT_CHANGE_TITLE_CONTENT = enumC992580bw82;
        EnumC992580bw8 enumC992580bw83 = new EnumC992580bw8("AUTO_CUT_CHANGE_TITLE_LOCATION", 2, 2);
        AUTO_CUT_CHANGE_TITLE_LOCATION = enumC992580bw83;
        EnumC992580bw8 enumC992580bw84 = new EnumC992580bw8("AUTO_CUT_CHANGE_TITLE_FONT", 3, 3);
        AUTO_CUT_CHANGE_TITLE_FONT = enumC992580bw84;
        EnumC992580bw8[] enumC992580bw8Arr = {enumC992580bw8, enumC992580bw82, enumC992580bw83, enumC992580bw84};
        LLILLJJLI = enumC992580bw8Arr;
        LLILLL = new C2254308sP(enumC992580bw8Arr);
    }

    public static EnumC992580bw8[] values() {
        return (EnumC992580bw8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992580bw8 valueOf(String str) {
        return (EnumC992580bw8) C08FF.LIZ(EnumC992580bw8.class, str);
    }

    public EnumC992580bw8(String str, int i, int i2) {
        this.LL = i2;
    }
}

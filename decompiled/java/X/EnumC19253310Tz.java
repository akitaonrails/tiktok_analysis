package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19253310Tz {
    public static final EnumC19253310Tz ENTER_PAGE;
    public static final /* synthetic */ EnumC19253310Tz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19253310Tz NONE;
    public static final EnumC19253310Tz SWITCH_PAGE;

    public static InterfaceC2044707zh<EnumC19253310Tz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19253310Tz enumC19253310Tz = new EnumC19253310Tz("ENTER_PAGE", 0);
        ENTER_PAGE = enumC19253310Tz;
        EnumC19253310Tz enumC19253310Tz2 = new EnumC19253310Tz("SWITCH_PAGE", 1);
        SWITCH_PAGE = enumC19253310Tz2;
        EnumC19253310Tz enumC19253310Tz3 = new EnumC19253310Tz("NONE", 2);
        NONE = enumC19253310Tz3;
        EnumC19253310Tz[] enumC19253310TzArr = {enumC19253310Tz, enumC19253310Tz2, enumC19253310Tz3};
        LL = enumC19253310TzArr;
        LLILLJJLI = new C2254308sP(enumC19253310TzArr);
    }

    public static EnumC19253310Tz[] values() {
        return (EnumC19253310Tz[]) LL.clone();
    }

    public static EnumC19253310Tz valueOf(String str) {
        return (EnumC19253310Tz) C08FF.LIZ(EnumC19253310Tz.class, str);
    }

    public EnumC19253310Tz(String str, int i) {
    }
}

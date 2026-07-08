package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19367810pw {
    public static final EnumC19367810pw AUTO_START_TYPE;
    public static final EnumC19367810pw JUST_EDIT_TYPE;
    public static final /* synthetic */ EnumC19367810pw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19367810pw NORMAL_TYPE;
    public static final EnumC19367810pw UNKNOWN_TYPE;

    public static InterfaceC2044707zh<EnumC19367810pw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19367810pw enumC19367810pw = new EnumC19367810pw("UNKNOWN_TYPE", 0);
        UNKNOWN_TYPE = enumC19367810pw;
        EnumC19367810pw enumC19367810pw2 = new EnumC19367810pw("NORMAL_TYPE", 1);
        NORMAL_TYPE = enumC19367810pw2;
        EnumC19367810pw enumC19367810pw3 = new EnumC19367810pw("AUTO_START_TYPE", 2);
        AUTO_START_TYPE = enumC19367810pw3;
        EnumC19367810pw enumC19367810pw4 = new EnumC19367810pw("JUST_EDIT_TYPE", 3);
        JUST_EDIT_TYPE = enumC19367810pw4;
        EnumC19367810pw[] enumC19367810pwArr = {enumC19367810pw, enumC19367810pw2, enumC19367810pw3, enumC19367810pw4};
        LL = enumC19367810pwArr;
        LLILLJJLI = new C2254308sP(enumC19367810pwArr);
    }

    public static EnumC19367810pw[] values() {
        return (EnumC19367810pw[]) LL.clone();
    }

    public static EnumC19367810pw valueOf(String str) {
        return (EnumC19367810pw) C08FF.LIZ(EnumC19367810pw.class, str);
    }

    public EnumC19367810pw(String str, int i) {
    }
}

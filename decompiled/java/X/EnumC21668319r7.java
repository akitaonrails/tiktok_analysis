package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21668319r7 {
    public static final EnumC21668319r7 ERROR;
    public static final EnumC21668319r7 FANS_CLUB;
    public static final /* synthetic */ EnumC21668319r7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21668319r7 LOADING;
    public static final EnumC21668319r7 SUPER_FAN;
    public static final EnumC21668319r7 UNKNOWN;

    public static InterfaceC2044707zh<EnumC21668319r7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21668319r7 enumC21668319r7 = new EnumC21668319r7("FANS_CLUB", 0);
        FANS_CLUB = enumC21668319r7;
        EnumC21668319r7 enumC21668319r72 = new EnumC21668319r7("SUPER_FAN", 1);
        SUPER_FAN = enumC21668319r72;
        EnumC21668319r7 enumC21668319r73 = new EnumC21668319r7("LOADING", 2);
        LOADING = enumC21668319r73;
        EnumC21668319r7 enumC21668319r74 = new EnumC21668319r7("ERROR", 3);
        ERROR = enumC21668319r74;
        EnumC21668319r7 enumC21668319r75 = new EnumC21668319r7("UNKNOWN", 4);
        UNKNOWN = enumC21668319r75;
        EnumC21668319r7[] enumC21668319r7Arr = {enumC21668319r7, enumC21668319r72, enumC21668319r73, enumC21668319r74, enumC21668319r75};
        LL = enumC21668319r7Arr;
        LLILLJJLI = new C2254308sP(enumC21668319r7Arr);
    }

    public static EnumC21668319r7[] values() {
        return (EnumC21668319r7[]) LL.clone();
    }

    public static EnumC21668319r7 valueOf(String str) {
        return (EnumC21668319r7) C08FF.LIZ(EnumC21668319r7.class, str);
    }

    public EnumC21668319r7(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994430bz7 {
    public static final EnumC994430bz7 HIDE;
    public static final /* synthetic */ EnumC994430bz7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994430bz7 SHOW_DIAMOND;
    public static final EnumC994430bz7 SHOW_RECORD;

    public static InterfaceC2044707zh<EnumC994430bz7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994430bz7 enumC994430bz7 = new EnumC994430bz7("HIDE", 0);
        HIDE = enumC994430bz7;
        EnumC994430bz7 enumC994430bz72 = new EnumC994430bz7("SHOW_RECORD", 1);
        SHOW_RECORD = enumC994430bz72;
        EnumC994430bz7 enumC994430bz73 = new EnumC994430bz7("SHOW_DIAMOND", 2);
        SHOW_DIAMOND = enumC994430bz73;
        EnumC994430bz7[] enumC994430bz7Arr = {enumC994430bz7, enumC994430bz72, enumC994430bz73};
        LL = enumC994430bz7Arr;
        LLILLJJLI = new C2254308sP(enumC994430bz7Arr);
    }

    public static EnumC994430bz7[] values() {
        return (EnumC994430bz7[]) LL.clone();
    }

    public static EnumC994430bz7 valueOf(String str) {
        return (EnumC994430bz7) C08FF.LIZ(EnumC994430bz7.class, str);
    }

    public EnumC994430bz7(String str, int i) {
    }
}

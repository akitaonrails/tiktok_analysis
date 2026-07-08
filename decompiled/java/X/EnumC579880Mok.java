package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC579880Mok {
    public static final EnumC579880Mok INIT;
    public static final /* synthetic */ EnumC579880Mok[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC579880Mok ON_DOWN;
    public static final EnumC579880Mok ON_UP;

    public static InterfaceC2044707zh<EnumC579880Mok> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC579880Mok enumC579880Mok = new EnumC579880Mok("INIT", 0);
        INIT = enumC579880Mok;
        EnumC579880Mok enumC579880Mok2 = new EnumC579880Mok("ON_DOWN", 1);
        ON_DOWN = enumC579880Mok2;
        EnumC579880Mok enumC579880Mok3 = new EnumC579880Mok("ON_UP", 2);
        ON_UP = enumC579880Mok3;
        EnumC579880Mok[] enumC579880MokArr = {enumC579880Mok, enumC579880Mok2, enumC579880Mok3};
        LL = enumC579880MokArr;
        LLILLJJLI = new C2254308sP(enumC579880MokArr);
    }

    public static EnumC579880Mok[] values() {
        return (EnumC579880Mok[]) LL.clone();
    }

    public static EnumC579880Mok valueOf(String str) {
        return (EnumC579880Mok) C08FF.LIZ(EnumC579880Mok.class, str);
    }

    public EnumC579880Mok(String str, int i) {
    }
}

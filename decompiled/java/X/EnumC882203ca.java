package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC882203ca {
    public static final EnumC882203ca CONFIRM;
    public static final EnumC882203ca CONTINUE;
    public static final /* synthetic */ EnumC882203ca[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC882203ca NEXT;
    public static final EnumC882203ca PAY_NOW;
    public static final EnumC882203ca SAVE;

    public static InterfaceC2044707zh<EnumC882203ca> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC882203ca enumC882203ca = new EnumC882203ca("NEXT", 0);
        NEXT = enumC882203ca;
        EnumC882203ca enumC882203ca2 = new EnumC882203ca("CONTINUE", 1);
        CONTINUE = enumC882203ca2;
        EnumC882203ca enumC882203ca3 = new EnumC882203ca("PAY_NOW", 2);
        PAY_NOW = enumC882203ca3;
        EnumC882203ca enumC882203ca4 = new EnumC882203ca("SAVE", 3);
        SAVE = enumC882203ca4;
        EnumC882203ca enumC882203ca5 = new EnumC882203ca("CONFIRM", 4);
        CONFIRM = enumC882203ca5;
        EnumC882203ca[] enumC882203caArr = {enumC882203ca, enumC882203ca2, enumC882203ca3, enumC882203ca4, enumC882203ca5};
        LL = enumC882203caArr;
        LLILLJJLI = new C2254308sP(enumC882203caArr);
    }

    public static EnumC882203ca[] values() {
        return (EnumC882203ca[]) LL.clone();
    }

    public static EnumC882203ca valueOf(String str) {
        return (EnumC882203ca) C08FF.LIZ(EnumC882203ca.class, str);
    }

    public EnumC882203ca(String str, int i) {
    }
}

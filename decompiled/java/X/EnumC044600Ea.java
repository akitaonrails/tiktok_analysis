package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC044600Ea {
    public static final EnumC044600Ea ERROR;
    public static final /* synthetic */ EnumC044600Ea[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC044600Ea SUCCESS;

    public static InterfaceC2044707zh<EnumC044600Ea> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC044600Ea enumC044600Ea = new EnumC044600Ea("SUCCESS", 0);
        SUCCESS = enumC044600Ea;
        EnumC044600Ea enumC044600Ea2 = new EnumC044600Ea("ERROR", 1);
        ERROR = enumC044600Ea2;
        EnumC044600Ea[] enumC044600EaArr = {enumC044600Ea, enumC044600Ea2};
        LL = enumC044600EaArr;
        LLILLJJLI = new C2254308sP(enumC044600EaArr);
    }

    public static EnumC044600Ea[] values() {
        return (EnumC044600Ea[]) LL.clone();
    }

    public static EnumC044600Ea valueOf(String str) {
        return (EnumC044600Ea) C08FF.LIZ(EnumC044600Ea.class, str);
    }

    public EnumC044600Ea(String str, int i) {
    }
}

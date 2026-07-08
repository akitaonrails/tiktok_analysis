package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1650720t3e {
    public static final EnumC1650720t3e ENTER_FROM_LONG_PRESS;
    public static final EnumC1650720t3e ENTER_FROM_SINGLE_CLICK;
    public static final /* synthetic */ EnumC1650720t3e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1650720t3e NONE_TYPE;

    public static InterfaceC2044707zh<EnumC1650720t3e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1650720t3e enumC1650720t3e = new EnumC1650720t3e("ENTER_FROM_LONG_PRESS", 0);
        ENTER_FROM_LONG_PRESS = enumC1650720t3e;
        EnumC1650720t3e enumC1650720t3e2 = new EnumC1650720t3e("ENTER_FROM_SINGLE_CLICK", 1);
        ENTER_FROM_SINGLE_CLICK = enumC1650720t3e2;
        EnumC1650720t3e enumC1650720t3e3 = new EnumC1650720t3e("NONE_TYPE", 2);
        NONE_TYPE = enumC1650720t3e3;
        EnumC1650720t3e[] enumC1650720t3eArr = {enumC1650720t3e, enumC1650720t3e2, enumC1650720t3e3};
        LL = enumC1650720t3eArr;
        LLILLJJLI = new C2254308sP(enumC1650720t3eArr);
    }

    public static EnumC1650720t3e[] values() {
        return (EnumC1650720t3e[]) LL.clone();
    }

    public static EnumC1650720t3e valueOf(String str) {
        return (EnumC1650720t3e) C08FF.LIZ(EnumC1650720t3e.class, str);
    }

    public EnumC1650720t3e(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1597050rf5 {
    public static final /* synthetic */ EnumC1597050rf5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1597050rf5 LOAD_MORE;
    public static final EnumC1597050rf5 REFRESH;

    public static InterfaceC2044707zh<EnumC1597050rf5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1597050rf5 enumC1597050rf5 = new EnumC1597050rf5("REFRESH", 0);
        REFRESH = enumC1597050rf5;
        EnumC1597050rf5 enumC1597050rf52 = new EnumC1597050rf5("LOAD_MORE", 1);
        LOAD_MORE = enumC1597050rf52;
        EnumC1597050rf5[] enumC1597050rf5Arr = {enumC1597050rf5, enumC1597050rf52};
        LL = enumC1597050rf5Arr;
        LLILLJJLI = new C2254308sP(enumC1597050rf5Arr);
    }

    public static EnumC1597050rf5[] values() {
        return (EnumC1597050rf5[]) LL.clone();
    }

    public static EnumC1597050rf5 valueOf(String str) {
        return (EnumC1597050rf5) C08FF.LIZ(EnumC1597050rf5.class, str);
    }

    public EnumC1597050rf5(String str, int i) {
    }
}

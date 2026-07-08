package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1224390hy1 {
    public static final EnumC1224390hy1 DISABLE;
    public static final /* synthetic */ EnumC1224390hy1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1224390hy1 MULTIPLE;
    public static final EnumC1224390hy1 SINGLE;

    public static InterfaceC2044707zh<EnumC1224390hy1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1224390hy1 enumC1224390hy1 = new EnumC1224390hy1("SINGLE", 0);
        SINGLE = enumC1224390hy1;
        EnumC1224390hy1 enumC1224390hy12 = new EnumC1224390hy1("MULTIPLE", 1);
        MULTIPLE = enumC1224390hy12;
        EnumC1224390hy1 enumC1224390hy13 = new EnumC1224390hy1("DISABLE", 2);
        DISABLE = enumC1224390hy13;
        EnumC1224390hy1[] enumC1224390hy1Arr = {enumC1224390hy1, enumC1224390hy12, enumC1224390hy13};
        LL = enumC1224390hy1Arr;
        LLILLJJLI = new C2254308sP(enumC1224390hy1Arr);
    }

    public static EnumC1224390hy1[] values() {
        return (EnumC1224390hy1[]) LL.clone();
    }

    public static EnumC1224390hy1 valueOf(String str) {
        return (EnumC1224390hy1) C08FF.LIZ(EnumC1224390hy1.class, str);
    }

    public EnumC1224390hy1(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c06, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995040c06 {
    public static final /* synthetic */ EnumC995040c06[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995040c06 RED;
    public static final EnumC995040c06 WHITE;

    public static InterfaceC2044707zh<EnumC995040c06> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995040c06 enumC995040c06 = new EnumC995040c06("RED", 0);
        RED = enumC995040c06;
        EnumC995040c06 enumC995040c062 = new EnumC995040c06("WHITE", 1);
        WHITE = enumC995040c062;
        EnumC995040c06[] enumC995040c06Arr = {enumC995040c06, enumC995040c062};
        LL = enumC995040c06Arr;
        LLILLJJLI = new C2254308sP(enumC995040c06Arr);
    }

    public static EnumC995040c06[] values() {
        return (EnumC995040c06[]) LL.clone();
    }

    public static EnumC995040c06 valueOf(String str) {
        return (EnumC995040c06) C08FF.LIZ(EnumC995040c06.class, str);
    }

    public EnumC995040c06(String str, int i) {
    }
}

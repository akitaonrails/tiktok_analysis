package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC923150a89 {
    public static final EnumC923150a89 FAILED;
    public static final /* synthetic */ EnumC923150a89[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC923150a89 NONE;
    public static final EnumC923150a89 SUCCEED;

    public static InterfaceC2044707zh<EnumC923150a89> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC923150a89 enumC923150a89 = new EnumC923150a89("NONE", 0);
        NONE = enumC923150a89;
        EnumC923150a89 enumC923150a892 = new EnumC923150a89("SUCCEED", 1);
        SUCCEED = enumC923150a892;
        EnumC923150a89 enumC923150a893 = new EnumC923150a89("FAILED", 2);
        FAILED = enumC923150a893;
        EnumC923150a89[] enumC923150a89Arr = {enumC923150a89, enumC923150a892, enumC923150a893};
        LL = enumC923150a89Arr;
        LLILLJJLI = new C2254308sP(enumC923150a89Arr);
    }

    public static EnumC923150a89[] values() {
        return (EnumC923150a89[]) LL.clone();
    }

    public static EnumC923150a89 valueOf(String str) {
        return (EnumC923150a89) C08FF.LIZ(EnumC923150a89.class, str);
    }

    public EnumC923150a89(String str, int i) {
    }
}

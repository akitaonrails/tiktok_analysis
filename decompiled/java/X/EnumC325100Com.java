package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Com, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC325100Com {
    public static final EnumC325100Com FAKE;
    public static final /* synthetic */ EnumC325100Com[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC325100Com NOT_AVAILABLE;
    public static final EnumC325100Com STRONG;
    public static final EnumC325100Com WEAK;

    public static InterfaceC2044707zh<EnumC325100Com> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC325100Com enumC325100Com = new EnumC325100Com("STRONG", 0);
        STRONG = enumC325100Com;
        EnumC325100Com enumC325100Com2 = new EnumC325100Com("WEAK", 1);
        WEAK = enumC325100Com2;
        EnumC325100Com enumC325100Com3 = new EnumC325100Com("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = enumC325100Com3;
        EnumC325100Com enumC325100Com4 = new EnumC325100Com("FAKE", 3);
        FAKE = enumC325100Com4;
        EnumC325100Com[] enumC325100ComArr = {enumC325100Com, enumC325100Com2, enumC325100Com3, enumC325100Com4};
        LL = enumC325100ComArr;
        LLILLJJLI = new C2254308sP(enumC325100ComArr);
    }

    public static EnumC325100Com[] values() {
        return (EnumC325100Com[]) LL.clone();
    }

    public static EnumC325100Com valueOf(String str) {
        return (EnumC325100Com) C08FF.LIZ(EnumC325100Com.class, str);
    }

    public EnumC325100Com(String str, int i) {
    }
}

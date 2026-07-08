package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1323320kXa {
    public static final EnumC1323320kXa FAKE;
    public static final /* synthetic */ EnumC1323320kXa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1323320kXa NOT_AVAILABLE;
    public static final EnumC1323320kXa STRONG;
    public static final EnumC1323320kXa WEAK;

    public static InterfaceC2044707zh<EnumC1323320kXa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1323320kXa enumC1323320kXa = new EnumC1323320kXa("STRONG", 0);
        STRONG = enumC1323320kXa;
        EnumC1323320kXa enumC1323320kXa2 = new EnumC1323320kXa("WEAK", 1);
        WEAK = enumC1323320kXa2;
        EnumC1323320kXa enumC1323320kXa3 = new EnumC1323320kXa("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = enumC1323320kXa3;
        EnumC1323320kXa enumC1323320kXa4 = new EnumC1323320kXa("FAKE", 3);
        FAKE = enumC1323320kXa4;
        EnumC1323320kXa[] enumC1323320kXaArr = {enumC1323320kXa, enumC1323320kXa2, enumC1323320kXa3, enumC1323320kXa4};
        LL = enumC1323320kXaArr;
        LLILLJJLI = new C2254308sP(enumC1323320kXaArr);
    }

    public static EnumC1323320kXa[] values() {
        return (EnumC1323320kXa[]) LL.clone();
    }

    public static EnumC1323320kXa valueOf(String str) {
        return (EnumC1323320kXa) C08FF.LIZ(EnumC1323320kXa.class, str);
    }

    public EnumC1323320kXa(String str, int i) {
    }
}

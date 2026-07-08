package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1692010u8F {
    public static final /* synthetic */ EnumC1692010u8F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1692010u8F Left;
    public static final EnumC1692010u8F Middle;
    public static final EnumC1692010u8F Right;

    public static InterfaceC2044707zh<EnumC1692010u8F> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1692010u8F valueOf(String str) {
        return (EnumC1692010u8F) C08FF.LIZ(EnumC1692010u8F.class, str);
    }

    public static EnumC1692010u8F[] values() {
        return (EnumC1692010u8F[]) LL.clone();
    }

    static {
        EnumC1692010u8F enumC1692010u8F = new EnumC1692010u8F("Left", 0);
        Left = enumC1692010u8F;
        EnumC1692010u8F enumC1692010u8F2 = new EnumC1692010u8F("Middle", 1);
        Middle = enumC1692010u8F2;
        EnumC1692010u8F enumC1692010u8F3 = new EnumC1692010u8F("Right", 2);
        Right = enumC1692010u8F3;
        EnumC1692010u8F[] enumC1692010u8FArr = {enumC1692010u8F, enumC1692010u8F2, enumC1692010u8F3};
        LL = enumC1692010u8FArr;
        LLILLJJLI = new C2254308sP(enumC1692010u8FArr);
    }

    public EnumC1692010u8F(String str, int i) {
    }
}

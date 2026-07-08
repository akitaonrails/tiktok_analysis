package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1420450n4F {
    public static final EnumC1420450n4F LL;
    public static final EnumC1420450n4F LLILLJJLI;
    public static final EnumC1420450n4F LLILLL;
    public static final /* synthetic */ EnumC1420450n4F[] LLILZ;

    static {
        EnumC1420450n4F enumC1420450n4F = new EnumC1420450n4F("RUNNING", 0);
        LL = enumC1420450n4F;
        EnumC1420450n4F enumC1420450n4F2 = new EnumC1420450n4F("SUCCESS", 1);
        LLILLJJLI = enumC1420450n4F2;
        EnumC1420450n4F enumC1420450n4F3 = new EnumC1420450n4F("FAIL", 2);
        LLILLL = enumC1420450n4F3;
        EnumC1420450n4F[] enumC1420450n4FArr = {enumC1420450n4F, enumC1420450n4F2, enumC1420450n4F3};
        LLILZ = enumC1420450n4FArr;
        new C2254308sP(enumC1420450n4FArr);
    }

    public static EnumC1420450n4F[] values() {
        return (EnumC1420450n4F[]) LLILZ.clone();
    }

    public static EnumC1420450n4F valueOf(String str) {
        return (EnumC1420450n4F) C08FF.LIZ(EnumC1420450n4F.class, str);
    }

    public EnumC1420450n4F(String str, int i) {
    }
}

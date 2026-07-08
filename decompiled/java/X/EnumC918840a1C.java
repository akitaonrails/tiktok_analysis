package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918840a1C {
    public static final EnumC918840a1C FAILED;
    public static final /* synthetic */ EnumC918840a1C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918840a1C PASSED;
    public static final EnumC918840a1C PENDING;

    public static InterfaceC2044707zh<EnumC918840a1C> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918840a1C enumC918840a1C = new EnumC918840a1C("PASSED", 0);
        PASSED = enumC918840a1C;
        EnumC918840a1C enumC918840a1C2 = new EnumC918840a1C("FAILED", 1);
        FAILED = enumC918840a1C2;
        EnumC918840a1C enumC918840a1C3 = new EnumC918840a1C("PENDING", 2);
        PENDING = enumC918840a1C3;
        EnumC918840a1C[] enumC918840a1CArr = {enumC918840a1C, enumC918840a1C2, enumC918840a1C3};
        LL = enumC918840a1CArr;
        LLILLJJLI = new C2254308sP(enumC918840a1CArr);
    }

    public static EnumC918840a1C[] values() {
        return (EnumC918840a1C[]) LL.clone();
    }

    public static EnumC918840a1C valueOf(String str) {
        return (EnumC918840a1C) C08FF.LIZ(EnumC918840a1C.class, str);
    }

    public EnumC918840a1C(String str, int i) {
    }
}

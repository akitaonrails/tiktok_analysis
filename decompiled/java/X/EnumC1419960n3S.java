package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1419960n3S {
    public static final EnumC1419960n3S CANCELED;
    public static final EnumC1419960n3S COMPRESSING;
    public static final EnumC1419960n3S FAILED;
    public static final /* synthetic */ EnumC1419960n3S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1419960n3S NONE;
    public static final EnumC1419960n3S SUCCESS;

    public static InterfaceC2044707zh<EnumC1419960n3S> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1419960n3S enumC1419960n3S = new EnumC1419960n3S("NONE", 0);
        NONE = enumC1419960n3S;
        EnumC1419960n3S enumC1419960n3S2 = new EnumC1419960n3S("COMPRESSING", 1);
        COMPRESSING = enumC1419960n3S2;
        EnumC1419960n3S enumC1419960n3S3 = new EnumC1419960n3S("SUCCESS", 2);
        SUCCESS = enumC1419960n3S3;
        EnumC1419960n3S enumC1419960n3S4 = new EnumC1419960n3S("FAILED", 3);
        FAILED = enumC1419960n3S4;
        EnumC1419960n3S enumC1419960n3S5 = new EnumC1419960n3S("CANCELED", 4);
        CANCELED = enumC1419960n3S5;
        EnumC1419960n3S[] enumC1419960n3SArr = {enumC1419960n3S, enumC1419960n3S2, enumC1419960n3S3, enumC1419960n3S4, enumC1419960n3S5};
        LL = enumC1419960n3SArr;
        LLILLJJLI = new C2254308sP(enumC1419960n3SArr);
    }

    public static EnumC1419960n3S[] values() {
        return (EnumC1419960n3S[]) LL.clone();
    }

    public static EnumC1419960n3S valueOf(String str) {
        return (EnumC1419960n3S) C08FF.LIZ(EnumC1419960n3S.class, str);
    }

    public EnumC1419960n3S(String str, int i) {
    }
}

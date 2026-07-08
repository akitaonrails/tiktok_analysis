package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1611990s3B {
    public static final EnumC1611990s3B LIMIT_EXCEEDED;
    public static final /* synthetic */ EnumC1611990s3B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1611990s3B NONE;
    public static final EnumC1611990s3B NOT_SAFE_SERIES;

    public static InterfaceC2044707zh<EnumC1611990s3B> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1611990s3B enumC1611990s3B = new EnumC1611990s3B("NONE", 0);
        NONE = enumC1611990s3B;
        EnumC1611990s3B enumC1611990s3B2 = new EnumC1611990s3B("NOT_SAFE_SERIES", 1);
        NOT_SAFE_SERIES = enumC1611990s3B2;
        EnumC1611990s3B enumC1611990s3B3 = new EnumC1611990s3B("LIMIT_EXCEEDED", 2);
        LIMIT_EXCEEDED = enumC1611990s3B3;
        EnumC1611990s3B[] enumC1611990s3BArr = {enumC1611990s3B, enumC1611990s3B2, enumC1611990s3B3};
        LL = enumC1611990s3BArr;
        LLILLJJLI = new C2254308sP(enumC1611990s3BArr);
    }

    public static EnumC1611990s3B[] values() {
        return (EnumC1611990s3B[]) LL.clone();
    }

    public static EnumC1611990s3B valueOf(String str) {
        return (EnumC1611990s3B) C08FF.LIZ(EnumC1611990s3B.class, str);
    }

    public EnumC1611990s3B(String str, int i) {
    }
}

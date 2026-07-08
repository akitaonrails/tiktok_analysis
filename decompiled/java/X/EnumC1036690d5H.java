package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1036690d5H {
    public static final /* synthetic */ EnumC1036690d5H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1036690d5H NORMAL;
    public static final EnumC1036690d5H REUSED;
    public static final EnumC1036690d5H REUSE_FIRST_LOAD;

    public static InterfaceC2044707zh<EnumC1036690d5H> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1036690d5H enumC1036690d5H = new EnumC1036690d5H("NORMAL", 0);
        NORMAL = enumC1036690d5H;
        EnumC1036690d5H enumC1036690d5H2 = new EnumC1036690d5H("REUSE_FIRST_LOAD", 1);
        REUSE_FIRST_LOAD = enumC1036690d5H2;
        EnumC1036690d5H enumC1036690d5H3 = new EnumC1036690d5H("REUSED", 2);
        REUSED = enumC1036690d5H3;
        EnumC1036690d5H[] enumC1036690d5HArr = {enumC1036690d5H, enumC1036690d5H2, enumC1036690d5H3};
        LL = enumC1036690d5HArr;
        LLILLJJLI = new C2254308sP(enumC1036690d5HArr);
    }

    public static EnumC1036690d5H[] values() {
        return (EnumC1036690d5H[]) LL.clone();
    }

    public static EnumC1036690d5H valueOf(String str) {
        return (EnumC1036690d5H) C08FF.LIZ(EnumC1036690d5H.class, str);
    }

    public EnumC1036690d5H(String str, int i) {
    }
}

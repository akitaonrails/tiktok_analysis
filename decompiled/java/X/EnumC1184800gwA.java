package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184800gwA {
    public static final EnumC1184800gwA BOTTOM_TITLE_NEW;
    public static final /* synthetic */ EnumC1184800gwA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1184800gwA MIDDLE_BLOCK_NEW;

    public static InterfaceC2044707zh<EnumC1184800gwA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1184800gwA enumC1184800gwA = new EnumC1184800gwA("BOTTOM_TITLE_NEW", 0);
        BOTTOM_TITLE_NEW = enumC1184800gwA;
        EnumC1184800gwA enumC1184800gwA2 = new EnumC1184800gwA("MIDDLE_BLOCK_NEW", 1);
        MIDDLE_BLOCK_NEW = enumC1184800gwA2;
        EnumC1184800gwA[] enumC1184800gwAArr = {enumC1184800gwA, enumC1184800gwA2};
        LL = enumC1184800gwAArr;
        LLILLJJLI = new C2254308sP(enumC1184800gwAArr);
    }

    public static EnumC1184800gwA[] values() {
        return (EnumC1184800gwA[]) LL.clone();
    }

    public static EnumC1184800gwA valueOf(String str) {
        return (EnumC1184800gwA) C08FF.LIZ(EnumC1184800gwA.class, str);
    }

    public EnumC1184800gwA(String str, int i) {
    }
}

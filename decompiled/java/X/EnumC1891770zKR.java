package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zKR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1891770zKR {
    public static final EnumC1891770zKR HAS_DATA;
    public static final /* synthetic */ EnumC1891770zKR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1891770zKR NO_DATA;
    public static final EnumC1891770zKR NULL;

    public static InterfaceC2044707zh<EnumC1891770zKR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1891770zKR enumC1891770zKR = new EnumC1891770zKR("HAS_DATA", 0);
        HAS_DATA = enumC1891770zKR;
        EnumC1891770zKR enumC1891770zKR2 = new EnumC1891770zKR("NO_DATA", 1);
        NO_DATA = enumC1891770zKR2;
        EnumC1891770zKR enumC1891770zKR3 = new EnumC1891770zKR("NULL", 2);
        NULL = enumC1891770zKR3;
        EnumC1891770zKR[] enumC1891770zKRArr = {enumC1891770zKR, enumC1891770zKR2, enumC1891770zKR3};
        LL = enumC1891770zKRArr;
        LLILLJJLI = new C2254308sP(enumC1891770zKRArr);
    }

    public static EnumC1891770zKR[] values() {
        return (EnumC1891770zKR[]) LL.clone();
    }

    public static EnumC1891770zKR valueOf(String str) {
        return (EnumC1891770zKR) C08FF.LIZ(EnumC1891770zKR.class, str);
    }

    public EnumC1891770zKR(String str, int i) {
    }
}

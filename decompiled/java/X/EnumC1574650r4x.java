package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1574650r4x {
    public static final EnumC1574650r4x CONSUMED;
    public static final EnumC1574650r4x EXPLICIT_INVALIDATE;
    public static final /* synthetic */ EnumC1574650r4x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1574650r4x LRU_EVICTED;

    public static InterfaceC2044707zh<EnumC1574650r4x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1574650r4x enumC1574650r4x = new EnumC1574650r4x("EXPLICIT_INVALIDATE", 0);
        EXPLICIT_INVALIDATE = enumC1574650r4x;
        EnumC1574650r4x enumC1574650r4x2 = new EnumC1574650r4x("LRU_EVICTED", 1);
        LRU_EVICTED = enumC1574650r4x2;
        EnumC1574650r4x enumC1574650r4x3 = new EnumC1574650r4x("CONSUMED", 2);
        CONSUMED = enumC1574650r4x3;
        EnumC1574650r4x[] enumC1574650r4xArr = {enumC1574650r4x, enumC1574650r4x2, enumC1574650r4x3};
        LL = enumC1574650r4xArr;
        LLILLJJLI = new C2254308sP(enumC1574650r4xArr);
    }

    public static EnumC1574650r4x[] values() {
        return (EnumC1574650r4x[]) LL.clone();
    }

    public static EnumC1574650r4x valueOf(String str) {
        return (EnumC1574650r4x) C08FF.LIZ(EnumC1574650r4x.class, str);
    }

    public EnumC1574650r4x(String str, int i) {
    }
}

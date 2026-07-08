package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC633580OtA {
    public static final EnumC633580OtA FAIL;
    public static final EnumC633580OtA FULL;
    public static final /* synthetic */ EnumC633580OtA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC633580OtA SUCCESS;

    public static InterfaceC2044707zh<EnumC633580OtA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC633580OtA enumC633580OtA = new EnumC633580OtA("SUCCESS", 0);
        SUCCESS = enumC633580OtA;
        EnumC633580OtA enumC633580OtA2 = new EnumC633580OtA("FAIL", 1);
        FAIL = enumC633580OtA2;
        EnumC633580OtA enumC633580OtA3 = new EnumC633580OtA("FULL", 2);
        FULL = enumC633580OtA3;
        EnumC633580OtA[] enumC633580OtAArr = {enumC633580OtA, enumC633580OtA2, enumC633580OtA3};
        LL = enumC633580OtAArr;
        LLILLJJLI = new C2254308sP(enumC633580OtAArr);
    }

    public static EnumC633580OtA[] values() {
        return (EnumC633580OtA[]) LL.clone();
    }

    public static EnumC633580OtA valueOf(String str) {
        return (EnumC633580OtA) C08FF.LIZ(EnumC633580OtA.class, str);
    }

    public EnumC633580OtA(String str, int i) {
    }
}

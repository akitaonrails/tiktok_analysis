package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783030wV3 {
    public static final EnumC1783030wV3 GC;
    public static final /* synthetic */ EnumC1783030wV3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783030wV3 SCHEDULED;

    public static InterfaceC2044707zh<EnumC1783030wV3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783030wV3 enumC1783030wV3 = new EnumC1783030wV3("GC", 0);
        GC = enumC1783030wV3;
        EnumC1783030wV3 enumC1783030wV32 = new EnumC1783030wV3("SCHEDULED", 1);
        SCHEDULED = enumC1783030wV32;
        EnumC1783030wV3[] enumC1783030wV3Arr = {enumC1783030wV3, enumC1783030wV32};
        LL = enumC1783030wV3Arr;
        LLILLJJLI = new C2254308sP(enumC1783030wV3Arr);
    }

    public static EnumC1783030wV3[] values() {
        return (EnumC1783030wV3[]) LL.clone();
    }

    public static EnumC1783030wV3 valueOf(String str) {
        return (EnumC1783030wV3) C08FF.LIZ(EnumC1783030wV3.class, str);
    }

    public EnumC1783030wV3(String str, int i) {
    }
}

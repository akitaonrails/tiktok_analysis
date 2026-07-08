package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05dA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1395405dA {
    public static final EnumC1395405dA Impulse;
    public static final /* synthetic */ EnumC1395405dA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1395405dA Lsq2;

    public static InterfaceC2044707zh<EnumC1395405dA> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1395405dA valueOf(String str) {
        return (EnumC1395405dA) C08FF.LIZ(EnumC1395405dA.class, str);
    }

    public static EnumC1395405dA[] values() {
        return (EnumC1395405dA[]) LL.clone();
    }

    static {
        EnumC1395405dA enumC1395405dA = new EnumC1395405dA("Lsq2", 0);
        Lsq2 = enumC1395405dA;
        EnumC1395405dA enumC1395405dA2 = new EnumC1395405dA("Impulse", 1);
        Impulse = enumC1395405dA2;
        EnumC1395405dA[] enumC1395405dAArr = {enumC1395405dA, enumC1395405dA2};
        LL = enumC1395405dAArr;
        LLILLJJLI = new C2254308sP(enumC1395405dAArr);
    }

    public EnumC1395405dA(String str, int i) {
    }
}

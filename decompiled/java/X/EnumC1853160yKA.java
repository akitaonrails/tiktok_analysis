package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yKA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1853160yKA {
    public static final EnumC1853160yKA DENIED;
    public static final EnumC1853160yKA FULL_GRANTED;
    public static final /* synthetic */ EnumC1853160yKA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1853160yKA PARTIAL_GRANTED;

    public static InterfaceC2044707zh<EnumC1853160yKA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1853160yKA enumC1853160yKA = new EnumC1853160yKA("FULL_GRANTED", 0);
        FULL_GRANTED = enumC1853160yKA;
        EnumC1853160yKA enumC1853160yKA2 = new EnumC1853160yKA("DENIED", 1);
        DENIED = enumC1853160yKA2;
        EnumC1853160yKA enumC1853160yKA3 = new EnumC1853160yKA("PARTIAL_GRANTED", 2);
        PARTIAL_GRANTED = enumC1853160yKA3;
        EnumC1853160yKA[] enumC1853160yKAArr = {enumC1853160yKA, enumC1853160yKA2, enumC1853160yKA3};
        LL = enumC1853160yKAArr;
        LLILLJJLI = new C2254308sP(enumC1853160yKAArr);
    }

    public static EnumC1853160yKA[] values() {
        return (EnumC1853160yKA[]) LL.clone();
    }

    public static EnumC1853160yKA valueOf(String str) {
        return (EnumC1853160yKA) C08FF.LIZ(EnumC1853160yKA.class, str);
    }

    public EnumC1853160yKA(String str, int i) {
    }
}

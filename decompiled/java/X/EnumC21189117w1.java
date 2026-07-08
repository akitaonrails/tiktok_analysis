package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21189117w1 {
    public static final /* synthetic */ EnumC21189117w1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21189117w1 SEA;
    public static final EnumC21189117w1 UNKNOWN;
    public static final EnumC21189117w1 US;

    public static InterfaceC2044707zh<EnumC21189117w1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21189117w1 enumC21189117w1 = new EnumC21189117w1("UNKNOWN", 0);
        UNKNOWN = enumC21189117w1;
        EnumC21189117w1 enumC21189117w12 = new EnumC21189117w1("SEA", 1);
        SEA = enumC21189117w12;
        EnumC21189117w1 enumC21189117w13 = new EnumC21189117w1("US", 2);
        US = enumC21189117w13;
        EnumC21189117w1[] enumC21189117w1Arr = {enumC21189117w1, enumC21189117w12, enumC21189117w13};
        LL = enumC21189117w1Arr;
        LLILLJJLI = new C2254308sP(enumC21189117w1Arr);
    }

    public static EnumC21189117w1[] values() {
        return (EnumC21189117w1[]) LL.clone();
    }

    public static EnumC21189117w1 valueOf(String str) {
        return (EnumC21189117w1) C08FF.LIZ(EnumC21189117w1.class, str);
    }

    public EnumC21189117w1(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356400DyA {
    public static final EnumC356400DyA ADD;
    public static final /* synthetic */ EnumC356400DyA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356400DyA REMOVE;

    public static InterfaceC2044707zh<EnumC356400DyA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356400DyA enumC356400DyA = new EnumC356400DyA("ADD", 0);
        ADD = enumC356400DyA;
        EnumC356400DyA enumC356400DyA2 = new EnumC356400DyA("REMOVE", 1);
        REMOVE = enumC356400DyA2;
        EnumC356400DyA[] enumC356400DyAArr = {enumC356400DyA, enumC356400DyA2};
        LL = enumC356400DyAArr;
        LLILLJJLI = new C2254308sP(enumC356400DyAArr);
    }

    public static EnumC356400DyA[] values() {
        return (EnumC356400DyA[]) LL.clone();
    }

    public static EnumC356400DyA valueOf(String str) {
        return (EnumC356400DyA) C08FF.LIZ(EnumC356400DyA.class, str);
    }

    public EnumC356400DyA(String str, int i) {
    }
}

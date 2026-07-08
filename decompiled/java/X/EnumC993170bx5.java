package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993170bx5 {
    public static final EnumC993170bx5 Both;
    public static final /* synthetic */ EnumC993170bx5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993170bx5 Slardar;
    public static final EnumC993170bx5 Tea;

    public static InterfaceC2044707zh<EnumC993170bx5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993170bx5 enumC993170bx5 = new EnumC993170bx5("Slardar", 0);
        Slardar = enumC993170bx5;
        EnumC993170bx5 enumC993170bx52 = new EnumC993170bx5("Tea", 1);
        Tea = enumC993170bx52;
        EnumC993170bx5 enumC993170bx53 = new EnumC993170bx5("Both", 2);
        Both = enumC993170bx53;
        EnumC993170bx5[] enumC993170bx5Arr = {enumC993170bx5, enumC993170bx52, enumC993170bx53};
        LL = enumC993170bx5Arr;
        LLILLJJLI = new C2254308sP(enumC993170bx5Arr);
    }

    public static EnumC993170bx5[] values() {
        return (EnumC993170bx5[]) LL.clone();
    }

    public static EnumC993170bx5 valueOf(String str) {
        return (EnumC993170bx5) C08FF.LIZ(EnumC993170bx5.class, str);
    }

    public EnumC993170bx5(String str, int i) {
    }
}

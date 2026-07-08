package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC908290ZkB {
    public static final EnumC908290ZkB FAKE;
    public static final /* synthetic */ EnumC908290ZkB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC908290ZkB NOT_AVAILABLE;
    public static final EnumC908290ZkB STRONG;
    public static final EnumC908290ZkB WEAK;

    public static InterfaceC2044707zh<EnumC908290ZkB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC908290ZkB enumC908290ZkB = new EnumC908290ZkB("STRONG", 0);
        STRONG = enumC908290ZkB;
        EnumC908290ZkB enumC908290ZkB2 = new EnumC908290ZkB("WEAK", 1);
        WEAK = enumC908290ZkB2;
        EnumC908290ZkB enumC908290ZkB3 = new EnumC908290ZkB("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = enumC908290ZkB3;
        EnumC908290ZkB enumC908290ZkB4 = new EnumC908290ZkB("FAKE", 3);
        FAKE = enumC908290ZkB4;
        EnumC908290ZkB[] enumC908290ZkBArr = {enumC908290ZkB, enumC908290ZkB2, enumC908290ZkB3, enumC908290ZkB4};
        LL = enumC908290ZkBArr;
        LLILLJJLI = new C2254308sP(enumC908290ZkBArr);
    }

    public static EnumC908290ZkB[] values() {
        return (EnumC908290ZkB[]) LL.clone();
    }

    public static EnumC908290ZkB valueOf(String str) {
        return (EnumC908290ZkB) C08FF.LIZ(EnumC908290ZkB.class, str);
    }

    public EnumC908290ZkB(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918830a1B {
    public static final EnumC918830a1B CANNOT_APPLY;
    public static final EnumC918830a1B CAN_APPLY;
    public static final /* synthetic */ EnumC918830a1B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC918830a1B> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918830a1B enumC918830a1B = new EnumC918830a1B("CAN_APPLY", 0);
        CAN_APPLY = enumC918830a1B;
        EnumC918830a1B enumC918830a1B2 = new EnumC918830a1B("CANNOT_APPLY", 1);
        CANNOT_APPLY = enumC918830a1B2;
        EnumC918830a1B[] enumC918830a1BArr = {enumC918830a1B, enumC918830a1B2};
        LL = enumC918830a1BArr;
        LLILLJJLI = new C2254308sP(enumC918830a1BArr);
    }

    public static EnumC918830a1B[] values() {
        return (EnumC918830a1B[]) LL.clone();
    }

    public static EnumC918830a1B valueOf(String str) {
        return (EnumC918830a1B) C08FF.LIZ(EnumC918830a1B.class, str);
    }

    public EnumC918830a1B(String str, int i) {
    }
}

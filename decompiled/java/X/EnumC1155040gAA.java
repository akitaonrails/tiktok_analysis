package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155040gAA {
    public static final EnumC1155040gAA CANCELLED;
    public static final /* synthetic */ EnumC1155040gAA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1155040gAA LOGGEDIN;

    public static InterfaceC2044707zh<EnumC1155040gAA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1155040gAA enumC1155040gAA = new EnumC1155040gAA("LOGGEDIN", 0);
        LOGGEDIN = enumC1155040gAA;
        EnumC1155040gAA enumC1155040gAA2 = new EnumC1155040gAA("CANCELLED", 1);
        CANCELLED = enumC1155040gAA2;
        EnumC1155040gAA[] enumC1155040gAAArr = {enumC1155040gAA, enumC1155040gAA2};
        LL = enumC1155040gAAArr;
        LLILLJJLI = new C2254308sP(enumC1155040gAAArr);
    }

    public static EnumC1155040gAA[] values() {
        return (EnumC1155040gAA[]) LL.clone();
    }

    public static EnumC1155040gAA valueOf(String str) {
        return (EnumC1155040gAA) C08FF.LIZ(EnumC1155040gAA.class, str);
    }

    public EnumC1155040gAA(String str, int i) {
    }
}

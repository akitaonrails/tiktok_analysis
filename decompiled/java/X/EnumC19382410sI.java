package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19382410sI {
    public static final EnumC19382410sI HALF;
    public static final /* synthetic */ EnumC19382410sI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19382410sI NONE;
    public static final EnumC19382410sI SHORT;

    public static InterfaceC2044707zh<EnumC19382410sI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19382410sI enumC19382410sI = new EnumC19382410sI("NONE", 0);
        NONE = enumC19382410sI;
        EnumC19382410sI enumC19382410sI2 = new EnumC19382410sI("SHORT", 1);
        SHORT = enumC19382410sI2;
        EnumC19382410sI enumC19382410sI3 = new EnumC19382410sI("HALF", 2);
        HALF = enumC19382410sI3;
        EnumC19382410sI[] enumC19382410sIArr = {enumC19382410sI, enumC19382410sI2, enumC19382410sI3};
        LL = enumC19382410sIArr;
        LLILLJJLI = new C2254308sP(enumC19382410sIArr);
    }

    public static EnumC19382410sI[] values() {
        return (EnumC19382410sI[]) LL.clone();
    }

    public static EnumC19382410sI valueOf(String str) {
        return (EnumC19382410sI) C08FF.LIZ(EnumC19382410sI.class, str);
    }

    public EnumC19382410sI(String str, int i) {
    }
}

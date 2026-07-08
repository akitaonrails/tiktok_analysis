package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356410DyB {
    public static final EnumC356410DyB CLEAR;
    public static final EnumC356410DyB EDIT;
    public static final /* synthetic */ EnumC356410DyB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC356410DyB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356410DyB enumC356410DyB = new EnumC356410DyB("EDIT", 0);
        EDIT = enumC356410DyB;
        EnumC356410DyB enumC356410DyB2 = new EnumC356410DyB("CLEAR", 1);
        CLEAR = enumC356410DyB2;
        EnumC356410DyB[] enumC356410DyBArr = {enumC356410DyB, enumC356410DyB2};
        LL = enumC356410DyBArr;
        LLILLJJLI = new C2254308sP(enumC356410DyBArr);
    }

    public static EnumC356410DyB[] values() {
        return (EnumC356410DyB[]) LL.clone();
    }

    public static EnumC356410DyB valueOf(String str) {
        return (EnumC356410DyB) C08FF.LIZ(EnumC356410DyB.class, str);
    }

    public EnumC356410DyB(String str, int i) {
    }
}

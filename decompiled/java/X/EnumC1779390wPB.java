package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779390wPB {
    public static final EnumC1779390wPB ELLIPSIZE;
    public static final /* synthetic */ EnumC1779390wPB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779390wPB SHRINK_OR_ELLIPSIZE;
    public static final EnumC1779390wPB SHRINK_OR_GROW;

    public static InterfaceC2044707zh<EnumC1779390wPB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779390wPB enumC1779390wPB = new EnumC1779390wPB("ELLIPSIZE", 0);
        ELLIPSIZE = enumC1779390wPB;
        EnumC1779390wPB enumC1779390wPB2 = new EnumC1779390wPB("SHRINK_OR_GROW", 1);
        SHRINK_OR_GROW = enumC1779390wPB2;
        EnumC1779390wPB enumC1779390wPB3 = new EnumC1779390wPB("SHRINK_OR_ELLIPSIZE", 2);
        SHRINK_OR_ELLIPSIZE = enumC1779390wPB3;
        EnumC1779390wPB[] enumC1779390wPBArr = {enumC1779390wPB, enumC1779390wPB2, enumC1779390wPB3};
        LL = enumC1779390wPBArr;
        LLILLJJLI = new C2254308sP(enumC1779390wPBArr);
    }

    public static EnumC1779390wPB[] values() {
        return (EnumC1779390wPB[]) LL.clone();
    }

    public static EnumC1779390wPB valueOf(String str) {
        return (EnumC1779390wPB) C08FF.LIZ(EnumC1779390wPB.class, str);
    }

    public EnumC1779390wPB(String str, int i) {
    }
}

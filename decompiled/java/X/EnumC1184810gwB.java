package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184810gwB {
    public static final EnumC1184810gwB BOTTOM_NEW;
    public static final EnumC1184810gwB BOTTOM_OLD;
    public static final /* synthetic */ EnumC1184810gwB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1184810gwB MIDDLE_NEW;

    public static InterfaceC2044707zh<EnumC1184810gwB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1184810gwB enumC1184810gwB = new EnumC1184810gwB("BOTTOM_OLD", 0);
        BOTTOM_OLD = enumC1184810gwB;
        EnumC1184810gwB enumC1184810gwB2 = new EnumC1184810gwB("BOTTOM_NEW", 1);
        BOTTOM_NEW = enumC1184810gwB2;
        EnumC1184810gwB enumC1184810gwB3 = new EnumC1184810gwB("MIDDLE_NEW", 2);
        MIDDLE_NEW = enumC1184810gwB3;
        EnumC1184810gwB[] enumC1184810gwBArr = {enumC1184810gwB, enumC1184810gwB2, enumC1184810gwB3};
        LL = enumC1184810gwBArr;
        LLILLJJLI = new C2254308sP(enumC1184810gwBArr);
    }

    public static EnumC1184810gwB[] values() {
        return (EnumC1184810gwB[]) LL.clone();
    }

    public static EnumC1184810gwB valueOf(String str) {
        return (EnumC1184810gwB) C08FF.LIZ(EnumC1184810gwB.class, str);
    }

    public EnumC1184810gwB(String str, int i) {
    }
}

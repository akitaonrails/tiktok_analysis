package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ekB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1100490ekB {
    public static final EnumC1100490ekB END;
    public static final EnumC1100490ekB INIT;
    public static final /* synthetic */ EnumC1100490ekB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1100490ekB START;

    public static InterfaceC2044707zh<EnumC1100490ekB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1100490ekB enumC1100490ekB = new EnumC1100490ekB("END", 0);
        END = enumC1100490ekB;
        EnumC1100490ekB enumC1100490ekB2 = new EnumC1100490ekB("INIT", 1);
        INIT = enumC1100490ekB2;
        EnumC1100490ekB enumC1100490ekB3 = new EnumC1100490ekB("START", 2);
        START = enumC1100490ekB3;
        EnumC1100490ekB[] enumC1100490ekBArr = {enumC1100490ekB, enumC1100490ekB2, enumC1100490ekB3};
        LL = enumC1100490ekBArr;
        LLILLJJLI = new C2254308sP(enumC1100490ekBArr);
    }

    public static EnumC1100490ekB[] values() {
        return (EnumC1100490ekB[]) LL.clone();
    }

    public static EnumC1100490ekB valueOf(String str) {
        return (EnumC1100490ekB) C08FF.LIZ(EnumC1100490ekB.class, str);
    }

    public EnumC1100490ekB(String str, int i) {
    }
}

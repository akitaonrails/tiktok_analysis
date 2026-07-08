package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ivF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261110ivF {
    public static final EnumC1261110ivF END;
    public static final /* synthetic */ EnumC1261110ivF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1261110ivF MIDDLE;
    public static final EnumC1261110ivF SINGLE;
    public static final EnumC1261110ivF START;

    public static InterfaceC2044707zh<EnumC1261110ivF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1261110ivF enumC1261110ivF = new EnumC1261110ivF("SINGLE", 0);
        SINGLE = enumC1261110ivF;
        EnumC1261110ivF enumC1261110ivF2 = new EnumC1261110ivF("START", 1);
        START = enumC1261110ivF2;
        EnumC1261110ivF enumC1261110ivF3 = new EnumC1261110ivF("END", 2);
        END = enumC1261110ivF3;
        EnumC1261110ivF enumC1261110ivF4 = new EnumC1261110ivF("MIDDLE", 3);
        MIDDLE = enumC1261110ivF4;
        EnumC1261110ivF[] enumC1261110ivFArr = {enumC1261110ivF, enumC1261110ivF2, enumC1261110ivF3, enumC1261110ivF4};
        LL = enumC1261110ivFArr;
        LLILLJJLI = new C2254308sP(enumC1261110ivFArr);
    }

    public static EnumC1261110ivF[] values() {
        return (EnumC1261110ivF[]) LL.clone();
    }

    public static EnumC1261110ivF valueOf(String str) {
        return (EnumC1261110ivF) C08FF.LIZ(EnumC1261110ivF.class, str);
    }

    public EnumC1261110ivF(String str, int i) {
    }
}

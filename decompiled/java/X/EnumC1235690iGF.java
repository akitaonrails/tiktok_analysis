package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235690iGF {
    public static final EnumC1235690iGF BOTTOM;
    public static final EnumC1235690iGF END;
    public static final /* synthetic */ EnumC1235690iGF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1235690iGF START;
    public static final EnumC1235690iGF TOP;

    public static InterfaceC2044707zh<EnumC1235690iGF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1235690iGF enumC1235690iGF = new EnumC1235690iGF("TOP", 0);
        TOP = enumC1235690iGF;
        EnumC1235690iGF enumC1235690iGF2 = new EnumC1235690iGF("START", 1);
        START = enumC1235690iGF2;
        EnumC1235690iGF enumC1235690iGF3 = new EnumC1235690iGF("END", 2);
        END = enumC1235690iGF3;
        EnumC1235690iGF enumC1235690iGF4 = new EnumC1235690iGF("BOTTOM", 3);
        BOTTOM = enumC1235690iGF4;
        EnumC1235690iGF[] enumC1235690iGFArr = {enumC1235690iGF, enumC1235690iGF2, enumC1235690iGF3, enumC1235690iGF4};
        LL = enumC1235690iGFArr;
        LLILLJJLI = new C2254308sP(enumC1235690iGFArr);
    }

    public static EnumC1235690iGF[] values() {
        return (EnumC1235690iGF[]) LL.clone();
    }

    public static EnumC1235690iGF valueOf(String str) {
        return (EnumC1235690iGF) C08FF.LIZ(EnumC1235690iGF.class, str);
    }

    public EnumC1235690iGF(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1999107sL {
    public static final EnumC1999107sL FPS;
    public static final /* synthetic */ EnumC1999107sL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1999107sL MEMORY;
    public static final EnumC1999107sL OVERLOAD_SCORE;

    public static InterfaceC2044707zh<EnumC1999107sL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1999107sL enumC1999107sL = new EnumC1999107sL("FPS", 0);
        FPS = enumC1999107sL;
        EnumC1999107sL enumC1999107sL2 = new EnumC1999107sL("MEMORY", 1);
        MEMORY = enumC1999107sL2;
        EnumC1999107sL enumC1999107sL3 = new EnumC1999107sL("OVERLOAD_SCORE", 2);
        OVERLOAD_SCORE = enumC1999107sL3;
        EnumC1999107sL[] enumC1999107sLArr = {enumC1999107sL, enumC1999107sL2, enumC1999107sL3};
        LL = enumC1999107sLArr;
        LLILLJJLI = new C2254308sP(enumC1999107sLArr);
    }

    public static EnumC1999107sL[] values() {
        return (EnumC1999107sL[]) LL.clone();
    }

    public static EnumC1999107sL valueOf(String str) {
        return (EnumC1999107sL) C08FF.LIZ(EnumC1999107sL.class, str);
    }

    public EnumC1999107sL(String str, int i) {
    }
}

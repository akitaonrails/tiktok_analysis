package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ioM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1256840ioM {
    public static final EnumC1256840ioM END_ANIMATION;
    public static final /* synthetic */ EnumC1256840ioM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1256840ioM PAUSE_ANIMATION;
    public static final EnumC1256840ioM RESUME_ANIMATION;
    public static final EnumC1256840ioM START_ANIMATION;

    public static InterfaceC2044707zh<EnumC1256840ioM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1256840ioM enumC1256840ioM = new EnumC1256840ioM("START_ANIMATION", 0);
        START_ANIMATION = enumC1256840ioM;
        EnumC1256840ioM enumC1256840ioM2 = new EnumC1256840ioM("PAUSE_ANIMATION", 1);
        PAUSE_ANIMATION = enumC1256840ioM2;
        EnumC1256840ioM enumC1256840ioM3 = new EnumC1256840ioM("RESUME_ANIMATION", 2);
        RESUME_ANIMATION = enumC1256840ioM3;
        EnumC1256840ioM enumC1256840ioM4 = new EnumC1256840ioM("END_ANIMATION", 3);
        END_ANIMATION = enumC1256840ioM4;
        EnumC1256840ioM[] enumC1256840ioMArr = {enumC1256840ioM, enumC1256840ioM2, enumC1256840ioM3, enumC1256840ioM4};
        LL = enumC1256840ioMArr;
        LLILLJJLI = new C2254308sP(enumC1256840ioMArr);
    }

    public static EnumC1256840ioM[] values() {
        return (EnumC1256840ioM[]) LL.clone();
    }

    public static EnumC1256840ioM valueOf(String str) {
        return (EnumC1256840ioM) C08FF.LIZ(EnumC1256840ioM.class, str);
    }

    public EnumC1256840ioM(String str, int i) {
    }
}

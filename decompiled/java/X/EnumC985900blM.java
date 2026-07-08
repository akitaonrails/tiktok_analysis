package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0blM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC985900blM {
    public static final EnumC985900blM END;
    public static final /* synthetic */ EnumC985900blM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC985900blM NORMAL;
    public static final EnumC985900blM PUNISH;
    public static final EnumC985900blM START;

    public static InterfaceC2044707zh<EnumC985900blM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC985900blM enumC985900blM = new EnumC985900blM("NORMAL", 0);
        NORMAL = enumC985900blM;
        EnumC985900blM enumC985900blM2 = new EnumC985900blM("START", 1);
        START = enumC985900blM2;
        EnumC985900blM enumC985900blM3 = new EnumC985900blM("PUNISH", 2);
        PUNISH = enumC985900blM3;
        EnumC985900blM enumC985900blM4 = new EnumC985900blM("END", 3);
        END = enumC985900blM4;
        EnumC985900blM[] enumC985900blMArr = {enumC985900blM, enumC985900blM2, enumC985900blM3, enumC985900blM4};
        LL = enumC985900blMArr;
        LLILLJJLI = new C2254308sP(enumC985900blMArr);
    }

    public static EnumC985900blM[] values() {
        return (EnumC985900blM[]) LL.clone();
    }

    public static EnumC985900blM valueOf(String str) {
        return (EnumC985900blM) C08FF.LIZ(EnumC985900blM.class, str);
    }

    public EnumC985900blM(String str, int i) {
    }
}

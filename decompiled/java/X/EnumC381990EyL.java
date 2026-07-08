package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC381990EyL {
    public static final EnumC381990EyL AUDIO;
    public static final EnumC381990EyL FILE;
    public static final EnumC381990EyL IMAGE;
    public static final /* synthetic */ EnumC381990EyL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC381990EyL TEXT;
    public static final EnumC381990EyL UNKNOWN;
    public static final EnumC381990EyL VIDEO;

    public static InterfaceC2044707zh<EnumC381990EyL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC381990EyL enumC381990EyL = new EnumC381990EyL("UNKNOWN", 0);
        UNKNOWN = enumC381990EyL;
        EnumC381990EyL enumC381990EyL2 = new EnumC381990EyL("TEXT", 1);
        TEXT = enumC381990EyL2;
        EnumC381990EyL enumC381990EyL3 = new EnumC381990EyL("IMAGE", 2);
        IMAGE = enumC381990EyL3;
        EnumC381990EyL enumC381990EyL4 = new EnumC381990EyL("VIDEO", 3);
        VIDEO = enumC381990EyL4;
        EnumC381990EyL enumC381990EyL5 = new EnumC381990EyL("AUDIO", 4);
        AUDIO = enumC381990EyL5;
        EnumC381990EyL enumC381990EyL6 = new EnumC381990EyL("FILE", 5);
        FILE = enumC381990EyL6;
        EnumC381990EyL[] enumC381990EyLArr = {enumC381990EyL, enumC381990EyL2, enumC381990EyL3, enumC381990EyL4, enumC381990EyL5, enumC381990EyL6};
        LL = enumC381990EyLArr;
        LLILLJJLI = new C2254308sP(enumC381990EyLArr);
    }

    public static EnumC381990EyL[] values() {
        return (EnumC381990EyL[]) LL.clone();
    }

    public static EnumC381990EyL valueOf(String str) {
        return (EnumC381990EyL) C08FF.LIZ(EnumC381990EyL.class, str);
    }

    public EnumC381990EyL(String str, int i) {
    }
}

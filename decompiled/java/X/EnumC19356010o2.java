package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10o2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19356010o2 {
    public static final EnumC19356010o2 AUDIO;
    public static final EnumC19356010o2 FILE;
    public static final EnumC19356010o2 IMAGE;
    public static final /* synthetic */ EnumC19356010o2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19356010o2 LOTTIE;
    public static final EnumC19356010o2 VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19356010o2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19356010o2 enumC19356010o2 = new EnumC19356010o2("IMAGE", 0, 0);
        IMAGE = enumC19356010o2;
        EnumC19356010o2 enumC19356010o22 = new EnumC19356010o2("AUDIO", 1, 1);
        AUDIO = enumC19356010o22;
        EnumC19356010o2 enumC19356010o23 = new EnumC19356010o2("VIDEO", 2, 2);
        VIDEO = enumC19356010o23;
        EnumC19356010o2 enumC19356010o24 = new EnumC19356010o2("FILE", 3, 3);
        FILE = enumC19356010o24;
        EnumC19356010o2 enumC19356010o25 = new EnumC19356010o2("LOTTIE", 4, 4);
        LOTTIE = enumC19356010o25;
        EnumC19356010o2[] enumC19356010o2Arr = {enumC19356010o2, enumC19356010o22, enumC19356010o23, enumC19356010o24, enumC19356010o25};
        LLILLJJLI = enumC19356010o2Arr;
        LLILLL = new C2254308sP(enumC19356010o2Arr);
    }

    public static EnumC19356010o2[] values() {
        return (EnumC19356010o2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19356010o2 valueOf(String str) {
        return (EnumC19356010o2) C08FF.LIZ(EnumC19356010o2.class, str);
    }

    public EnumC19356010o2(String str, int i, int i2) {
        this.LL = i2;
    }
}

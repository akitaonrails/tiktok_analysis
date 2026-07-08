package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986807qM {
    public static final EnumC1986807qM AUDIO;
    public static final EnumC1986807qM CAMEO;
    public static final EnumC1986807qM IMAGE;
    public static final /* synthetic */ EnumC1986807qM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1986807qM MD_TEXT;
    public static final EnumC1986807qM REASONING;
    public static final EnumC1986807qM TEXT;
    public static final EnumC1986807qM VIDEO;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC1986807qM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1986807qM enumC1986807qM = new EnumC1986807qM("TEXT", 0, 0);
        TEXT = enumC1986807qM;
        EnumC1986807qM enumC1986807qM2 = new EnumC1986807qM("IMAGE", 1, 1);
        IMAGE = enumC1986807qM2;
        EnumC1986807qM enumC1986807qM3 = new EnumC1986807qM("VIDEO", 2, 2);
        VIDEO = enumC1986807qM3;
        EnumC1986807qM enumC1986807qM4 = new EnumC1986807qM("AUDIO", 3, 3);
        AUDIO = enumC1986807qM4;
        EnumC1986807qM enumC1986807qM5 = new EnumC1986807qM("CAMEO", 4, 4);
        CAMEO = enumC1986807qM5;
        EnumC1986807qM enumC1986807qM6 = new EnumC1986807qM("REASONING", 5, 5);
        REASONING = enumC1986807qM6;
        EnumC1986807qM enumC1986807qM7 = new EnumC1986807qM("MD_TEXT", 6, 6);
        MD_TEXT = enumC1986807qM7;
        EnumC1986807qM[] enumC1986807qMArr = {enumC1986807qM, enumC1986807qM2, enumC1986807qM3, enumC1986807qM4, enumC1986807qM5, enumC1986807qM6, enumC1986807qM7};
        LLILLJJLI = enumC1986807qMArr;
        LLILLL = new C2254308sP(enumC1986807qMArr);
    }

    public static EnumC1986807qM[] values() {
        return (EnumC1986807qM[]) LLILLJJLI.clone();
    }

    public final Integer getType() {
        return this.LL;
    }

    public static EnumC1986807qM valueOf(String str) {
        return (EnumC1986807qM) C08FF.LIZ(EnumC1986807qM.class, str);
    }

    public EnumC1986807qM(String str, int i, Integer num) {
        this.LL = num;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0toC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1679580toC {
    public static final /* synthetic */ EnumC1679580toC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1679580toC LOADING;
    public static final EnumC1679580toC TEXT;
    public static final EnumC1679580toC TEXT_INPUTTING;
    public static final EnumC1679580toC VOICE;

    public static InterfaceC2044707zh<EnumC1679580toC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1679580toC enumC1679580toC = new EnumC1679580toC("LOADING", 0);
        LOADING = enumC1679580toC;
        EnumC1679580toC enumC1679580toC2 = new EnumC1679580toC("TEXT", 1);
        TEXT = enumC1679580toC2;
        EnumC1679580toC enumC1679580toC3 = new EnumC1679580toC("VOICE", 2);
        VOICE = enumC1679580toC3;
        EnumC1679580toC enumC1679580toC4 = new EnumC1679580toC("TEXT_INPUTTING", 3);
        TEXT_INPUTTING = enumC1679580toC4;
        EnumC1679580toC[] enumC1679580toCArr = {enumC1679580toC, enumC1679580toC2, enumC1679580toC3, enumC1679580toC4};
        LL = enumC1679580toCArr;
        LLILLJJLI = new C2254308sP(enumC1679580toCArr);
    }

    public static EnumC1679580toC[] values() {
        return (EnumC1679580toC[]) LL.clone();
    }

    public static EnumC1679580toC valueOf(String str) {
        return (EnumC1679580toC) C08FF.LIZ(EnumC1679580toC.class, str);
    }

    public EnumC1679580toC(String str, int i) {
    }
}

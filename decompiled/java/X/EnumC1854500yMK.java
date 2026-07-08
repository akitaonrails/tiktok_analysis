package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1854500yMK {
    public static final EnumC1854500yMK AUTO_SEND_PROMPT;
    public static final /* synthetic */ EnumC1854500yMK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1854500yMK RATIO_SELECT;
    public static final EnumC1854500yMK STYLE_CONVERT;

    public static InterfaceC2044707zh<EnumC1854500yMK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1854500yMK enumC1854500yMK = new EnumC1854500yMK("AUTO_SEND_PROMPT", 0);
        AUTO_SEND_PROMPT = enumC1854500yMK;
        EnumC1854500yMK enumC1854500yMK2 = new EnumC1854500yMK("STYLE_CONVERT", 1);
        STYLE_CONVERT = enumC1854500yMK2;
        EnumC1854500yMK enumC1854500yMK3 = new EnumC1854500yMK("RATIO_SELECT", 2);
        RATIO_SELECT = enumC1854500yMK3;
        EnumC1854500yMK[] enumC1854500yMKArr = {enumC1854500yMK, enumC1854500yMK2, enumC1854500yMK3};
        LL = enumC1854500yMKArr;
        LLILLJJLI = new C2254308sP(enumC1854500yMKArr);
    }

    public static EnumC1854500yMK[] values() {
        return (EnumC1854500yMK[]) LL.clone();
    }

    public static EnumC1854500yMK valueOf(String str) {
        return (EnumC1854500yMK) C08FF.LIZ(EnumC1854500yMK.class, str);
    }

    public EnumC1854500yMK(String str, int i) {
    }
}

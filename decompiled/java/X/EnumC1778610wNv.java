package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778610wNv {
    public static final C1778620wNw Companion;
    public static final EnumC1778610wNv FAVORITE_SOUND;
    public static final /* synthetic */ EnumC1778610wNv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778610wNv TT_TO_DSP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1778610wNv> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0wNw] */
    static {
        EnumC1778610wNv enumC1778610wNv = new EnumC1778610wNv("FAVORITE_SOUND", 0, 1);
        FAVORITE_SOUND = enumC1778610wNv;
        EnumC1778610wNv enumC1778610wNv2 = new EnumC1778610wNv("TT_TO_DSP", 1, 2);
        TT_TO_DSP = enumC1778610wNv2;
        EnumC1778610wNv[] enumC1778610wNvArr = {enumC1778610wNv, enumC1778610wNv2};
        LLILLJJLI = enumC1778610wNvArr;
        LLILLL = new C2254308sP(enumC1778610wNvArr);
        Companion = new Object() { // from class: X.0wNw
        };
    }

    public static EnumC1778610wNv[] values() {
        return (EnumC1778610wNv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1778610wNv valueOf(String str) {
        return (EnumC1778610wNv) C08FF.LIZ(EnumC1778610wNv.class, str);
    }

    public EnumC1778610wNv(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1403300mca {
    public static final /* synthetic */ EnumC1403300mca[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1403300mca RATIO_1_TO_1;
    public static final EnumC1403300mca RATIO_3_TO_4;
    public static final EnumC1403300mca RATIO_9_TO_16;
    public final float LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1403300mca> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1403300mca enumC1403300mca = new EnumC1403300mca(1.0f, "RATIO_1_TO_1", 0, "1:1");
        RATIO_1_TO_1 = enumC1403300mca;
        EnumC1403300mca enumC1403300mca2 = new EnumC1403300mca(0.75f, "RATIO_3_TO_4", 1, "3:4");
        RATIO_3_TO_4 = enumC1403300mca2;
        EnumC1403300mca enumC1403300mca3 = new EnumC1403300mca(0.5625f, "RATIO_9_TO_16", 2, "9:16");
        RATIO_9_TO_16 = enumC1403300mca3;
        EnumC1403300mca[] enumC1403300mcaArr = {enumC1403300mca, enumC1403300mca2, enumC1403300mca3};
        LLILLL = enumC1403300mcaArr;
        LLILZ = new C2254308sP(enumC1403300mcaArr);
    }

    public static EnumC1403300mca[] values() {
        return (EnumC1403300mca[]) LLILLL.clone();
    }

    public final String getDescription() {
        return this.LLILLJJLI;
    }

    public final float getRatio() {
        return this.LL;
    }

    public static EnumC1403300mca valueOf(String str) {
        return (EnumC1403300mca) C08FF.LIZ(EnumC1403300mca.class, str);
    }

    public EnumC1403300mca(float f, String str, int i, String str2) {
        this.LL = f;
        this.LLILLJJLI = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1431770nMV {
    public static final EnumC1431770nMV COUNT;
    public static final EnumC1431770nMV DURATION;
    public static final EnumC1431770nMV INVALID;
    public static final /* synthetic */ EnumC1431770nMV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1431770nMV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1431770nMV enumC1431770nMV = new EnumC1431770nMV("INVALID", 0, -1);
        INVALID = enumC1431770nMV;
        EnumC1431770nMV enumC1431770nMV2 = new EnumC1431770nMV("DURATION", 1, 0);
        DURATION = enumC1431770nMV2;
        EnumC1431770nMV enumC1431770nMV3 = new EnumC1431770nMV("COUNT", 2, 1);
        COUNT = enumC1431770nMV3;
        EnumC1431770nMV[] enumC1431770nMVArr = {enumC1431770nMV, enumC1431770nMV2, enumC1431770nMV3};
        LLILLJJLI = enumC1431770nMVArr;
        LLILLL = new C2254308sP(enumC1431770nMVArr);
    }

    public static EnumC1431770nMV[] values() {
        return (EnumC1431770nMV[]) LLILLJJLI.clone();
    }

    public final int getPolicy() {
        return this.LL;
    }

    public static EnumC1431770nMV valueOf(String str) {
        return (EnumC1431770nMV) C08FF.LIZ(EnumC1431770nMV.class, str);
    }

    public EnumC1431770nMV(String str, int i, int i2) {
        this.LL = i2;
    }
}

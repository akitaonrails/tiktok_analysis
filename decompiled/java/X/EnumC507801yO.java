package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC507801yO {
    public static final EnumC507801yO COMPLETE;
    public static final /* synthetic */ EnumC507801yO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC507801yO UNKNOWN;
    public static final EnumC507801yO UPLOAD_IMAGE_FAILED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC507801yO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC507801yO enumC507801yO = new EnumC507801yO("UNKNOWN", 0, 0);
        UNKNOWN = enumC507801yO;
        EnumC507801yO enumC507801yO2 = new EnumC507801yO("COMPLETE", 1, 1);
        COMPLETE = enumC507801yO2;
        EnumC507801yO enumC507801yO3 = new EnumC507801yO("UPLOAD_IMAGE_FAILED", 2, 2);
        UPLOAD_IMAGE_FAILED = enumC507801yO3;
        EnumC507801yO[] enumC507801yOArr = {enumC507801yO, enumC507801yO2, enumC507801yO3};
        LLILLJJLI = enumC507801yOArr;
        LLILLL = new C2254308sP(enumC507801yOArr);
    }

    public static EnumC507801yO[] values() {
        return (EnumC507801yO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC507801yO valueOf(String str) {
        return (EnumC507801yO) C08FF.LIZ(EnumC507801yO.class, str);
    }

    public EnumC507801yO(String str, int i, int i2) {
        this.LL = i2;
    }
}

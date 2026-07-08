package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC490130JJz {
    public static final EnumC490130JJz INVALID_PATH;
    public static final /* synthetic */ EnumC490130JJz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC490130JJz MISSING_COMPULSORY_PARAM;
    public final int LL;

    public static InterfaceC2044707zh<EnumC490130JJz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC490130JJz enumC490130JJz = new EnumC490130JJz("INVALID_PATH", 0, -101);
        INVALID_PATH = enumC490130JJz;
        EnumC490130JJz enumC490130JJz2 = new EnumC490130JJz("MISSING_COMPULSORY_PARAM", 1, -102);
        MISSING_COMPULSORY_PARAM = enumC490130JJz2;
        EnumC490130JJz[] enumC490130JJzArr = {enumC490130JJz, enumC490130JJz2};
        LLILLJJLI = enumC490130JJzArr;
        LLILLL = new C2254308sP(enumC490130JJzArr);
    }

    public static EnumC490130JJz[] values() {
        return (EnumC490130JJz[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static EnumC490130JJz valueOf(String str) {
        return (EnumC490130JJz) C08FF.LIZ(EnumC490130JJz.class, str);
    }

    public EnumC490130JJz(String str, int i, int i2) {
        this.LL = i2;
    }
}

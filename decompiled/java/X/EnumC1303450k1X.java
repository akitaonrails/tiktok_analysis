package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1303450k1X {
    public static final EnumC1303450k1X LLILLJJLI;
    public static final EnumC1303450k1X LLILLL;
    public static final EnumC1303450k1X LLILZ;
    public static final /* synthetic */ EnumC1303450k1X[] LLILZIL;
    public final String LL;

    static {
        EnumC1303450k1X enumC1303450k1X = new EnumC1303450k1X("SUCCESS", 0, "success");
        LLILLJJLI = enumC1303450k1X;
        EnumC1303450k1X enumC1303450k1X2 = new EnumC1303450k1X("FAILED", 1, "failed");
        LLILLL = enumC1303450k1X2;
        EnumC1303450k1X enumC1303450k1X3 = new EnumC1303450k1X("INTERRUPTED", 2, "interrupted");
        LLILZ = enumC1303450k1X3;
        EnumC1303450k1X[] enumC1303450k1XArr = {enumC1303450k1X, enumC1303450k1X2, enumC1303450k1X3};
        LLILZIL = enumC1303450k1XArr;
        new C2254308sP(enumC1303450k1XArr);
    }

    public static EnumC1303450k1X[] values() {
        return (EnumC1303450k1X[]) LLILZIL.clone();
    }

    public static EnumC1303450k1X valueOf(String str) {
        return (EnumC1303450k1X) C08FF.LIZ(EnumC1303450k1X.class, str);
    }

    public EnumC1303450k1X(String str, int i, String str2) {
        this.LL = str2;
    }
}

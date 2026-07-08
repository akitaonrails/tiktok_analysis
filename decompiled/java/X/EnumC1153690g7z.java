package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153690g7z {
    public static final EnumC1153690g7z ERROR_FILE;
    public static final EnumC1153690g7z ERROR_SEGMENT;
    public static final EnumC1153690g7z IDE;
    public static final /* synthetic */ EnumC1153690g7z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1153690g7z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153690g7z enumC1153690g7z = new EnumC1153690g7z("IDE", 0);
        IDE = enumC1153690g7z;
        EnumC1153690g7z enumC1153690g7z2 = new EnumC1153690g7z("ERROR_SEGMENT", 1);
        ERROR_SEGMENT = enumC1153690g7z2;
        EnumC1153690g7z enumC1153690g7z3 = new EnumC1153690g7z("ERROR_FILE", 2);
        ERROR_FILE = enumC1153690g7z3;
        EnumC1153690g7z[] enumC1153690g7zArr = {enumC1153690g7z, enumC1153690g7z2, enumC1153690g7z3};
        LL = enumC1153690g7zArr;
        LLILLJJLI = new C2254308sP(enumC1153690g7zArr);
    }

    public static EnumC1153690g7z[] values() {
        return (EnumC1153690g7z[]) LL.clone();
    }

    public static EnumC1153690g7z valueOf(String str) {
        return (EnumC1153690g7z) C08FF.LIZ(EnumC1153690g7z.class, str);
    }

    public EnumC1153690g7z(String str, int i) {
    }
}

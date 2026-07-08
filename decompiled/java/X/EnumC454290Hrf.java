package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454290Hrf {
    public static final /* synthetic */ EnumC454290Hrf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC454290Hrf SAVE;
    public static final EnumC454290Hrf SHARE;
    public static final EnumC454290Hrf USE;

    public static InterfaceC2044707zh<EnumC454290Hrf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC454290Hrf enumC454290Hrf = new EnumC454290Hrf("SAVE", 0);
        SAVE = enumC454290Hrf;
        EnumC454290Hrf enumC454290Hrf2 = new EnumC454290Hrf("USE", 1);
        USE = enumC454290Hrf2;
        EnumC454290Hrf enumC454290Hrf3 = new EnumC454290Hrf("SHARE", 2);
        SHARE = enumC454290Hrf3;
        EnumC454290Hrf[] enumC454290HrfArr = {enumC454290Hrf, enumC454290Hrf2, enumC454290Hrf3};
        LL = enumC454290HrfArr;
        LLILLJJLI = new C2254308sP(enumC454290HrfArr);
    }

    public static EnumC454290Hrf[] values() {
        return (EnumC454290Hrf[]) LL.clone();
    }

    public static EnumC454290Hrf valueOf(String str) {
        return (EnumC454290Hrf) C08FF.LIZ(EnumC454290Hrf.class, str);
    }

    public EnumC454290Hrf(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035900Ar {
    public static final EnumC035900Ar DONATION_STATUS_NORMAL;
    public static final EnumC035900Ar DONATION_STATUS_UNABLE;
    public static final /* synthetic */ EnumC035900Ar[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035900Ar> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035900Ar enumC035900Ar = new EnumC035900Ar("DONATION_STATUS_NORMAL", 0, 1);
        DONATION_STATUS_NORMAL = enumC035900Ar;
        EnumC035900Ar enumC035900Ar2 = new EnumC035900Ar("DONATION_STATUS_UNABLE", 1, 2);
        DONATION_STATUS_UNABLE = enumC035900Ar2;
        EnumC035900Ar[] enumC035900ArArr = {enumC035900Ar, enumC035900Ar2};
        LLILLJJLI = enumC035900ArArr;
        LLILLL = new C2254308sP(enumC035900ArArr);
    }

    public static EnumC035900Ar[] values() {
        return (EnumC035900Ar[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC035900Ar valueOf(String str) {
        return (EnumC035900Ar) C08FF.LIZ(EnumC035900Ar.class, str);
    }

    public EnumC035900Ar(String str, int i, int i2) {
        this.LL = i2;
    }
}

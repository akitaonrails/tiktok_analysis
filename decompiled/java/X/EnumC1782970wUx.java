package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782970wUx {
    public static final EnumC1782970wUx FAIL;
    public static final /* synthetic */ EnumC1782970wUx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782970wUx PROGRESS_UPDAATE;
    public static final EnumC1782970wUx SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1782970wUx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782970wUx enumC1782970wUx = new EnumC1782970wUx("PROGRESS_UPDAATE", 0, "progressUpdaate");
        PROGRESS_UPDAATE = enumC1782970wUx;
        EnumC1782970wUx enumC1782970wUx2 = new EnumC1782970wUx("SUCCESS", 1, "success");
        SUCCESS = enumC1782970wUx2;
        EnumC1782970wUx enumC1782970wUx3 = new EnumC1782970wUx("FAIL", 2, "fail");
        FAIL = enumC1782970wUx3;
        EnumC1782970wUx[] enumC1782970wUxArr = {enumC1782970wUx, enumC1782970wUx2, enumC1782970wUx3};
        LLILLJJLI = enumC1782970wUxArr;
        LLILLL = new C2254308sP(enumC1782970wUxArr);
    }

    public static EnumC1782970wUx[] values() {
        return (EnumC1782970wUx[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static EnumC1782970wUx valueOf(String str) {
        return (EnumC1782970wUx) C08FF.LIZ(EnumC1782970wUx.class, str);
    }

    public EnumC1782970wUx(String str, int i, String str2) {
        this.LL = str2;
    }
}

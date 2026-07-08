package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC617770OKx {
    public static final EnumC617770OKx LLILLJJLI;
    public static final EnumC617770OKx LLILLL;
    public static final EnumC617770OKx LLILZ;
    public static final /* synthetic */ EnumC617770OKx[] LLILZIL;
    public final String LL;

    static {
        EnumC617770OKx enumC617770OKx = new EnumC617770OKx("PUBLISH_CANCEL", 0, "cancel");
        LLILLJJLI = enumC617770OKx;
        EnumC617770OKx enumC617770OKx2 = new EnumC617770OKx("PUBLISH_SUCCESS", 1, "success");
        LLILLL = enumC617770OKx2;
        EnumC617770OKx enumC617770OKx3 = new EnumC617770OKx("PUBLISH_FAIL", 2, "fail");
        LLILZ = enumC617770OKx3;
        EnumC617770OKx[] enumC617770OKxArr = {enumC617770OKx, enumC617770OKx2, enumC617770OKx3};
        LLILZIL = enumC617770OKxArr;
        new C2254308sP(enumC617770OKxArr);
    }

    public static EnumC617770OKx[] values() {
        return (EnumC617770OKx[]) LLILZIL.clone();
    }

    public static EnumC617770OKx valueOf(String str) {
        return (EnumC617770OKx) C08FF.LIZ(EnumC617770OKx.class, str);
    }

    public EnumC617770OKx(String str, int i, String str2) {
        this.LL = str2;
    }
}

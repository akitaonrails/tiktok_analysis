package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1857370yQx {
    public static final EnumC1857370yQx COPY;
    public static final EnumC1857370yQx DELETE;
    public static final /* synthetic */ EnumC1857370yQx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1857370yQx REPORT;
    public static final EnumC1857370yQx SHARE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1857370yQx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1857370yQx enumC1857370yQx = new EnumC1857370yQx("SHARE", 0, "share");
        SHARE = enumC1857370yQx;
        EnumC1857370yQx enumC1857370yQx2 = new EnumC1857370yQx("COPY", 1, "copy");
        COPY = enumC1857370yQx2;
        EnumC1857370yQx enumC1857370yQx3 = new EnumC1857370yQx("REPORT", 2, "report");
        REPORT = enumC1857370yQx3;
        EnumC1857370yQx enumC1857370yQx4 = new EnumC1857370yQx("DELETE", 3, "delete");
        DELETE = enumC1857370yQx4;
        EnumC1857370yQx[] enumC1857370yQxArr = {enumC1857370yQx, enumC1857370yQx2, enumC1857370yQx3, enumC1857370yQx4};
        LLILLJJLI = enumC1857370yQxArr;
        LLILLL = new C2254308sP(enumC1857370yQxArr);
    }

    public static EnumC1857370yQx[] values() {
        return (EnumC1857370yQx[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1857370yQx valueOf(String str) {
        return (EnumC1857370yQx) C08FF.LIZ(EnumC1857370yQx.class, str);
    }

    public EnumC1857370yQx(String str, int i, String str2) {
        this.LL = str2;
    }
}

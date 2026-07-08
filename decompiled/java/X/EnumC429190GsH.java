package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429190GsH {
    public static final EnumC429190GsH LL;
    public static final EnumC429190GsH LLILLJJLI;
    public static final EnumC429190GsH LLILLL;
    public static final /* synthetic */ EnumC429190GsH[] LLILZ;

    static {
        EnumC429190GsH enumC429190GsH = new EnumC429190GsH("NONE", 0);
        LL = enumC429190GsH;
        EnumC429190GsH enumC429190GsH2 = new EnumC429190GsH("INACTIVE", 1);
        LLILLJJLI = enumC429190GsH2;
        EnumC429190GsH enumC429190GsH3 = new EnumC429190GsH("ACTIVE", 2);
        LLILLL = enumC429190GsH3;
        EnumC429190GsH[] enumC429190GsHArr = {enumC429190GsH, enumC429190GsH2, enumC429190GsH3};
        LLILZ = enumC429190GsHArr;
        new C2254308sP(enumC429190GsHArr);
    }

    public static EnumC429190GsH[] values() {
        return (EnumC429190GsH[]) LLILZ.clone();
    }

    public static EnumC429190GsH valueOf(String str) {
        return (EnumC429190GsH) C08FF.LIZ(EnumC429190GsH.class, str);
    }

    public EnumC429190GsH(String str, int i) {
    }
}

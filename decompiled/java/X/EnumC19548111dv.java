package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19548111dv {
    public static final EnumC19548111dv CANCEL;
    public static final EnumC19548111dv DESTROY;
    public static final EnumC19548111dv INIT;
    public static final /* synthetic */ EnumC19548111dv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19548111dv START;

    public static InterfaceC2044707zh<EnumC19548111dv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19548111dv enumC19548111dv = new EnumC19548111dv("INIT", 0);
        INIT = enumC19548111dv;
        EnumC19548111dv enumC19548111dv2 = new EnumC19548111dv("START", 1);
        START = enumC19548111dv2;
        EnumC19548111dv enumC19548111dv3 = new EnumC19548111dv("CANCEL", 2);
        CANCEL = enumC19548111dv3;
        EnumC19548111dv enumC19548111dv4 = new EnumC19548111dv("DESTROY", 3);
        DESTROY = enumC19548111dv4;
        EnumC19548111dv[] enumC19548111dvArr = {enumC19548111dv, enumC19548111dv2, enumC19548111dv3, enumC19548111dv4};
        LL = enumC19548111dvArr;
        LLILLJJLI = new C2254308sP(enumC19548111dvArr);
    }

    public static EnumC19548111dv[] values() {
        return (EnumC19548111dv[]) LL.clone();
    }

    public static EnumC19548111dv valueOf(String str) {
        return (EnumC19548111dv) C08FF.LIZ(EnumC19548111dv.class, str);
    }

    public EnumC19548111dv(String str, int i) {
    }
}

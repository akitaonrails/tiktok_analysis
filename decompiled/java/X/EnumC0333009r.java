package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0333009r {
    public static final /* synthetic */ EnumC0333009r[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0333009r POST_PAY;
    public static final EnumC0333009r UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0333009r> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0333009r enumC0333009r = new EnumC0333009r("UNKNOWN", 0, 0);
        UNKNOWN = enumC0333009r;
        EnumC0333009r enumC0333009r2 = new EnumC0333009r("POST_PAY", 1, 1);
        POST_PAY = enumC0333009r2;
        EnumC0333009r[] enumC0333009rArr = {enumC0333009r, enumC0333009r2};
        LLILLJJLI = enumC0333009rArr;
        LLILLL = new C2254308sP(enumC0333009rArr);
    }

    public static EnumC0333009r[] values() {
        return (EnumC0333009r[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0333009r valueOf(String str) {
        return (EnumC0333009r) C08FF.LIZ(EnumC0333009r.class, str);
    }

    public EnumC0333009r(String str, int i, int i2) {
        this.LL = i2;
    }
}

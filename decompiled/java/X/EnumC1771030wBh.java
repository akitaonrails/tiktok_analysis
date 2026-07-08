package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771030wBh {
    public static final EnumC1771030wBh ERROR_RETRY;
    public static final EnumC1771030wBh FIRST_REQUEST;
    public static final /* synthetic */ EnumC1771030wBh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771030wBh PREFETCH;
    public static final EnumC1771030wBh PRELOAD;
    public static final EnumC1771030wBh REFRESH;
    public static final EnumC1771030wBh RETURN_MALL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1771030wBh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771030wBh enumC1771030wBh = new EnumC1771030wBh("PREFETCH", 0, 0);
        PREFETCH = enumC1771030wBh;
        EnumC1771030wBh enumC1771030wBh2 = new EnumC1771030wBh("PRELOAD", 1, 1);
        PRELOAD = enumC1771030wBh2;
        EnumC1771030wBh enumC1771030wBh3 = new EnumC1771030wBh("FIRST_REQUEST", 2, 2);
        FIRST_REQUEST = enumC1771030wBh3;
        EnumC1771030wBh enumC1771030wBh4 = new EnumC1771030wBh("REFRESH", 3, 3);
        REFRESH = enumC1771030wBh4;
        EnumC1771030wBh enumC1771030wBh5 = new EnumC1771030wBh("ERROR_RETRY", 4, 4);
        ERROR_RETRY = enumC1771030wBh5;
        EnumC1771030wBh enumC1771030wBh6 = new EnumC1771030wBh("RETURN_MALL", 5, 5);
        RETURN_MALL = enumC1771030wBh6;
        EnumC1771030wBh[] enumC1771030wBhArr = {enumC1771030wBh, enumC1771030wBh2, enumC1771030wBh3, enumC1771030wBh4, enumC1771030wBh5, enumC1771030wBh6};
        LLILLJJLI = enumC1771030wBhArr;
        LLILLL = new C2254308sP(enumC1771030wBhArr);
    }

    public static EnumC1771030wBh[] values() {
        return (EnumC1771030wBh[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1771030wBh valueOf(String str) {
        return (EnumC1771030wBh) C08FF.LIZ(EnumC1771030wBh.class, str);
    }

    public EnumC1771030wBh(String str, int i, int i2) {
        this.LL = i2;
    }
}

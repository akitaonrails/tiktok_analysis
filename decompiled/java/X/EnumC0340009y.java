package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0340009y {
    public static final EnumC0340009y FAIL;
    public static final EnumC0340009y HIDE_IN_RANK;
    public static final /* synthetic */ EnumC0340009y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0340009y PASS;
    public static final EnumC0340009y PNS_DELETED;
    public static final EnumC0340009y UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0340009y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0340009y enumC0340009y = new EnumC0340009y("UNKNOWN", 0, 0);
        UNKNOWN = enumC0340009y;
        EnumC0340009y enumC0340009y2 = new EnumC0340009y("FAIL", 1, 1);
        FAIL = enumC0340009y2;
        EnumC0340009y enumC0340009y3 = new EnumC0340009y("PASS", 2, 2);
        PASS = enumC0340009y3;
        EnumC0340009y enumC0340009y4 = new EnumC0340009y("PNS_DELETED", 3, 3);
        PNS_DELETED = enumC0340009y4;
        EnumC0340009y enumC0340009y5 = new EnumC0340009y("HIDE_IN_RANK", 4, 4);
        HIDE_IN_RANK = enumC0340009y5;
        EnumC0340009y[] enumC0340009yArr = {enumC0340009y, enumC0340009y2, enumC0340009y3, enumC0340009y4, enumC0340009y5};
        LLILLJJLI = enumC0340009yArr;
        LLILLL = new C2254308sP(enumC0340009yArr);
    }

    public static EnumC0340009y[] values() {
        return (EnumC0340009y[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC0340009y valueOf(String str) {
        return (EnumC0340009y) C08FF.LIZ(EnumC0340009y.class, str);
    }

    public EnumC0340009y(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0v0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1725940v0y {
    public static final EnumC1725940v0y FAIL;
    public static final /* synthetic */ EnumC1725940v0y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1725940v0y NONE;
    public static final EnumC1725940v0y PENDING;
    public static final EnumC1725940v0y SUCCESS;

    public static InterfaceC2044707zh<EnumC1725940v0y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1725940v0y enumC1725940v0y = new EnumC1725940v0y("SUCCESS", 0);
        SUCCESS = enumC1725940v0y;
        EnumC1725940v0y enumC1725940v0y2 = new EnumC1725940v0y("FAIL", 1);
        FAIL = enumC1725940v0y2;
        EnumC1725940v0y enumC1725940v0y3 = new EnumC1725940v0y("NONE", 2);
        NONE = enumC1725940v0y3;
        EnumC1725940v0y enumC1725940v0y4 = new EnumC1725940v0y("PENDING", 3);
        PENDING = enumC1725940v0y4;
        EnumC1725940v0y[] enumC1725940v0yArr = {enumC1725940v0y, enumC1725940v0y2, enumC1725940v0y3, enumC1725940v0y4};
        LL = enumC1725940v0yArr;
        LLILLJJLI = new C2254308sP(enumC1725940v0yArr);
    }

    public static EnumC1725940v0y[] values() {
        return (EnumC1725940v0y[]) LL.clone();
    }

    public static EnumC1725940v0y valueOf(String str) {
        return (EnumC1725940v0y) C08FF.LIZ(EnumC1725940v0y.class, str);
    }

    public EnumC1725940v0y(String str, int i) {
    }
}

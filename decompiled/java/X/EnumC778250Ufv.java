package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ufv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC778250Ufv {
    public static final EnumC778250Ufv BEFORE_LIVE;
    public static final EnumC778250Ufv IN_LIVE;
    public static final /* synthetic */ EnumC778250Ufv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC778250Ufv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC778250Ufv enumC778250Ufv = new EnumC778250Ufv("BEFORE_LIVE", 0, "before_live");
        BEFORE_LIVE = enumC778250Ufv;
        EnumC778250Ufv enumC778250Ufv2 = new EnumC778250Ufv("IN_LIVE", 1, "in_live");
        IN_LIVE = enumC778250Ufv2;
        EnumC778250Ufv[] enumC778250UfvArr = {enumC778250Ufv, enumC778250Ufv2};
        LLILLJJLI = enumC778250UfvArr;
        LLILLL = new C2254308sP(enumC778250UfvArr);
    }

    public static EnumC778250Ufv[] values() {
        return (EnumC778250Ufv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC778250Ufv valueOf(String str) {
        return (EnumC778250Ufv) C08FF.LIZ(EnumC778250Ufv.class, str);
    }

    public EnumC778250Ufv(String str, int i, String str2) {
        this.LL = str2;
    }
}

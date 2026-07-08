package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19356210o4 {
    public static final EnumC19356210o4 EXPIRED_DATA;
    public static final /* synthetic */ EnumC19356210o4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19356210o4 NO_DATA;
    public static final EnumC19356210o4 NO_TIMESTAMP;
    public static final EnumC19356210o4 USED_DATA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19356210o4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19356210o4 enumC19356210o4 = new EnumC19356210o4("NO_DATA", 0, "no_data");
        NO_DATA = enumC19356210o4;
        EnumC19356210o4 enumC19356210o42 = new EnumC19356210o4("NO_TIMESTAMP", 1, "no_timestamp");
        NO_TIMESTAMP = enumC19356210o42;
        EnumC19356210o4 enumC19356210o43 = new EnumC19356210o4("EXPIRED_DATA", 2, "expired_data");
        EXPIRED_DATA = enumC19356210o43;
        EnumC19356210o4 enumC19356210o44 = new EnumC19356210o4("USED_DATA", 3, "used_data");
        USED_DATA = enumC19356210o44;
        EnumC19356210o4[] enumC19356210o4Arr = {enumC19356210o4, enumC19356210o42, enumC19356210o43, enumC19356210o44};
        LLILLJJLI = enumC19356210o4Arr;
        LLILLL = new C2254308sP(enumC19356210o4Arr);
    }

    public static EnumC19356210o4[] values() {
        return (EnumC19356210o4[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC19356210o4 valueOf(String str) {
        return (EnumC19356210o4) C08FF.LIZ(EnumC19356210o4.class, str);
    }

    public EnumC19356210o4(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994170byh {
    public static final EnumC994170byh ANCHOR;
    public static final EnumC994170byh GUEST;
    public static final /* synthetic */ EnumC994170byh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994170byh VIEWER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC994170byh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994170byh enumC994170byh = new EnumC994170byh("ANCHOR", 0, "a");
        ANCHOR = enumC994170byh;
        EnumC994170byh enumC994170byh2 = new EnumC994170byh("GUEST", 1, "g");
        GUEST = enumC994170byh2;
        EnumC994170byh enumC994170byh3 = new EnumC994170byh("VIEWER", 2, "v");
        VIEWER = enumC994170byh3;
        EnumC994170byh[] enumC994170byhArr = {enumC994170byh, enumC994170byh2, enumC994170byh3};
        LLILLJJLI = enumC994170byhArr;
        LLILLL = new C2254308sP(enumC994170byhArr);
    }

    public static EnumC994170byh[] values() {
        return (EnumC994170byh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC994170byh valueOf(String str) {
        return (EnumC994170byh) C08FF.LIZ(EnumC994170byh.class, str);
    }

    public EnumC994170byh(String str, int i, String str2) {
        this.LL = str2;
    }
}

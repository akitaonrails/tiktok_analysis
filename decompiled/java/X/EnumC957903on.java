package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC957903on {
    public static final EnumC957903on CLOSE;
    public static final /* synthetic */ EnumC957903on[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC957903on OPEN_SCHEMA;
    public static final EnumC957903on REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC957903on> getEntries() {
        return LLILLL;
    }

    static {
        EnumC957903on enumC957903on = new EnumC957903on("REFRESH", 0, "refresh");
        REFRESH = enumC957903on;
        EnumC957903on enumC957903on2 = new EnumC957903on("OPEN_SCHEMA", 1, "open-schema");
        OPEN_SCHEMA = enumC957903on2;
        EnumC957903on enumC957903on3 = new EnumC957903on("CLOSE", 2, "close");
        CLOSE = enumC957903on3;
        EnumC957903on[] enumC957903onArr = {enumC957903on, enumC957903on2, enumC957903on3};
        LLILLJJLI = enumC957903onArr;
        LLILLL = new C2254308sP(enumC957903onArr);
    }

    public static EnumC957903on[] values() {
        return (EnumC957903on[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC957903on valueOf(String str) {
        return (EnumC957903on) C08FF.LIZ(EnumC957903on.class, str);
    }

    public EnumC957903on(String str, int i, String str2) {
        this.LL = str2;
    }
}

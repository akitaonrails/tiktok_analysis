package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC888403da {
    public static final /* synthetic */ EnumC888403da[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC888403da MIT;
    public static final EnumC888403da NEW_ADD;
    public static final EnumC888403da NOT_MIT;
    public static final EnumC888403da UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC888403da> getEntries() {
        return LLILLL;
    }

    static {
        EnumC888403da enumC888403da = new EnumC888403da("UNKNOWN", 0, "");
        UNKNOWN = enumC888403da;
        EnumC888403da enumC888403da2 = new EnumC888403da("MIT", 1, "mit");
        MIT = enumC888403da2;
        EnumC888403da enumC888403da3 = new EnumC888403da("NOT_MIT", 2, "not_mit");
        NOT_MIT = enumC888403da3;
        EnumC888403da enumC888403da4 = new EnumC888403da("NEW_ADD", 3, "new_add");
        NEW_ADD = enumC888403da4;
        EnumC888403da[] enumC888403daArr = {enumC888403da, enumC888403da2, enumC888403da3, enumC888403da4};
        LLILLJJLI = enumC888403daArr;
        LLILLL = new C2254308sP(enumC888403daArr);
    }

    public static EnumC888403da[] values() {
        return (EnumC888403da[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC888403da valueOf(String str) {
        return (EnumC888403da) C08FF.LIZ(EnumC888403da.class, str);
    }

    public EnumC888403da(String str, int i, String str2) {
        this.LL = str2;
    }
}

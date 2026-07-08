package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1845760y8E {
    public static final EnumC1845760y8E CONNECT;
    public static final EnumC1845760y8E FETCH;
    public static final EnumC1845760y8E INVALID_LINK;
    public static final /* synthetic */ EnumC1845760y8E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1845760y8E NONE;
    public static final EnumC1845760y8E NOT_MATCH;
    public static final EnumC1845760y8E SECURITY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1845760y8E> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1845760y8E enumC1845760y8E = new EnumC1845760y8E("NOT_MATCH", 0, "not_match");
        NOT_MATCH = enumC1845760y8E;
        EnumC1845760y8E enumC1845760y8E2 = new EnumC1845760y8E("CONNECT", 1, "connect");
        CONNECT = enumC1845760y8E2;
        EnumC1845760y8E enumC1845760y8E3 = new EnumC1845760y8E("FETCH", 2, "fetch");
        FETCH = enumC1845760y8E3;
        EnumC1845760y8E enumC1845760y8E4 = new EnumC1845760y8E("INVALID_LINK", 3, "invalid_link");
        INVALID_LINK = enumC1845760y8E4;
        EnumC1845760y8E enumC1845760y8E5 = new EnumC1845760y8E("SECURITY", 4, "security");
        SECURITY = enumC1845760y8E5;
        EnumC1845760y8E enumC1845760y8E6 = new EnumC1845760y8E("NONE", 5, "");
        NONE = enumC1845760y8E6;
        EnumC1845760y8E[] enumC1845760y8EArr = {enumC1845760y8E, enumC1845760y8E2, enumC1845760y8E3, enumC1845760y8E4, enumC1845760y8E5, enumC1845760y8E6};
        LLILLJJLI = enumC1845760y8EArr;
        LLILLL = new C2254308sP(enumC1845760y8EArr);
    }

    public static EnumC1845760y8E[] values() {
        return (EnumC1845760y8E[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1845760y8E valueOf(String str) {
        return (EnumC1845760y8E) C08FF.LIZ(EnumC1845760y8E.class, str);
    }

    public EnumC1845760y8E(String str, int i, String str2) {
        this.LL = str2;
    }
}

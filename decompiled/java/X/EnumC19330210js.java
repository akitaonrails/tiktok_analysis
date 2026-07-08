package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19330210js {
    public static final EnumC19330210js BY_AVOIDANCE;
    public static final EnumC19330210js BY_BUSINESS;
    public static final EnumC19330210js BY_COMMAND;
    public static final EnumC19330210js BY_DUPLICATION;
    public static final EnumC19330210js BY_EXPIRATION;
    public static final EnumC19330210js BY_FREQUENCY;
    public static final EnumC19330210js BY_INNER_PUSH_OPT;
    public static final EnumC19330210js BY_INVALID;
    public static final EnumC19330210js BY_LOCAL_PUSH_CHECK;
    public static final EnumC19330210js BY_NOTICE_READ;
    public static final EnumC19330210js BY_PERMISSION;
    public static final EnumC19330210js BY_UITEMPLATENULL;
    public static final EnumC19330210js BY_USERID_MISMATCH;
    public static final /* synthetic */ EnumC19330210js[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19330210js PASS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19330210js> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19330210js enumC19330210js = new EnumC19330210js("PASS", 0, "PASS");
        PASS = enumC19330210js;
        EnumC19330210js enumC19330210js2 = new EnumC19330210js("BY_INVALID", 1, "INVALID");
        BY_INVALID = enumC19330210js2;
        EnumC19330210js enumC19330210js3 = new EnumC19330210js("BY_COMMAND", 2, "COMMAND");
        BY_COMMAND = enumC19330210js3;
        EnumC19330210js enumC19330210js4 = new EnumC19330210js("BY_BUSINESS", 3, "BUSINESS");
        BY_BUSINESS = enumC19330210js4;
        EnumC19330210js enumC19330210js5 = new EnumC19330210js("BY_PERMISSION", 4, "PERMISSION");
        BY_PERMISSION = enumC19330210js5;
        EnumC19330210js enumC19330210js6 = new EnumC19330210js("BY_EXPIRATION", 5, "EXPIRATION");
        BY_EXPIRATION = enumC19330210js6;
        EnumC19330210js enumC19330210js7 = new EnumC19330210js("BY_DUPLICATION", 6, "DUPLICATION");
        BY_DUPLICATION = enumC19330210js7;
        EnumC19330210js enumC19330210js8 = new EnumC19330210js("BY_FREQUENCY", 7, "FREQUENCY");
        BY_FREQUENCY = enumC19330210js8;
        EnumC19330210js enumC19330210js9 = new EnumC19330210js("BY_NOTICE_READ", 8, "NOTICE_READ");
        BY_NOTICE_READ = enumC19330210js9;
        EnumC19330210js enumC19330210js10 = new EnumC19330210js("BY_USERID_MISMATCH", 9, "USERID_MISMATCH");
        BY_USERID_MISMATCH = enumC19330210js10;
        EnumC19330210js enumC19330210js11 = new EnumC19330210js("BY_LOCAL_PUSH_CHECK", 10, "LOCAL_PUSH_CHECK");
        BY_LOCAL_PUSH_CHECK = enumC19330210js11;
        EnumC19330210js enumC19330210js12 = new EnumC19330210js("BY_AVOIDANCE", 11, "AVOIDANCE");
        BY_AVOIDANCE = enumC19330210js12;
        EnumC19330210js enumC19330210js13 = new EnumC19330210js("BY_UITEMPLATENULL", 12, "UITEMPLATENULL");
        BY_UITEMPLATENULL = enumC19330210js13;
        EnumC19330210js enumC19330210js14 = new EnumC19330210js("BY_INNER_PUSH_OPT", 13, "INNER_PUSH_OPT");
        BY_INNER_PUSH_OPT = enumC19330210js14;
        EnumC19330210js[] enumC19330210jsArr = {enumC19330210js, enumC19330210js2, enumC19330210js3, enumC19330210js4, enumC19330210js5, enumC19330210js6, enumC19330210js7, enumC19330210js8, enumC19330210js9, enumC19330210js10, enumC19330210js11, enumC19330210js12, enumC19330210js13, enumC19330210js14};
        LLILLJJLI = enumC19330210jsArr;
        LLILLL = new C2254308sP(enumC19330210jsArr);
    }

    public static EnumC19330210js[] values() {
        return (EnumC19330210js[]) LLILLJJLI.clone();
    }

    public final String getInfo() {
        return this.LL;
    }

    public static EnumC19330210js valueOf(String str) {
        return (EnumC19330210js) C08FF.LIZ(EnumC19330210js.class, str);
    }

    public EnumC19330210js(String str, int i, String str2) {
        this.LL = str2;
    }
}

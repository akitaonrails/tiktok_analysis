package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0318009c {
    public static final EnumC0318009c ADDRESS_INVALID;
    public static final EnumC0318009c AUTHENTICATION_FAILED;
    public static final EnumC0318009c BPEA_FAILED;
    public static final EnumC0318009c ENGINE_ERROR;
    public static final EnumC0318009c INIT_FAILED;
    public static final /* synthetic */ EnumC0318009c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0318009c MIC_OCCUPIED;
    public static final EnumC0318009c NETWORK_ERROR;
    public static final EnumC0318009c NONE;
    public static final EnumC0318009c NO_PERMISSION;
    public static final EnumC0318009c NO_VOICE;
    public static final EnumC0318009c SEND_DIRECTIVE_WRONG_STATE;
    public static final EnumC0318009c SENSITIVE_REJECTED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0318009c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0318009c enumC0318009c = new EnumC0318009c("NONE", 0, 0);
        NONE = enumC0318009c;
        EnumC0318009c enumC0318009c2 = new EnumC0318009c("INIT_FAILED", 1, -101);
        INIT_FAILED = enumC0318009c2;
        EnumC0318009c enumC0318009c3 = new EnumC0318009c("AUTHENTICATION_FAILED", 2, -102);
        AUTHENTICATION_FAILED = enumC0318009c3;
        EnumC0318009c enumC0318009c4 = new EnumC0318009c("ADDRESS_INVALID", 3, -103);
        ADDRESS_INVALID = enumC0318009c4;
        EnumC0318009c enumC0318009c5 = new EnumC0318009c("BPEA_FAILED", 4, -104);
        BPEA_FAILED = enumC0318009c5;
        EnumC0318009c enumC0318009c6 = new EnumC0318009c("NO_PERMISSION", 5, -105);
        NO_PERMISSION = enumC0318009c6;
        EnumC0318009c enumC0318009c7 = new EnumC0318009c("MIC_OCCUPIED", 6, -106);
        MIC_OCCUPIED = enumC0318009c7;
        EnumC0318009c enumC0318009c8 = new EnumC0318009c("NETWORK_ERROR", 7, -107);
        NETWORK_ERROR = enumC0318009c8;
        EnumC0318009c enumC0318009c9 = new EnumC0318009c("SEND_DIRECTIVE_WRONG_STATE", 8, -108);
        SEND_DIRECTIVE_WRONG_STATE = enumC0318009c9;
        EnumC0318009c enumC0318009c10 = new EnumC0318009c("SENSITIVE_REJECTED", 9, -201);
        SENSITIVE_REJECTED = enumC0318009c10;
        EnumC0318009c enumC0318009c11 = new EnumC0318009c("NO_VOICE", 10, -202);
        NO_VOICE = enumC0318009c11;
        EnumC0318009c enumC0318009c12 = new EnumC0318009c("ENGINE_ERROR", 11, -999);
        ENGINE_ERROR = enumC0318009c12;
        EnumC0318009c[] enumC0318009cArr = {enumC0318009c, enumC0318009c2, enumC0318009c3, enumC0318009c4, enumC0318009c5, enumC0318009c6, enumC0318009c7, enumC0318009c8, enumC0318009c9, enumC0318009c10, enumC0318009c11, enumC0318009c12};
        LLILLJJLI = enumC0318009cArr;
        LLILLL = new C2254308sP(enumC0318009cArr);
    }

    public static EnumC0318009c[] values() {
        return (EnumC0318009c[]) LLILLJJLI.clone();
    }

    public final int getSemanticCode() {
        return this.LL;
    }

    public static EnumC0318009c valueOf(String str) {
        return (EnumC0318009c) C08FF.LIZ(EnumC0318009c.class, str);
    }

    public EnumC0318009c(String str, int i, int i2) {
        this.LL = i2;
    }
}

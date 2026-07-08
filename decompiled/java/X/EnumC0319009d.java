package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0319009d {
    public static final EnumC0319009d ILLEGAL_PARAMETERS;
    public static final /* synthetic */ EnumC0319009d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0319009d NETWORK_ERROR;
    public static final EnumC0319009d NO_PLAY_RESULT;
    public static final EnumC0319009d NULL_CHALLENGE_ENTRIES;
    public static final EnumC0319009d NULL_FIRST_SCORE;
    public static final EnumC0319009d NULL_RESPONSE;
    public static final EnumC0319009d SUCCESS;
    public static final EnumC0319009d TASK_ID_NULL;
    public static final EnumC0319009d UNEXPECTED_SERVER_RESPONSE;
    public static final EnumC0319009d UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0319009d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0319009d enumC0319009d = new EnumC0319009d("UNKNOWN", 0, -1);
        UNKNOWN = enumC0319009d;
        EnumC0319009d enumC0319009d2 = new EnumC0319009d("SUCCESS", 1, 0);
        SUCCESS = enumC0319009d2;
        EnumC0319009d enumC0319009d3 = new EnumC0319009d("NETWORK_ERROR", 2, 1);
        NETWORK_ERROR = enumC0319009d3;
        EnumC0319009d enumC0319009d4 = new EnumC0319009d("UNEXPECTED_SERVER_RESPONSE", 3, 2);
        UNEXPECTED_SERVER_RESPONSE = enumC0319009d4;
        EnumC0319009d enumC0319009d5 = new EnumC0319009d("ILLEGAL_PARAMETERS", 4, 3);
        ILLEGAL_PARAMETERS = enumC0319009d5;
        EnumC0319009d enumC0319009d6 = new EnumC0319009d("NO_PLAY_RESULT", 5, 4);
        NO_PLAY_RESULT = enumC0319009d6;
        EnumC0319009d enumC0319009d7 = new EnumC0319009d("TASK_ID_NULL", 6, 5);
        TASK_ID_NULL = enumC0319009d7;
        EnumC0319009d enumC0319009d8 = new EnumC0319009d("NULL_FIRST_SCORE", 7, 7);
        NULL_FIRST_SCORE = enumC0319009d8;
        EnumC0319009d enumC0319009d9 = new EnumC0319009d("NULL_CHALLENGE_ENTRIES", 8, 8);
        NULL_CHALLENGE_ENTRIES = enumC0319009d9;
        EnumC0319009d enumC0319009d10 = new EnumC0319009d("NULL_RESPONSE", 9, 9);
        NULL_RESPONSE = enumC0319009d10;
        EnumC0319009d[] enumC0319009dArr = {enumC0319009d, enumC0319009d2, enumC0319009d3, enumC0319009d4, enumC0319009d5, enumC0319009d6, enumC0319009d7, enumC0319009d8, enumC0319009d9, enumC0319009d10};
        LLILLJJLI = enumC0319009dArr;
        LLILLL = new C2254308sP(enumC0319009dArr);
    }

    public static EnumC0319009d[] values() {
        return (EnumC0319009d[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0319009d valueOf(String str) {
        return (EnumC0319009d) C08FF.LIZ(EnumC0319009d.class, str);
    }

    public EnumC0319009d(String str, int i, int i2) {
        this.LL = i2;
    }
}

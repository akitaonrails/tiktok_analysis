package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC905800ZgA {
    public static final EnumC905800ZgA AUTO_START_ON_OPEN;
    public static final /* synthetic */ EnumC905800ZgA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC905800ZgA MANUAL_RESUME;
    public static final EnumC905800ZgA MANUAL_START;
    public static final EnumC905800ZgA MESSAGE_SENT;
    public static final EnumC905800ZgA RESUME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC905800ZgA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC905800ZgA enumC905800ZgA = new EnumC905800ZgA("MESSAGE_SENT", 0, "message_sent");
        MESSAGE_SENT = enumC905800ZgA;
        EnumC905800ZgA enumC905800ZgA2 = new EnumC905800ZgA("RESUME", 1, "resume");
        RESUME = enumC905800ZgA2;
        EnumC905800ZgA enumC905800ZgA3 = new EnumC905800ZgA("AUTO_START_ON_OPEN", 2, "auto_start_on_open");
        AUTO_START_ON_OPEN = enumC905800ZgA3;
        EnumC905800ZgA enumC905800ZgA4 = new EnumC905800ZgA("MANUAL_START", 3, "manual_start");
        MANUAL_START = enumC905800ZgA4;
        EnumC905800ZgA enumC905800ZgA5 = new EnumC905800ZgA("MANUAL_RESUME", 4, "manual_resume");
        MANUAL_RESUME = enumC905800ZgA5;
        EnumC905800ZgA[] enumC905800ZgAArr = {enumC905800ZgA, enumC905800ZgA2, enumC905800ZgA3, enumC905800ZgA4, enumC905800ZgA5};
        LLILLJJLI = enumC905800ZgAArr;
        LLILLL = new C2254308sP(enumC905800ZgAArr);
    }

    public static EnumC905800ZgA[] values() {
        return (EnumC905800ZgA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC905800ZgA valueOf(String str) {
        return (EnumC905800ZgA) C08FF.LIZ(EnumC905800ZgA.class, str);
    }

    public EnumC905800ZgA(String str, int i, String str2) {
        this.LL = str2;
    }
}

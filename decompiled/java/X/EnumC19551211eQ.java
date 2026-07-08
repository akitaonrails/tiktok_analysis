package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19551211eQ {
    public static final EnumC19551211eQ AUTO_CUT_AGENT;
    public static final EnumC19551211eQ CAPTION;
    public static final /* synthetic */ EnumC19551211eQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19551211eQ NORMAL;
    public static final EnumC19551211eQ TEST_SPEED;
    public static final EnumC19551211eQ VOICE_CONVERSION;
    public static final EnumC19551211eQ VOICE_REPLACE;

    public static InterfaceC2044707zh<EnumC19551211eQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19551211eQ enumC19551211eQ = new EnumC19551211eQ("NORMAL", 0);
        NORMAL = enumC19551211eQ;
        EnumC19551211eQ enumC19551211eQ2 = new EnumC19551211eQ("CAPTION", 1);
        CAPTION = enumC19551211eQ2;
        EnumC19551211eQ enumC19551211eQ3 = new EnumC19551211eQ("TEST_SPEED", 2);
        TEST_SPEED = enumC19551211eQ3;
        EnumC19551211eQ enumC19551211eQ4 = new EnumC19551211eQ("VOICE_CONVERSION", 3);
        VOICE_CONVERSION = enumC19551211eQ4;
        EnumC19551211eQ enumC19551211eQ5 = new EnumC19551211eQ("VOICE_REPLACE", 4);
        VOICE_REPLACE = enumC19551211eQ5;
        EnumC19551211eQ enumC19551211eQ6 = new EnumC19551211eQ("AUTO_CUT_AGENT", 5);
        AUTO_CUT_AGENT = enumC19551211eQ6;
        EnumC19551211eQ[] enumC19551211eQArr = {enumC19551211eQ, enumC19551211eQ2, enumC19551211eQ3, enumC19551211eQ4, enumC19551211eQ5, enumC19551211eQ6};
        LL = enumC19551211eQArr;
        LLILLJJLI = new C2254308sP(enumC19551211eQArr);
    }

    public static EnumC19551211eQ[] values() {
        return (EnumC19551211eQ[]) LL.clone();
    }

    public static EnumC19551211eQ valueOf(String str) {
        return (EnumC19551211eQ) C08FF.LIZ(EnumC19551211eQ.class, str);
    }

    public EnumC19551211eQ(String str, int i) {
    }
}

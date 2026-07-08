package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1687410u0p {
    public static final EnumC1687410u0p AI_ANSWER;
    public static final EnumC1687410u0p AWEME_INFO;
    public static final EnumC1687410u0p ERROR_MESSAGE;
    public static final /* synthetic */ EnumC1687410u0p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1687410u0p NEW_USER_GUIDE;
    public static final EnumC1687410u0p NORMAL_TIP;
    public static final EnumC1687410u0p THINK;
    public static final EnumC1687410u0p TNS_BLOCKED;
    public static final EnumC1687410u0p USER_QUERY;
    public static final EnumC1687410u0p VIDEO_SUMMARY;

    public static InterfaceC2044707zh<EnumC1687410u0p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1687410u0p enumC1687410u0p = new EnumC1687410u0p("USER_QUERY", 0);
        USER_QUERY = enumC1687410u0p;
        EnumC1687410u0p enumC1687410u0p2 = new EnumC1687410u0p("THINK", 1);
        THINK = enumC1687410u0p2;
        EnumC1687410u0p enumC1687410u0p3 = new EnumC1687410u0p("AI_ANSWER", 2);
        AI_ANSWER = enumC1687410u0p3;
        EnumC1687410u0p enumC1687410u0p4 = new EnumC1687410u0p("VIDEO_SUMMARY", 3);
        VIDEO_SUMMARY = enumC1687410u0p4;
        EnumC1687410u0p enumC1687410u0p5 = new EnumC1687410u0p("NEW_USER_GUIDE", 4);
        NEW_USER_GUIDE = enumC1687410u0p5;
        EnumC1687410u0p enumC1687410u0p6 = new EnumC1687410u0p("ERROR_MESSAGE", 5);
        ERROR_MESSAGE = enumC1687410u0p6;
        EnumC1687410u0p enumC1687410u0p7 = new EnumC1687410u0p("TNS_BLOCKED", 6);
        TNS_BLOCKED = enumC1687410u0p7;
        EnumC1687410u0p enumC1687410u0p8 = new EnumC1687410u0p("AWEME_INFO", 7);
        AWEME_INFO = enumC1687410u0p8;
        EnumC1687410u0p enumC1687410u0p9 = new EnumC1687410u0p("NORMAL_TIP", 8);
        NORMAL_TIP = enumC1687410u0p9;
        EnumC1687410u0p[] enumC1687410u0pArr = {enumC1687410u0p, enumC1687410u0p2, enumC1687410u0p3, enumC1687410u0p4, enumC1687410u0p5, enumC1687410u0p6, enumC1687410u0p7, enumC1687410u0p8, enumC1687410u0p9};
        LL = enumC1687410u0pArr;
        LLILLJJLI = new C2254308sP(enumC1687410u0pArr);
    }

    public static EnumC1687410u0p[] values() {
        return (EnumC1687410u0p[]) LL.clone();
    }

    public static EnumC1687410u0p valueOf(String str) {
        return (EnumC1687410u0p) C08FF.LIZ(EnumC1687410u0p.class, str);
    }

    public EnumC1687410u0p(String str, int i) {
    }
}

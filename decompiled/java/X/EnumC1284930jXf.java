package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1284930jXf {
    public static final EnumC1284930jXf AUTH_FETCHED;
    public static final EnumC1284930jXf AUTH_FETCH_START;
    public static final EnumC1284930jXf CONVERSATION_FETCHED;
    public static final EnumC1284930jXf CONVERSATION_FETCH_START;
    public static final /* synthetic */ EnumC1284930jXf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1284930jXf PAGE_ENTERED;
    public static final EnumC1284930jXf RTC_INIT_DONE;
    public static final EnumC1284930jXf RTC_INIT_START;
    public static final EnumC1284930jXf USER_JOINED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1284930jXf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1284930jXf enumC1284930jXf = new EnumC1284930jXf("PAGE_ENTERED", 0, "pageEntered");
        PAGE_ENTERED = enumC1284930jXf;
        EnumC1284930jXf enumC1284930jXf2 = new EnumC1284930jXf("CONVERSATION_FETCH_START", 1, "conversationFetchStart");
        CONVERSATION_FETCH_START = enumC1284930jXf2;
        EnumC1284930jXf enumC1284930jXf3 = new EnumC1284930jXf("CONVERSATION_FETCHED", 2, "conversationFetched");
        CONVERSATION_FETCHED = enumC1284930jXf3;
        EnumC1284930jXf enumC1284930jXf4 = new EnumC1284930jXf("AUTH_FETCH_START", 3, "authFetchStart");
        AUTH_FETCH_START = enumC1284930jXf4;
        EnumC1284930jXf enumC1284930jXf5 = new EnumC1284930jXf("AUTH_FETCHED", 4, "authFetched");
        AUTH_FETCHED = enumC1284930jXf5;
        EnumC1284930jXf enumC1284930jXf6 = new EnumC1284930jXf("RTC_INIT_START", 5, "rtcInitStart");
        RTC_INIT_START = enumC1284930jXf6;
        EnumC1284930jXf enumC1284930jXf7 = new EnumC1284930jXf("RTC_INIT_DONE", 6, "rtcInitDone");
        RTC_INIT_DONE = enumC1284930jXf7;
        EnumC1284930jXf enumC1284930jXf8 = new EnumC1284930jXf("USER_JOINED", 7, "userJoined");
        USER_JOINED = enumC1284930jXf8;
        EnumC1284930jXf[] enumC1284930jXfArr = {enumC1284930jXf, enumC1284930jXf2, enumC1284930jXf3, enumC1284930jXf4, enumC1284930jXf5, enumC1284930jXf6, enumC1284930jXf7, enumC1284930jXf8};
        LLILLJJLI = enumC1284930jXfArr;
        LLILLL = new C2254308sP(enumC1284930jXfArr);
    }

    public static EnumC1284930jXf[] values() {
        return (EnumC1284930jXf[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1284930jXf valueOf(String str) {
        return (EnumC1284930jXf) C08FF.LIZ(EnumC1284930jXf.class, str);
    }

    public EnumC1284930jXf(String str, int i, String str2) {
        this.LL = str2;
    }
}

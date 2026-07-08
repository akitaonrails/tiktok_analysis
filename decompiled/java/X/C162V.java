package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.162V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162V {
    public static final C162V ADDED_TO_DO_NOT_TRANSLATE;
    public static final C162V CHANGE_TARGET_LANGUAGE;
    public static final C162V FAILURE;
    public static final /* synthetic */ C162V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C162V ONE_TIME_TRANSLATION_REQUEST;
    public static final C162V SUCCESS;
    public static final C162V SWITCH_VIDEO;
    public static final C162V TRANSLATION_TURNED_OFF;
    public static final C162V UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C162V> getEntries() {
        return LLILLL;
    }

    static {
        C162V c162v = new C162V("UNKNOWN", 0, -1);
        UNKNOWN = c162v;
        C162V c162v2 = new C162V("SUCCESS", 1, 1);
        SUCCESS = c162v2;
        C162V c162v3 = new C162V("FAILURE", 2, 2);
        FAILURE = c162v3;
        C162V c162v4 = new C162V("SWITCH_VIDEO", 3, 3);
        SWITCH_VIDEO = c162v4;
        C162V c162v5 = new C162V("TRANSLATION_TURNED_OFF", 4, 4);
        TRANSLATION_TURNED_OFF = c162v5;
        C162V c162v6 = new C162V("ADDED_TO_DO_NOT_TRANSLATE", 5, 5);
        ADDED_TO_DO_NOT_TRANSLATE = c162v6;
        C162V c162v7 = new C162V("CHANGE_TARGET_LANGUAGE", 6, 6);
        CHANGE_TARGET_LANGUAGE = c162v7;
        C162V c162v8 = new C162V("ONE_TIME_TRANSLATION_REQUEST", 7, 7);
        ONE_TIME_TRANSLATION_REQUEST = c162v8;
        C162V[] c162vArr = {c162v, c162v2, c162v3, c162v4, c162v5, c162v6, c162v7, c162v8};
        LLILLJJLI = c162vArr;
        LLILLL = new C2254308sP(c162vArr);
    }

    public static C162V[] values() {
        return (C162V[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C162V valueOf(String str) {
        return (C162V) C08FF.LIZ(C162V.class, str);
    }

    public C162V(String str, int i, int i2) {
        this.LL = i2;
    }
}

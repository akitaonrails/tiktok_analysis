package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06SM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SM {
    public static final C06SM BLOCKED;
    public static final C06SM FILTERED;
    public static final C06SM INVALID;
    public static final /* synthetic */ C06SM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06SM MESSAGE_REQUEST;
    public static final C06SM MUTED;
    public static final C06SM NORMAL;
    public static final C06SM OVER_THRESHOLD;
    public static final C06SM RECOMMENDED;
    public static final C06SM SECONDARY;

    public static InterfaceC2044707zh<C06SM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06SM c06sm = new C06SM("NORMAL", 0);
        NORMAL = c06sm;
        C06SM c06sm2 = new C06SM("INVALID", 1);
        INVALID = c06sm2;
        C06SM c06sm3 = new C06SM("RECOMMENDED", 2);
        RECOMMENDED = c06sm3;
        C06SM c06sm4 = new C06SM("MUTED", 3);
        MUTED = c06sm4;
        C06SM c06sm5 = new C06SM("BLOCKED", 4);
        BLOCKED = c06sm5;
        C06SM c06sm6 = new C06SM("FILTERED", 5);
        FILTERED = c06sm6;
        C06SM c06sm7 = new C06SM("OVER_THRESHOLD", 6);
        OVER_THRESHOLD = c06sm7;
        C06SM c06sm8 = new C06SM("SECONDARY", 7);
        SECONDARY = c06sm8;
        C06SM c06sm9 = new C06SM("MESSAGE_REQUEST", 8);
        MESSAGE_REQUEST = c06sm9;
        C06SM[] c06smArr = {c06sm, c06sm2, c06sm3, c06sm4, c06sm5, c06sm6, c06sm7, c06sm8, c06sm9};
        LL = c06smArr;
        LLILLJJLI = new C2254308sP(c06smArr);
    }

    public static C06SM[] values() {
        return (C06SM[]) LL.clone();
    }

    public static C06SM valueOf(String str) {
        return (C06SM) C08FF.LIZ(C06SM.class, str);
    }

    public C06SM(String str, int i) {
    }
}

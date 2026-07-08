package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0565, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0565 {
    public static final /* synthetic */ AnonymousClass0565[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0565 NOTICE_ACTION_CLICK;
    public static final AnonymousClass0565 NOTICE_ACTION_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0565> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0565 anonymousClass0565 = new AnonymousClass0565("NOTICE_ACTION_UNKNOWN", 0, 0);
        NOTICE_ACTION_UNKNOWN = anonymousClass0565;
        AnonymousClass0565 anonymousClass05652 = new AnonymousClass0565("NOTICE_ACTION_CLICK", 1, 1);
        NOTICE_ACTION_CLICK = anonymousClass05652;
        AnonymousClass0565[] anonymousClass0565Arr = {anonymousClass0565, anonymousClass05652};
        LLILLJJLI = anonymousClass0565Arr;
        LLILLL = new C2254308sP(anonymousClass0565Arr);
    }

    public static AnonymousClass0565[] values() {
        return (AnonymousClass0565[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AnonymousClass0565 valueOf(String str) {
        return (AnonymousClass0565) C08FF.LIZ(AnonymousClass0565.class, str);
    }

    public AnonymousClass0565(String str, int i, int i2) {
        this.LL = i2;
    }
}

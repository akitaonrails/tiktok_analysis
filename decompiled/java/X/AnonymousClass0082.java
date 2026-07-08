package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0082, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0082 {
    public static final /* synthetic */ AnonymousClass0082[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0082 STORY_REPLY_SA_QUICK_TAB;
    public static final AnonymousClass0082 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0082> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0082 anonymousClass0082 = new AnonymousClass0082("UNKNOWN", 0, 0);
        UNKNOWN = anonymousClass0082;
        AnonymousClass0082 anonymousClass00822 = new AnonymousClass0082("STORY_REPLY_SA_QUICK_TAB", 1, 1);
        STORY_REPLY_SA_QUICK_TAB = anonymousClass00822;
        AnonymousClass0082[] anonymousClass0082Arr = {anonymousClass0082, anonymousClass00822};
        LLILLJJLI = anonymousClass0082Arr;
        LLILLL = new C2254308sP(anonymousClass0082Arr);
    }

    public static AnonymousClass0082[] values() {
        return (AnonymousClass0082[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AnonymousClass0082 valueOf(String str) {
        return (AnonymousClass0082) C08FF.LIZ(AnonymousClass0082.class, str);
    }

    public AnonymousClass0082(String str, int i, int i2) {
        this.LL = i2;
    }
}

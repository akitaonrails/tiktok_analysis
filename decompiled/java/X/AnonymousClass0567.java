package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0567, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0567 {
    public static final AnonymousClass0567 CREATOR_ENTRANCE;
    public static final /* synthetic */ AnonymousClass0567[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0567 REVIEW_ENTRANCE;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0567> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0567 anonymousClass0567 = new AnonymousClass0567("REVIEW_ENTRANCE", 0, 0);
        REVIEW_ENTRANCE = anonymousClass0567;
        AnonymousClass0567 anonymousClass05672 = new AnonymousClass0567("CREATOR_ENTRANCE", 1, 1);
        CREATOR_ENTRANCE = anonymousClass05672;
        AnonymousClass0567[] anonymousClass0567Arr = {anonymousClass0567, anonymousClass05672};
        LLILLJJLI = anonymousClass0567Arr;
        LLILLL = new C2254308sP(anonymousClass0567Arr);
    }

    public static AnonymousClass0567[] values() {
        return (AnonymousClass0567[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static AnonymousClass0567 valueOf(String str) {
        return (AnonymousClass0567) C08FF.LIZ(AnonymousClass0567.class, str);
    }

    public AnonymousClass0567(String str, int i, int i2) {
        this.LL = i2;
    }
}

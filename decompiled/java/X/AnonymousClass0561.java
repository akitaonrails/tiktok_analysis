package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0561, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0561 {
    public static final /* synthetic */ AnonymousClass0561[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0561 SURPRISE_RESOURCE_TYPE_ENUM_ACTIVITY_SURPRISE;
    public static final AnonymousClass0561 SURPRISE_RESOURCE_TYPE_ENUM_FIRST_COMMENT_SURPRISE;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0561> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0561 anonymousClass0561 = new AnonymousClass0561("SURPRISE_RESOURCE_TYPE_ENUM_FIRST_COMMENT_SURPRISE", 0, 0);
        SURPRISE_RESOURCE_TYPE_ENUM_FIRST_COMMENT_SURPRISE = anonymousClass0561;
        AnonymousClass0561 anonymousClass05612 = new AnonymousClass0561("SURPRISE_RESOURCE_TYPE_ENUM_ACTIVITY_SURPRISE", 1, 1);
        SURPRISE_RESOURCE_TYPE_ENUM_ACTIVITY_SURPRISE = anonymousClass05612;
        AnonymousClass0561[] anonymousClass0561Arr = {anonymousClass0561, anonymousClass05612};
        LLILLJJLI = anonymousClass0561Arr;
        LLILLL = new C2254308sP(anonymousClass0561Arr);
    }

    public static AnonymousClass0561[] values() {
        return (AnonymousClass0561[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AnonymousClass0561 valueOf(String str) {
        return (AnonymousClass0561) C08FF.LIZ(AnonymousClass0561.class, str);
    }

    public AnonymousClass0561(String str, int i, int i2) {
        this.LL = i2;
    }
}

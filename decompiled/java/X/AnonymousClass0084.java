package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0084, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0084 {
    public static final /* synthetic */ AnonymousClass0084[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass0084 MIX_LIVE;
    public static final AnonymousClass0084 NONE;

    public static InterfaceC2044707zh<AnonymousClass0084> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass0084 anonymousClass0084 = new AnonymousClass0084("NONE", 0);
        NONE = anonymousClass0084;
        AnonymousClass0084 anonymousClass00842 = new AnonymousClass0084("MIX_LIVE", 1);
        MIX_LIVE = anonymousClass00842;
        AnonymousClass0084[] anonymousClass0084Arr = {anonymousClass0084, anonymousClass00842};
        LL = anonymousClass0084Arr;
        LLILLJJLI = new C2254308sP(anonymousClass0084Arr);
    }

    public static AnonymousClass0084[] values() {
        return (AnonymousClass0084[]) LL.clone();
    }

    public static AnonymousClass0084 valueOf(String str) {
        return (AnonymousClass0084) C08FF.LIZ(AnonymousClass0084.class, str);
    }

    public AnonymousClass0084(String str, int i) {
    }
}

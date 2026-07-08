package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0089, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0089 {
    public static final AnonymousClass0089 INTERACTIVE_ZONE_BOTTOM;
    public static final AnonymousClass0089 INTERACTIVE_ZONE_TOP;
    public static final /* synthetic */ AnonymousClass0089[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<AnonymousClass0089> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass0089 anonymousClass0089 = new AnonymousClass0089("INTERACTIVE_ZONE_TOP", 0);
        INTERACTIVE_ZONE_TOP = anonymousClass0089;
        AnonymousClass0089 anonymousClass00892 = new AnonymousClass0089("INTERACTIVE_ZONE_BOTTOM", 1);
        INTERACTIVE_ZONE_BOTTOM = anonymousClass00892;
        AnonymousClass0089[] anonymousClass0089Arr = {anonymousClass0089, anonymousClass00892};
        LL = anonymousClass0089Arr;
        LLILLJJLI = new C2254308sP(anonymousClass0089Arr);
    }

    public static AnonymousClass0089[] values() {
        return (AnonymousClass0089[]) LL.clone();
    }

    public static AnonymousClass0089 valueOf(String str) {
        return (AnonymousClass0089) C08FF.LIZ(AnonymousClass0089.class, str);
    }

    public AnonymousClass0089(String str, int i) {
    }
}

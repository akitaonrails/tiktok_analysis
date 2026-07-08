package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0854, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0854 {
    public static final /* synthetic */ AnonymousClass0854[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0854 VISUAL_SEARCH_BANNER;
    public final String LL = "visual_search_banner";

    public static InterfaceC2044707zh<AnonymousClass0854> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0854 anonymousClass0854 = new AnonymousClass0854();
        VISUAL_SEARCH_BANNER = anonymousClass0854;
        AnonymousClass0854[] anonymousClass0854Arr = {anonymousClass0854};
        LLILLJJLI = anonymousClass0854Arr;
        LLILLL = new C2254308sP(anonymousClass0854Arr);
    }

    public static AnonymousClass0854[] values() {
        return (AnonymousClass0854[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0854 valueOf(String str) {
        return (AnonymousClass0854) C08FF.LIZ(AnonymousClass0854.class, str);
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0080, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0080 {
    public static final AnonymousClass0080 ASSET_INCOMPATIBLE;
    public static final AnonymousClass0080 INNER_ERROR;
    public static final /* synthetic */ AnonymousClass0080[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass0080 NO_HANDLER;
    public static final AnonymousClass0080 SUCCESS;

    public static InterfaceC2044707zh<AnonymousClass0080> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass0080 anonymousClass0080 = new AnonymousClass0080("SUCCESS", 0);
        SUCCESS = anonymousClass0080;
        AnonymousClass0080 anonymousClass00802 = new AnonymousClass0080("NO_HANDLER", 1);
        NO_HANDLER = anonymousClass00802;
        AnonymousClass0080 anonymousClass00803 = new AnonymousClass0080("ASSET_INCOMPATIBLE", 2);
        ASSET_INCOMPATIBLE = anonymousClass00803;
        AnonymousClass0080 anonymousClass00804 = new AnonymousClass0080("INNER_ERROR", 3);
        INNER_ERROR = anonymousClass00804;
        AnonymousClass0080[] anonymousClass0080Arr = {anonymousClass0080, anonymousClass00802, anonymousClass00803, anonymousClass00804};
        LL = anonymousClass0080Arr;
        LLILLJJLI = new C2254308sP(anonymousClass0080Arr);
    }

    public static AnonymousClass0080[] values() {
        return (AnonymousClass0080[]) LL.clone();
    }

    public static AnonymousClass0080 valueOf(String str) {
        return (AnonymousClass0080) C08FF.LIZ(AnonymousClass0080.class, str);
    }

    public AnonymousClass0080(String str, int i) {
    }
}

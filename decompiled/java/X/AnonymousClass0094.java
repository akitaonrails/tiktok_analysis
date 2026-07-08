package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0094, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0094 {
    public static final AnonymousClass0094 CAMPAIGN_INFO;
    public static final /* synthetic */ AnonymousClass0094[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "campaign_info";

    public static InterfaceC2044707zh<AnonymousClass0094> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0094 anonymousClass0094 = new AnonymousClass0094();
        CAMPAIGN_INFO = anonymousClass0094;
        AnonymousClass0094[] anonymousClass0094Arr = {anonymousClass0094};
        LLILLJJLI = anonymousClass0094Arr;
        LLILLL = new C2254308sP(anonymousClass0094Arr);
    }

    public static AnonymousClass0094[] values() {
        return (AnonymousClass0094[]) LLILLJJLI.clone();
    }

    public final String getBusinessName() {
        return this.LL;
    }

    public static AnonymousClass0094 valueOf(String str) {
        return (AnonymousClass0094) C08FF.LIZ(AnonymousClass0094.class, str);
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1623, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1623 {
    public static final C162O Companion;
    public static final AnonymousClass1623 FAILURE;
    public static final AnonymousClass1623 INTENTIONALLY_HIDDEN;
    public static final /* synthetic */ AnonymousClass1623[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final AnonymousClass1623 RT_TRANSLATION_UNSUPPORTED_LANGUAGE;
    public static final AnonymousClass1623 SUCCESS;
    public static final AnonymousClass1623 SWITCH_VIDEO;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<AnonymousClass1623> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.162O] */
    static {
        AnonymousClass1623 anonymousClass1623 = new AnonymousClass1623("SUCCESS", 0, 1, "success");
        SUCCESS = anonymousClass1623;
        AnonymousClass1623 anonymousClass16232 = new AnonymousClass1623("FAILURE", 1, 2, "failure");
        FAILURE = anonymousClass16232;
        AnonymousClass1623 anonymousClass16233 = new AnonymousClass1623("SWITCH_VIDEO", 2, 3, "switch video(swiping/exiting etc.)");
        SWITCH_VIDEO = anonymousClass16233;
        AnonymousClass1623 anonymousClass16234 = new AnonymousClass1623("INTENTIONALLY_HIDDEN", 3, 4, "intentionally hidden by business policy");
        INTENTIONALLY_HIDDEN = anonymousClass16234;
        AnonymousClass1623 anonymousClass16235 = new AnonymousClass1623("RT_TRANSLATION_UNSUPPORTED_LANGUAGE", 4, 5, "realtime translation: target language not supported (expected)");
        RT_TRANSLATION_UNSUPPORTED_LANGUAGE = anonymousClass16235;
        AnonymousClass1623[] anonymousClass1623Arr = {anonymousClass1623, anonymousClass16232, anonymousClass16233, anonymousClass16234, anonymousClass16235};
        LLILLL = anonymousClass1623Arr;
        LLILZ = new C2254308sP(anonymousClass1623Arr);
        Companion = new Object() { // from class: X.162O
        };
    }

    public static AnonymousClass1623[] values() {
        return (AnonymousClass1623[]) LLILLL.clone();
    }

    public final String getDescription() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static AnonymousClass1623 valueOf(String str) {
        return (AnonymousClass1623) C08FF.LIZ(AnonymousClass1623.class, str);
    }

    public AnonymousClass1623(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}

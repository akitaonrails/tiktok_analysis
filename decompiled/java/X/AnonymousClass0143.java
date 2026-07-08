package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0143, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0143 {
    public static final AnonymousClass0143 HORIZONTAL;
    public static final /* synthetic */ AnonymousClass0143[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0143 VERTICAL;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0143> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0143 anonymousClass0143 = new AnonymousClass0143("HORIZONTAL", 0, "horizontal");
        HORIZONTAL = anonymousClass0143;
        AnonymousClass0143 anonymousClass01432 = new AnonymousClass0143("VERTICAL", 1, "vertical");
        VERTICAL = anonymousClass01432;
        AnonymousClass0143[] anonymousClass0143Arr = {anonymousClass0143, anonymousClass01432};
        LLILLJJLI = anonymousClass0143Arr;
        LLILLL = new C2254308sP(anonymousClass0143Arr);
    }

    public static AnonymousClass0143[] values() {
        return (AnonymousClass0143[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0143 valueOf(String str) {
        return (AnonymousClass0143) C08FF.LIZ(AnonymousClass0143.class, str);
    }

    public AnonymousClass0143(String str, int i, String str2) {
        this.LL = str2;
    }
}

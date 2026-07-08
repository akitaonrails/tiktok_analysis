package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0604, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0604 {
    public static final AnonymousClass0604 CREATOR;
    public static final /* synthetic */ AnonymousClass0604[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0604 USER;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0604> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0604 anonymousClass0604 = new AnonymousClass0604("CREATOR", 0, "creator");
        CREATOR = anonymousClass0604;
        AnonymousClass0604 anonymousClass06042 = new AnonymousClass0604("USER", 1, "user");
        USER = anonymousClass06042;
        AnonymousClass0604[] anonymousClass0604Arr = {anonymousClass0604, anonymousClass06042};
        LLILLJJLI = anonymousClass0604Arr;
        LLILLL = new C2254308sP(anonymousClass0604Arr);
    }

    public static AnonymousClass0604[] values() {
        return (AnonymousClass0604[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0604 valueOf(String str) {
        return (AnonymousClass0604) C08FF.LIZ(AnonymousClass0604.class, str);
    }

    public AnonymousClass0604(String str, int i, String str2) {
        this.LL = str2;
    }
}

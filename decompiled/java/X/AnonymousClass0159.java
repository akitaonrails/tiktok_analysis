package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0159, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0159 {
    public static final /* synthetic */ AnonymousClass0159[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0159 OFF;
    public static final AnonymousClass0159 ON;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0159> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0159 anonymousClass0159 = new AnonymousClass0159("OFF", 0, "off");
        OFF = anonymousClass0159;
        AnonymousClass0159 anonymousClass01592 = new AnonymousClass0159("ON", 1, "on");
        ON = anonymousClass01592;
        AnonymousClass0159[] anonymousClass0159Arr = {anonymousClass0159, anonymousClass01592};
        LLILLJJLI = anonymousClass0159Arr;
        LLILLL = new C2254308sP(anonymousClass0159Arr);
    }

    public static AnonymousClass0159[] values() {
        return (AnonymousClass0159[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0159 valueOf(String str) {
        return (AnonymousClass0159) C08FF.LIZ(AnonymousClass0159.class, str);
    }

    public AnonymousClass0159(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0158, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0158 {
    public static final /* synthetic */ AnonymousClass0158[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0158 OFF;
    public static final AnonymousClass0158 ON;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0158> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0158 anonymousClass0158 = new AnonymousClass0158("OFF", 0, "off");
        OFF = anonymousClass0158;
        AnonymousClass0158 anonymousClass01582 = new AnonymousClass0158("ON", 1, "on");
        ON = anonymousClass01582;
        AnonymousClass0158[] anonymousClass0158Arr = {anonymousClass0158, anonymousClass01582};
        LLILLJJLI = anonymousClass0158Arr;
        LLILLL = new C2254308sP(anonymousClass0158Arr);
    }

    public static AnonymousClass0158[] values() {
        return (AnonymousClass0158[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0158 valueOf(String str) {
        return (AnonymousClass0158) C08FF.LIZ(AnonymousClass0158.class, str);
    }

    public AnonymousClass0158(String str, int i, String str2) {
        this.LL = str2;
    }
}

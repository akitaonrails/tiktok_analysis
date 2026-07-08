package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0157, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0157 {
    public static final /* synthetic */ AnonymousClass0157[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0157 OFF;
    public static final AnonymousClass0157 ON;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0157> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0157 anonymousClass0157 = new AnonymousClass0157("OFF", 0, "off");
        OFF = anonymousClass0157;
        AnonymousClass0157 anonymousClass01572 = new AnonymousClass0157("ON", 1, "on");
        ON = anonymousClass01572;
        AnonymousClass0157[] anonymousClass0157Arr = {anonymousClass0157, anonymousClass01572};
        LLILLJJLI = anonymousClass0157Arr;
        LLILLL = new C2254308sP(anonymousClass0157Arr);
    }

    public static AnonymousClass0157[] values() {
        return (AnonymousClass0157[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0157 valueOf(String str) {
        return (AnonymousClass0157) C08FF.LIZ(AnonymousClass0157.class, str);
    }

    public AnonymousClass0157(String str, int i, String str2) {
        this.LL = str2;
    }
}

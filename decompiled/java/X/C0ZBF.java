package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBF {
    public static final /* synthetic */ C0ZBF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZBF MUTE;
    public static final C0ZBF UN_MUTE;
    public final String LL;

    public static InterfaceC2044707zh<C0ZBF> getEntries() {
        return LLILLL;
    }

    static {
        C0ZBF c0zbf = new C0ZBF("UN_MUTE", 0, "unmute");
        UN_MUTE = c0zbf;
        C0ZBF c0zbf2 = new C0ZBF("MUTE", 1, "mute");
        MUTE = c0zbf2;
        C0ZBF[] c0zbfArr = {c0zbf, c0zbf2};
        LLILLJJLI = c0zbfArr;
        LLILLL = new C2254308sP(c0zbfArr);
    }

    public static C0ZBF[] values() {
        return (C0ZBF[]) LLILLJJLI.clone();
    }

    public final String getEventName() {
        return this.LL;
    }

    public static C0ZBF valueOf(String str) {
        return (C0ZBF) C08FF.LIZ(C0ZBF.class, str);
    }

    public C0ZBF(String str, int i, String str2) {
        this.LL = str2;
    }
}

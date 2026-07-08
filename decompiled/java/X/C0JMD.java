package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JMD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMD {
    public static final C0JMD GRAYED_OUT_FOR_FREQ_CONTROL;
    public static final C0JMD GRAYED_OUT_FOR_IN_PROCESS;
    public static final C0JMD GRAYED_OUT_FOR_MODERATION;
    public static final C0JMD GRAYED_OUT_FOR_TIME_EXPIRATION;
    public static final /* synthetic */ C0JMD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0JMD NO_SHOW;
    public static final C0JMD SHOW;
    public final int LL;

    public static InterfaceC2044707zh<C0JMD> getEntries() {
        return LLILLL;
    }

    static {
        C0JMD c0jmd = new C0JMD("NO_SHOW", 0, 0);
        NO_SHOW = c0jmd;
        C0JMD c0jmd2 = new C0JMD("SHOW", 1, 1);
        SHOW = c0jmd2;
        C0JMD c0jmd3 = new C0JMD("GRAYED_OUT_FOR_MODERATION", 2, 2);
        GRAYED_OUT_FOR_MODERATION = c0jmd3;
        C0JMD c0jmd4 = new C0JMD("GRAYED_OUT_FOR_FREQ_CONTROL", 3, 3);
        GRAYED_OUT_FOR_FREQ_CONTROL = c0jmd4;
        C0JMD c0jmd5 = new C0JMD("GRAYED_OUT_FOR_TIME_EXPIRATION", 4, 4);
        GRAYED_OUT_FOR_TIME_EXPIRATION = c0jmd5;
        C0JMD c0jmd6 = new C0JMD("GRAYED_OUT_FOR_IN_PROCESS", 5, 5);
        GRAYED_OUT_FOR_IN_PROCESS = c0jmd6;
        C0JMD[] c0jmdArr = {c0jmd, c0jmd2, c0jmd3, c0jmd4, c0jmd5, c0jmd6};
        LLILLJJLI = c0jmdArr;
        LLILLL = new C2254308sP(c0jmdArr);
    }

    public static C0JMD[] values() {
        return (C0JMD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0JMD valueOf(String str) {
        return (C0JMD) C08FF.LIZ(C0JMD.class, str);
    }

    public C0JMD(String str, int i, int i2) {
        this.LL = i2;
    }
}

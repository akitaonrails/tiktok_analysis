package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NRC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NRC {
    public static final C0NRC BLOCKING;
    public static final /* synthetic */ C0NRC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NRC NOTICE;

    public static InterfaceC2044707zh<C0NRC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NRC c0nrc = new C0NRC("BLOCKING", 0);
        BLOCKING = c0nrc;
        C0NRC c0nrc2 = new C0NRC("NOTICE", 1);
        NOTICE = c0nrc2;
        C0NRC[] c0nrcArr = {c0nrc, c0nrc2};
        LL = c0nrcArr;
        LLILLJJLI = new C2254308sP(c0nrcArr);
    }

    public static C0NRC[] values() {
        return (C0NRC[]) LL.clone();
    }

    public final boolean isNotice() {
        return this == NOTICE;
    }

    public static C0NRC valueOf(String str) {
        return (C0NRC) C08FF.LIZ(C0NRC.class, str);
    }

    public C0NRC(String str, int i) {
    }
}

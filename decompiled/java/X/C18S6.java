package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18S6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S6 {
    public static final /* synthetic */ C18S6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C18S6 START;
    public static final C18S6 STOP;

    public static InterfaceC2044707zh<C18S6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C18S6 c18s6 = new C18S6("START", 0);
        START = c18s6;
        C18S6 c18s62 = new C18S6("STOP", 1);
        STOP = c18s62;
        C18S6[] c18s6Arr = {c18s6, c18s62};
        LL = c18s6Arr;
        LLILLJJLI = new C2254308sP(c18s6Arr);
    }

    public static C18S6[] values() {
        return (C18S6[]) LL.clone();
    }

    public static C18S6 valueOf(String str) {
        return (C18S6) C08FF.LIZ(C18S6.class, str);
    }

    public C18S6(String str, int i) {
    }
}

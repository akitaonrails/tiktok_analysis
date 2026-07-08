package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18S4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S4 {
    public static final C18S4 COMMON;
    public static final /* synthetic */ C18S4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C18S4 NETWORK;
    public static final C18S4 NO_SOUND_DETECTED;

    public static InterfaceC2044707zh<C18S4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C18S4 c18s4 = new C18S4("NO_SOUND_DETECTED", 0);
        NO_SOUND_DETECTED = c18s4;
        C18S4 c18s42 = new C18S4("NETWORK", 1);
        NETWORK = c18s42;
        C18S4 c18s43 = new C18S4("COMMON", 2);
        COMMON = c18s43;
        C18S4[] c18s4Arr = {c18s4, c18s42, c18s43};
        LL = c18s4Arr;
        LLILLJJLI = new C2254308sP(c18s4Arr);
    }

    public static C18S4[] values() {
        return (C18S4[]) LL.clone();
    }

    public static C18S4 valueOf(String str) {
        return (C18S4) C08FF.LIZ(C18S4.class, str);
    }

    public C18S4(String str, int i) {
    }
}

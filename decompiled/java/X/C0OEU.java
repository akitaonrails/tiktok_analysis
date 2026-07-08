package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OEU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OEU {
    public static final /* synthetic */ C0OEU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OEU NETWORK_MOBILE_DIALOG;
    public static final C0OEU VIDEO_CLEAR_DIALOG;

    public static InterfaceC2044707zh<C0OEU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OEU c0oeu = new C0OEU("VIDEO_CLEAR_DIALOG", 0);
        VIDEO_CLEAR_DIALOG = c0oeu;
        C0OEU c0oeu2 = new C0OEU("NETWORK_MOBILE_DIALOG", 1);
        NETWORK_MOBILE_DIALOG = c0oeu2;
        C0OEU[] c0oeuArr = {c0oeu, c0oeu2};
        LL = c0oeuArr;
        LLILLJJLI = new C2254308sP(c0oeuArr);
    }

    public static C0OEU[] values() {
        return (C0OEU[]) LL.clone();
    }

    public static C0OEU valueOf(String str) {
        return (C0OEU) C08FF.LIZ(C0OEU.class, str);
    }

    public C0OEU(String str, int i) {
    }
}

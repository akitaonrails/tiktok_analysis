package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJE {
    public static final /* synthetic */ C0MJE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MJE START_SCAN_FACE_ENTRY_AIME_TAB;
    public static final C0MJE START_SCAN_FACE_ENTRY_EFFECT_PANEL;
    public static final C0MJE START_SCAN_FACE_EXTERNAL;

    public static InterfaceC2044707zh<C0MJE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MJE c0mje = new C0MJE("START_SCAN_FACE_ENTRY_AIME_TAB", 0);
        START_SCAN_FACE_ENTRY_AIME_TAB = c0mje;
        C0MJE c0mje2 = new C0MJE("START_SCAN_FACE_ENTRY_EFFECT_PANEL", 1);
        START_SCAN_FACE_ENTRY_EFFECT_PANEL = c0mje2;
        C0MJE c0mje3 = new C0MJE("START_SCAN_FACE_EXTERNAL", 2);
        START_SCAN_FACE_EXTERNAL = c0mje3;
        C0MJE[] c0mjeArr = {c0mje, c0mje2, c0mje3};
        LL = c0mjeArr;
        LLILLJJLI = new C2254308sP(c0mjeArr);
    }

    public static C0MJE[] values() {
        return (C0MJE[]) LL.clone();
    }

    public static C0MJE valueOf(String str) {
        return (C0MJE) C08FF.LIZ(C0MJE.class, str);
    }

    public C0MJE(String str, int i) {
    }
}

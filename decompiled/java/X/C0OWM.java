package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OWM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OWM {
    public static final C0OWM EMOJI;
    public static final C0OWM HIDE;
    public static final C0OWM KEY_BOARD;
    public static final /* synthetic */ C0OWM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0OWM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OWM c0owm = new C0OWM("HIDE", 0);
        HIDE = c0owm;
        C0OWM c0owm2 = new C0OWM("EMOJI", 1);
        EMOJI = c0owm2;
        C0OWM c0owm3 = new C0OWM("KEY_BOARD", 2);
        KEY_BOARD = c0owm3;
        C0OWM[] c0owmArr = {c0owm, c0owm2, c0owm3};
        LL = c0owmArr;
        LLILLJJLI = new C2254308sP(c0owmArr);
    }

    public static C0OWM[] values() {
        return (C0OWM[]) LL.clone();
    }

    public static C0OWM valueOf(String str) {
        return (C0OWM) C08FF.LIZ(C0OWM.class, str);
    }

    public C0OWM(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U2R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2R {
    public static final C0U2R IDLE;
    public static final /* synthetic */ C0U2R[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0U2R PAUSE;
    public static final C0U2R PLAYING;

    public static InterfaceC2044707zh<C0U2R> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0U2R c0u2r = new C0U2R("PLAYING", 0);
        PLAYING = c0u2r;
        C0U2R c0u2r2 = new C0U2R("PAUSE", 1);
        PAUSE = c0u2r2;
        C0U2R c0u2r3 = new C0U2R("IDLE", 2);
        IDLE = c0u2r3;
        C0U2R[] c0u2rArr = {c0u2r, c0u2r2, c0u2r3};
        LL = c0u2rArr;
        LLILLJJLI = new C2254308sP(c0u2rArr);
    }

    public static C0U2R[] values() {
        return (C0U2R[]) LL.clone();
    }

    public static C0U2R valueOf(String str) {
        return (C0U2R) C08FF.LIZ(C0U2R.class, str);
    }

    public C0U2R(String str, int i) {
    }
}

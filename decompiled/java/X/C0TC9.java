package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TC9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TC9 {
    public static final /* synthetic */ C0TC9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TC9 RESUME_PLAY_INTERNAL;
    public static final C0TC9 VIDEO_EVENT;
    public final int LL;

    public static InterfaceC2044707zh<C0TC9> getEntries() {
        return LLILLL;
    }

    static {
        C0TC9 c0tc9 = new C0TC9("RESUME_PLAY_INTERNAL", 0, 0);
        RESUME_PLAY_INTERNAL = c0tc9;
        C0TC9 c0tc92 = new C0TC9("VIDEO_EVENT", 1, 1);
        VIDEO_EVENT = c0tc92;
        C0TC9[] c0tc9Arr = {c0tc9, c0tc92};
        LLILLJJLI = c0tc9Arr;
        LLILLL = new C2254308sP(c0tc9Arr);
    }

    public static C0TC9[] values() {
        return (C0TC9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0TC9 valueOf(String str) {
        return (C0TC9) C08FF.LIZ(C0TC9.class, str);
    }

    public C0TC9(String str, int i, int i2) {
        this.LL = i2;
    }
}

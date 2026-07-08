package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCV {
    public static final C0NCV CHAT_INTRO;
    public static final C0NCV FOLLOW_TO_DM;
    public static final /* synthetic */ C0NCV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NCV UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0NCV> getEntries() {
        return LLILLL;
    }

    static {
        C0NCV c0ncv = new C0NCV("UNKNOWN", 0, 0);
        UNKNOWN = c0ncv;
        C0NCV c0ncv2 = new C0NCV("FOLLOW_TO_DM", 1, 1);
        FOLLOW_TO_DM = c0ncv2;
        C0NCV c0ncv3 = new C0NCV("CHAT_INTRO", 2, 2);
        CHAT_INTRO = c0ncv3;
        C0NCV[] c0ncvArr = {c0ncv, c0ncv2, c0ncv3};
        LLILLJJLI = c0ncvArr;
        LLILLL = new C2254308sP(c0ncvArr);
    }

    public static C0NCV[] values() {
        return (C0NCV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NCV valueOf(String str) {
        return (C0NCV) C08FF.LIZ(C0NCV.class, str);
    }

    public C0NCV(String str, int i, int i2) {
        this.LL = i2;
    }
}

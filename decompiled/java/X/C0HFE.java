package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HFE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFE {
    public static final C0HFE COMPLETED_VIDEO;
    public static final /* synthetic */ C0HFE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HFE LOADING_VIDEO;
    public static final C0HFE START_PLAYING_VIDEO;
    public static final C0HFE UNPLAYED;
    public final int LL;

    public static InterfaceC2044707zh<C0HFE> getEntries() {
        return LLILLL;
    }

    static {
        C0HFE c0hfe = new C0HFE("UNPLAYED", 0, 0);
        UNPLAYED = c0hfe;
        C0HFE c0hfe2 = new C0HFE("LOADING_VIDEO", 1, 1);
        LOADING_VIDEO = c0hfe2;
        C0HFE c0hfe3 = new C0HFE("START_PLAYING_VIDEO", 2, 2);
        START_PLAYING_VIDEO = c0hfe3;
        C0HFE c0hfe4 = new C0HFE("COMPLETED_VIDEO", 3, 3);
        COMPLETED_VIDEO = c0hfe4;
        C0HFE[] c0hfeArr = {c0hfe, c0hfe2, c0hfe3, c0hfe4};
        LLILLJJLI = c0hfeArr;
        LLILLL = new C2254308sP(c0hfeArr);
    }

    public static C0HFE[] values() {
        return (C0HFE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0HFE valueOf(String str) {
        return (C0HFE) C08FF.LIZ(C0HFE.class, str);
    }

    public C0HFE(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MVY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVY {
    public static final C0MVY CLICK_CLOSE;
    public static final C0MVY DISMISS;
    public static final /* synthetic */ C0MVY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0MVY NEGATIVE_BTN;
    public static final C0MVY NEUTRAL_BTN;
    public static final C0MVY POSITIVE_BTN;
    public static final C0MVY SHOW;
    public final int LL;

    public static InterfaceC2044707zh<C0MVY> getEntries() {
        return LLILLL;
    }

    static {
        C0MVY c0mvy = new C0MVY("SHOW", 0, 1);
        SHOW = c0mvy;
        C0MVY c0mvy2 = new C0MVY("DISMISS", 1, 2);
        DISMISS = c0mvy2;
        C0MVY c0mvy3 = new C0MVY("NEGATIVE_BTN", 2, 3);
        NEGATIVE_BTN = c0mvy3;
        C0MVY c0mvy4 = new C0MVY("POSITIVE_BTN", 3, 4);
        POSITIVE_BTN = c0mvy4;
        C0MVY c0mvy5 = new C0MVY("NEUTRAL_BTN", 4, 5);
        NEUTRAL_BTN = c0mvy5;
        C0MVY c0mvy6 = new C0MVY("CLICK_CLOSE", 5, 6);
        CLICK_CLOSE = c0mvy6;
        C0MVY[] c0mvyArr = {c0mvy, c0mvy2, c0mvy3, c0mvy4, c0mvy5, c0mvy6};
        LLILLJJLI = c0mvyArr;
        LLILLL = new C2254308sP(c0mvyArr);
    }

    public static C0MVY[] values() {
        return (C0MVY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0MVY valueOf(String str) {
        return (C0MVY) C08FF.LIZ(C0MVY.class, str);
    }

    public C0MVY(String str, int i, int i2) {
        this.LL = i2;
    }
}

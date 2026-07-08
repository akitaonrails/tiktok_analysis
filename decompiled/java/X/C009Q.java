package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009Q {
    public static final C009Q DUMMY;
    public static final /* synthetic */ C009Q[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C009Q PROMOTE_3_PHOTOS;
    public static final C009Q PROMOTE_LYNX;
    public static final C009Q PROMOTE_NEW_SINGLE_PHOTO;
    public static final C009Q PROMOTE_SINGLE_PHOTO;
    public static final C009Q PROMOTE_TEXT;
    public static final C009Q PROMOTE_VIDEO;
    public final int LL;
    public final String LLILLJJLI;

    public C009Q() {
        throw null;
    }

    public static InterfaceC2044707zh<C009Q> getEntries() {
        return LLILZ;
    }

    static {
        C009Q c009q = new C009Q("DUMMY", 0);
        DUMMY = c009q;
        C009Q c009q2 = new C009Q("PROMOTE_TEXT", 1);
        PROMOTE_TEXT = c009q2;
        C009Q c009q3 = new C009Q("PROMOTE_SINGLE_PHOTO", 2);
        PROMOTE_SINGLE_PHOTO = c009q3;
        C009Q c009q4 = new C009Q("PROMOTE_VIDEO", 3);
        PROMOTE_VIDEO = c009q4;
        C009Q c009q5 = new C009Q("PROMOTE_NEW_SINGLE_PHOTO", 4);
        PROMOTE_NEW_SINGLE_PHOTO = c009q5;
        C009Q c009q6 = new C009Q("PROMOTE_LYNX", 5);
        PROMOTE_LYNX = c009q6;
        C009Q c009q7 = new C009Q("PROMOTE_3_PHOTOS", 6);
        PROMOTE_3_PHOTOS = c009q7;
        C009Q[] c009qArr = {c009q, c009q2, c009q3, c009q4, c009q5, c009q6, c009q7};
        LLILLL = c009qArr;
        LLILZ = new C2254308sP(c009qArr);
    }

    public static C009Q[] values() {
        return (C009Q[]) LLILLL.clone();
    }

    public final String getLogStr() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    public static C009Q valueOf(String str) {
        return (C009Q) C08FF.LIZ(C009Q.class, str);
    }

    public C009Q(String str, int i) {
        this.LL = 1;
        this.LLILLJJLI = "golive_promo_card";
    }
}

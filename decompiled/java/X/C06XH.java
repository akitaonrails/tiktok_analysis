package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06XH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06XH {
    public static final C06XH CI_EXPLOSION_EFFECT_ANIMATION;
    public static final C06XH CI_VIDEO_RAIN_EFFECT_ANIMATION;
    public static final C06XH LIGHT_INTERACTION_ANIMATION;
    public static final /* synthetic */ C06XH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06XH STREAK_ANIMATION;
    public final int LL;

    public static InterfaceC2044707zh<C06XH> getEntries() {
        return LLILLL;
    }

    static {
        C06XH c06xh = new C06XH("LIGHT_INTERACTION_ANIMATION", 0, 1);
        LIGHT_INTERACTION_ANIMATION = c06xh;
        C06XH c06xh2 = new C06XH("STREAK_ANIMATION", 1, 2);
        STREAK_ANIMATION = c06xh2;
        C06XH c06xh3 = new C06XH("CI_VIDEO_RAIN_EFFECT_ANIMATION", 2, 3);
        CI_VIDEO_RAIN_EFFECT_ANIMATION = c06xh3;
        C06XH c06xh4 = new C06XH("CI_EXPLOSION_EFFECT_ANIMATION", 3, 4);
        CI_EXPLOSION_EFFECT_ANIMATION = c06xh4;
        C06XH[] c06xhArr = {c06xh, c06xh2, c06xh3, c06xh4};
        LLILLJJLI = c06xhArr;
        LLILLL = new C2254308sP(c06xhArr);
    }

    public static C06XH[] values() {
        return (C06XH[]) LLILLJJLI.clone();
    }

    public final int getLevel() {
        return this.LL;
    }

    public static C06XH valueOf(String str) {
        return (C06XH) C08FF.LIZ(C06XH.class, str);
    }

    public C06XH(String str, int i, int i2) {
        this.LL = i2;
    }
}

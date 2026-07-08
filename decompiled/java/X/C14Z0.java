package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Z0 {
    public static final C14Z0 FEED_TYPE;
    public static final C14Z0 LIVE_TYPE;
    public static final /* synthetic */ C14Z0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C14Z0 PHOTO_TYPE;
    public static final C14Z0 PROFILE_TYPE;
    public static final C14Z0 SOCIAL_TYPE;
    public final int LL;

    public static InterfaceC2044707zh<C14Z0> getEntries() {
        return LLILLL;
    }

    static {
        C14Z0 c14z0 = new C14Z0("FEED_TYPE", 0, 1);
        FEED_TYPE = c14z0;
        C14Z0 c14z02 = new C14Z0("SOCIAL_TYPE", 1, 2);
        SOCIAL_TYPE = c14z02;
        C14Z0 c14z03 = new C14Z0("LIVE_TYPE", 2, 3);
        LIVE_TYPE = c14z03;
        C14Z0 c14z04 = new C14Z0("PHOTO_TYPE", 3, 4);
        PHOTO_TYPE = c14z04;
        C14Z0 c14z05 = new C14Z0("PROFILE_TYPE", 4, 7);
        PROFILE_TYPE = c14z05;
        C14Z0[] c14z0Arr = {c14z0, c14z02, c14z03, c14z04, c14z05};
        LLILLJJLI = c14z0Arr;
        LLILLL = new C2254308sP(c14z0Arr);
    }

    public static C14Z0[] values() {
        return (C14Z0[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C14Z0 valueOf(String str) {
        return (C14Z0) C08FF.LIZ(C14Z0.class, str);
    }

    public C14Z0(String str, int i, int i2) {
        this.LL = i2;
    }
}

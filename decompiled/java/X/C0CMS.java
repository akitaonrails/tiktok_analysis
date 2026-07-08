package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CMS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CMS {
    public static final C0CMS HIGH_PRIORITY;
    public static final /* synthetic */ C0CMS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CMS NORMAL_PRIORITY;
    public static final C0CMS TOP_PRIORITY;
    public final int LL;

    public static InterfaceC2044707zh<C0CMS> getEntries() {
        return LLILLL;
    }

    static {
        C0CMS c0cms = new C0CMS("TOP_PRIORITY", 0, 3);
        TOP_PRIORITY = c0cms;
        C0CMS c0cms2 = new C0CMS("HIGH_PRIORITY", 1, 2);
        HIGH_PRIORITY = c0cms2;
        C0CMS c0cms3 = new C0CMS("NORMAL_PRIORITY", 2, 1);
        NORMAL_PRIORITY = c0cms3;
        C0CMS[] c0cmsArr = {c0cms, c0cms2, c0cms3};
        LLILLJJLI = c0cmsArr;
        LLILLL = new C2254308sP(c0cmsArr);
    }

    public static C0CMS[] values() {
        return (C0CMS[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0CMS valueOf(String str) {
        return (C0CMS) C08FF.LIZ(C0CMS.class, str);
    }

    public C0CMS(String str, int i, int i2) {
        this.LL = i2;
    }
}

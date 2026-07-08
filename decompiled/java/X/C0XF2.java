package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XF2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XF2 {
    public static final /* synthetic */ C0XF2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XF2 MOBILE;
    public static final C0XF2 MOBILE_2G;
    public static final C0XF2 MOBILE_3G;
    public static final C0XF2 MOBILE_4G;
    public static final C0XF2 NONE;
    public static final C0XF2 WIFI;
    public final int LL;

    public static InterfaceC2044707zh<C0XF2> getEntries() {
        return LLILLL;
    }

    static {
        C0XF2 c0xf2 = new C0XF2("NONE", 0, 0);
        NONE = c0xf2;
        C0XF2 c0xf22 = new C0XF2("MOBILE", 1, 1);
        MOBILE = c0xf22;
        C0XF2 c0xf23 = new C0XF2("MOBILE_2G", 2, 2);
        MOBILE_2G = c0xf23;
        C0XF2 c0xf24 = new C0XF2("MOBILE_3G", 3, 3);
        MOBILE_3G = c0xf24;
        C0XF2 c0xf25 = new C0XF2("WIFI", 4, 4);
        WIFI = c0xf25;
        C0XF2 c0xf26 = new C0XF2("MOBILE_4G", 5, 5);
        MOBILE_4G = c0xf26;
        C0XF2[] c0xf2Arr = {c0xf2, c0xf22, c0xf23, c0xf24, c0xf25, c0xf26};
        LLILLJJLI = c0xf2Arr;
        LLILLL = new C2254308sP(c0xf2Arr);
    }

    public static C0XF2[] values() {
        return (C0XF2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0XF2 valueOf(String str) {
        return (C0XF2) C08FF.LIZ(C0XF2.class, str);
    }

    public C0XF2(String str, int i, int i2) {
        this.LL = i2;
    }
}

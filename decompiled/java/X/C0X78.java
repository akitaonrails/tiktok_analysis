package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X78, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X78 {
    public static final /* synthetic */ C0X78[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X78 TTWEB_OFFLINE;
    public static final C0X78 TTWEB_PRELOAD;
    public static final C0X78 TTWEB_TTNET;
    public final String LL;

    public static InterfaceC2044707zh<C0X78> getEntries() {
        return LLILLL;
    }

    static {
        C0X78 c0x78 = new C0X78("TTWEB_OFFLINE", 0, "ttweb_offline");
        TTWEB_OFFLINE = c0x78;
        C0X78 c0x782 = new C0X78("TTWEB_TTNET", 1, "ttweb_ttnet_native");
        TTWEB_TTNET = c0x782;
        C0X78 c0x783 = new C0X78("TTWEB_PRELOAD", 2, "ttweb_preloader");
        TTWEB_PRELOAD = c0x783;
        C0X78[] c0x78Arr = {c0x78, c0x782, c0x783};
        LLILLJJLI = c0x78Arr;
        LLILLL = new C2254308sP(c0x78Arr);
    }

    public static C0X78[] values() {
        return (C0X78[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0X78 valueOf(String str) {
        return (C0X78) C08FF.LIZ(C0X78.class, str);
    }

    public C0X78(String str, int i, String str2) {
        this.LL = str2;
    }
}

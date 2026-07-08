package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TCO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCO {
    public static final C0TCO AF_LINK;
    public static final C0TCO GG_LINK;
    public static final /* synthetic */ C0TCO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TCO LONG_LINK;
    public static final C0TCO SHORT_LINK;
    public final String LL;

    public static InterfaceC2044707zh<C0TCO> getEntries() {
        return LLILLL;
    }

    static {
        C0TCO c0tco = new C0TCO("SHORT_LINK", 0, "short_link");
        SHORT_LINK = c0tco;
        C0TCO c0tco2 = new C0TCO("LONG_LINK", 1, "long_link");
        LONG_LINK = c0tco2;
        C0TCO c0tco3 = new C0TCO("AF_LINK", 2, "af_link");
        AF_LINK = c0tco3;
        C0TCO c0tco4 = new C0TCO("GG_LINK", 3, "gg_link");
        GG_LINK = c0tco4;
        C0TCO[] c0tcoArr = {c0tco, c0tco2, c0tco3, c0tco4};
        LLILLJJLI = c0tcoArr;
        LLILLL = new C2254308sP(c0tcoArr);
    }

    public static C0TCO[] values() {
        return (C0TCO[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static C0TCO valueOf(String str) {
        return (C0TCO) C08FF.LIZ(C0TCO.class, str);
    }

    public C0TCO(String str, int i, String str2) {
        this.LL = str2;
    }
}

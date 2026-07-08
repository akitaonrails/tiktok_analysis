package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CH {
    public static final C00CH ANCHOR_LINKMIC;
    public static final C00CH AUDIENCE_LINKMIC;
    public static final /* synthetic */ C00CH[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public String LL;
    public String LLILLJJLI = "connection_type";

    public static InterfaceC2044707zh<C00CH> getEntries() {
        return LLILZ;
    }

    static {
        C00CH c00ch = new C00CH("ANCHOR_LINKMIC", 0, "anchor");
        ANCHOR_LINKMIC = c00ch;
        C00CH c00ch2 = new C00CH("AUDIENCE_LINKMIC", 1, "audience");
        AUDIENCE_LINKMIC = c00ch2;
        C00CH[] c00chArr = {c00ch, c00ch2};
        LLILLL = c00chArr;
        LLILZ = new C2254308sP(c00chArr);
    }

    public static C00CH[] values() {
        return (C00CH[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00CH valueOf(String str) {
        return (C00CH) C08FF.LIZ(C00CH.class, str);
    }

    public final void setKey(String str) {
        this.LLILLJJLI = str;
    }

    public final void setValue(String str) {
        this.LL = str;
    }

    public C00CH(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OM7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM7 {
    public static final C0OM7 BAR_ENTRANCE_SHOW_TYPE_LIVE;
    public static final C0OM7 BAR_ENTRANCE_SHOW_TYPE_TEMPLATE;
    public static final C0OM7 BAR_ENTRANCE_SHOW_TYPE_UNKNOWN;
    public static final /* synthetic */ C0OM7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0OM7> getEntries() {
        return LLILLL;
    }

    static {
        C0OM7 c0om7 = new C0OM7("BAR_ENTRANCE_SHOW_TYPE_UNKNOWN", 0, 0);
        BAR_ENTRANCE_SHOW_TYPE_UNKNOWN = c0om7;
        C0OM7 c0om72 = new C0OM7("BAR_ENTRANCE_SHOW_TYPE_TEMPLATE", 1, 1);
        BAR_ENTRANCE_SHOW_TYPE_TEMPLATE = c0om72;
        C0OM7 c0om73 = new C0OM7("BAR_ENTRANCE_SHOW_TYPE_LIVE", 2, 2);
        BAR_ENTRANCE_SHOW_TYPE_LIVE = c0om73;
        C0OM7[] c0om7Arr = {c0om7, c0om72, c0om73};
        LLILLJJLI = c0om7Arr;
        LLILLL = new C2254308sP(c0om7Arr);
    }

    public static C0OM7[] values() {
        return (C0OM7[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0OM7 valueOf(String str) {
        return (C0OM7) C08FF.LIZ(C0OM7.class, str);
    }

    public C0OM7(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227710i3N {
    public static final EnumC1227710i3N BEFORE_SEND_REQUEST;
    public static final EnumC1227710i3N CREATE_PANEL_OPENED;
    public static final EnumC1227710i3N FAIL;
    public static final /* synthetic */ EnumC1227710i3N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1227710i3N STARTED;
    public static final EnumC1227710i3N SUCCESS;
    public static final EnumC1227710i3N UNSTARTED;

    public static InterfaceC2044707zh<EnumC1227710i3N> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1227710i3N enumC1227710i3N = new EnumC1227710i3N("UNSTARTED", 0);
        UNSTARTED = enumC1227710i3N;
        EnumC1227710i3N enumC1227710i3N2 = new EnumC1227710i3N("STARTED", 1);
        STARTED = enumC1227710i3N2;
        EnumC1227710i3N enumC1227710i3N3 = new EnumC1227710i3N("CREATE_PANEL_OPENED", 2);
        CREATE_PANEL_OPENED = enumC1227710i3N3;
        EnumC1227710i3N enumC1227710i3N4 = new EnumC1227710i3N("BEFORE_SEND_REQUEST", 3);
        BEFORE_SEND_REQUEST = enumC1227710i3N4;
        EnumC1227710i3N enumC1227710i3N5 = new EnumC1227710i3N("SUCCESS", 4);
        SUCCESS = enumC1227710i3N5;
        EnumC1227710i3N enumC1227710i3N6 = new EnumC1227710i3N("FAIL", 5);
        FAIL = enumC1227710i3N6;
        EnumC1227710i3N[] enumC1227710i3NArr = {enumC1227710i3N, enumC1227710i3N2, enumC1227710i3N3, enumC1227710i3N4, enumC1227710i3N5, enumC1227710i3N6};
        LL = enumC1227710i3NArr;
        LLILLJJLI = new C2254308sP(enumC1227710i3NArr);
    }

    public static EnumC1227710i3N[] values() {
        return (EnumC1227710i3N[]) LL.clone();
    }

    public static EnumC1227710i3N valueOf(String str) {
        return (EnumC1227710i3N) C08FF.LIZ(EnumC1227710i3N.class, str);
    }

    public EnumC1227710i3N(String str, int i) {
    }
}

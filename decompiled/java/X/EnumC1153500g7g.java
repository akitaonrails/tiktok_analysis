package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153500g7g {
    public static final EnumC1153500g7g HANDLE_THREAD;
    public static final /* synthetic */ EnumC1153500g7g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153500g7g MAIN_IDLE;

    public static InterfaceC2044707zh<EnumC1153500g7g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153500g7g enumC1153500g7g = new EnumC1153500g7g("HANDLE_THREAD", 0);
        HANDLE_THREAD = enumC1153500g7g;
        EnumC1153500g7g enumC1153500g7g2 = new EnumC1153500g7g("MAIN_IDLE", 1);
        MAIN_IDLE = enumC1153500g7g2;
        EnumC1153500g7g[] enumC1153500g7gArr = {enumC1153500g7g, enumC1153500g7g2};
        LL = enumC1153500g7gArr;
        LLILLJJLI = new C2254308sP(enumC1153500g7gArr);
    }

    public static EnumC1153500g7g[] values() {
        return (EnumC1153500g7g[]) LL.clone();
    }

    public static EnumC1153500g7g valueOf(String str) {
        return (EnumC1153500g7g) C08FF.LIZ(EnumC1153500g7g.class, str);
    }

    public EnumC1153500g7g(String str, int i) {
    }
}

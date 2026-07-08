package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1823680xYc {
    public static final EnumC1823680xYc BEFORE_LOAD_START;
    public static final /* synthetic */ EnumC1823680xYc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1823680xYc LOADING;
    public static final EnumC1823680xYc LOAD_FAIL;
    public static final EnumC1823680xYc LOAD_SUCCESS;

    public static InterfaceC2044707zh<EnumC1823680xYc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1823680xYc enumC1823680xYc = new EnumC1823680xYc("BEFORE_LOAD_START", 0);
        BEFORE_LOAD_START = enumC1823680xYc;
        EnumC1823680xYc enumC1823680xYc2 = new EnumC1823680xYc("LOADING", 1);
        LOADING = enumC1823680xYc2;
        EnumC1823680xYc enumC1823680xYc3 = new EnumC1823680xYc("LOAD_SUCCESS", 2);
        LOAD_SUCCESS = enumC1823680xYc3;
        EnumC1823680xYc enumC1823680xYc4 = new EnumC1823680xYc("LOAD_FAIL", 3);
        LOAD_FAIL = enumC1823680xYc4;
        EnumC1823680xYc[] enumC1823680xYcArr = {enumC1823680xYc, enumC1823680xYc2, enumC1823680xYc3, enumC1823680xYc4};
        LL = enumC1823680xYcArr;
        LLILLJJLI = new C2254308sP(enumC1823680xYcArr);
    }

    public static EnumC1823680xYc[] values() {
        return (EnumC1823680xYc[]) LL.clone();
    }

    public static EnumC1823680xYc valueOf(String str) {
        return (EnumC1823680xYc) C08FF.LIZ(EnumC1823680xYc.class, str);
    }

    public EnumC1823680xYc(String str, int i) {
    }
}

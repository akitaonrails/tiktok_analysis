package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D72, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D72 {
    public static final /* synthetic */ C1D72[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1D72 LOW_DEVICE_ASSEMBLE;
    public static final C1D72 LOW_NETWORK_ASSEMBLE;
    public static final C1D72 NORMAL_ASSEMBLE;
    public final Class<?> LL;

    public static InterfaceC2044707zh<C1D72> getEntries() {
        return LLILLL;
    }

    static {
        C1D72 c1d72 = new C1D72(0, C1D74.class, "NORMAL_ASSEMBLE");
        NORMAL_ASSEMBLE = c1d72;
        C1D72 c1d722 = new C1D72(1, C1D74.class, "LOW_NETWORK_ASSEMBLE");
        LOW_NETWORK_ASSEMBLE = c1d722;
        C1D72 c1d723 = new C1D72(2, C1D78.class, "LOW_DEVICE_ASSEMBLE");
        LOW_DEVICE_ASSEMBLE = c1d723;
        C1D72[] c1d72Arr = {c1d72, c1d722, c1d723};
        LLILLJJLI = c1d72Arr;
        LLILLL = new C2254308sP(c1d72Arr);
    }

    public static C1D72[] values() {
        return (C1D72[]) LLILLJJLI.clone();
    }

    public final Class<?> getExecutorClass() {
        return this.LL;
    }

    public static C1D72 valueOf(String str) {
        return (C1D72) C08FF.LIZ(C1D72.class, str);
    }

    public C1D72(int i, Class cls, String str) {
        this.LL = cls;
    }
}

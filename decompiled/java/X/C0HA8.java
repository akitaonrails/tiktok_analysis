package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HA8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HA8 {
    public static final /* synthetic */ C0HA8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HA8 MULTI_VIDEO;
    public static final C0HA8 SINGLE_VIDEO;

    public static InterfaceC2044707zh<C0HA8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HA8 c0ha8 = new C0HA8("SINGLE_VIDEO", 0);
        SINGLE_VIDEO = c0ha8;
        C0HA8 c0ha82 = new C0HA8("MULTI_VIDEO", 1);
        MULTI_VIDEO = c0ha82;
        C0HA8[] c0ha8Arr = {c0ha8, c0ha82};
        LL = c0ha8Arr;
        LLILLJJLI = new C2254308sP(c0ha8Arr);
    }

    public static C0HA8[] values() {
        return (C0HA8[]) LL.clone();
    }

    public static C0HA8 valueOf(String str) {
        return (C0HA8) C08FF.LIZ(C0HA8.class, str);
    }

    public C0HA8(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00Y8 {
    public static final C00Y8 IDLE;
    public static final /* synthetic */ C00Y8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00Y8 UPDATING;

    public static InterfaceC2044707zh<C00Y8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00Y8 c00y8 = new C00Y8("IDLE", 0);
        IDLE = c00y8;
        C00Y8 c00y82 = new C00Y8("UPDATING", 1);
        UPDATING = c00y82;
        C00Y8[] c00y8Arr = {c00y8, c00y82};
        LL = c00y8Arr;
        LLILLJJLI = new C2254308sP(c00y8Arr);
    }

    public static C00Y8[] values() {
        return (C00Y8[]) LL.clone();
    }

    public static C00Y8 valueOf(String str) {
        return (C00Y8) C08FF.LIZ(C00Y8.class, str);
    }

    public C00Y8(String str, int i) {
    }
}

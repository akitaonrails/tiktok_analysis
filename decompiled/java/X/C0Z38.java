package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z38, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z38 {
    public static final /* synthetic */ C0Z38[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Z38 MODE_FIRST_ONLY;
    public static final C0Z38 MODE_LATEST;

    public static InterfaceC2044707zh<C0Z38> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Z38 c0z38 = new C0Z38("MODE_LATEST", 0);
        MODE_LATEST = c0z38;
        C0Z38 c0z382 = new C0Z38("MODE_FIRST_ONLY", 1);
        MODE_FIRST_ONLY = c0z382;
        C0Z38[] c0z38Arr = {c0z38, c0z382};
        LL = c0z38Arr;
        LLILLJJLI = new C2254308sP(c0z38Arr);
    }

    public static C0Z38[] values() {
        return (C0Z38[]) LL.clone();
    }

    public static C0Z38 valueOf(String str) {
        return (C0Z38) C08FF.LIZ(C0Z38.class, str);
    }

    public C0Z38(String str, int i) {
    }
}

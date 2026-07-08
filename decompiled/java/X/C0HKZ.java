package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKZ {
    public static final C0HKZ CACHE;
    public static final C0HKZ CURRENT_REPOST;
    public static final /* synthetic */ C0HKZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0HKZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HKZ c0hkz = new C0HKZ("CACHE", 0);
        CACHE = c0hkz;
        C0HKZ c0hkz2 = new C0HKZ("CURRENT_REPOST", 1);
        CURRENT_REPOST = c0hkz2;
        C0HKZ[] c0hkzArr = {c0hkz, c0hkz2};
        LL = c0hkzArr;
        LLILLJJLI = new C2254308sP(c0hkzArr);
    }

    public static C0HKZ[] values() {
        return (C0HKZ[]) LL.clone();
    }

    public static C0HKZ valueOf(String str) {
        return (C0HKZ) C08FF.LIZ(C0HKZ.class, str);
    }

    public C0HKZ(String str, int i) {
    }
}

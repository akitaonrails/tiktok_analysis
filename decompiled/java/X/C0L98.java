package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L98, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L98 {
    public static final C0L98 GUIDING;
    public static final C0L98 HIDING;
    public static final /* synthetic */ C0L98[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L98 NONE;
    public static final C0L98 SHOWING;

    public static InterfaceC2044707zh<C0L98> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L98 c0l98 = new C0L98("HIDING", 0);
        HIDING = c0l98;
        C0L98 c0l982 = new C0L98("SHOWING", 1);
        SHOWING = c0l982;
        C0L98 c0l983 = new C0L98("GUIDING", 2);
        GUIDING = c0l983;
        C0L98 c0l984 = new C0L98("NONE", 3);
        NONE = c0l984;
        C0L98[] c0l98Arr = {c0l98, c0l982, c0l983, c0l984};
        LL = c0l98Arr;
        LLILLJJLI = new C2254308sP(c0l98Arr);
    }

    public static C0L98[] values() {
        return (C0L98[]) LL.clone();
    }

    public static C0L98 valueOf(String str) {
        return (C0L98) C08FF.LIZ(C0L98.class, str);
    }

    public C0L98(String str, int i) {
    }
}

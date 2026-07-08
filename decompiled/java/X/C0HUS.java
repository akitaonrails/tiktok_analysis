package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HUS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUS {
    public static final /* synthetic */ C0HUS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HUS NORMAL;
    public static final C0HUS SCALE;

    public static InterfaceC2044707zh<C0HUS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HUS c0hus = new C0HUS("SCALE", 0);
        SCALE = c0hus;
        C0HUS c0hus2 = new C0HUS("NORMAL", 1);
        NORMAL = c0hus2;
        C0HUS[] c0husArr = {c0hus, c0hus2};
        LL = c0husArr;
        LLILLJJLI = new C2254308sP(c0husArr);
    }

    public static C0HUS[] values() {
        return (C0HUS[]) LL.clone();
    }

    public static C0HUS valueOf(String str) {
        return (C0HUS) C08FF.LIZ(C0HUS.class, str);
    }

    public C0HUS(String str, int i) {
    }
}

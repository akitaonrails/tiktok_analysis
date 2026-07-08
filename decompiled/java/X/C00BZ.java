package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BZ {
    public static final C00BZ ACTION;
    public static final C00BZ EMOTION;
    public static final /* synthetic */ C00BZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BZ OBJECT;
    public static final C00BZ SCENE;
    public static final C00BZ TIME_OF_DAY;
    public static final C00BZ WEATHER;

    public static InterfaceC2044707zh<C00BZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BZ c00bz = new C00BZ("SCENE", 0);
        SCENE = c00bz;
        C00BZ c00bz2 = new C00BZ("OBJECT", 1);
        OBJECT = c00bz2;
        C00BZ c00bz3 = new C00BZ("ACTION", 2);
        ACTION = c00bz3;
        C00BZ c00bz4 = new C00BZ("EMOTION", 3);
        EMOTION = c00bz4;
        C00BZ c00bz5 = new C00BZ("WEATHER", 4);
        WEATHER = c00bz5;
        C00BZ c00bz6 = new C00BZ("TIME_OF_DAY", 5);
        TIME_OF_DAY = c00bz6;
        C00BZ[] c00bzArr = {c00bz, c00bz2, c00bz3, c00bz4, c00bz5, c00bz6};
        LL = c00bzArr;
        LLILLJJLI = new C2254308sP(c00bzArr);
    }

    public static C00BZ[] values() {
        return (C00BZ[]) LL.clone();
    }

    public static C00BZ valueOf(String str) {
        return (C00BZ) C08FF.LIZ(C00BZ.class, str);
    }

    public C00BZ(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008F {
    public static final /* synthetic */ C008F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008F LOADER_AFTER_ENTER;
    public static final C008F LOADER_AFTER_FIRST_FRAME;
    public static final C008F LOADER_WHEN_ENTER;
    public static final C008F PRE_LOADER;

    public static InterfaceC2044707zh<C008F> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008F c008f = new C008F("PRE_LOADER", 0);
        PRE_LOADER = c008f;
        C008F c008f2 = new C008F("LOADER_WHEN_ENTER", 1);
        LOADER_WHEN_ENTER = c008f2;
        C008F c008f3 = new C008F("LOADER_AFTER_FIRST_FRAME", 2);
        LOADER_AFTER_FIRST_FRAME = c008f3;
        C008F c008f4 = new C008F("LOADER_AFTER_ENTER", 3);
        LOADER_AFTER_ENTER = c008f4;
        C008F[] c008fArr = {c008f, c008f2, c008f3, c008f4};
        LL = c008fArr;
        LLILLJJLI = new C2254308sP(c008fArr);
    }

    public static C008F[] values() {
        return (C008F[]) LL.clone();
    }

    public static C008F valueOf(String str) {
        return (C008F) C08FF.LIZ(C008F.class, str);
    }

    public C008F(String str, int i) {
    }
}

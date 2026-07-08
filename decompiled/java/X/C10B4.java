package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10B4, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10B4 {
    public static final /* synthetic */ C10B4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10B4 NONE;
    public static final C10B4 PRIVATE;
    public static final C10B4 PUBLIC;
    public static final C10B4 REMIND_LATER;

    public static InterfaceC2044707zh<C10B4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10B4 c10b4 = new C10B4("NONE", 0);
        NONE = c10b4;
        C10B4 c10b42 = new C10B4("PRIVATE", 1);
        PRIVATE = c10b42;
        C10B4 c10b43 = new C10B4("PUBLIC", 2);
        PUBLIC = c10b43;
        C10B4 c10b44 = new C10B4("REMIND_LATER", 3);
        REMIND_LATER = c10b44;
        C10B4[] c10b4Arr = {c10b4, c10b42, c10b43, c10b44};
        LL = c10b4Arr;
        LLILLJJLI = new C2254308sP(c10b4Arr);
    }

    public static C10B4[] values() {
        return (C10B4[]) LL.clone();
    }

    public static C10B4 valueOf(String str) {
        return (C10B4) C08FF.LIZ(C10B4.class, str);
    }

    public C10B4(String str, int i) {
    }
}

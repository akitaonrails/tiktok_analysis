package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJ9 {
    public static final C0MJ9 AUTO_CUT;
    public static final /* synthetic */ C0MJ9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MJ9 MIX_EDITING;
    public static final C0MJ9 PLACE_HOLDER;
    public static final C0MJ9 SOUND_SYNC;

    public static InterfaceC2044707zh<C0MJ9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MJ9 c0mj9 = new C0MJ9("AUTO_CUT", 0);
        AUTO_CUT = c0mj9;
        C0MJ9 c0mj92 = new C0MJ9("SOUND_SYNC", 1);
        SOUND_SYNC = c0mj92;
        C0MJ9 c0mj93 = new C0MJ9("MIX_EDITING", 2);
        MIX_EDITING = c0mj93;
        C0MJ9 c0mj94 = new C0MJ9("PLACE_HOLDER", 3);
        PLACE_HOLDER = c0mj94;
        C0MJ9[] c0mj9Arr = {c0mj9, c0mj92, c0mj93, c0mj94};
        LL = c0mj9Arr;
        LLILLJJLI = new C2254308sP(c0mj9Arr);
    }

    public static C0MJ9[] values() {
        return (C0MJ9[]) LL.clone();
    }

    public static C0MJ9 valueOf(String str) {
        return (C0MJ9) C08FF.LIZ(C0MJ9.class, str);
    }

    public C0MJ9(String str, int i) {
    }
}

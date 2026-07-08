package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QL8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL8 {
    public static final C0QL8 GONE;
    public static final /* synthetic */ C0QL8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QL8 SHOW_ICON_END;
    public static final C0QL8 SHOW_ICON_START;

    public static InterfaceC2044707zh<C0QL8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QL8 c0ql8 = new C0QL8("SHOW_ICON_START", 0);
        SHOW_ICON_START = c0ql8;
        C0QL8 c0ql82 = new C0QL8("SHOW_ICON_END", 1);
        SHOW_ICON_END = c0ql82;
        C0QL8 c0ql83 = new C0QL8("GONE", 2);
        GONE = c0ql83;
        C0QL8[] c0ql8Arr = {c0ql8, c0ql82, c0ql83};
        LL = c0ql8Arr;
        LLILLJJLI = new C2254308sP(c0ql8Arr);
    }

    public static C0QL8[] values() {
        return (C0QL8[]) LL.clone();
    }

    public static C0QL8 valueOf(String str) {
        return (C0QL8) C08FF.LIZ(C0QL8.class, str);
    }

    public C0QL8(String str, int i) {
    }
}

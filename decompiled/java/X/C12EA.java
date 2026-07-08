package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12EA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EA {
    public static final C12EA CLICK;
    public static final C12EA CLOSE;
    public static final /* synthetic */ C12EA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C12EA PUBLISH;
    public static final C12EA SHOW;

    public static InterfaceC2044707zh<C12EA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C12EA c12ea = new C12EA("SHOW", 0);
        SHOW = c12ea;
        C12EA c12ea2 = new C12EA("CLICK", 1);
        CLICK = c12ea2;
        C12EA c12ea3 = new C12EA("CLOSE", 2);
        CLOSE = c12ea3;
        C12EA c12ea4 = new C12EA("PUBLISH", 3);
        PUBLISH = c12ea4;
        C12EA[] c12eaArr = {c12ea, c12ea2, c12ea3, c12ea4};
        LL = c12eaArr;
        LLILLJJLI = new C2254308sP(c12eaArr);
    }

    public static C12EA[] values() {
        return (C12EA[]) LL.clone();
    }

    public static C12EA valueOf(String str) {
        return (C12EA) C08FF.LIZ(C12EA.class, str);
    }

    public C12EA(String str, int i) {
    }
}

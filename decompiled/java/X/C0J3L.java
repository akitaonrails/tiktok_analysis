package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J3L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3L {
    public static final C0J3L COHOST_LINKED;
    public static final C0J3L ENTER_ROOM;
    public static final /* synthetic */ C0J3L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0J3L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J3L c0j3l = new C0J3L("ENTER_ROOM", 0);
        ENTER_ROOM = c0j3l;
        C0J3L c0j3l2 = new C0J3L("COHOST_LINKED", 1);
        COHOST_LINKED = c0j3l2;
        C0J3L[] c0j3lArr = {c0j3l, c0j3l2};
        LL = c0j3lArr;
        LLILLJJLI = new C2254308sP(c0j3lArr);
    }

    public static C0J3L[] values() {
        return (C0J3L[]) LL.clone();
    }

    public static C0J3L valueOf(String str) {
        return (C0J3L) C08FF.LIZ(C0J3L.class, str);
    }

    public C0J3L(String str, int i) {
    }
}

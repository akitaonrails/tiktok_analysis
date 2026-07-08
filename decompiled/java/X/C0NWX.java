package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NWX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWX {
    public static final C0NWX ENTER;
    public static final C0NWX EXIT;
    public static final C0NWX IN_PROGRESS;
    public static final /* synthetic */ C0NWX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0NWX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NWX c0nwx = new C0NWX("ENTER", 0);
        ENTER = c0nwx;
        C0NWX c0nwx2 = new C0NWX("IN_PROGRESS", 1);
        IN_PROGRESS = c0nwx2;
        C0NWX c0nwx3 = new C0NWX("EXIT", 2);
        EXIT = c0nwx3;
        C0NWX[] c0nwxArr = {c0nwx, c0nwx2, c0nwx3};
        LL = c0nwxArr;
        LLILLJJLI = new C2254308sP(c0nwxArr);
    }

    public static C0NWX[] values() {
        return (C0NWX[]) LL.clone();
    }

    public static C0NWX valueOf(String str) {
        return (C0NWX) C08FF.LIZ(C0NWX.class, str);
    }

    public C0NWX(String str, int i) {
    }
}

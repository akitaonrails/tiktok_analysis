package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QQU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQU {
    public static final C0QQU CLICK;
    public static final /* synthetic */ C0QQU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QQU SHOW;

    public static InterfaceC2044707zh<C0QQU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QQU c0qqu = new C0QQU("SHOW", 0);
        SHOW = c0qqu;
        C0QQU c0qqu2 = new C0QQU("CLICK", 1);
        CLICK = c0qqu2;
        C0QQU[] c0qquArr = {c0qqu, c0qqu2};
        LL = c0qquArr;
        LLILLJJLI = new C2254308sP(c0qquArr);
    }

    public static C0QQU[] values() {
        return (C0QQU[]) LL.clone();
    }

    public static C0QQU valueOf(String str) {
        return (C0QQU) C08FF.LIZ(C0QQU.class, str);
    }

    public C0QQU(String str, int i) {
    }
}

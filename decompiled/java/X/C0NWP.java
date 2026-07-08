package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NWP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWP {
    public static final C0NWP Hide;
    public static final C0NWP Init;
    public static final /* synthetic */ C0NWP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NWP Show;

    public static InterfaceC2044707zh<C0NWP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NWP c0nwp = new C0NWP("Init", 0);
        Init = c0nwp;
        C0NWP c0nwp2 = new C0NWP("Show", 1);
        Show = c0nwp2;
        C0NWP c0nwp3 = new C0NWP("Hide", 2);
        Hide = c0nwp3;
        C0NWP[] c0nwpArr = {c0nwp, c0nwp2, c0nwp3};
        LL = c0nwpArr;
        LLILLJJLI = new C2254308sP(c0nwpArr);
    }

    public static C0NWP[] values() {
        return (C0NWP[]) LL.clone();
    }

    public static C0NWP valueOf(String str) {
        return (C0NWP) C08FF.LIZ(C0NWP.class, str);
    }

    public C0NWP(String str, int i) {
    }
}

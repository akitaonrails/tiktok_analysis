package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HXS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXS {
    public static final /* synthetic */ C0HXS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HXS POPUP;
    public static final C0HXS UPGRADE;

    public static InterfaceC2044707zh<C0HXS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HXS c0hxs = new C0HXS("UPGRADE", 0);
        UPGRADE = c0hxs;
        C0HXS c0hxs2 = new C0HXS("POPUP", 1);
        POPUP = c0hxs2;
        C0HXS[] c0hxsArr = {c0hxs, c0hxs2};
        LL = c0hxsArr;
        LLILLJJLI = new C2254308sP(c0hxsArr);
    }

    public static C0HXS[] values() {
        return (C0HXS[]) LL.clone();
    }

    public static C0HXS valueOf(String str) {
        return (C0HXS) C08FF.LIZ(C0HXS.class, str);
    }

    public C0HXS(String str, int i) {
    }
}

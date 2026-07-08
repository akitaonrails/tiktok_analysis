package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.16AU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16AU {
    public static final C16AU CLICKED;
    public static final C16AU DISMISSED;
    public static final C16AU DRAGGING;
    public static final /* synthetic */ C16AU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C16AU NO_ACTION;
    public static final C16AU RELEASED;

    public static InterfaceC2044707zh<C16AU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C16AU c16au = new C16AU("NO_ACTION", 0);
        NO_ACTION = c16au;
        C16AU c16au2 = new C16AU("DRAGGING", 1);
        DRAGGING = c16au2;
        C16AU c16au3 = new C16AU("RELEASED", 2);
        RELEASED = c16au3;
        C16AU c16au4 = new C16AU("CLICKED", 3);
        CLICKED = c16au4;
        C16AU c16au5 = new C16AU("DISMISSED", 4);
        DISMISSED = c16au5;
        C16AU[] c16auArr = {c16au, c16au2, c16au3, c16au4, c16au5};
        LL = c16auArr;
        LLILLJJLI = new C2254308sP(c16auArr);
    }

    public static C16AU[] values() {
        return (C16AU[]) LL.clone();
    }

    public static C16AU valueOf(String str) {
        return (C16AU) C08FF.LIZ(C16AU.class, str);
    }

    public C16AU(String str, int i) {
    }
}

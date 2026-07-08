package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TUO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUO {
    public static final C0TUO DISPLAY;
    public static final C0TUO EDIT;
    public static final /* synthetic */ C0TUO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0TUO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TUO c0tuo = new C0TUO("DISPLAY", 0);
        DISPLAY = c0tuo;
        C0TUO c0tuo2 = new C0TUO("EDIT", 1);
        EDIT = c0tuo2;
        C0TUO[] c0tuoArr = {c0tuo, c0tuo2};
        LL = c0tuoArr;
        LLILLJJLI = new C2254308sP(c0tuoArr);
    }

    public static C0TUO[] values() {
        return (C0TUO[]) LL.clone();
    }

    public static C0TUO valueOf(String str) {
        return (C0TUO) C08FF.LIZ(C0TUO.class, str);
    }

    public C0TUO(String str, int i) {
    }
}

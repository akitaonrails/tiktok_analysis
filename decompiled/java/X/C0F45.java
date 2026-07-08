package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F45, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F45 {
    public static final C0F45 LEFT;
    public static final /* synthetic */ C0F45[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0F45 RIGHT;

    public static InterfaceC2044707zh<C0F45> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0F45 c0f45 = new C0F45("LEFT", 0);
        LEFT = c0f45;
        C0F45 c0f452 = new C0F45("RIGHT", 1);
        RIGHT = c0f452;
        C0F45[] c0f45Arr = {c0f45, c0f452};
        LL = c0f45Arr;
        LLILLJJLI = new C2254308sP(c0f45Arr);
    }

    public static C0F45[] values() {
        return (C0F45[]) LL.clone();
    }

    public static C0F45 valueOf(String str) {
        return (C0F45) C08FF.LIZ(C0F45.class, str);
    }

    public C0F45(String str, int i) {
    }
}

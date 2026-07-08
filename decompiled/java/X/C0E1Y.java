package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1Y {
    public static final C0E1Y ADD_STICKER;
    public static final C0E1Y COPY_STICKER;
    public static final C0E1Y DELETE_STICKER;
    public static final /* synthetic */ C0E1Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E1Y PIN_STICKER;
    public static final C0E1Y REPLACE_STICKER;

    public static InterfaceC2044707zh<C0E1Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E1Y c0e1y = new C0E1Y("ADD_STICKER", 0);
        ADD_STICKER = c0e1y;
        C0E1Y c0e1y2 = new C0E1Y("DELETE_STICKER", 1);
        DELETE_STICKER = c0e1y2;
        C0E1Y c0e1y3 = new C0E1Y("REPLACE_STICKER", 2);
        REPLACE_STICKER = c0e1y3;
        C0E1Y c0e1y4 = new C0E1Y("COPY_STICKER", 3);
        COPY_STICKER = c0e1y4;
        C0E1Y c0e1y5 = new C0E1Y("PIN_STICKER", 4);
        PIN_STICKER = c0e1y5;
        C0E1Y[] c0e1yArr = {c0e1y, c0e1y2, c0e1y3, c0e1y4, c0e1y5};
        LL = c0e1yArr;
        LLILLJJLI = new C2254308sP(c0e1yArr);
    }

    public static C0E1Y[] values() {
        return (C0E1Y[]) LL.clone();
    }

    public static C0E1Y valueOf(String str) {
        return (C0E1Y) C08FF.LIZ(C0E1Y.class, str);
    }

    public C0E1Y(String str, int i) {
    }
}

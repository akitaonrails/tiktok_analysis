package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TXW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXW {
    public static final C0TXW CLICK;
    public static final C0TXW DISLIKE;
    public static final /* synthetic */ C0TXW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TXW SHOW;

    public static InterfaceC2044707zh<C0TXW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TXW c0txw = new C0TXW("SHOW", 0);
        SHOW = c0txw;
        C0TXW c0txw2 = new C0TXW("CLICK", 1);
        CLICK = c0txw2;
        C0TXW c0txw3 = new C0TXW("DISLIKE", 2);
        DISLIKE = c0txw3;
        C0TXW[] c0txwArr = {c0txw, c0txw2, c0txw3};
        LL = c0txwArr;
        LLILLJJLI = new C2254308sP(c0txwArr);
    }

    public static C0TXW[] values() {
        return (C0TXW[]) LL.clone();
    }

    public static C0TXW valueOf(String str) {
        return (C0TXW) C08FF.LIZ(C0TXW.class, str);
    }

    public C0TXW(String str, int i) {
    }
}

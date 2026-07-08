package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0THY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THY {
    public static final C0THY DEPRECATED;
    public static final /* synthetic */ C0THY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0THY USING;

    public static InterfaceC2044707zh<C0THY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0THY c0thy = new C0THY("USING", 0);
        USING = c0thy;
        C0THY c0thy2 = new C0THY("DEPRECATED", 1);
        DEPRECATED = c0thy2;
        C0THY[] c0thyArr = {c0thy, c0thy2};
        LL = c0thyArr;
        LLILLJJLI = new C2254308sP(c0thyArr);
    }

    public static C0THY[] values() {
        return (C0THY[]) LL.clone();
    }

    public static C0THY valueOf(String str) {
        return (C0THY) C08FF.LIZ(C0THY.class, str);
    }

    public C0THY(String str, int i) {
    }
}

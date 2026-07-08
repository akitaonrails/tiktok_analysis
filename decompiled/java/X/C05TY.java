package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05TY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05TY {
    public static final C05TY ANIMATED;
    public static final C05TY DIRECT;
    public static final /* synthetic */ C05TY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C05TY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05TY c05ty = new C05TY("ANIMATED", 0);
        ANIMATED = c05ty;
        C05TY c05ty2 = new C05TY("DIRECT", 1);
        DIRECT = c05ty2;
        C05TY[] c05tyArr = {c05ty, c05ty2};
        LL = c05tyArr;
        LLILLJJLI = new C2254308sP(c05tyArr);
    }

    public static C05TY[] values() {
        return (C05TY[]) LL.clone();
    }

    public static C05TY valueOf(String str) {
        return (C05TY) C08FF.LIZ(C05TY.class, str);
    }

    public C05TY(String str, int i) {
    }
}

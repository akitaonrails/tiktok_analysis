package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09TL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TL {
    public static final C09TL FAIL;
    public static final C09TL IDLE;
    public static final /* synthetic */ C09TL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09TL SUC;

    public static InterfaceC2044707zh<C09TL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09TL c09tl = new C09TL("IDLE", 0);
        IDLE = c09tl;
        C09TL c09tl2 = new C09TL("SUC", 1);
        SUC = c09tl2;
        C09TL c09tl3 = new C09TL("FAIL", 2);
        FAIL = c09tl3;
        C09TL[] c09tlArr = {c09tl, c09tl2, c09tl3};
        LL = c09tlArr;
        LLILLJJLI = new C2254308sP(c09tlArr);
    }

    public static C09TL[] values() {
        return (C09TL[]) LL.clone();
    }

    public static C09TL valueOf(String str) {
        return (C09TL) C08FF.LIZ(C09TL.class, str);
    }

    public C09TL(String str, int i) {
    }
}

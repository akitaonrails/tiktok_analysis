package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06PL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06PL {
    public static final C06PL LEFT;
    public static final /* synthetic */ C06PL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06PL RIGHT;

    public static InterfaceC2044707zh<C06PL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06PL c06pl = new C06PL("LEFT", 0);
        LEFT = c06pl;
        C06PL c06pl2 = new C06PL("RIGHT", 1);
        RIGHT = c06pl2;
        C06PL[] c06plArr = {c06pl, c06pl2};
        LL = c06plArr;
        LLILLJJLI = new C2254308sP(c06plArr);
    }

    public static C06PL[] values() {
        return (C06PL[]) LL.clone();
    }

    public static C06PL valueOf(String str) {
        return (C06PL) C08FF.LIZ(C06PL.class, str);
    }

    public C06PL(String str, int i) {
    }
}

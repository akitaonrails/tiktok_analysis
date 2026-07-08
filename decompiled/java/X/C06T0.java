package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06T0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06T0 {
    public static final C06T0 CARD_EXPOSURE_ONCE;
    public static final C06T0 CLICK;
    public static final /* synthetic */ C06T0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C06T0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06T0 c06t0 = new C06T0("CARD_EXPOSURE_ONCE", 0);
        CARD_EXPOSURE_ONCE = c06t0;
        C06T0 c06t02 = new C06T0("CLICK", 1);
        CLICK = c06t02;
        C06T0[] c06t0Arr = {c06t0, c06t02};
        LL = c06t0Arr;
        LLILLJJLI = new C2254308sP(c06t0Arr);
    }

    public static C06T0[] values() {
        return (C06T0[]) LL.clone();
    }

    public static C06T0 valueOf(String str) {
        return (C06T0) C08FF.LIZ(C06T0.class, str);
    }

    public C06T0(String str, int i) {
    }
}

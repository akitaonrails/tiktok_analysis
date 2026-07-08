package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG7 {
    public static final C0PG7 DIMISS;
    public static final /* synthetic */ C0PG7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PG7 READY;
    public static final C0PG7 SHOW;

    public static InterfaceC2044707zh<C0PG7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PG7 c0pg7 = new C0PG7("READY", 0);
        READY = c0pg7;
        C0PG7 c0pg72 = new C0PG7("SHOW", 1);
        SHOW = c0pg72;
        C0PG7 c0pg73 = new C0PG7("DIMISS", 2);
        DIMISS = c0pg73;
        C0PG7[] c0pg7Arr = {c0pg7, c0pg72, c0pg73};
        LL = c0pg7Arr;
        LLILLJJLI = new C2254308sP(c0pg7Arr);
    }

    public static C0PG7[] values() {
        return (C0PG7[]) LL.clone();
    }

    public static C0PG7 valueOf(String str) {
        return (C0PG7) C08FF.LIZ(C0PG7.class, str);
    }

    public C0PG7(String str, int i) {
    }
}

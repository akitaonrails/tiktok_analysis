package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SV1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SV1 {
    public static final /* synthetic */ C0SV1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SV1 LOCAL;
    public static final C0SV1 REMOTE;
    public static final C0SV1 TUX;

    public static InterfaceC2044707zh<C0SV1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SV1 c0sv1 = new C0SV1("LOCAL", 0);
        LOCAL = c0sv1;
        C0SV1 c0sv12 = new C0SV1("REMOTE", 1);
        REMOTE = c0sv12;
        C0SV1 c0sv13 = new C0SV1("TUX", 2);
        TUX = c0sv13;
        C0SV1[] c0sv1Arr = {c0sv1, c0sv12, c0sv13};
        LL = c0sv1Arr;
        LLILLJJLI = new C2254308sP(c0sv1Arr);
    }

    public static C0SV1[] values() {
        return (C0SV1[]) LL.clone();
    }

    public static C0SV1 valueOf(String str) {
        return (C0SV1) C08FF.LIZ(C0SV1.class, str);
    }

    public C0SV1(String str, int i) {
    }
}

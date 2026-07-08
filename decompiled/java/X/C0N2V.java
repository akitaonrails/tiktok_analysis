package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2V {
    public static final C0N2V COIN_TASK;
    public static final /* synthetic */ C0N2V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "timer";

    public static InterfaceC2044707zh<C0N2V> getEntries() {
        return LLILLL;
    }

    static {
        C0N2V c0n2v = new C0N2V();
        COIN_TASK = c0n2v;
        C0N2V[] c0n2vArr = {c0n2v};
        LLILLJJLI = c0n2vArr;
        LLILLL = new C2254308sP(c0n2vArr);
    }

    public static C0N2V[] values() {
        return (C0N2V[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0N2V valueOf(String str) {
        return (C0N2V) C08FF.LIZ(C0N2V.class, str);
    }
}

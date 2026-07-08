package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5K {
    public static final /* synthetic */ C0N5K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N5K SHRINK_TO_BAG;
    public final int LL = 1;

    public static InterfaceC2044707zh<C0N5K> getEntries() {
        return LLILLL;
    }

    static {
        C0N5K c0n5k = new C0N5K();
        SHRINK_TO_BAG = c0n5k;
        C0N5K[] c0n5kArr = {c0n5k};
        LLILLJJLI = c0n5kArr;
        LLILLL = new C2254308sP(c0n5kArr);
    }

    public static C0N5K[] values() {
        return (C0N5K[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0N5K valueOf(String str) {
        return (C0N5K) C08FF.LIZ(C0N5K.class, str);
    }
}

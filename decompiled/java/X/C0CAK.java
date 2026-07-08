package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CAK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAK {
    public static final C0CAK CONFIG_CHANGES;
    public static final C0CAK IN_BACKGROUND;
    public static final /* synthetic */ C0CAK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CAK OTHER;

    public static InterfaceC2044707zh<C0CAK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CAK c0cak = new C0CAK("CONFIG_CHANGES", 0);
        CONFIG_CHANGES = c0cak;
        C0CAK c0cak2 = new C0CAK("IN_BACKGROUND", 1);
        IN_BACKGROUND = c0cak2;
        C0CAK c0cak3 = new C0CAK("OTHER", 2);
        OTHER = c0cak3;
        C0CAK[] c0cakArr = {c0cak, c0cak2, c0cak3};
        LL = c0cakArr;
        LLILLJJLI = new C2254308sP(c0cakArr);
    }

    public static C0CAK[] values() {
        return (C0CAK[]) LL.clone();
    }

    public static C0CAK valueOf(String str) {
        return (C0CAK) C08FF.LIZ(C0CAK.class, str);
    }

    public C0CAK(String str, int i) {
    }
}

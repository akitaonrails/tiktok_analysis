package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N9C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N9C {
    public static final C0N9C COLD_CACHE;
    public static final C0N9C FEED_UNCONSUMED;
    public static final C0N9C GOLDEN_HOUSE;
    public static final /* synthetic */ C0N9C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N9C MERGE_CACHE;
    public static final C0N9C OFFLINE_MODE;

    public static InterfaceC2044707zh<C0N9C> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N9C c0n9c = new C0N9C("COLD_CACHE", 0);
        COLD_CACHE = c0n9c;
        C0N9C c0n9c2 = new C0N9C("FEED_UNCONSUMED", 1);
        FEED_UNCONSUMED = c0n9c2;
        C0N9C c0n9c3 = new C0N9C("GOLDEN_HOUSE", 2);
        GOLDEN_HOUSE = c0n9c3;
        C0N9C c0n9c4 = new C0N9C("OFFLINE_MODE", 3);
        OFFLINE_MODE = c0n9c4;
        C0N9C c0n9c5 = new C0N9C("MERGE_CACHE", 4);
        MERGE_CACHE = c0n9c5;
        C0N9C[] c0n9cArr = {c0n9c, c0n9c2, c0n9c3, c0n9c4, c0n9c5};
        LL = c0n9cArr;
        LLILLJJLI = new C2254308sP(c0n9cArr);
    }

    public static C0N9C[] values() {
        return (C0N9C[]) LL.clone();
    }

    public static C0N9C valueOf(String str) {
        return (C0N9C) C08FF.LIZ(C0N9C.class, str);
    }

    public C0N9C(String str, int i) {
    }
}

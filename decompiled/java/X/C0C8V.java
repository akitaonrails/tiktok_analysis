package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8V {
    public static final C0C8V FYP_EC_SEARCH_CARD;
    public static final /* synthetic */ C0C8V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "fyp_card_in_feed";

    public static InterfaceC2044707zh<C0C8V> getEntries() {
        return LLILLL;
    }

    static {
        C0C8V c0c8v = new C0C8V();
        FYP_EC_SEARCH_CARD = c0c8v;
        C0C8V[] c0c8vArr = {c0c8v};
        LLILLJJLI = c0c8vArr;
        LLILLL = new C2254308sP(c0c8vArr);
    }

    public static C0C8V[] values() {
        return (C0C8V[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0C8V valueOf(String str) {
        return (C0C8V) C08FF.LIZ(C0C8V.class, str);
    }
}

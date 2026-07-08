package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OST, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OST {
    public static final C0OST EMOJI;
    public static final C0OST EXISTING_SUBSCRIBER;
    public static final /* synthetic */ C0OST[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OST NEW_SUBSCRIBER;

    public static InterfaceC2044707zh<C0OST> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OST c0ost = new C0OST("NEW_SUBSCRIBER", 0);
        NEW_SUBSCRIBER = c0ost;
        C0OST c0ost2 = new C0OST("EXISTING_SUBSCRIBER", 1);
        EXISTING_SUBSCRIBER = c0ost2;
        C0OST c0ost3 = new C0OST("EMOJI", 2);
        EMOJI = c0ost3;
        C0OST[] c0ostArr = {c0ost, c0ost2, c0ost3};
        LL = c0ostArr;
        LLILLJJLI = new C2254308sP(c0ostArr);
    }

    public static C0OST[] values() {
        return (C0OST[]) LL.clone();
    }

    public static C0OST valueOf(String str) {
        return (C0OST) C08FF.LIZ(C0OST.class, str);
    }

    public C0OST(String str, int i) {
    }
}

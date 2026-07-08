package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009A {
    public static final C009A CREATION_CARD_TYPE_EFFECT;
    public static final /* synthetic */ C009A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C009A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009A c009a = new C009A();
        CREATION_CARD_TYPE_EFFECT = c009a;
        C009A[] c009aArr = {c009a};
        LL = c009aArr;
        LLILLJJLI = new C2254308sP(c009aArr);
    }

    public static C009A[] values() {
        return (C009A[]) LL.clone();
    }

    public static C009A valueOf(String str) {
        return (C009A) C08FF.LIZ(C009A.class, str);
    }
}

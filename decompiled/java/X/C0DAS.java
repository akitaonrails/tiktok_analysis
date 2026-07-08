package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DAS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAS {
    public static final C0DAS EMPTY;
    public static final /* synthetic */ C0DAS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DAS READY;
    public static final C0DAS RESOLVING;

    public static InterfaceC2044707zh<C0DAS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DAS c0das = new C0DAS("RESOLVING", 0);
        RESOLVING = c0das;
        C0DAS c0das2 = new C0DAS("EMPTY", 1);
        EMPTY = c0das2;
        C0DAS c0das3 = new C0DAS("READY", 2);
        READY = c0das3;
        C0DAS[] c0dasArr = {c0das, c0das2, c0das3};
        LL = c0dasArr;
        LLILLJJLI = new C2254308sP(c0dasArr);
    }

    public static C0DAS[] values() {
        return (C0DAS[]) LL.clone();
    }

    public static C0DAS valueOf(String str) {
        return (C0DAS) C08FF.LIZ(C0DAS.class, str);
    }

    public C0DAS(String str, int i) {
    }
}

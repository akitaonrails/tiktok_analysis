package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IKA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKA {
    public static final C0IKA DOWNLOAD;
    public static final C0IKA INFERENCE;
    public static final /* synthetic */ C0IKA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IKA SEI_RECEIVE;

    public static InterfaceC2044707zh<C0IKA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IKA c0ika = new C0IKA("DOWNLOAD", 0);
        DOWNLOAD = c0ika;
        C0IKA c0ika2 = new C0IKA("INFERENCE", 1);
        INFERENCE = c0ika2;
        C0IKA c0ika3 = new C0IKA("SEI_RECEIVE", 2);
        SEI_RECEIVE = c0ika3;
        C0IKA[] c0ikaArr = {c0ika, c0ika2, c0ika3};
        LL = c0ikaArr;
        LLILLJJLI = new C2254308sP(c0ikaArr);
    }

    public static C0IKA[] values() {
        return (C0IKA[]) LL.clone();
    }

    public static C0IKA valueOf(String str) {
        return (C0IKA) C08FF.LIZ(C0IKA.class, str);
    }

    public C0IKA(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15VQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VQ {
    public static final C15VQ FAIL;
    public static final C15VQ IDLE;
    public static final /* synthetic */ C15VQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15VQ LOADED;
    public static final C15VQ START;

    public static InterfaceC2044707zh<C15VQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15VQ c15vq = new C15VQ("IDLE", 0);
        IDLE = c15vq;
        C15VQ c15vq2 = new C15VQ("START", 1);
        START = c15vq2;
        C15VQ c15vq3 = new C15VQ("LOADED", 2);
        LOADED = c15vq3;
        C15VQ c15vq4 = new C15VQ("FAIL", 3);
        FAIL = c15vq4;
        C15VQ[] c15vqArr = {c15vq, c15vq2, c15vq3, c15vq4};
        LL = c15vqArr;
        LLILLJJLI = new C2254308sP(c15vqArr);
    }

    public static C15VQ[] values() {
        return (C15VQ[]) LL.clone();
    }

    public static C15VQ valueOf(String str) {
        return (C15VQ) C08FF.LIZ(C15VQ.class, str);
    }

    public C15VQ(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZSW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSW {
    public static final /* synthetic */ C0ZSW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZSW NO_MASK;
    public static final C0ZSW NUDE_MASK;
    public static final C0ZSW PHOTO_SWAP_INITIATE_MASK;
    public static final C0ZSW PHOTO_SWAP_REPLY_MASK;
    public static final C0ZSW SAFETY_MASK;

    public static InterfaceC2044707zh<C0ZSW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZSW c0zsw = new C0ZSW("NO_MASK", 0);
        NO_MASK = c0zsw;
        C0ZSW c0zsw2 = new C0ZSW("SAFETY_MASK", 1);
        SAFETY_MASK = c0zsw2;
        C0ZSW c0zsw3 = new C0ZSW("NUDE_MASK", 2);
        NUDE_MASK = c0zsw3;
        C0ZSW c0zsw4 = new C0ZSW("PHOTO_SWAP_INITIATE_MASK", 3);
        PHOTO_SWAP_INITIATE_MASK = c0zsw4;
        C0ZSW c0zsw5 = new C0ZSW("PHOTO_SWAP_REPLY_MASK", 4);
        PHOTO_SWAP_REPLY_MASK = c0zsw5;
        C0ZSW[] c0zswArr = {c0zsw, c0zsw2, c0zsw3, c0zsw4, c0zsw5};
        LL = c0zswArr;
        LLILLJJLI = new C2254308sP(c0zswArr);
    }

    public static C0ZSW[] values() {
        return (C0ZSW[]) LL.clone();
    }

    public static C0ZSW valueOf(String str) {
        return (C0ZSW) C08FF.LIZ(C0ZSW.class, str);
    }

    public C0ZSW(String str, int i) {
    }
}

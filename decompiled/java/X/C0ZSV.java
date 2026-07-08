package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZSV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSV {
    public static final /* synthetic */ C0ZSV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZSV NONE;
    public static final C0ZSV PHOTO_SWAP_INITIATE_MASK;
    public static final C0ZSV PHOTO_SWAP_REPLY_MASK;

    public static InterfaceC2044707zh<C0ZSV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZSV c0zsv = new C0ZSV("PHOTO_SWAP_INITIATE_MASK", 0);
        PHOTO_SWAP_INITIATE_MASK = c0zsv;
        C0ZSV c0zsv2 = new C0ZSV("PHOTO_SWAP_REPLY_MASK", 1);
        PHOTO_SWAP_REPLY_MASK = c0zsv2;
        C0ZSV c0zsv3 = new C0ZSV("NONE", 2);
        NONE = c0zsv3;
        C0ZSV[] c0zsvArr = {c0zsv, c0zsv2, c0zsv3};
        LL = c0zsvArr;
        LLILLJJLI = new C2254308sP(c0zsvArr);
    }

    public static C0ZSV[] values() {
        return (C0ZSV[]) LL.clone();
    }

    public static C0ZSV valueOf(String str) {
        return (C0ZSV) C08FF.LIZ(C0ZSV.class, str);
    }

    public C0ZSV(String str, int i) {
    }
}

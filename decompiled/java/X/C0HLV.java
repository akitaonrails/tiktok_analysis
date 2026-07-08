package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLV {
    public static final C0HLV GENERATING;
    public static final /* synthetic */ C0HLV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HLV QUEUE;
    public static final C0HLV UPLOADING;

    public static InterfaceC2044707zh<C0HLV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HLV c0hlv = new C0HLV("QUEUE", 0);
        QUEUE = c0hlv;
        C0HLV c0hlv2 = new C0HLV("GENERATING", 1);
        GENERATING = c0hlv2;
        C0HLV c0hlv3 = new C0HLV("UPLOADING", 2);
        UPLOADING = c0hlv3;
        C0HLV[] c0hlvArr = {c0hlv, c0hlv2, c0hlv3};
        LL = c0hlvArr;
        LLILLJJLI = new C2254308sP(c0hlvArr);
    }

    public static C0HLV[] values() {
        return (C0HLV[]) LL.clone();
    }

    public static C0HLV valueOf(String str) {
        return (C0HLV) C08FF.LIZ(C0HLV.class, str);
    }

    public C0HLV(String str, int i) {
    }
}

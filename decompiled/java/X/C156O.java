package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.156O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156O {
    public static final C156O FAIL;
    public static final /* synthetic */ C156O[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C156O PENDING;
    public static final C156O STRIPPING;
    public static final C156O SUCCESS;

    public static InterfaceC2044707zh<C156O> getEntries() {
        return LLILLJJLI;
    }

    static {
        C156O c156o = new C156O("PENDING", 0);
        PENDING = c156o;
        C156O c156o2 = new C156O("STRIPPING", 1);
        STRIPPING = c156o2;
        C156O c156o3 = new C156O("SUCCESS", 2);
        SUCCESS = c156o3;
        C156O c156o4 = new C156O("FAIL", 3);
        FAIL = c156o4;
        C156O[] c156oArr = {c156o, c156o2, c156o3, c156o4};
        LL = c156oArr;
        LLILLJJLI = new C2254308sP(c156oArr);
    }

    public static C156O[] values() {
        return (C156O[]) LL.clone();
    }

    public static C156O valueOf(String str) {
        return (C156O) C08FF.LIZ(C156O.class, str);
    }

    public C156O(String str, int i) {
    }
}

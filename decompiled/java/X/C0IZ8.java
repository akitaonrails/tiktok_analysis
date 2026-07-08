package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZ8 {
    public static final C0IZ8 ECOM;
    public static final C0IZ8 FOLLOW;
    public static final C0IZ8 FORU;
    public static final /* synthetic */ C0IZ8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IZ8 OTHER;

    public static InterfaceC2044707zh<C0IZ8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IZ8 c0iz8 = new C0IZ8("FORU", 0);
        FORU = c0iz8;
        C0IZ8 c0iz82 = new C0IZ8("FOLLOW", 1);
        FOLLOW = c0iz82;
        C0IZ8 c0iz83 = new C0IZ8("ECOM", 2);
        ECOM = c0iz83;
        C0IZ8 c0iz84 = new C0IZ8("OTHER", 3);
        OTHER = c0iz84;
        C0IZ8[] c0iz8Arr = {c0iz8, c0iz82, c0iz83, c0iz84};
        LL = c0iz8Arr;
        LLILLJJLI = new C2254308sP(c0iz8Arr);
    }

    public static C0IZ8[] values() {
        return (C0IZ8[]) LL.clone();
    }

    public static C0IZ8 valueOf(String str) {
        return (C0IZ8) C08FF.LIZ(C0IZ8.class, str);
    }

    public C0IZ8(String str, int i) {
    }
}

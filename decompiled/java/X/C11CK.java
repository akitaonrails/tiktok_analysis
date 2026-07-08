package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11CK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11CK {
    public static final C11CK CANCEL;
    public static final C11CK DOWNLOADING;
    public static final C11CK FAIL;
    public static final /* synthetic */ C11CK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11CK PREPARED;
    public static final C11CK SUCCESS;

    public static InterfaceC2044707zh<C11CK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C11CK c11ck = new C11CK("PREPARED", 0);
        PREPARED = c11ck;
        C11CK c11ck2 = new C11CK("DOWNLOADING", 1);
        DOWNLOADING = c11ck2;
        C11CK c11ck3 = new C11CK("SUCCESS", 2);
        SUCCESS = c11ck3;
        C11CK c11ck4 = new C11CK("CANCEL", 3);
        CANCEL = c11ck4;
        C11CK c11ck5 = new C11CK("FAIL", 4);
        FAIL = c11ck5;
        C11CK[] c11ckArr = {c11ck, c11ck2, c11ck3, c11ck4, c11ck5};
        LL = c11ckArr;
        LLILLJJLI = new C2254308sP(c11ckArr);
    }

    public static C11CK[] values() {
        return (C11CK[]) LL.clone();
    }

    public static C11CK valueOf(String str) {
        return (C11CK) C08FF.LIZ(C11CK.class, str);
    }

    public C11CK(String str, int i) {
    }
}

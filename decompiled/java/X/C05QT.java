package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05QT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QT {
    public static final C05QT ADD_MEMBER;
    public static final C05QT FETCH_MEMBER_INFO;
    public static final C05QT FETCH_USER_INFO;
    public static final /* synthetic */ C05QT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C05QT READ_FROM_CACHE;
    public static final C05QT REMOVE_MEMBER;
    public static final C05QT UPDATE_MEMBER;

    public static InterfaceC2044707zh<C05QT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05QT c05qt = new C05QT("READ_FROM_CACHE", 0);
        READ_FROM_CACHE = c05qt;
        C05QT c05qt2 = new C05QT("ADD_MEMBER", 1);
        ADD_MEMBER = c05qt2;
        C05QT c05qt3 = new C05QT("REMOVE_MEMBER", 2);
        REMOVE_MEMBER = c05qt3;
        C05QT c05qt4 = new C05QT("UPDATE_MEMBER", 3);
        UPDATE_MEMBER = c05qt4;
        C05QT c05qt5 = new C05QT("FETCH_MEMBER_INFO", 4);
        FETCH_MEMBER_INFO = c05qt5;
        C05QT c05qt6 = new C05QT("FETCH_USER_INFO", 5);
        FETCH_USER_INFO = c05qt6;
        C05QT[] c05qtArr = {c05qt, c05qt2, c05qt3, c05qt4, c05qt5, c05qt6};
        LL = c05qtArr;
        LLILLJJLI = new C2254308sP(c05qtArr);
    }

    public static C05QT[] values() {
        return (C05QT[]) LL.clone();
    }

    public static C05QT valueOf(String str) {
        return (C05QT) C08FF.LIZ(C05QT.class, str);
    }

    public C05QT(String str, int i) {
    }
}

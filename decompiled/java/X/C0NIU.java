package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NIU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NIU {
    public static final /* synthetic */ C0NIU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NIU NULL_TO_APPEND;
    public static final C0NIU REMOVE;
    public static final C0NIU REPLACE;
    public final int LL;

    public static InterfaceC2044707zh<C0NIU> getEntries() {
        return LLILLL;
    }

    static {
        C0NIU c0niu = new C0NIU("NULL_TO_APPEND", 0, 0);
        NULL_TO_APPEND = c0niu;
        C0NIU c0niu2 = new C0NIU("REPLACE", 1, 1);
        REPLACE = c0niu2;
        C0NIU c0niu3 = new C0NIU("REMOVE", 2, 2);
        REMOVE = c0niu3;
        C0NIU[] c0niuArr = {c0niu, c0niu2, c0niu3};
        LLILLJJLI = c0niuArr;
        LLILLL = new C2254308sP(c0niuArr);
    }

    public static C0NIU[] values() {
        return (C0NIU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NIU valueOf(String str) {
        return (C0NIU) C08FF.LIZ(C0NIU.class, str);
    }

    public C0NIU(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EKL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKL {
    public static final C0EKL EditPageAdd;
    public static final C0EKL EditorProAddNew;
    public static final C0EKL EditorProEdit;
    public static final /* synthetic */ C0EKL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0EKL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0EKL c0ekl = new C0EKL("EditorProEdit", 0);
        EditorProEdit = c0ekl;
        C0EKL c0ekl2 = new C0EKL("EditPageAdd", 1);
        EditPageAdd = c0ekl2;
        C0EKL c0ekl3 = new C0EKL("EditorProAddNew", 2);
        EditorProAddNew = c0ekl3;
        C0EKL[] c0eklArr = {c0ekl, c0ekl2, c0ekl3};
        LL = c0eklArr;
        LLILLJJLI = new C2254308sP(c0eklArr);
    }

    public static C0EKL[] values() {
        return (C0EKL[]) LL.clone();
    }

    public static C0EKL valueOf(String str) {
        return (C0EKL) C08FF.LIZ(C0EKL.class, str);
    }

    public C0EKL(String str, int i) {
    }
}

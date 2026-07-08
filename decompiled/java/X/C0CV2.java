package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CV2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CV2 {
    public static final /* synthetic */ C0CV2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CV2 REQUEST_FAILURE;
    public static final C0CV2 REQUEST_SUCCESS;

    public static InterfaceC2044707zh<C0CV2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CV2 c0cv2 = new C0CV2("REQUEST_SUCCESS", 0);
        REQUEST_SUCCESS = c0cv2;
        C0CV2 c0cv22 = new C0CV2("REQUEST_FAILURE", 1);
        REQUEST_FAILURE = c0cv22;
        C0CV2[] c0cv2Arr = {c0cv2, c0cv22};
        LL = c0cv2Arr;
        LLILLJJLI = new C2254308sP(c0cv2Arr);
    }

    public static C0CV2[] values() {
        return (C0CV2[]) LL.clone();
    }

    public static C0CV2 valueOf(String str) {
        return (C0CV2) C08FF.LIZ(C0CV2.class, str);
    }

    public C0CV2(String str, int i) {
    }
}

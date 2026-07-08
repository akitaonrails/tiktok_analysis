package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LU2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LU2 {
    public static final C0LU2 DOWNLOAD;
    public static final C0LU2 IMAGE_UPLOAD;
    public static final /* synthetic */ C0LU2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LU2 POST_PROCESSING;
    public static final C0LU2 PROGRESS;
    public static final C0LU2 QUOTA;
    public static final C0LU2 SAVE_DRAFT;
    public static final C0LU2 SERVER;
    public static final C0LU2 STEP_DEFAULT;

    public static InterfaceC2044707zh<C0LU2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LU2 c0lu2 = new C0LU2("STEP_DEFAULT", 0);
        STEP_DEFAULT = c0lu2;
        C0LU2 c0lu22 = new C0LU2("IMAGE_UPLOAD", 1);
        IMAGE_UPLOAD = c0lu22;
        C0LU2 c0lu23 = new C0LU2("SERVER", 2);
        SERVER = c0lu23;
        C0LU2 c0lu24 = new C0LU2("PROGRESS", 3);
        PROGRESS = c0lu24;
        C0LU2 c0lu25 = new C0LU2("DOWNLOAD", 4);
        DOWNLOAD = c0lu25;
        C0LU2 c0lu26 = new C0LU2("POST_PROCESSING", 5);
        POST_PROCESSING = c0lu26;
        C0LU2 c0lu27 = new C0LU2("SAVE_DRAFT", 6);
        SAVE_DRAFT = c0lu27;
        C0LU2 c0lu28 = new C0LU2("QUOTA", 7);
        QUOTA = c0lu28;
        C0LU2[] c0lu2Arr = {c0lu2, c0lu22, c0lu23, c0lu24, c0lu25, c0lu26, c0lu27, c0lu28};
        LL = c0lu2Arr;
        LLILLJJLI = new C2254308sP(c0lu2Arr);
    }

    public static C0LU2[] values() {
        return (C0LU2[]) LL.clone();
    }

    public static C0LU2 valueOf(String str) {
        return (C0LU2) C08FF.LIZ(C0LU2.class, str);
    }

    public C0LU2(String str, int i) {
    }
}

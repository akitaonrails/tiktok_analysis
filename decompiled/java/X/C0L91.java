package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L91, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L91 {
    public static final C0L91 IMAGE;
    public static final C0L91 IMAGE_AND_VIDEO;
    public static final /* synthetic */ C0L91[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L91 VIDEO;

    public static InterfaceC2044707zh<C0L91> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L91 c0l91 = new C0L91("IMAGE_AND_VIDEO", 0);
        IMAGE_AND_VIDEO = c0l91;
        C0L91 c0l912 = new C0L91("IMAGE", 1);
        IMAGE = c0l912;
        C0L91 c0l913 = new C0L91("VIDEO", 2);
        VIDEO = c0l913;
        C0L91[] c0l91Arr = {c0l91, c0l912, c0l913};
        LL = c0l91Arr;
        LLILLJJLI = new C2254308sP(c0l91Arr);
    }

    public static C0L91[] values() {
        return (C0L91[]) LL.clone();
    }

    public static C0L91 valueOf(String str) {
        return (C0L91) C08FF.LIZ(C0L91.class, str);
    }

    public C0L91(String str, int i) {
    }
}

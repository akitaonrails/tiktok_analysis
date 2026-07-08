package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09O8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09O8 {
    public static final C09O8 IMAGE;
    public static final /* synthetic */ C09O8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09O8 VIDEO;

    public static InterfaceC2044707zh<C09O8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09O8 c09o8 = new C09O8("IMAGE", 0);
        IMAGE = c09o8;
        C09O8 c09o82 = new C09O8("VIDEO", 1);
        VIDEO = c09o82;
        C09O8[] c09o8Arr = {c09o8, c09o82};
        LL = c09o8Arr;
        LLILLJJLI = new C2254308sP(c09o8Arr);
    }

    public static C09O8[] values() {
        return (C09O8[]) LL.clone();
    }

    public static C09O8 valueOf(String str) {
        return (C09O8) C08FF.LIZ(C09O8.class, str);
    }

    public C09O8(String str, int i) {
    }
}

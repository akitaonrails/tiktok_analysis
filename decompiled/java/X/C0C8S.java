package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8S {
    public static final /* synthetic */ C0C8S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0C8S VISUAL_EC_PRODUCT;
    public static final C0C8S VISUAL_HISTORY;
    public static final C0C8S VISUAL_LONG_PRESS_PANEL;
    public static final C0C8S VISUAL_SCREENSHOT;
    public static final C0C8S VISUAL_SMART_SEARCH;
    public static final C0C8S VISUAL_TAG;
    public static final C0C8S VISUAL_TAKE_PHOTO;

    public static InterfaceC2044707zh<C0C8S> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0C8S c0c8s = new C0C8S("VISUAL_TAG", 0);
        VISUAL_TAG = c0c8s;
        C0C8S c0c8s2 = new C0C8S("VISUAL_TAKE_PHOTO", 1);
        VISUAL_TAKE_PHOTO = c0c8s2;
        C0C8S c0c8s3 = new C0C8S("VISUAL_HISTORY", 2);
        VISUAL_HISTORY = c0c8s3;
        C0C8S c0c8s4 = new C0C8S("VISUAL_SMART_SEARCH", 3);
        VISUAL_SMART_SEARCH = c0c8s4;
        C0C8S c0c8s5 = new C0C8S("VISUAL_SCREENSHOT", 4);
        VISUAL_SCREENSHOT = c0c8s5;
        C0C8S c0c8s6 = new C0C8S("VISUAL_LONG_PRESS_PANEL", 5);
        VISUAL_LONG_PRESS_PANEL = c0c8s6;
        C0C8S c0c8s7 = new C0C8S("VISUAL_EC_PRODUCT", 6);
        VISUAL_EC_PRODUCT = c0c8s7;
        C0C8S[] c0c8sArr = {c0c8s, c0c8s2, c0c8s3, c0c8s4, c0c8s5, c0c8s6, c0c8s7};
        LL = c0c8sArr;
        LLILLJJLI = new C2254308sP(c0c8sArr);
    }

    public static C0C8S[] values() {
        return (C0C8S[]) LL.clone();
    }

    public static C0C8S valueOf(String str) {
        return (C0C8S) C08FF.LIZ(C0C8S.class, str);
    }

    public C0C8S(String str, int i) {
    }
}

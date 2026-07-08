package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SK1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SK1 {
    public static final C0SK1 CAPTION_STATE_NOT_DISPLAYED;
    public static final C0SK1 CONTAINER_VIEW_NOT_VISIBLE;
    public static final C0SK1 CONTENT_IS_EMPTY;
    public static final /* synthetic */ C0SK1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SK1 ROOT_VIEW_NOT_VISIBLE;
    public static final C0SK1 SUCCESS;
    public static final C0SK1 TEXT_LAYOUT_NOT_SET;
    public static final C0SK1 TEXT_VIEW_NOT_VISIBLE;
    public static final C0SK1 VIEW_NOT_INFLATED;

    public static InterfaceC2044707zh<C0SK1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SK1 c0sk1 = new C0SK1("VIEW_NOT_INFLATED", 0);
        VIEW_NOT_INFLATED = c0sk1;
        C0SK1 c0sk12 = new C0SK1("TEXT_VIEW_NOT_VISIBLE", 1);
        TEXT_VIEW_NOT_VISIBLE = c0sk12;
        C0SK1 c0sk13 = new C0SK1("ROOT_VIEW_NOT_VISIBLE", 2);
        ROOT_VIEW_NOT_VISIBLE = c0sk13;
        C0SK1 c0sk14 = new C0SK1("CONTAINER_VIEW_NOT_VISIBLE", 3);
        CONTAINER_VIEW_NOT_VISIBLE = c0sk14;
        C0SK1 c0sk15 = new C0SK1("CAPTION_STATE_NOT_DISPLAYED", 4);
        CAPTION_STATE_NOT_DISPLAYED = c0sk15;
        C0SK1 c0sk16 = new C0SK1("TEXT_LAYOUT_NOT_SET", 5);
        TEXT_LAYOUT_NOT_SET = c0sk16;
        C0SK1 c0sk17 = new C0SK1("SUCCESS", 6);
        SUCCESS = c0sk17;
        C0SK1 c0sk18 = new C0SK1("CONTENT_IS_EMPTY", 7);
        CONTENT_IS_EMPTY = c0sk18;
        C0SK1[] c0sk1Arr = {c0sk1, c0sk12, c0sk13, c0sk14, c0sk15, c0sk16, c0sk17, c0sk18};
        LL = c0sk1Arr;
        LLILLJJLI = new C2254308sP(c0sk1Arr);
    }

    public static C0SK1[] values() {
        return (C0SK1[]) LL.clone();
    }

    public static C0SK1 valueOf(String str) {
        return (C0SK1) C08FF.LIZ(C0SK1.class, str);
    }

    public C0SK1(String str, int i) {
    }
}

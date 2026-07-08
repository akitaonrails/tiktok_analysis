package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14S3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14S3 {
    public static final /* synthetic */ C14S3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C14S3 SPACE_CHAPTER;
    public static final C14S3 SPACE_HEADING2;
    public static final C14S3 SPACE_HEADING3;
    public static final C14S3 SPACE_LIST_ITEM;
    public static final C14S3 SPACE_NATURAL_SEGMENT;
    public static final C14S3 V2_SPACE_HEADING_1;
    public static final C14S3 V2_SPACE_HEADING_2;
    public static final C14S3 V2_SPACE_HEADING_BETWEEN;
    public static final C14S3 V2_SPACE_HEADING_EXTRA_TOP;
    public static final C14S3 V2_SPACE_ITEM_BETWEEN;
    public static final C14S3 V2_SPACE_NATURAL_SEGMENT;

    public static InterfaceC2044707zh<C14S3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C14S3 c14s3 = new C14S3("SPACE_NATURAL_SEGMENT", 0);
        SPACE_NATURAL_SEGMENT = c14s3;
        C14S3 c14s32 = new C14S3("SPACE_LIST_ITEM", 1);
        SPACE_LIST_ITEM = c14s32;
        C14S3 c14s33 = new C14S3("SPACE_CHAPTER", 2);
        SPACE_CHAPTER = c14s33;
        C14S3 c14s34 = new C14S3("SPACE_HEADING3", 3);
        SPACE_HEADING3 = c14s34;
        C14S3 c14s35 = new C14S3("SPACE_HEADING2", 4);
        SPACE_HEADING2 = c14s35;
        C14S3 c14s36 = new C14S3("V2_SPACE_HEADING_1", 5);
        V2_SPACE_HEADING_1 = c14s36;
        C14S3 c14s37 = new C14S3("V2_SPACE_HEADING_2", 6);
        V2_SPACE_HEADING_2 = c14s37;
        C14S3 c14s38 = new C14S3("V2_SPACE_NATURAL_SEGMENT", 7);
        V2_SPACE_NATURAL_SEGMENT = c14s38;
        C14S3 c14s39 = new C14S3("V2_SPACE_HEADING_BETWEEN", 8);
        V2_SPACE_HEADING_BETWEEN = c14s39;
        C14S3 c14s310 = new C14S3("V2_SPACE_ITEM_BETWEEN", 9);
        V2_SPACE_ITEM_BETWEEN = c14s310;
        C14S3 c14s311 = new C14S3("V2_SPACE_HEADING_EXTRA_TOP", 10);
        V2_SPACE_HEADING_EXTRA_TOP = c14s311;
        C14S3[] c14s3Arr = {c14s3, c14s32, c14s33, c14s34, c14s35, c14s36, c14s37, c14s38, c14s39, c14s310, c14s311};
        LL = c14s3Arr;
        LLILLJJLI = new C2254308sP(c14s3Arr);
    }

    public static C14S3[] values() {
        return (C14S3[]) LL.clone();
    }

    public static C14S3 valueOf(String str) {
        return (C14S3) C08FF.LIZ(C14S3.class, str);
    }

    public C14S3(String str, int i) {
    }
}

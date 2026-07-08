package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC325870Cq1 {
    public static final EnumC325870Cq1 DOWNLOAD_ASYNC;
    public static final /* synthetic */ EnumC325870Cq1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC325870Cq1 LOAD_BITMAP_ASYNC;

    public static InterfaceC2044707zh<EnumC325870Cq1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC325870Cq1 enumC325870Cq1 = new EnumC325870Cq1("DOWNLOAD_ASYNC", 0);
        DOWNLOAD_ASYNC = enumC325870Cq1;
        EnumC325870Cq1 enumC325870Cq12 = new EnumC325870Cq1("LOAD_BITMAP_ASYNC", 1);
        LOAD_BITMAP_ASYNC = enumC325870Cq12;
        EnumC325870Cq1[] enumC325870Cq1Arr = {enumC325870Cq1, enumC325870Cq12};
        LL = enumC325870Cq1Arr;
        LLILLJJLI = new C2254308sP(enumC325870Cq1Arr);
    }

    public static EnumC325870Cq1[] values() {
        return (EnumC325870Cq1[]) LL.clone();
    }

    public static EnumC325870Cq1 valueOf(String str) {
        return (EnumC325870Cq1) C08FF.LIZ(EnumC325870Cq1.class, str);
    }

    public EnumC325870Cq1(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5D {
    public static final C0N5D CREATE_LOCAL_VIDEO_UGC_STICKER;
    public static final C0N5D CREATE_PRIVATE_IMAGE_UGC_STICKER;
    public static final C0N5D CREATE_UGC_STICKER;
    public static final /* synthetic */ C0N5D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0N5D> getEntries() {
        return LLILLL;
    }

    static {
        C0N5D c0n5d = new C0N5D("CREATE_UGC_STICKER", 0, "create_ugc_sticker");
        CREATE_UGC_STICKER = c0n5d;
        C0N5D c0n5d2 = new C0N5D("CREATE_PRIVATE_IMAGE_UGC_STICKER", 1, "create_private_image_ugc_sticker");
        CREATE_PRIVATE_IMAGE_UGC_STICKER = c0n5d2;
        C0N5D c0n5d3 = new C0N5D("CREATE_LOCAL_VIDEO_UGC_STICKER", 2, "create_local_video_ugc_sticker");
        CREATE_LOCAL_VIDEO_UGC_STICKER = c0n5d3;
        C0N5D[] c0n5dArr = {c0n5d, c0n5d2, c0n5d3};
        LLILLJJLI = c0n5dArr;
        LLILLL = new C2254308sP(c0n5dArr);
    }

    public static C0N5D[] values() {
        return (C0N5D[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static C0N5D valueOf(String str) {
        return (C0N5D) C08FF.LIZ(C0N5D.class, str);
    }

    public C0N5D(String str, int i, String str2) {
        this.LL = str2;
    }
}

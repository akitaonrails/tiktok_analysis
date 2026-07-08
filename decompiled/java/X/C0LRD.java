package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LRD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LRD {
    public static final C0LRD ASPECT_CROP;
    public static final C0LRD COMPRESS;
    public static final C0LRD FORMAT_CONVERT;
    public static final /* synthetic */ C0LRD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LRD SCALE_DOWN;
    public static final C0LRD SCALE_UP;
    public static final C0LRD STRIP_LIVE_PHOTO;

    public static InterfaceC2044707zh<C0LRD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LRD c0lrd = new C0LRD("FORMAT_CONVERT", 0);
        FORMAT_CONVERT = c0lrd;
        C0LRD c0lrd2 = new C0LRD("ASPECT_CROP", 1);
        ASPECT_CROP = c0lrd2;
        C0LRD c0lrd3 = new C0LRD("SCALE_DOWN", 2);
        SCALE_DOWN = c0lrd3;
        C0LRD c0lrd4 = new C0LRD("SCALE_UP", 3);
        SCALE_UP = c0lrd4;
        C0LRD c0lrd5 = new C0LRD("COMPRESS", 4);
        COMPRESS = c0lrd5;
        C0LRD c0lrd6 = new C0LRD("STRIP_LIVE_PHOTO", 5);
        STRIP_LIVE_PHOTO = c0lrd6;
        C0LRD[] c0lrdArr = {c0lrd, c0lrd2, c0lrd3, c0lrd4, c0lrd5, c0lrd6};
        LL = c0lrdArr;
        LLILLJJLI = new C2254308sP(c0lrdArr);
    }

    public static C0LRD[] values() {
        return (C0LRD[]) LL.clone();
    }

    public static C0LRD valueOf(String str) {
        return (C0LRD) C08FF.LIZ(C0LRD.class, str);
    }

    public C0LRD(String str, int i) {
    }
}

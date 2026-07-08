package X;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LJE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJE {
    public static final List<C0LJE> ALL_SUPPORTED_TYPE;
    public static final C0LJG Companion;
    public static final C0LJE IMAGE_AND_VIDEO;
    public static final C0LJE IMAGE_ONLY;
    public static final /* synthetic */ C0LJE[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C0LJE VIDEO_ONLY;
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<C0LJE> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0LJG] */
    static {
        C0LJE c0lje = new C0LJE("IMAGE_AND_VIDEO", 0, 0, "all", "all");
        IMAGE_AND_VIDEO = c0lje;
        C0LJE c0lje2 = new C0LJE("IMAGE_ONLY", 1, 1, "photos", "photo");
        IMAGE_ONLY = c0lje2;
        C0LJE c0lje3 = new C0LJE("VIDEO_ONLY", 2, 2, "videos", "video");
        VIDEO_ONLY = c0lje3;
        C0LJE[] c0ljeArr = {c0lje, c0lje2, c0lje3};
        LLILZ = c0ljeArr;
        LLILZIL = new C2254308sP(c0ljeArr);
        Companion = new Object() { // from class: X.0LJG
        };
        ALL_SUPPORTED_TYPE = C1697810uHb.LJIIJJI(c0lje, c0lje2, c0lje3);
    }

    public static C0LJE[] values() {
        return (C0LJE[]) LLILZ.clone();
    }

    public final String getConfigName() {
        return this.LLILLJJLI;
    }

    public final String getMobName() {
        return this.LLILLL;
    }

    public final int getPriority() {
        return this.LL;
    }

    public static C0LJE valueOf(String str) {
        return (C0LJE) C08FF.LIZ(C0LJE.class, str);
    }

    public C0LJE(String str, int i, int i2, String str2, String str3) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}

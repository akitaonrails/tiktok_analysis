package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U5K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5K {
    public static final C0U5K DEFAULT;
    public static final C0U5K DOWNLOADING;
    public static final C0U5K DOWNLOAD_FAIL;
    public static final C0U5K DOWNLOAD_START;
    public static final C0U5K DOWNLOAD_SUCCESS;
    public static final /* synthetic */ C0U5K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0U5K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0U5K c0u5k = new C0U5K(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c0u5k;
        C0U5K c0u5k2 = new C0U5K("DOWNLOAD_START", 1);
        DOWNLOAD_START = c0u5k2;
        C0U5K c0u5k3 = new C0U5K("DOWNLOADING", 2);
        DOWNLOADING = c0u5k3;
        C0U5K c0u5k4 = new C0U5K("DOWNLOAD_SUCCESS", 3);
        DOWNLOAD_SUCCESS = c0u5k4;
        C0U5K c0u5k5 = new C0U5K("DOWNLOAD_FAIL", 4);
        DOWNLOAD_FAIL = c0u5k5;
        C0U5K[] c0u5kArr = {c0u5k, c0u5k2, c0u5k3, c0u5k4, c0u5k5};
        LL = c0u5kArr;
        LLILLJJLI = new C2254308sP(c0u5kArr);
    }

    public static C0U5K[] values() {
        return (C0U5K[]) LL.clone();
    }

    public static C0U5K valueOf(String str) {
        return (C0U5K) C08FF.LIZ(C0U5K.class, str);
    }

    public C0U5K(String str, int i) {
    }
}

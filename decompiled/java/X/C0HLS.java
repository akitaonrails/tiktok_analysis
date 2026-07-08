package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLS {
    public static final C0HLS DEFAULT;
    public static final C0HLS FACE_DETECTION;
    public static final C0HLS INTERNAL;
    public static final C0HLS INTERNET;
    public static final /* synthetic */ C0HLS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HLS TNS_CHECK;

    public static InterfaceC2044707zh<C0HLS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HLS c0hls = new C0HLS("TNS_CHECK", 0);
        TNS_CHECK = c0hls;
        C0HLS c0hls2 = new C0HLS("FACE_DETECTION", 1);
        FACE_DETECTION = c0hls2;
        C0HLS c0hls3 = new C0HLS("INTERNAL", 2);
        INTERNAL = c0hls3;
        C0HLS c0hls4 = new C0HLS("INTERNET", 3);
        INTERNET = c0hls4;
        C0HLS c0hls5 = new C0HLS(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = c0hls5;
        C0HLS[] c0hlsArr = {c0hls, c0hls2, c0hls3, c0hls4, c0hls5};
        LL = c0hlsArr;
        LLILLJJLI = new C2254308sP(c0hlsArr);
    }

    public static C0HLS[] values() {
        return (C0HLS[]) LL.clone();
    }

    public static C0HLS valueOf(String str) {
        return (C0HLS) C08FF.LIZ(C0HLS.class, str);
    }

    public C0HLS(String str, int i) {
    }
}

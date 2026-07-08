package X;

import com.ss.android.ugc.aweme.config.VisualSearchOcrConfig;

/* JADX INFO: renamed from: X.0QBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666340QBs {
    public static final C666340QBs LIZ = new C666340QBs();
    public static final VisualSearchOcrConfig LIZIZ = new VisualSearchOcrConfig(0, 0.0d, 0.3d, 0.3d, "search_smart_ocr_android", false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C666330QBr());

    public static VisualSearchOcrConfig LIZ() {
        return (VisualSearchOcrConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().enabled == 1;
    }
}

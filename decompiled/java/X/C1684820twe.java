package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AiSelfCameraConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AiSelfCameraDetectRange;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.CenterRange;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.DetectRange;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0twe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684820twe {
    public static final AiSelfCameraConfig LIZ = new AiSelfCameraConfig(new AiSelfCameraDetectRange(new DetectRange(-8.0f, 8.0f), new DetectRange(-6.0f, 6.0f), new DetectRange(-10.0f, 10.0f)), new AiSelfCameraDetectRange(new DetectRange(-8.0f, 8.0f), new DetectRange(-6.0f, 6.0f), new DetectRange(10.0f, 20.0f)), new AiSelfCameraDetectRange(new DetectRange(-8.0f, 8.0f), new DetectRange(-6.0f, 6.0f), new DetectRange(-20.0f, -10.0f)), new CenterRange(new DetectRange(0.35f, 0.65f), new DetectRange(0.3f, 0.7f)), new DetectRange(0.35f, 0.55f), true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(10));

    public static final AiSelfCameraConfig LIZ() {
        return (AiSelfCameraConfig) LIZIZ.getValue();
    }
}

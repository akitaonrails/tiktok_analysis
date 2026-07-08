package X;

import com.bytedance.android.livesdk.livesetting.message.EnablePreviewGameMomentSetting;
import com.bytedance.android.livesdk.livesetting.message.LivePreviewGameMomentSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0g62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152480g62 {
    public static final C1152480g62 LIZ = new C1152480g62();

    public static final boolean LIZ() {
        return LivePreviewGameMomentSetting.INSTANCE.enableShowGameName();
    }

    public static final boolean LIZIZ() {
        return EnablePreviewGameMomentSetting.INSTANCE.getValue();
    }

    public static final List<Integer> LIZJ() {
        return LivePreviewGameMomentSetting.INSTANCE.supportGameMomentType();
    }
}

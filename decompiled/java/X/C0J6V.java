package X;

import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;
import com.ss.android.ugc.aweme.IHomeTabService;

/* JADX INFO: renamed from: X.0J6V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J6V {
    public static void LIZ(boolean z) {
        LiveIconGenerator.LLJJJ = z;
        IHomeTabService value = LiveIconGenerator.LLJJIJIL.getValue();
        if (value != null) {
            value.LIZIZ(z);
        }
    }
}

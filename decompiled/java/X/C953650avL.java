package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.NoticeboardConfigSetting;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0avL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953650avL {
    public C443120HZe<String, Bitmap, Integer> LIZ;
    public Bitmap LIZIZ;
    public volatile boolean LIZJ;

    public final synchronized void LIZ(Bitmap bitmap, String str) {
        String first;
        C443120HZe<String, Bitmap, Integer> c443120HZe = this.LIZ;
        Bitmap second = null;
        if (c443120HZe != null) {
            first = c443120HZe.getFirst();
        } else {
            first = null;
        }
        C443120HZe<String, Bitmap, Integer> c443120HZe2 = this.LIZ;
        if (c443120HZe2 != null) {
            second = c443120HZe2.getSecond();
        }
        if (!Intrinsics.LJFF(first, str)) {
            if (NoticeboardConfigSetting.INSTANCE.getSettingValue().recycleOpt && second != null) {
                second.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(second);
            }
            this.LIZ = new C443120HZe<>(str, bitmap, Integer.valueOf(C953620avI.LJ(bitmap)));
        }
    }
}

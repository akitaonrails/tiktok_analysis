package X;

import com.bytedance.android.livesdkapi.avoidance.setting.LiveConflictControlAdaptionBlockListSetting;

/* JADX INFO: renamed from: X.0Zxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916790Zxt {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        if (i > 0 && LiveConflictControlAdaptionBlockListSetting.INSTANCE.contains(i)) {
            return false;
        }
        return true;
    }
}

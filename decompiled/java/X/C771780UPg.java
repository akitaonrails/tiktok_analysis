package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.0UPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771780UPg {
    public static final /* synthetic */ C771780UPg LIZ = new C771780UPg();

    public static LiveMode LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return LiveMode.LIVE_VOICE;
                    }
                    return LiveMode.VIDEO;
                }
                return LiveMode.LIVE_STUDIO;
            }
            return LiveMode.SCREEN_RECORD;
        }
        return LiveMode.THIRD_PARTY;
    }
}

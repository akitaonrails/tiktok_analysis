package X;

import com.ss.android.ugc.aweme.tools.music.ab.AIMusicFrameCountConfig;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275008vk {
    public static final AIMusicFrameCountConfig LIZ = new AIMusicFrameCountConfig(false, 5, 5);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1399));

    public static int LIZ() {
        C01GW c01gw = LIZIZ;
        if (((AIMusicFrameCountConfig) c01gw.getValue()).enable) {
            return ((AIMusicFrameCountConfig) c01gw.getValue()).videoExtractCount;
        }
        return 5;
    }
}

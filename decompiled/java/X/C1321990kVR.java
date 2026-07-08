package X;

import com.lynx.textra.PlatformFontCaps;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0kVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1321990kVR {
    public static short LIZ(PlatformFontCaps platformFontCaps, int i) {
        if (i >= 1000) {
            i = LSPassThroughRecordSizeConfig.DEFAULT;
        } else if (i <= 100) {
            i = 100;
        }
        return (short) i;
    }
}

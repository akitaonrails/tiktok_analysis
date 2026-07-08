package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.io.IOException;

/* JADX INFO: renamed from: X.0kis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330320kis {
    public static int LIZ(Throwable th, boolean z) {
        if (th == null) {
            return OppoPermissionPopupMaskDelayExp.DEFAULT;
        }
        String message = th.getMessage();
        if (z) {
            return 100;
        }
        if (th instanceof IOException) {
            return 201;
        }
        if (th instanceof InterruptedException) {
            return 501;
        }
        if (th instanceof C1330310kir) {
            return 601;
        }
        if (th instanceof IllegalArgumentException) {
            if (message.contains("ByteBuffer must be direct")) {
                return 301;
            }
            if (message.contains("Failed to create demuxer")) {
                return 302;
            }
            if (message.contains("Width or height is negative")) {
                return 303;
            }
            if (!message.contains("Problem decoding into existing bitmap")) {
                return OppoPermissionPopupMaskDelayExp.DEFAULT;
            }
            return 304;
        }
        if (th instanceof IllegalStateException) {
            if (message.contains("Invalid dimensions")) {
                return 305;
            }
            if (message.contains("Failed to slurp image")) {
                return 306;
            }
            if (message.contains("No fames in image")) {
                return 307;
            }
            if (message.contains("Already disposed")) {
                return 308;
            }
            if (message.contains("unable to get frame")) {
                return 309;
            }
            if (message.contains("Bad bitmap")) {
                return 310;
            }
            if (message.contains("Width or height is too small")) {
                return 311;
            }
            if (message.contains("Wrong color format")) {
                return 312;
            }
            if (message.contains("WebPInitDecoderConfig failed")) {
                return 313;
            }
            if (message.contains("WebPGetFeatures failed")) {
                return 314;
            }
            if (message.contains("Failed to decode frame. VP8StatusCode:")) {
                return 315;
            }
            if (!message.contains("WebpBitmapFactory is null")) {
                return OppoPermissionPopupMaskDelayExp.DEFAULT;
            }
            return 316;
        }
        if (!(th instanceof RuntimeException)) {
            return OppoPermissionPopupMaskDelayExp.DEFAULT;
        }
        if (message.contains("Could not create WebPDemux from image. This webp might be malformed")) {
            return 317;
        }
        if (message.contains("unrecognized pixel format")) {
            return 318;
        }
        if (message.contains("Wrong pixel format for jpeg encoding")) {
            return 401;
        }
        if (message.contains("Could not write scanline")) {
            return 402;
        }
        if (!message.contains("could not allocate memory")) {
            return OppoPermissionPopupMaskDelayExp.DEFAULT;
        }
        return 602;
    }
}

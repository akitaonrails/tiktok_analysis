package X;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS98S0201000_12;

/* JADX INFO: renamed from: X.0TPX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPX {
    public static Intent LIZJ(MediaProjectionManager mediaProjectionManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(102100, "screenRecord_createScreenCaptureIntent", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent()Landroid/content/Intent;", null);
        return (Intent) C838080WuE.LIZ(c825940WaeLIZ, new AwS591S0100000_12(mediaProjectionManager, 1113));
    }

    public static C825940Wae LIZ(int i, String str, Cert cert) {
        return new C825940Wae(cert, str, new String[]{"screenRecord"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static Intent LIZIZ(MediaProjectionManager mediaProjectionManager, MediaProjectionConfig mediaProjectionConfig, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(102100, "screenRecord_createScreenCaptureIntent", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent()Landroid/content/Intent;", null);
        return (Intent) C838080WuE.LIZ(c825940WaeLIZ, new C0TP8(mediaProjectionManager, mediaProjectionConfig));
    }

    public static MediaProjection LIZLLL(MediaProjectionManager mediaProjectionManager, int i, Intent intent, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(102101, "screenRecord_getMediaProjection", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/projection/MediaProjectionManager", "getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;", C2097608Jq.LJIIIIZZ(new Pair("resultCode", Integer.valueOf(i)), new Pair("resultData", intent)));
        return (MediaProjection) C838080WuE.LIZ(c825940WaeLIZ, new AwS98S0201000_12(mediaProjectionManager, i, intent, 3));
    }
}

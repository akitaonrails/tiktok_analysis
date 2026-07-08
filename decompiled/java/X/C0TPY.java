package X;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.view.Surface;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TPY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPY {
    public static VirtualDisplay LIZ(MediaProjection mediaProjection, String str, int i, int i2, int i3, Surface surface, C0THM c0thm, Cert cert) {
        C825940Wae c825940WaeLIZ = C0TPX.LIZ(0, "screenRecord_createVirtualDisplay", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/projection/MediaProjection", "createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;", C2097608Jq.LJIIIIZZ(new Pair("name", str), new Pair("width", Integer.valueOf(i)), new Pair("height", Integer.valueOf(i2)), new Pair("dpi", Integer.valueOf(i3)), new Pair("flags", 3), new Pair("surface", surface), new Pair("callback", c0thm), new Pair("handler", null)));
        return (VirtualDisplay) C838080WuE.LIZ(c825940WaeLIZ, new C0TP7(mediaProjection, str, i, i2, i3, surface, c0thm));
    }
}

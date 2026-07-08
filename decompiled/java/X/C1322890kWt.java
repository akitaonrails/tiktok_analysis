package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.Window;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0kWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322890kWt {
    public static C825940Wae LIZ(Cert cert) {
        return new C825940Wae(cert, "PixelCopy_request", new String[]{"screenShot"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 0);
    }

    public static void LIZIZ(Surface surface, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/PixelCopy", "request(Landroid/view/Surface;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", C2097608Jq.LJIIIIZZ(new Pair("source", surface), new Pair("dest", bitmap), new Pair("listener", onPixelCopyFinishedListener), new Pair("listenerThread", handler)));
        C838080WuE.LIZ(c825940WaeLIZ, new C1322910kWv(surface, bitmap, onPixelCopyFinishedListener, handler));
    }

    public static void LIZJ(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/PixelCopy", "request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", C2097608Jq.LJIIIIZZ(new Pair("source", surfaceView), new Pair("dest", bitmap), new Pair("listener", onPixelCopyFinishedListener), new Pair("listenerThread", handler)));
        C838080WuE.LIZ(c825940WaeLIZ, new C1322900kWu(surfaceView, bitmap, onPixelCopyFinishedListener, handler));
    }

    public static void LIZLLL(Window window, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/PixelCopy", "request(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", C2097608Jq.LJIIIIZZ(new Pair("source", window), new Pair("dest", bitmap), new Pair("listener", onPixelCopyFinishedListener), new Pair("listenerThread", handler)));
        C838080WuE.LIZ(c825940WaeLIZ, new C1322880kWs(window, bitmap, onPixelCopyFinishedListener, handler));
    }

    public static void LJ(Window window, Rect rect, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, BPEAHandler bPEAHandler, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/view/PixelCopy", "request(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", C2097608Jq.LJIIIIZZ(new Pair("source", window), new Pair("srcRect", rect), new Pair("dest", bitmap), new Pair("listener", onPixelCopyFinishedListener), new Pair("listenerThread", bPEAHandler)));
        C838080WuE.LIZ(c825940WaeLIZ, new C1322870kWr(window, rect, bitmap, onPixelCopyFinishedListener, bPEAHandler));
    }
}

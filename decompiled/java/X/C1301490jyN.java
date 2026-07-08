package X;

import android.graphics.Bitmap;
import com.lynx.canvas.loader.CanvasResourceLoader;
import com.lynx.canvas.loader.CanvasResourceResolver;

/* JADX INFO: renamed from: X.0jyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301490jyN implements InterfaceC1301370jyB {
    public final /* synthetic */ CanvasResourceResolver LIZ;
    public final /* synthetic */ CanvasResourceLoader LIZIZ;

    @Override // X.InterfaceC1301370jyB
    public final void LIZ(Bitmap bitmap) {
        this.LIZ.LIZIZ(bitmap);
    }

    @Override // X.InterfaceC1301370jyB
    public final void reject(String str) {
        CanvasResourceLoader canvasResourceLoader = this.LIZIZ;
        CanvasResourceResolver canvasResourceResolver = this.LIZ;
        canvasResourceLoader.getClass();
        CanvasResourceLoader.LIZIZ(str, canvasResourceResolver, false);
    }

    public C1301490jyN(CanvasResourceLoader canvasResourceLoader, CanvasResourceResolver canvasResourceResolver) {
        this.LIZIZ = canvasResourceLoader;
        this.LIZ = canvasResourceResolver;
    }
}

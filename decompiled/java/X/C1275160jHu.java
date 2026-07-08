package X;

import android.os.Handler;
import android.view.View;
import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.ILyraxVideoRendererFactory;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;

/* JADX INFO: renamed from: X.0jHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275160jHu implements ILyraxVideoRendererFactory {
    public final /* synthetic */ InterfaceC1274510jGr LIZ;
    public final /* synthetic */ C1274810jHL LIZIZ;

    @Override // com.ss.lyrax.video.ILyraxVideoRendererFactory
    public final ILyraxVideoRenderer createVideoRenderer(String str) {
        LyraxVideoRendererWrapper lyraxVideoRendererWrapper = new LyraxVideoRendererWrapper(new C1275200jHy(this.LIZIZ.LJIILJJIL.LIZIZ, true));
        C1274570jGx c1274570jGx = new C1274570jGx(new InterfaceC1274510jGr() { // from class: X.0jIa
            @Override // X.InterfaceC1274510jGr
            public final InterfaceC1274490jGp LJI(View view, Handler handler, boolean z) {
                return this.LL.LIZ.LJIIJ(view, handler, z);
            }

            @Override // X.InterfaceC1274510jGr
            public final InterfaceC1274490jGp LJIIJ(View view, Handler handler, boolean z) {
                return LJI(view, handler, z);
            }
        }, GLThreadManager.getMainGlHandle(), GLThreadManager.getMainGlHandle(), false, false, 0, 0, true);
        c1274570jGx.LJIIL();
        lyraxVideoRendererWrapper.LJIIIZ(c1274570jGx, null);
        return lyraxVideoRendererWrapper;
    }

    public C1275160jHu(C1274810jHL c1274810jHL, AbstractC1273900jFs abstractC1273900jFs) {
        this.LIZIZ = c1274810jHL;
        this.LIZ = abstractC1273900jFs;
    }
}

package X;

import Y.ARunnableS75S0200000_6;
import Y.ARunnableS89S0200000_20;
import android.net.Uri;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331580kku implements InterfaceC442640HXi<Boolean> {
    public final /* synthetic */ C1331510kkn LIZ;
    public final /* synthetic */ Uri LIZIZ;
    public final /* synthetic */ FrescoImageLoaderImpl LIZJ;

    @Override // X.InterfaceC442640HXi
    public final void onResult(Boolean bool) {
        final InterfaceC605070NoH interfaceC605070NoH = this.LIZ.LJJIJIL;
        if (bool.booleanValue()) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LIZ(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", "cachedFile hit!!!");
            if (interfaceC605070NoH != null) {
                this.LIZJ.mCache.LJIIIIZZ(this.LIZIZ, new InterfaceC442640HXi<File>() { // from class: X.0kky
                    @Override // X.InterfaceC442640HXi
                    public final void onResult(File file) {
                        File file2 = file;
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCompleted image path=");
                        sbLIZ.append(file2);
                        C1330590kjJ.LIZ(this.LIZIZ.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", C2188811AlT.LIZIZ(sbLIZ));
                        C1331580kku c1331580kku = this.LIZIZ;
                        c1331580kku.LIZJ.getCallbackExecutor(c1331580kku.LIZ).execute(new ARunnableS75S0200000_6(interfaceC605070NoH, file2, 70));
                    }
                });
                return;
            }
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C1330590kjJ.LJIIIIZZ(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", "cachedFile miss");
        AbstractC1321260kUG abstractC1321260kUGLJIJ = C1328130kfL.LJIILIIL().LJIIL().LJIJ(FrescoImageLoaderImpl.buildImageRequest(this.LIZ, this.LIZIZ), this.LIZ.LJJIIJ);
        C1331510kkn c1331510kkn = this.LIZ;
        C1331880klO c1331880klO = new C1331880klO(abstractC1321260kUGLJIJ);
        if (c1331510kkn != null) {
            C1331710kl7.LIZ.execute(new ARunnableS89S0200000_20(c1331880klO, c1331510kkn, 231));
        } else {
            ExecutorService executorService = C1331710kl7.LIZ;
        }
        abstractC1321260kUGLJIJ.LIZJ(new C1331600kkw(this, interfaceC605070NoH), this.LIZJ.getCallbackExecutor(this.LIZ));
    }

    public C1331580kku(FrescoImageLoaderImpl frescoImageLoaderImpl, C1331510kkn c1331510kkn, Uri uri) {
        this.LIZJ = frescoImageLoaderImpl;
        this.LIZ = c1331510kkn;
        this.LIZIZ = uri;
    }
}

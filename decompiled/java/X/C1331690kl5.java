package X;

import Y.ARunnableS89S0200000_20;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import java.io.File;

/* JADX INFO: renamed from: X.0kl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1331690kl5 implements InterfaceC1331960klW {
    public final InterfaceC605070NoH LIZ;
    public final C1331510kkn LIZIZ;
    public final /* synthetic */ FrescoImageLoaderImpl LIZJ;

    @Override // X.InterfaceC1331960klW
    public final void LIZ(File file) {
        C1331510kkn c1331510kkn;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWriteCacheSuccess: ");
        sbLIZ.append(file);
        C1330590kjJ.LJIIIIZZ(this.LIZIZ.hashCode(), "FrescoImageLoaderImpl", "OnWriterCacheListenerWrap", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ != null && (c1331510kkn = this.LIZIZ) != null) {
            this.LIZJ.getCallbackExecutor(c1331510kkn).execute(new ARunnableS89S0200000_20(this, file, 24));
        }
    }

    public C1331690kl5(FrescoImageLoaderImpl frescoImageLoaderImpl, C1331510kkn c1331510kkn, InterfaceC605070NoH interfaceC605070NoH) {
        this.LIZJ = frescoImageLoaderImpl;
        this.LIZ = interfaceC605070NoH;
        this.LIZIZ = c1331510kkn;
    }
}

package X;

import com.lynx.canvas.loader.CanvasResourceLoader;
import com.lynx.canvas.loader.CanvasResourceResolver;

/* JADX INFO: renamed from: X.0jyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301460jyK implements InterfaceC1301360jyA {
    public final /* synthetic */ CanvasResourceResolver LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ CanvasResourceLoader LIZJ;

    @Override // X.InterfaceC1301360jyA
    public final void reject(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resolver reject with current status: ");
        sbLIZ.append(this.LIZ.LIZ.toString());
        C1288370jdD.LIZJ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        CanvasResourceLoader canvasResourceLoader = this.LIZJ;
        CanvasResourceResolver canvasResourceResolver = this.LIZ;
        boolean z = this.LIZIZ;
        canvasResourceLoader.getClass();
        CanvasResourceLoader.LIZIZ(str, canvasResourceResolver, z);
    }

    @Override // X.InterfaceC1301360jyA
    public final void LIZ(byte[] bArr, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resolver resolve with current status: ");
        sbLIZ.append(this.LIZ.LIZ.toString());
        C1288370jdD.LIZJ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ) {
            this.LIZ.LJFF(i);
            this.LIZ.LIZLLL(bArr, i);
            this.LIZ.LJ(null, true);
            return;
        }
        this.LIZ.LIZJ(bArr, i);
    }

    public C1301460jyK(CanvasResourceLoader canvasResourceLoader, CanvasResourceResolver canvasResourceResolver, boolean z) {
        this.LIZJ = canvasResourceLoader;
        this.LIZ = canvasResourceResolver;
        this.LIZIZ = z;
    }
}

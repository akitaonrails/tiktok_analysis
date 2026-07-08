package X;

/* JADX INFO: renamed from: X.0jbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1287550jbt implements InterfaceC1287600jby {
    public final int[] LIZ;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1287530jbr LIZIZ;

    public AbstractC1287550jbt(TextureViewSurfaceTextureListenerC1287530jbr textureViewSurfaceTextureListenerC1287530jbr, int[] iArr) {
        this.LIZIZ = textureViewSurfaceTextureListenerC1287530jbr;
        if (textureViewSurfaceTextureListenerC1287530jbr.LLJI == 2) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.LIZ = iArr;
    }
}

package X;

import android.graphics.Matrix;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.TimeUtils;

/* JADX INFO: renamed from: X.0jCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271780jCS extends C1275940jJA<k> implements InterfaceC1272840jEA {
    public final C1271750jCP LLIZ;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
    }

    public C1271780jCS(int i, InterfaceC1275950jJB interfaceC1275950jJB) {
        super(i, interfaceC1275950jJB, new InterfaceC1275740jIq<k>() { // from class: X.0jCU
            @Override // X.InterfaceC1275740jIq
            public final k LIZ(final C1275940jJA<k> c1275940jJA) {
                final k kVar = new k();
                kVar.setOnBufferReleaseListener(new InterfaceC1271760jCQ() { // from class: X.0jCV
                    @Override // X.InterfaceC1271760jCQ
                    public final void LIZ(VideoFrame.Buffer buffer) {
                        c1275940jJA.LIZJ(kVar);
                    }
                });
                return kVar;
            }
        });
        this.LLIZ = new C1271750jCP(this);
    }

    public final k LJ(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable) {
        return LJFF(i, i2, enumC1273550jFJ, i3, matrix, interfaceC1268620j7M, runnable, null);
    }

    public final k LJFF(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        return LIZLLL(i, i2, enumC1273550jFJ, i3, matrix, null, interfaceC1268620j7M, runnable, iExtraData, TimeUtils.currentTimeMs());
    }

    public final k LIZLLL(int i, int i2, EnumC1273550jFJ enumC1273550jFJ, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, InterfaceC1268620j7M interfaceC1268620j7M, Runnable runnable, VideoFrame.IExtraData iExtraData, long j) {
        k kVarLIZ = LIZ();
        if (kVarLIZ != null) {
            kVarLIZ.textureBufferCreator = this.LLIZ;
            kVarLIZ.reuseTextureBuffer(i, i2, enumC1273550jFJ, i3, matrix, surfaceTextureHelper, interfaceC1268620j7M, runnable, iExtraData, j);
            return kVarLIZ;
        }
        return null;
    }
}

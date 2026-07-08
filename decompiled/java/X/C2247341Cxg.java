package X;

import android.content.Context;
import android.opengl.GLES20;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247341Cxg {
    public final Context LIZ;
    public FloatBuffer LJ;
    public FloatBuffer LJFF;
    public FloatBuffer LJI;
    public final List<MaskSrc> LJIILLIIL;
    public final float[] LIZIZ = new float[8];
    public final float[] LIZJ = new float[8];
    public final float[] LIZLLL = new float[8];
    public final C2247381Cxk LJII = new C2247381Cxk();
    public int LJIIIIZZ = 0;
    public int LJIIIZ = 0;
    public int LJIIJ = 0;
    public int LJIIJJI = 0;
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public final Map<String, MaskSrc> LJIILJJIL = new HashMap();
    public final Map<String, Integer> LJIILL = new HashMap();

    public final void LIZ() {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.LIZIZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.LIZIZ);
        this.LJ = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.LIZJ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(this.LIZJ);
        this.LJFF = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.position(0);
        FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(this.LIZLLL.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer3.put(this.LIZLLL);
        this.LJI = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.position(0);
        int iLIZIZ = C1287350jbZ.LIZIZ(C1287350jbZ.LIZJ(this.LIZ.getResources(), "mask/mask_vertex.sh"), C1287350jbZ.LIZJ(this.LIZ.getResources(), "mask/mask_frag.sh"));
        this.LJIIIIZZ = iLIZIZ;
        if (iLIZIZ != 0) {
            this.LJIIIZ = GLES20.glGetAttribLocation(iLIZIZ, "aPosition");
            C1287350jbZ.LIZ();
            if (this.LJIIIZ == -1) {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
            this.LJIIJ = GLES20.glGetAttribLocation(this.LJIIIIZZ, "aTextureCoord");
            C1287350jbZ.LIZ();
            if (this.LJIIJ == -1) {
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            this.LJIIJJI = GLES20.glGetAttribLocation(this.LJIIIIZZ, "aMaskTextureCoord");
            C1287350jbZ.LIZ();
            if (this.LJIIJJI == -1) {
                throw new RuntimeException("Could not get attrib location for aMaskTextureCoord");
            }
            this.LJIIL = GLES20.glGetUniformLocation(this.LJIIIIZZ, "sTexture");
            C1287350jbZ.LIZ();
            if (this.LJIIL == -1) {
                throw new RuntimeException("Could not get attrib location for sTexture");
            }
            this.LJIILIIL = GLES20.glGetUniformLocation(this.LJIIIIZZ, "sMaskTexture");
            C1287350jbZ.LIZ();
            if (this.LJIILIIL == -1) {
                throw new RuntimeException("Could not get attrib location for sMaskTexture");
            }
        }
        List<MaskSrc> list = this.LJIILLIIL;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        ((HashMap) this.LJIILL).clear();
        ((HashMap) this.LJIILJJIL).clear();
        for (int i = 0; i < ((ArrayList) this.LJIILLIIL).size(); i++) {
            MaskSrc maskSrc = (MaskSrc) ListProtector.get(this.LJIILLIIL, i);
            ((HashMap) this.LJIILJJIL).put(maskSrc.getName(), maskSrc);
            ((HashMap) this.LJIILL).put(maskSrc.getName(), Integer.valueOf(C1271240jBa.LIZ(maskSrc.getBitmap())));
        }
    }

    public C2247341Cxg(Context context, List<MaskSrc> list) {
        this.LIZ = context;
        this.LJIILLIIL = new ArrayList(list);
    }
}

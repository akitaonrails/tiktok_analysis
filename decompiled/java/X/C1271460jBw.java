package X;

import android.graphics.Bitmap;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1271460jBw {
    public SafeHandlerThread LIZ;
    public int LIZJ;
    public Bitmap LIZLLL;
    public ByteBuffer LJ;
    public ByteBuffer LJFF;
    public final /* synthetic */ C1271450jBv LJIIIZ;
    public String LIZIZ = "";
    public final Object LJI = new Object();
    public int LJII = 0;
    public int LJIIIIZZ = 0;

    public C1271460jBw(C1271450jBv c1271450jBv) {
        this.LJIIIZ = c1271450jBv;
    }

    public final void LIZ(int i, int i2) {
        Bitmap bitmap = this.LIZLLL;
        if (bitmap == null || bitmap.getWidth() != i || this.LIZLLL.getHeight() != i2) {
            this.LIZLLL = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer byteBuffer = this.LJ;
        if (byteBuffer == null || byteBuffer.capacity() != i * i2 * 4) {
            this.LJII = i;
            this.LJIIIIZZ = i2;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
            this.LJ = byteBufferAllocateDirect;
            this.LJFF = ByteBuffer.allocateDirect(byteBufferAllocateDirect.capacity());
        }
        ByteBuffer byteBuffer2 = this.LJ;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }
}

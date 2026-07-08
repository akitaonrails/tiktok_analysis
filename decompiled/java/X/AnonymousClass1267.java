package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1267, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1267 {
    public List<NinePatchDiv> LIZ = new ArrayList();
    public List<NinePatchDiv> LIZIZ = new ArrayList();
    public Rect LIZJ = new Rect();
    public int[] LIZLLL = new int[0];

    public final byte[] LIZ() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((this.LIZ.size() * 2 * 4) + 32 + (this.LIZIZ.size() * 2 * 4) + (this.LIZLLL.length * 4)).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) (this.LIZ.size() * 2));
        byteBufferOrder.put((byte) (this.LIZIZ.size() * 2));
        byteBufferOrder.put((byte) this.LIZLLL.length);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(this.LIZJ.left);
        byteBufferOrder.putInt(this.LIZJ.right);
        byteBufferOrder.putInt(this.LIZJ.top);
        byteBufferOrder.putInt(this.LIZJ.bottom);
        byteBufferOrder.putInt(0);
        for (NinePatchDiv ninePatchDiv : this.LIZ) {
            byteBufferOrder.putInt(ninePatchDiv.getStart());
            byteBufferOrder.putInt(ninePatchDiv.getEnd());
        }
        for (NinePatchDiv ninePatchDiv2 : this.LIZIZ) {
            byteBufferOrder.putInt(ninePatchDiv2.getStart());
            byteBufferOrder.putInt(ninePatchDiv2.getEnd());
        }
        for (int i : this.LIZLLL) {
            byteBufferOrder.putInt(i);
        }
        return byteBufferOrder.array();
    }
}

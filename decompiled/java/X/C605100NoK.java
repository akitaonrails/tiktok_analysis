package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.0NoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605100NoK {
    public static final C605100NoK LIZ = new C605100NoK();
    public static final LruCache<String, Bitmap> LIZIZ = new LruCache<>(12);

    public static Rect LIZ(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (byteBufferOrder.get() == 0) {
            return null;
        }
        byteBufferOrder.get();
        byteBufferOrder.get();
        byteBufferOrder.get();
        byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        Rect rect = new Rect();
        rect.left = byteBufferOrder.getInt();
        rect.right = byteBufferOrder.getInt();
        rect.top = byteBufferOrder.getInt();
        rect.bottom = byteBufferOrder.getInt();
        return rect;
    }

    public static boolean LIZJ(C21568919b5 c21568919b5, String str) {
        boolean z = false;
        if (str.length() > 0) {
            Context context = c21568919b5.getContext();
            try {
                LruCache<String, Bitmap> lruCache = LIZIZ;
                Bitmap bitmapDecodeFile = lruCache.get(str);
                if (bitmapDecodeFile == null) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (!c0vsj.exists() || (bitmapDecodeFile = BitmapFactory.decodeFile(c0vsj.getPath())) == null || bitmapDecodeFile.getNinePatchChunk() == null) {
                        return false;
                    }
                    lruCache.put(str, bitmapDecodeFile);
                }
                byte[] ninePatchChunk = bitmapDecodeFile.getNinePatchChunk();
                if (ninePatchChunk == null) {
                    return false;
                }
                NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(context.getResources(), bitmapDecodeFile, ninePatchChunk, LIZ(ninePatchChunk), null);
                ninePatchDrawable.setAutoMirrored(true);
                c21568919b5.setBackground(ninePatchDrawable);
                z = true;
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7 A[Catch: all -> 0x0110, PHI: r14
      0x00f7: PHI (r14v7 X.0NoH) = (r14v10 X.0NoH), (r14v0 X.0NoH) binds: [B:52:0x00f5, B:30:0x0084] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0110, blocks: (B:53:0x00f7, B:51:0x00f2), top: B:67:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.view.View r18, java.lang.String r19, X.InterfaceC605070NoH r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605100NoK.LIZIZ(android.view.View, java.lang.String, X.0NoH, X.05Vn):java.lang.Object");
    }
}

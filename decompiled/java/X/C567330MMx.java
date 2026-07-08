package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0MMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567330MMx extends C1D7S<C0MN0, Bitmap> {
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    @Override // X.C1D7S
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0MN0 r12, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r13) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567330MMx.LIZIZ(X.0MN0, X.05Vn):java.lang.Object");
    }

    public static Object LIZJ(int i, int i2, String str, C567340MMy c567340MMy) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c567340MMy));
        VEUtils.getVideoFrames(str, new int[]{0}, i, i2, false, new InterfaceC1286300jZs() { // from class: X.08tw
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                if (byteBuffer != null) {
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                }
                C2243608qg.LIZ(bitmapCreateBitmap, c23260099m);
                return true;
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c567340MMy);
        }
        return objLIZ;
    }
}

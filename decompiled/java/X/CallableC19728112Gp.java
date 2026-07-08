package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.12Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class CallableC19728112Gp<V> implements Callable {
    public final /* synthetic */ float LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    public CallableC19728112Gp(int i, int i2, float f, String str) {
        this.LL = f;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("ImageCompressUtil@7985.compressImage$1");
        float f = this.LL;
        double dSqrt = f > 1.0f ? Math.sqrt(f) : 1.0d;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compressImage: scale ");
        sbLIZ.append(dSqrt);
        C2188811AlT.LIZIZ(sbLIZ);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.LLILLJJLI, options);
        C20182113xz c20182113xz = C20182113xz.LIZ;
        String str = this.LLILLJJLI;
        int i = (int) (((double) this.LLILLL) / dSqrt);
        int i2 = (int) (((double) this.LLILZ) / dSqrt);
        c20182113xz.getClass();
        Bitmap bitmapLJII = C20182113xz.LJII(str, options, i, i2);
        C2208361Bbu c2208361BbuLJIIJJI = bitmapLJII != null ? C20182113xz.LJIIJJI(bitmapLJII) : null;
        C1C7U.LIZIZ("ImageCompressUtil@7985.compressImage$1");
        return c2208361BbuLJIIJJI;
    }
}

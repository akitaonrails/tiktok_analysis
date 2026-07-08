package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0kfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1328490kfv implements InterfaceC1328910kgb {
    public static final Class<?> LIZLLL = AbstractC1328490kfv.class;
    public static final byte[] LJ = {-1, -39};
    public final InterfaceC1330420kj2 LIZ;
    public final PreverificationHelper LIZIZ;
    public final C1085640eME<ByteBuffer> LIZJ;

    public abstract int LIZJ(int i, int i2, BitmapFactory.Options options);

    public static BitmapFactory.Options LIZLLL(C1328480kfu c1328480kfu, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c1328480kfu.LLIZLLLIL;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1328480kfu.LJII(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException(C1328520kfy.LIZJ(c1328480kfu));
    }

    public AbstractC1328490kfv(InterfaceC1330420kj2 interfaceC1330420kj2, int i, C1085640eME c1085640eME) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.LIZIZ = preverificationHelper;
        this.LIZ = interfaceC1330420kj2;
        this.LIZJ = c1085640eME;
        for (int i2 = 0; i2 < i; i2++) {
            this.LIZJ.LIZ(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1323050kX9<android.graphics.Bitmap> LIZIZ(java.io.InputStream r16, android.graphics.BitmapFactory.Options r17, android.graphics.Rect r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1328490kfv.LIZIZ(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):X.0kX9");
    }

    @Override // X.InterfaceC1328910kgb
    public final C1323050kX9<Bitmap> decodeFromEncodedImageWithColorSpace(C1328480kfu c1328480kfu, Bitmap.Config config, Rect rect, boolean z) {
        boolean z2;
        BitmapFactory.Options optionsLIZLLL = LIZLLL(c1328480kfu, config);
        if (optionsLIZLLL.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return LIZIZ(c1328480kfu.LJII(), optionsLIZLLL, rect, z);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(c1328480kfu, Bitmap.Config.ARGB_8888, rect, z);
            }
            throw e;
        }
    }

    public Bitmap LIZ(InputStream inputStream, BitmapFactory.Options options, int i, int i2, Bitmap bitmap) {
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // X.InterfaceC1328910kgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1323050kX9<android.graphics.Bitmap> decodeJPEGFromEncodedImageWithColorSpace(X.C1328480kfu r6, android.graphics.Bitmap.Config r7, android.graphics.Rect r8, final int r9, boolean r10) {
        /*
            r5 = this;
            X.0kiM r1 = r6.LLILLL
            X.0kiM r3 = X.C1328580kg4.LIZ
            r4 = 0
            if (r1 == r3) goto L39
            X.0kiM r0 = X.C1328580kg4.LJIIIZ
            if (r1 == r0) goto L39
            X.0kiM r0 = X.C1328580kg4.LJIILIIL
            if (r1 == r0) goto L39
        Lf:
            r1 = 1
        L10:
            android.graphics.BitmapFactory$Options r3 = LIZLLL(r6, r7)
            java.io.InputStream r2 = r6.LJII()
            r2.getClass()
            int r0 = r6.LJIILL()
            if (r0 <= r9) goto L27
            X.0WAf r0 = new X.0WAf
            r0.<init>(r2, r9)
            r2 = r0
        L27:
            if (r1 != 0) goto L31
            X.0WAg r1 = new X.0WAg
            byte[] r0 = X.AbstractC1328490kfv.LJ
            r1.<init>(r2, r0)
            r2 = r1
        L31:
            android.graphics.Bitmap$Config r1 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 == r0) goto L6e
            r4 = 1
            goto L6e
        L39:
            X.0kSL<java.io.FileInputStream> r0 = r6.LLILLJJLI
            if (r0 != 0) goto Lf
            X.0kX9<X.0kdc> r0 = r6.LL
            r0.getClass()
            java.lang.Object r2 = r0.get()
            X.0kdc r2 = (X.InterfaceC1327060kdc) r2
            X.0kiM r1 = r6.LLILLL
            if (r1 != r3) goto L60
            int r0 = r9 + (-2)
            byte r1 = r2.read(r0)
            r0 = -1
            if (r1 != r0) goto L6c
            int r0 = r9 + (-1)
            byte r1 = r2.read(r0)
            r0 = -39
            if (r1 != r0) goto L6c
            goto Lf
        L60:
            X.0kiM r0 = X.C1328580kg4.LJIIIZ
            if (r1 != r0) goto Lf
            int r1 = r6.LLJILJIL
            if (r1 == 0) goto Lf
            r0 = 3
            if (r1 != r0) goto L6c
            goto Lf
        L6c:
            r1 = 0
            goto L10
        L6e:
            X.0kX9 r0 = r5.LIZIZ(r2, r3, r8, r10)     // Catch: java.lang.RuntimeException -> L73
            return r0
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r4 == 0) goto L80
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            X.0kX9 r0 = r5.decodeJPEGFromEncodedImageWithColorSpace(r6, r7, r8, r9, r10)
            return r0
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1328490kfv.decodeJPEGFromEncodedImageWithColorSpace(X.0kfu, android.graphics.Bitmap$Config, android.graphics.Rect, int, boolean):X.0kX9");
    }
}

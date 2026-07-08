package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.VEUtilsCombinedStrategy$extractFromImage$2", f = "VEUtilsCombinedStrategy.kt", l = {}, m = "invokeSuspend")
public final class C20175513wv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C20176213x2 LLILLJJLI;
    public final /* synthetic */ C1457070o1J LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20175513wv(String str, C20176213x2 c20176213x2, C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super C20175513wv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c20176213x2;
        this.LLILLL = c1457070o1J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20175513wv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BitmapFactory.Options options;
        int i;
        FileInputStream fileInputStreamLJJI;
        C1C7U.LIZ("VEUtilsCombinedStrategy@6950.extractFromImage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZJ = null;
        try {
            options = new BitmapFactory.Options();
            i = 1;
            options.inJustDecodeBounds = true;
            fileInputStreamLJJI = C2471909mP.LJJI(0, this.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            BitmapFactory.decodeStream(fileInputStreamLJJI, null, options);
            C2107108Nh.LIZ(fileInputStreamLJJI, null);
            options.inJustDecodeBounds = false;
            C20176213x2 c20176213x2 = this.LLILLJJLI;
            C1457070o1J c1457070o1J = this.LLILLL;
            int i2 = c1457070o1J.LJFF;
            int i3 = c1457070o1J.LJI;
            c20176213x2.getClass();
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            if (i2 > 0 && i3 > 0) {
                while (true) {
                    if (i4 / i <= i2 && i5 / i <= i3) {
                        break;
                    }
                    i *= 2;
                }
            }
            options.inSampleSize = i;
            fileInputStreamLJJI = C2471909mP.LJJI(0, this.LL);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStreamLJJI, null, options);
                C2107108Nh.LIZ(fileInputStreamLJJI, null);
                if (bitmapDecodeStream != null) {
                    bitmapLIZJ = C20176213x2.LIZJ(bitmapDecodeStream, this.LLILLL);
                }
                C1C7U.LIZIZ("VEUtilsCombinedStrategy@6950.extractFromImage$2");
                return bitmapLIZJ;
            } finally {
                th = th;
                try {
                } catch (Throwable th) {
                    while (true) {
                    }
                }
            }
        } finally {
            th = th;
            try {
                TryCatchGuardChecker.doCheck(th);
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(fileInputStreamLJJI, th);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th = null;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

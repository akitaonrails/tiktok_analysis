package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12Go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.util.ImageCompressUtil$compressImageAsync$1", f = "ImageCompressUtil.kt", l = {}, m = "invokeSuspend")
public final class C19728012Go extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC19728212Gq LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19728012Go(float f, String str, int i, int i2, InterfaceC19728212Gq interfaceC19728212Gq, InterfaceC1364105Vn<? super C19728012Go> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = f;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = interfaceC19728212Gq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19728012Go c19728012Go = new C19728012Go(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c19728012Go.LL = obj;
        return c19728012Go;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        double dSqrt;
        Bitmap bitmapLJII;
        C2208361Bbu c2208361BbuLJIIJJI;
        C1C7U.LIZ("ImageCompressUtil@7985.compressImageAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Bitmap bitmap = null;
        try {
            try {
                float f = this.LLILLJJLI;
                if (f > 1.0f) {
                    dSqrt = Math.sqrt(f);
                } else {
                    dSqrt = 1.0d;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("compressImageAsync: scale ");
                sbLIZ.append(dSqrt);
                C2188811AlT.LIZIZ(sbLIZ);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.LLILLL, options);
                C2296808zG.LJFF(interfaceC497601wk);
                C20182113xz c20182113xz = C20182113xz.LIZ;
                String str = this.LLILLL;
                int i = (int) (((double) this.LLILZ) / dSqrt);
                int i2 = (int) (((double) this.LLILZIL) / dSqrt);
                c20182113xz.getClass();
                bitmapLJII = C20182113xz.LJII(str, options, i, i2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (CancellationException e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
        }
        try {
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            if (bitmapLJII != null) {
                c2208361BbuLJIIJJI = C20182113xz.LJIIJJI(bitmapLJII);
            } else {
                c2208361BbuLJIIJJI = null;
            }
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            if (c2208361BbuLJIIJJI != null) {
                this.LLILZLL.LIZ(c2208361BbuLJIIJJI);
            } else {
                this.LLILZLL.LIZJ();
            }
        } catch (CancellationException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e4) {
            e = e4;
            bitmap = bitmapLJII;
            TryCatchGuardChecker.doCheck(e);
            this.LLILZLL.LIZJ();
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = bitmapLJII;
            TryCatchGuardChecker.doCheck(th);
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            throw th;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageCompressUtil@7985.compressImageAsync$1");
        return unit;
    }
}

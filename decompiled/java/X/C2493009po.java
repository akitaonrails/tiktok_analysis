package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.monitor.whitescreen.config.SearchBlankScreenDetectionConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.monitor.whitescreen.SearchBlankScreenDetectionUtils$tryDetect$1$1", f = "SearchBlankScreenDetectionUtils.kt", l = {}, m = "invokeSuspend")
public final class C2493009po extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C2493109pp LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ SearchBlankScreenDetectionConfig.Config LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2493009po(Bitmap bitmap, C2493109pp c2493109pp, long j, SearchBlankScreenDetectionConfig.Config config, InterfaceC1364105Vn<? super C2493009po> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = c2493109pp;
        this.LLILZ = j;
        this.LLILZIL = config;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2493009po c2493009po = new C2493009po(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2493009po.LL = obj;
        return c2493009po;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        long jCurrentTimeMillis;
        int i2;
        C1C7U.LIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LLILLJJLI;
        C2493109pp c2493109pp = this.LLILLL;
        long j = this.LLILZ;
        SearchBlankScreenDetectionConfig.Config config = this.LLILZIL;
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C2493209pq c2493209pq = C2493209pq.LIZ;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            c2493209pq.getClass();
            i = 0;
            for (int[] iArr : (ArrayList) C2493209pq.LIZIZ(width, height, c2493109pp)) {
                int i3 = iArr[0];
                int i4 = iArr[1];
                C2493209pq.LIZ.getClass();
                double[] dArrLIZ = C2493209pq.LIZ(i3, i4, bitmap);
                if (c2493109pp.LIZ(dArrLIZ[0], dArrLIZ[1], dArrLIZ[2]) && (i = i + 1) >= c2493109pp.LIZLLL) {
                    break;
                }
            }
            jCurrentTimeMillis = (System.currentTimeMillis() - jCurrentTimeMillis2) + j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i < c2493109pp.LIZLLL) {
            C2493209pq.LIZ.getClass();
            C2493209pq.LIZJ(0, jCurrentTimeMillis, 0L, i / r4.size(), 0.0f);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1$1");
            return unit;
        }
        SearchBlankScreenDetectionConfig.SearchBlankDetailStrategy searchBlankDetailStrategy = config.searchBlankDetailStrategy;
        if (searchBlankDetailStrategy != null && Intrinsics.LJFF(searchBlankDetailStrategy.enable, true)) {
            Double d = config.searchBlankDetailStrategy.ratio;
            if (d != null && d.doubleValue() > 0.0d) {
                double dDoubleValue = d.doubleValue();
                Double d2 = config.searchBlankDetailStrategy.threshold;
                if (d2 != null && d2.doubleValue() > 0.0d) {
                    double dDoubleValue2 = d2.doubleValue();
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    int width2 = (int) (((double) bitmap.getWidth()) * dDoubleValue);
                    int height2 = (int) (((double) bitmap.getHeight()) * dDoubleValue);
                    char c = 1;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width2, height2, true);
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                    int width3 = (int) (((double) (bitmapCreateScaledBitmap.getWidth() * bitmapCreateScaledBitmap.getHeight())) * dDoubleValue2);
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    int width4 = bitmapCreateScaledBitmap.getWidth();
                    int i5 = 0;
                    int i6 = 0;
                    loop1: while (i6 < width4) {
                        int height3 = bitmapCreateScaledBitmap.getHeight();
                        int i7 = 0;
                        while (i7 < height3) {
                            C2493209pq.LIZ.getClass();
                            double[] dArrLIZ2 = C2493209pq.LIZ(i6, i7, bitmapCreateScaledBitmap);
                            if (c2493109pp.LIZ(dArrLIZ2[0], dArrLIZ2[c], dArrLIZ2[2]) && (i5 = i5 + 1) >= width3) {
                                break loop1;
                            }
                            i7++;
                            c = 1;
                        }
                        i6++;
                        c = 1;
                    }
                    long jCurrentTimeMillis6 = (System.currentTimeMillis() - jCurrentTimeMillis5) + jCurrentTimeMillis4;
                    C2493209pq c2493209pq2 = C2493209pq.LIZ;
                    if (i5 >= width3) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    c2493209pq2.getClass();
                    C2493209pq.LIZJ(i2, jCurrentTimeMillis, jCurrentTimeMillis6, i / c2493109pp.LIZLLL, i5 / (bitmapCreateScaledBitmap.getWidth() * bitmapCreateScaledBitmap.getHeight()));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1$1");
                    return unit2;
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1$1");
                return unit3;
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1$1");
            return unit4;
        }
        C2493209pq.LIZ.getClass();
        C2493209pq.LIZJ(1, jCurrentTimeMillis, 0L, i / r4.size(), 0.0f);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

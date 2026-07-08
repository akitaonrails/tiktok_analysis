package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performanceopt.experiment.feed.BitmapMemoryCacheOptData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335250kqp extends C09AY implements Function0<BitmapMemoryCacheOptData> {
    public C1335250kqp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final BitmapMemoryCacheOptData invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            BitmapMemoryCacheOptData bitmapMemoryCacheOptData = C1335240kqo.LIZ;
            BitmapMemoryCacheOptData bitmapMemoryCacheOptData2 = (BitmapMemoryCacheOptData) c0c64LJIILLIIL.LJJIIJ(true, "tt_bitmap_memory_cache_opt", 31744, BitmapMemoryCacheOptData.class, bitmapMemoryCacheOptData, 2);
            return bitmapMemoryCacheOptData2 != null ? bitmapMemoryCacheOptData2 : bitmapMemoryCacheOptData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1335240kqo.LIZ;
        }
    }
}

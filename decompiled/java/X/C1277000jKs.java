package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277000jKs extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ AbstractC1273900jFs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277000jKs(AbstractC1273900jFs abstractC1273900jFs) {
        super(1);
        this.LL = abstractC1273900jFs;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        try {
            this.LL.LJJIJLIJ(bitmap2);
            if (!bitmap2.isRecycled()) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }
}

package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09n9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476509n9 extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ Function1<Bitmap, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2476509n9(C1277000jKs c1277000jKs) {
        super(1);
        this.LL = c1277000jKs;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
        this.LL.invoke(bitmapCreateBitmap);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
        }
        return Unit.LIZ;
    }
}

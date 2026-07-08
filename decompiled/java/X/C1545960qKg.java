package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545960qKg implements InterfaceC1554280qY6 {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        int realWidth = this.LIZ.getRealWidth(this.LIZIZ.getContext());
        ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
        if (realWidth > 0) {
            int iLJ = C1338790kwX.LJ(null);
            if (realWidth > iLJ) {
                realWidth = iLJ;
            }
        } else if (realWidth == 0) {
            realWidth = Intrinsics.LJFF(this.LIZ.getRealGravity(this.LIZIZ.getContext()), "center") ? C416070GTd.LIZ(300.0d, this.LIZIZ.getContext()) : -1;
        }
        layoutParams.width = realWidth;
    }

    public C1545960qKg(View view, SparkPopupSchemaParam sparkPopupSchemaParam) {
        this.LIZ = sparkPopupSchemaParam;
        this.LIZIZ = view;
    }
}

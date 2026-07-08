package X;

import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;

/* JADX INFO: renamed from: X.0qXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1554180qXw implements InterfaceC1554280qY6 {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        if (this.LIZ.getShowMask()) {
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
        } else {
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
            C786410Ut5.T4(this.LIZIZ, 0.0f);
        }
    }

    public C1554180qXw(View view, SparkPopupSchemaParam sparkPopupSchemaParam) {
        this.LIZ = sparkPopupSchemaParam;
        this.LIZIZ = view;
    }
}

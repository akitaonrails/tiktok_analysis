package X;

import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.1Bqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217691Bqx implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final ViewGroup LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam == null || !sparkPageSchemaParam.getHideNavBar()) {
            C786410Ut5.LJLZ(0, this.LIZIZ);
        } else {
            C786410Ut5.LJLZ(8, this.LIZIZ);
        }
    }

    public C2217691Bqx(SparkPageSchemaParam sparkPageSchemaParam, ViewGroup viewGroup) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = viewGroup;
    }
}

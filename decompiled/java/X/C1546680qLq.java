package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546680qLq implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        boolean hideStatusBar;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam == null || !(hideStatusBar = sparkPageSchemaParam.getHideStatusBar())) {
            return;
        }
        this.LIZIZ.g5(hideStatusBar);
    }

    public C1546680qLq(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
    }
}

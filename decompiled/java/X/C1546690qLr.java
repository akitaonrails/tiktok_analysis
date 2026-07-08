package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546690qLr implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        this.LIZIZ.Ip(sparkPageSchemaParam != null ? sparkPageSchemaParam.getNeedBottomOut() : false);
    }

    public C1546690qLr(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
    }
}

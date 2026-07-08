package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0zMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893160zMg implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1892990zMP LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        String title;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam == null || (title = sparkPageSchemaParam.getTitle()) == null) {
            title = "";
        }
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LIZ;
        if (!(sparkPageSchemaParam2 != null && sparkPageSchemaParam2.getOptTitle())) {
            InterfaceC1892990zMP interfaceC1892990zMP = this.LIZIZ;
            if (interfaceC1892990zMP != null) {
                interfaceC1892990zMP.setTitle(title);
            }
            C1530030puz.LIZIZ("time_consuming_optimization", "setTitle", null);
            return;
        }
        if (title.length() > 0) {
            InterfaceC1892990zMP interfaceC1892990zMP2 = this.LIZIZ;
            if (interfaceC1892990zMP2 != null) {
                interfaceC1892990zMP2.setTitle(title);
            }
            C1530030puz.LIZIZ("time_consuming_optimization", "setTitle", null);
        }
    }

    public C1893160zMg(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1892990zMP interfaceC1892990zMP) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1892990zMP;
    }
}

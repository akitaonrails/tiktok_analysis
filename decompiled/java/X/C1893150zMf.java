package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0zMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893150zMf implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1892990zMP LIZIZ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    @Override // X.InterfaceC1554280qY6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke() {
        /*
            r5 = this;
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r5.LIZ
            r3 = 0
            if (r0 == 0) goto L12
            java.lang.String r1 = r0.getNavBtnType()
            if (r1 == 0) goto L12
            int r0 = r1.hashCode()
            switch(r0) {
                case -934521548: goto L57;
                case 3357525: goto L4c;
                case 109400031: goto L41;
                case 949444906: goto L36;
                default: goto L12;
            }
        L12:
            X.0dtI r4 = X.EnumC1067700dtI.TYPE_NONE
        L14:
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r5.LIZ
            if (r0 == 0) goto L34
            boolean r1 = r0.getOptTitle()
            r0 = 1
            if (r1 != r0) goto L34
        L1f:
            java.lang.String r2 = "setNavBtnType"
            java.lang.String r1 = "time_consuming_optimization"
            if (r0 == 0) goto L62
            X.0dtI r0 = X.EnumC1067700dtI.TYPE_NONE
            if (r4 == r0) goto L33
            X.0zMP r0 = r5.LIZIZ
            if (r0 == 0) goto L30
            r0.LJJIFFI(r4)
        L30:
            X.C1530030puz.LIZIZ(r1, r2, r3)
        L33:
            return
        L34:
            r0 = 0
            goto L1f
        L36:
            java.lang.String r0 = "collect"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            X.0dtI r4 = X.EnumC1067700dtI.TYPE_COLLECT
            goto L14
        L41:
            java.lang.String r0 = "share"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            X.0dtI r4 = X.EnumC1067700dtI.TYPE_SHARE
            goto L14
        L4c:
            java.lang.String r0 = "more"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            X.0dtI r4 = X.EnumC1067700dtI.TYPE_MORE
            goto L14
        L57:
            java.lang.String r0 = "report"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            X.0dtI r4 = X.EnumC1067700dtI.TYPE_REPORT
            goto L14
        L62:
            X.0zMP r0 = r5.LIZIZ
            if (r0 == 0) goto L69
            r0.LJJIFFI(r4)
        L69:
            X.C1530030puz.LIZIZ(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1893150zMf.invoke():void");
    }

    public C1893150zMf(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1892990zMP interfaceC1892990zMP) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1892990zMP;
    }
}

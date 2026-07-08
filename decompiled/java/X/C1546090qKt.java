package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546090qKt implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    @Override // X.InterfaceC1554280qY6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke() {
        /*
            r6 = this;
            X.0qEO r0 = X.C1546010qKl.LIZ
            r5 = 0
            if (r0 == 0) goto L56
            X.0qKw r0 = r0.LJFF()
            if (r0 == 0) goto L56
            X.0qKv r4 = r0.LIZIZ
        Ld:
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r3 = r6.LIZ
            java.lang.String r2 = "light"
            if (r3 == 0) goto L31
            java.lang.String r0 = r3.getStatusFontMode()
            if (r0 != 0) goto L2e
            boolean r0 = X.C1540320qBa.LIZ
            if (r0 == 0) goto L54
            X.0qLn r0 = r6.LIZIZ
            com.bytedance.hybrid.spark.SparkContext r0 = r0.LLIILZL()
            if (r0 == 0) goto L52
            X.0qBc r1 = r0.LJIIZILJ(r5)
        L29:
            X.0qBc r0 = X.EnumC1540340qBc.DARK
            if (r1 != r0) goto L54
            r0 = r2
        L2e:
            r3.setStatusFontMode(r0)
        L31:
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r6.LIZ
            if (r0 == 0) goto L39
            java.lang.String r5 = r0.getStatusFontMode()
        L39:
            java.lang.String r0 = "dark"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L49
            X.0qKv r4 = X.EnumC1546110qKv.DARK
        L43:
            X.0qLn r0 = r6.LIZIZ
            r0.Ux(r4)
            return
        L49:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
            if (r0 == 0) goto L43
            X.0qKv r4 = X.EnumC1546110qKv.Light
            goto L43
        L52:
            r1 = r5
            goto L29
        L54:
            r0 = r5
            goto L2e
        L56:
            r4 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546090qKt.invoke():void");
    }

    public C1546090qKt(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
    }
}

package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0qLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546660qLo implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final WeakReference<InterfaceC1546650qLn> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // X.InterfaceC1554280qY6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke() {
        /*
            r3 = this;
            java.lang.ref.WeakReference<X.0qLn> r0 = r3.LIZIZ
            java.lang.Object r2 = r0.get()
            X.0qLn r2 = (X.InterfaceC1546650qLn) r2
            if (r2 == 0) goto L18
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r3.LIZ
            if (r0 == 0) goto L32
            boolean r1 = r0.getForceBlockBackPress()
            r0 = 1
            if (r1 != r0) goto L32
        L15:
            r2.fh(r0)
        L18:
            java.lang.ref.WeakReference<X.0qLn> r0 = r3.LIZIZ
            java.lang.Object r0 = r0.get()
            X.0qLn r0 = (X.InterfaceC1546650qLn) r0
            if (r0 == 0) goto L31
            com.bytedance.hybrid.spark.SparkContext r2 = r0.LLIILZL()
            if (r2 == 0) goto L31
            X.0qYT r1 = new X.0qYT
            r0 = 1
            r1.<init>(r2, r3, r0)
            r2.LJJJJZI(r1)
        L31:
            return
        L32:
            r0 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546660qLo.invoke():void");
    }

    public C1546660qLo(SparkPageSchemaParam sparkPageSchemaParam, WeakReference<InterfaceC1546650qLn> weakReference) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = weakReference;
    }
}

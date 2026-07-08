package X;

import android.app.Activity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542770qFX implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final Activity LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    @Override // X.InterfaceC1554280qY6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke() {
        /*
            r8 = this;
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r8.LIZ
            r7 = 0
            if (r0 == 0) goto L89
            java.lang.String r4 = r0.getScreenOrientation()
        L9:
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r8.LIZ
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L87
            boolean r0 = r0.getEnableAutoAdaptation()
            if (r0 != r3) goto L87
            r0 = 1
        L16:
            java.lang.String r6 = "auto"
            if (r0 == 0) goto L84
            android.app.Activity r5 = r8.LIZIZ
            if (r5 == 0) goto L82
            android.content.res.Resources r0 = r5.getResources()
            if (r0 == 0) goto L82
            android.content.res.Configuration r1 = r0.getConfiguration()
        L28:
            android.app.Activity r0 = r8.LIZIZ
            if (r0 == 0) goto L30
            android.view.Window r7 = r0.getWindow()
        L30:
            X.0qER r0 = X.C1545950qKf.LJ(r5, r1, r7)
            int r1 = r0.LIZ
            android.app.Activity r0 = r8.LIZIZ
            boolean r0 = X.C1545950qKf.LIZLLL(r0, r1, r3)
            if (r0 == 0) goto L84
            r4 = r6
        L3f:
            int r1 = r4.hashCode()
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r0) goto L72
            r0 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r1 == r0) goto L62
            r0 = 1430647483(0x5545f2bb, float:1.3602894E13)
            if (r1 != r0) goto L61
            java.lang.String r0 = "landscape"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L61
            android.app.Activity r0 = r8.LIZIZ
            if (r0 == 0) goto L61
            r0.setRequestedOrientation(r2)
        L61:
            return
        L62:
            java.lang.String r0 = "portrait"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L61
            android.app.Activity r0 = r8.LIZIZ
            if (r0 == 0) goto L61
            r0.setRequestedOrientation(r3)
            return
        L72:
            boolean r0 = r4.equals(r6)
            if (r0 == 0) goto L61
            android.app.Activity r1 = r8.LIZIZ
            if (r1 == 0) goto L61
            r0 = 13
            r1.setRequestedOrientation(r0)
            return
        L82:
            r1 = r7
            goto L28
        L84:
            if (r4 == 0) goto L61
            goto L3f
        L87:
            r0 = 0
            goto L16
        L89:
            r4 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1542770qFX.invoke():void");
    }

    public C1542770qFX(SparkPageSchemaParam sparkPageSchemaParam, Activity activity) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}

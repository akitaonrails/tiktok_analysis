package X;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS298S0000000_14;

/* JADX INFO: renamed from: X.0Ze5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904510Ze5 {
    public static final AFwS298S0000000_14 LIZJ = AFwS298S0000000_14.get$arr$(8);
    public final Function2<Context, String, Boolean> LIZ;
    public final Function2<Context, String, Boolean> LIZIZ;

    public C904510Ze5() {
        this(null);
    }

    public C904510Ze5(Object obj) {
        AFwS298S0000000_14 aFwS298S0000000_14 = LIZJ;
        C904490Ze3 c904490Ze3 = new C904490Ze3(C904500Ze4.LIZ);
        this.LIZ = aFwS298S0000000_14;
        this.LIZIZ = c904490Ze3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[PHI: r3
      0x005c: PHI (r3v1 boolean) = (r3v0 boolean), (r3v0 boolean), (r3v0 boolean), (r3v0 boolean), (r3v4 boolean) binds: [B:3:0x0007, B:10:0x0024, B:12:0x002a, B:14:0x0036, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r5, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r6) {
        /*
            r4 = this;
            java.util.List<java.lang.String> r0 = r6.data
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L5c
            java.util.List<java.lang.String> r0 = r6.data
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto Lf
        L22:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5c
            java.lang.String r2 = android.net.Uri.decode(r1)
            if (r2 == 0) goto L5c
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType r0 = r6.linkType
            int[] r1 = X.C2244371Cst.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L4e;
                case 3: goto L5c;
                case 4: goto L5c;
                case 5: goto L5c;
                case 6: goto L5c;
                default: goto L39;
            }
        L39:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L3f:
            r1 = 0
            goto L22
        L41:
            kotlin.jvm.functions.Function2<android.content.Context, java.lang.String, java.lang.Boolean> r0 = r4.LIZ
            java.lang.Object r0 = r0.invoke(r5, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            goto L5a
        L4e:
            kotlin.jvm.functions.Function2<android.content.Context, java.lang.String, java.lang.Boolean> r0 = r4.LIZIZ
            java.lang.Object r0 = r0.invoke(r5, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L5a:
            if (r3 != 0) goto L70
        L5c:
            android.app.Activity r0 = X.C1388190mED.LIZ(r5)
            if (r0 == 0) goto L70
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 2131832165(0x7f112d65, float:1.9297376E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C904510Ze5.LIZ(android.content.Context, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent):boolean");
    }
}

package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.tools.common.mob.AiTraceItem;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CTD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CTD {
    public static final C0CTD LIZ = new C0CTD();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6027));
    public static final CopyOnWriteArrayList<AiTraceItem> LIZJ = new CopyOnWriteArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.tools.common.mob.AiTraceItem> r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0CTC
            if (r0 == 0) goto L51
            r4 = r7
            X.0CTC r4 = (X.C0CTC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L57
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            if (r1 == 0) goto L4f
            int r0 = r1.status_code
            if (r0 != 0) goto L4f
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.tools.common.mob.AiTraceRequestBody r1 = new com.ss.android.ugc.tools.common.mob.AiTraceRequestBody
            r1.<init>(r6)
            X.0CTE r0 = X.C0CTE.LIZ
            r0.getClass()
            X.01GW r0 = X.C0CTE.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.tools.common.mob.IAITraceAPI r0 = (com.ss.android.ugc.tools.common.mob.IAITraceAPI) r0
            if (r0 == 0) goto L4f
            r4.LLILLL = r2
            java.lang.Object r1 = r0.aigcTrace(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L4f:
            r2 = 0
            goto L2a
        L51:
            X.0CTC r4 = new X.0CTC
            r4.<init>(r5, r7)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CTD.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(String str, String str2, C0D8I c0d8i, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C0CTB(str, "aigc", "VisualPoet", "TextImage2Image", str2, jCurrentTimeMillis * j * j, c0d8i, map, null), 3);
    }
}

package X;

import com.ss.android.ugc.aweme.outreach.pipeline.OutreachPerformanceSampleConfig;
import com.ss.android.ugc.aweme.outreach.pipeline.OutreachPipelineSampleConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.080A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080A {
    public static final C080A LIZ = new C080A();

    public static final void LIZLLL(long j, String str, String str2) {
        double d;
        OutreachPerformanceSampleConfig outreachPerformanceSampleConfig = (OutreachPerformanceSampleConfig) C1911107e9.LIZIZ.getValue();
        if (j > outreachPerformanceSampleConfig.outreachProcessorCostThreshold) {
            d = 0.1d;
        } else {
            d = outreachPerformanceSampleConfig.outreachProcessorCost;
        }
        C080N.LIZ.getClass();
        if (((Boolean) C080N.LIZJ.getValue()).booleanValue()) {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportProcessorCostSampled, timingKey=");
            sbLIZ.append(str);
            sbLIZ.append(", processorName=");
            sbLIZ.append(str2);
            sbLIZ.append(", processorCostMs=");
            sbLIZ.append(j);
            sbLIZ.append(", sampleRate=");
            sbLIZ.append(d);
            sbLIZ.append(", threshold=");
            sbLIZ.append(outreachPerformanceSampleConfig.outreachProcessorCostThreshold);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ);
        }
        if (d <= 0.0d) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("processor_cost_report_");
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(str2);
        if (!C080N.LIZ(d, C2188811AlT.LIZIZ(sbLIZ2))) {
            return;
        }
        C20684815ws.LJIILLIIL("outreach_processor_cost", C2097608Jq.LJIIJ(new Pair("processor_name", str2), new Pair("cost", String.valueOf(j)), new Pair("timing_key", str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final X.C080C r9, final java.lang.String r10, final java.lang.String r11, final java.lang.String r12) {
        /*
            r8 = 0
            r4 = r9
            boolean r0 = X.C080G.LIZ(r4)
            if (r0 == 0) goto L5f
            X.080A r0 = X.C080A.LIZ
            r0.getClass()
            int[] r3 = X.C080B.LIZ
            int r0 = r4.ordinal()
            r0 = r3[r0]
            r2 = 1
            if (r0 != r2) goto L8e
            X.01GW r0 = X.C1911207eA.LIZIZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.outreach.pipeline.OutreachPipelineSampleConfig r1 = (com.ss.android.ugc.aweme.outreach.pipeline.OutreachPipelineSampleConfig) r1
            int r0 = r4.ordinal()
            r0 = r3[r0]
            if (r0 != r2) goto L88
            r5 = r10
            int r0 = r5.hashCode()
            switch(r0) {
                case -245071156: goto L74;
                case 429175496: goto L6b;
                case 978065305: goto L60;
                case 1389363152: goto L7d;
                default: goto L30;
            }
        L30:
            java.lang.String r0 = ""
        L32:
            double r2 = r1.LIZ(r0)
            boolean r0 = X.C080N.LIZ(r2, r5)
            if (r0 == 0) goto L5f
            X.080N r0 = X.C080N.LIZ
            r0.getClass()
            X.01GW r0 = X.C080N.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L51:
            java.util.concurrent.ExecutorService r0 = X.C20684815ws.LJFF()
            X.080I r1 = new X.080I
            r7 = r12
            r6 = r11
            r1.<init>()
            r0.execute(r1)
        L5f:
            return
        L60:
            java.lang.String r0 = "card_click"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "outreach_click"
            goto L32
        L6b:
            java.lang.String r0 = "card_insert"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L85
            goto L30
        L74:
            java.lang.String r0 = "card_show"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L85
            goto L30
        L7d:
            java.lang.String r0 = "load_lynx"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L30
        L85:
            java.lang.String r0 = "outreach_show"
            goto L32
        L88:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L8e:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C080A.LIZ(X.080C, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        if (!C080E.LIZ()) {
            return;
        }
        double dLIZ = ((OutreachPipelineSampleConfig) C1911207eA.LIZIZ.getValue()).LIZ(str);
        if (!C080N.LIZ(dLIZ, str)) {
            return;
        }
        C080N.LIZ.getClass();
        if (((Boolean) C080N.LIZJ.getValue()).booleanValue()) {
            dLIZ = 1.0d;
        }
        C20684815ws.LJFF().execute(new C080L(dLIZ, str, str2, str3, str4, str5));
    }
}

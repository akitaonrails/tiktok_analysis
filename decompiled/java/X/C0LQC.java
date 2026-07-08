package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0LQC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQC extends C0LRS<CommonAigcQuotaInput, C0LQD> {
    public final C0LTN<CommonAigcQuotaInput, C0LQD> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<CommonAigcQuotaInput, C0LQD> LIZLLL() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LQC(C0LTN<? super CommonAigcQuotaInput, C0LQD> c0ltn, C0LM6 c0lm6) {
        super(c0ltn, c0lm6);
        this.LIZLLL = c0ltn;
        this.LJ = c0lm6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r4
      0x0015: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:7:0x000f, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r4
      0x0011: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:7:0x000f, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0LRS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09JG LIZJ(X.C0LSZ r10, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r11) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput r2 = new com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput
            r3 = 0
            com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r1 = r11.parentTaskInput
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r0 = r1.commonParentTaskInput
            if (r0 == 0) goto Ld
            java.lang.String r4 = r0.jobType
            if (r4 != 0) goto L11
        Ld:
            java.lang.String r4 = "image2video"
            if (r0 == 0) goto L15
        L11:
            java.lang.String r5 = r0.businessScene
            if (r5 != 0) goto L17
        L15:
            java.lang.String r5 = "effect_aigc"
        L17:
            com.ss.android.ugc.aweme.aigc.asynctask.Source r6 = r11.source
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r1.creativeInfo
            if (r0 == 0) goto L23
            java.lang.String r7 = r0.getCreationId()
            if (r7 != 0) goto L25
        L23:
            java.lang.String r7 = ""
        L25:
            com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r11.parentTaskInput
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r8 = r0.commonParentTaskInput
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQC.LIZJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.09JG");
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        String creationId;
        int iIntValue;
        C0LQD c0lqd = (C0LQD) absTaskOutput;
        if (c0lqd != null) {
            publicTaskInput.childTaskOutPut.commonAigcQuotaOutput = new C0LQD(c0lsz.LJIILL, c0lsz.LJ, c0lsz.LJIILLIIL, c0lqd.LJ, c0lqd.LJFF, c0lqd.LIZLLL);
            TaskLogExtra taskLogExtra = c0lsz.LJJ;
            CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
            String str = "";
            if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                creationId = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
            sbLIZ.append("quota: finished");
            TaskLogExtra taskLogExtraLIZ = TaskLogExtra.LIZ(taskLogExtra, null, null, creationId, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1045503);
            Integer num = c0lqd.LJ;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer num2 = c0lqd.LJFF;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            QuotaResult quotaResult = new QuotaResult(numValueOf, Integer.valueOf(iIntValue2), Integer.valueOf(c0lqd.LIZIZ), c0lqd.LIZJ, c0lqd.LIZLLL);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "QUOTA", 0, null, null, null, 0, null, str, null, 0, null, null, null, 0L, null, 0L, taskLogExtraLIZ, null, quotaResult, 0, null, 226484159);
        }
        return null;
    }
}

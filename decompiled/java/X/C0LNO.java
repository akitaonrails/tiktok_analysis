package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;

/* JADX INFO: renamed from: X.0LNO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LNO extends C0LRS<C09JG, I2VServerTaskOutput> {
    public final C0LTN<C09JG, I2VServerTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<C09JG, I2VServerTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.C0LRS
    public final C0LSZ LIZ(C0LSZ c0lsz) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "SERVER", 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435135);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LNO(C0LTN<? super C09JG, I2VServerTaskOutput> c0ltn, C0LM6 c0lm6) {
        super(c0ltn, c0lm6);
        this.LIZLLL = c0ltn;
        this.LJ = c0lm6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r6
      0x0015: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:7:0x000f, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[PHI: r6 r8
      0x0018: PHI (r6v1 java.lang.String) = (r6v4 java.lang.String), (r6v5 java.lang.String) binds: [B:11:0x0016, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x0018: PHI (r8v0 java.lang.String) = (r8v3 java.lang.String), (r8v4 java.lang.String) binds: [B:11:0x0016, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r6 r8
      0x001c: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:13:0x001a, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:13:0x001a, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d A[PHI: r12
      0x003d: PHI (r12v3 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:29:0x003b, B:27:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041 A[PHI: r12
      0x0041: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:29:0x003b, B:31:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r6
      0x0011: PHI (r6v5 java.lang.String) = (r6v0 java.lang.String), (r6v6 java.lang.String) binds: [B:7:0x000f, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0LRS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09JG LIZJ(X.C0LSZ r25, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r26) {
        /*
            r24 = this;
            r3 = r26
            com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r2 = r3.parentTaskInput
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r1 = r2.commonParentTaskInput
            java.lang.String r5 = ""
            if (r1 == 0) goto Le
            java.lang.String r6 = r1.effectId
            if (r6 != 0) goto L11
        Le:
            r6 = r5
            if (r1 == 0) goto L15
        L11:
            java.lang.String r8 = r1.algoReq
            if (r8 != 0) goto L18
        L15:
            r8 = r5
            if (r1 == 0) goto L1c
        L18:
            java.lang.String r9 = r1.reqJson
            if (r9 != 0) goto L1d
        L1c:
            r9 = r5
        L1d:
            r0 = r25
            com.ss.android.ugc.aweme.aigc.asynctask.Source r4 = r0.LJIIL
            if (r1 == 0) goto L27
            java.lang.String r14 = r1.promptText
            if (r14 != 0) goto L28
        L27:
            r14 = r5
        L28:
            com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput r0 = r3.childTaskOutPut
            com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput r0 = r0.imageUploadTaskOutput
            if (r0 == 0) goto L32
            java.util.List<java.lang.String> r11 = r0.imageXIdList
            if (r11 != 0) goto L34
        L32:
            X.13BV r11 = X.C13BV.INSTANCE
        L34:
            if (r1 == 0) goto L3a
            java.lang.String r12 = r1.businessScene
            if (r12 != 0) goto L3d
        L3a:
            r12 = r5
            if (r1 == 0) goto L41
        L3d:
            java.lang.String r13 = r1.taskType
            if (r13 != 0) goto L43
        L41:
            java.lang.String r13 = "image2video"
        L43:
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r2.creativeInfo
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.getCreationId()
            if (r0 == 0) goto L4e
            r5 = r0
        L4e:
            com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r3.parentTaskInput
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r2 = r0.commonParentTaskInput
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            int r0 = X.C0LNQ.LIZ()
            long r0 = (long) r0
            long r0 = r3.toSeconds(r0)
            com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r3 = new com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput
            r7 = 0
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            r20 = 0
            r22 = 247880(0x3c848, float:3.47354E-40)
            r10 = r7
            r15 = r7
            r17 = r2
            r18 = r7
            r19 = r7
            r21 = r7
            r23 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LNO.LIZJ(X.0LSZ, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput):X.09JG");
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        I2VServerTaskOutput i2VServerTaskOutput = (I2VServerTaskOutput) absTaskOutput;
        if (i2VServerTaskOutput != null) {
            publicTaskInput.childTaskOutPut.i2VServerTaskOutput = new I2VServerTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, i2VServerTaskOutput.errorSource, null, i2VServerTaskOutput.videoUrl, i2VServerTaskOutput.videoUrlType, i2VServerTaskOutput.serverTaskId, i2VServerTaskOutput.videoUrlList, i2VServerTaskOutput.logId, i2VServerTaskOutput.serverCreateTime, i2VServerTaskOutput.serverEndTime, i2VServerTaskOutput.extra, null, null, 0L, null, 122896, null);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            String str = i2VServerTaskOutput.serverTaskId;
            TaskLogExtra taskLogExtra = c0lsz.LJJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
            sbLIZ.append(", server: finished");
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, str, 0L, TaskLogExtra.LIZ(taskLogExtra, i2VServerTaskOutput.logId, null, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1046523), null, null, 0, null, 257941503);
        }
        return null;
    }
}

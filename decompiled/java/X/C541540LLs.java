package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CheckCameoPermissionTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541540LLs extends AbstractC541550LLt<CheckCameoPermissionTaskInput, C1974507oN> {
    public final C0LTN<CheckCameoPermissionTaskInput, C1974507oN> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<CheckCameoPermissionTaskInput, C1974507oN> LIZLLL() {
        return this.LIZLLL;
    }

    public C541540LLs(C541920LNe c541920LNe, C0LM6 c0lm6) {
        super(c541920LNe, c0lm6);
        this.LIZLLL = c541920LNe;
        this.LJ = c0lm6;
    }

    @Override // X.C0LRS
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        String str;
        C1974507oN c1974507oN = publicTaskInput.childTaskOutPut.checkCameoPermissionTaskOutput;
        if (c1974507oN != null) {
            str = c1974507oN.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "FINISHED")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip ");
            sbLIZ.append(this.LJ.getStepName());
            sbLIZ.append(", success");
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return new CheckCameoPermissionTaskInput(publicTaskInput.source, publicTaskInput.parentTaskInput.commonParentTaskInput);
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        String creationId;
        C1974507oN c1974507oN = (C1974507oN) absTaskOutput;
        if (c1974507oN != null) {
            publicTaskInput.childTaskOutPut.checkCameoPermissionTaskOutput = new C1974507oN(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, c1974507oN.LIZLLL);
            TaskLogExtra taskLogExtra = c0lsz.LJJ;
            CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
            String str = "";
            if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                creationId = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
            sbLIZ.append("CHECK_CAMEO_PERMISSION: finished");
            TaskLogExtra taskLogExtraLIZ = TaskLogExtra.LIZ(taskLogExtra, null, null, creationId, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1045503);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "CHECK_CAMEO_PERMISSION", 0, null, null, null, 0, null, str, null, 0, null, null, null, 0L, null, 0L, taskLogExtraLIZ, null, null, 0, null, 260038591);
        }
        return null;
    }
}

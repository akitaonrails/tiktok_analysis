package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0LNP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LNP extends C0LRS<GeneralI2VServerProgressTaskInput, GeneralI2VServerProgressTaskOutput> {
    public final C0LTN<GeneralI2VServerProgressTaskInput, GeneralI2VServerProgressTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<GeneralI2VServerProgressTaskInput, GeneralI2VServerProgressTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.C0LRS
    public final C0LSZ LIZ(C0LSZ c0lsz) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, "ASYNC", "PROGRESS", 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435359);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LNP(C0LTN<? super GeneralI2VServerProgressTaskInput, GeneralI2VServerProgressTaskOutput> c0ltn, C0LM6 c0lm6) {
        super(c0ltn, c0lm6);
        this.LIZLLL = c0ltn;
        this.LJ = c0lm6;
    }

    @Override // X.C0LRS
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        String str;
        CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
        if ((commonParentTaskInput == null || (str = commonParentTaskInput.serverTaskId) == null || str.length() == 0) && (str = c0lsz.LJIJJLI) == null) {
            str = "";
        }
        return new GeneralI2VServerProgressTaskInput(c0lsz.LJIIL, str, Long.valueOf(TimeUnit.MINUTES.toSeconds(C0LNQ.LIZ())), publicTaskInput.parentTaskInput.commonParentTaskInput);
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        GeneralI2VServerProgressTaskOutput generalI2VServerProgressTaskOutput = (GeneralI2VServerProgressTaskOutput) absTaskOutput;
        if (generalI2VServerProgressTaskOutput != null) {
            publicTaskInput.childTaskOutPut.i2VServerTaskOutput = new I2VServerTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, generalI2VServerProgressTaskOutput.LIZLLL, null, generalI2VServerProgressTaskOutput.videoUrl, generalI2VServerProgressTaskOutput.videoUrlType, null, generalI2VServerProgressTaskOutput.videoUrlList, null, 0L, 0L, generalI2VServerProgressTaskOutput.extra, null, null, 0L, null, 126608, null);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            TaskLogExtra taskLogExtra = c0lsz.LJJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
            sbLIZ.append(", polling: finished");
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1046527), null, null, 0, null, 260038655);
        }
        return null;
    }
}

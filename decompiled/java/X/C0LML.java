package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.List;

/* JADX INFO: renamed from: X.0LML, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LML extends C0LRS<CreationDownloadTaskInput, CreationDownloadListTaskOutput> {
    public final C0LTN<CreationDownloadTaskInput, CreationDownloadListTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<CreationDownloadTaskInput, CreationDownloadListTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.C0LRS
    public final C0LSZ LIZ(C0LSZ c0lsz) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "DOWNLOAD", 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 1000L, null, null, null, 0, null, 264240831);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LML(C0LTN<? super CreationDownloadTaskInput, CreationDownloadListTaskOutput> c0ltn, C0LM6 c0lm6) {
        super(c0ltn, c0lm6);
        this.LIZLLL = c0ltn;
        this.LJ = c0lm6;
    }

    @Override // X.C0LRS
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        List list;
        String str;
        AIGCResultType aIGCResultType;
        String str2 = c0lsz.LJIIJ;
        boolean z = false;
        if (str2 != null && str2.length() != 0 && c0lsz.LJIIJJI >= 0) {
            z = true;
        }
        CommonParentTaskInput commonParentTaskInputLIZ = null;
        if (!z) {
            return null;
        }
        I2VServerTaskOutput i2VServerTaskOutput = publicTaskInput.childTaskOutPut.i2VServerTaskOutput;
        if (i2VServerTaskOutput == null || (list = i2VServerTaskOutput.videoUrlList) == null) {
            list = C13BV.INSTANCE;
        }
        Source source = c0lsz.LJIIL;
        if (i2VServerTaskOutput == null || (str = i2VServerTaskOutput.videoUrl) == null) {
            str = "";
        }
        if (i2VServerTaskOutput == null || (aIGCResultType = i2VServerTaskOutput.videoUrlType) == null) {
            aIGCResultType = AIGCResultType.VIDEO;
        }
        String strLJ = C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo(c0lsz.LJIIJ, c0lsz.LJIIJJI, null, 4, null), C0MI0.OFFLINE_PROCESSING, null, 12);
        String str3 = c0lsz.LJIIJ;
        int i = c0lsz.LJIIJJI;
        CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
        if (commonParentTaskInput != null) {
            commonParentTaskInputLIZ = CommonParentTaskInput.LIZ(commonParentTaskInput, c0lsz.LJIJI, c0lsz.LJIJJLI, null, false, false, null, 1073735679);
        }
        return new CreationDownloadTaskInput(source, str, strLJ, str3, i, list, commonParentTaskInputLIZ, aIGCResultType);
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        String str;
        CreationDownloadListTaskOutput creationDownloadListTaskOutput = (CreationDownloadListTaskOutput) absTaskOutput;
        if (creationDownloadListTaskOutput != null) {
            publicTaskInput.childTaskOutPut.creationDownloadListTaskOutput = new CreationDownloadListTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, creationDownloadListTaskOutput.LIZLLL, creationDownloadListTaskOutput.downloadItemList);
            List<DownloadItemResult> list = creationDownloadListTaskOutput.downloadItemList;
            I2VServerTaskOutput i2VServerTaskOutput = publicTaskInput.childTaskOutPut.i2VServerTaskOutput;
            String str2 = "";
            if (i2VServerTaskOutput == null || (str = i2VServerTaskOutput.extra) == null) {
                str = "";
            }
            String strLIZLLL = C0LKZ.LIZLLL(new C0LMN(list, str));
            if (strLIZLLL != null) {
                str2 = strLIZLLL;
            }
            TaskLogExtra taskLogExtra = c0lsz.LJJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
            sbLIZ.append(", download list: finished");
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, str2, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1046527), null, null, 0, null, 260038655);
        }
        TaskLogExtra taskLogExtra2 = c0lsz.LJJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0lsz.LJJ.aigcWorkflowStatus);
        sbLIZ2.append(", download list: failed");
        TaskLogExtra.LIZ(taskLogExtra2, null, null, null, C2188811AlT.LIZIZ(sbLIZ2), 0, null, null, null, null, false, null, 1046527);
        return null;
    }
}

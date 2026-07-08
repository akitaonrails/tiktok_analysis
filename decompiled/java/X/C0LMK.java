package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LMK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LMK extends AbstractC542960LRe<CreationDownloadTaskInput, CreationDownloadListTaskOutput> {
    public final C0LTN<CreationDownloadTaskInput, CreationDownloadListTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.AbstractC542960LRe
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC542960LRe
    public final C0LTN<CreationDownloadTaskInput, CreationDownloadListTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LIZ(C0LSZ c0lsz) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "DOWNLOAD", 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 1000L, null, null, null, 0, null, 264240831);
    }

    public C0LMK(C541640LMc c541640LMc, C0LM6 c0lm6) {
        super(c541640LMc, c0lm6);
        this.LIZLLL = c541640LMc;
        this.LJ = c0lm6;
    }

    @Override // X.AbstractC542960LRe
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        List arrayList;
        String str = c0lsz.LJIIJ;
        boolean z = false;
        if (str != null && str.length() != 0 && c0lsz.LJIIJJI >= 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        I2VServerTaskOutput i2VServerTaskOutput = publicTaskInput.childTaskOutPut.i2VServerTaskOutput;
        if (i2VServerTaskOutput == null || (arrayList = i2VServerTaskOutput.videoUrlList) == null) {
            arrayList = new ArrayList();
        }
        return new CreationDownloadTaskInput(c0lsz.LJIIL, null, C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo(c0lsz.LJIIJ, c0lsz.LJIIJJI, null, 4, null), C0MI0.EDITOR_PRO_AIGC, null, 12), c0lsz.LJIIJ, c0lsz.LJIIJJI, arrayList, publicTaskInput.parentTaskInput.commonParentTaskInput, null, 130, null);
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        CreationDownloadListTaskOutput creationDownloadListTaskOutput = (CreationDownloadListTaskOutput) absTaskOutput;
        if (creationDownloadListTaskOutput != null) {
            publicTaskInput.childTaskOutPut.creationDownloadListTaskOutput = new CreationDownloadListTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, null, creationDownloadListTaskOutput.downloadItemList);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
        }
        return null;
    }
}

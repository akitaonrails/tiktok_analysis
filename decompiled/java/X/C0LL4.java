package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0LL4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LL4 extends AbstractC542960LRe<ImageUploadTaskInput, ImageUploadTaskOutput> {
    public final C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.AbstractC542960LRe
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC542960LRe
    public final C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    public C0LL4(C541280LKs c541280LKs, C0LM6 c0lm6) {
        super(c541280LKs, c0lm6);
        this.LIZLLL = c541280LKs;
        this.LJ = c0lm6;
    }

    @Override // X.AbstractC542960LRe
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        List<String> listLIZIZ;
        CommonParentTaskInput commonParentTaskInputLIZ;
        String creationId;
        Source source = c0lsz.LJIIL;
        CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
        if (commonParentTaskInput == null || (listLIZIZ = commonParentTaskInput.LIZIZ()) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        ParentTaskInput parentTaskInput = publicTaskInput.parentTaskInput;
        CommonParentTaskInput commonParentTaskInput2 = parentTaskInput.commonParentTaskInput;
        if (commonParentTaskInput2 != null) {
            CreativeInfo creativeInfo = parentTaskInput.creativeInfo;
            if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                creationId = "";
            }
            commonParentTaskInputLIZ = CommonParentTaskInput.LIZ(commonParentTaskInput2, null, null, creationId, false, false, null, 1073733631);
        } else {
            commonParentTaskInputLIZ = null;
        }
        return new ImageUploadTaskInput(source, listLIZIZ, "", commonParentTaskInputLIZ, null, 16, null);
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        ImageUploadTaskOutput imageUploadTaskOutput = (ImageUploadTaskOutput) absTaskOutput;
        if (imageUploadTaskOutput != null) {
            publicTaskInput.childTaskOutPut.imageUploadTaskOutput = new ImageUploadTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, null, imageUploadTaskOutput.imageXIdList, null, imageUploadTaskOutput.imageUploadDuration, 40, null);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "IMAGE_UPLOAD", 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427199);
        }
        return null;
    }
}

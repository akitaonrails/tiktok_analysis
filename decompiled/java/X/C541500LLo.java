package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0LLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541500LLo extends C0LRS<ImageUploadTaskInput, ImageUploadTaskOutput> {
    public final C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C541500LLo(C0LTN<? super ImageUploadTaskInput, ImageUploadTaskOutput> c0ltn, C0LM6 c0lm6) {
        super(c0ltn, c0lm6);
        this.LIZLLL = c0ltn;
        this.LJ = c0lm6;
    }

    @Override // X.C0LRS
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        List<AIGCInputItem> list;
        String creationId;
        Integer num;
        CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
        if (commonParentTaskInput != null && (list = commonParentTaskInput.inputItems) != null) {
            for (AIGCInputItem aIGCInputItem : list) {
                Integer num2 = aIGCInputItem.type;
                if (num2 == null || num2.intValue() == 2 || ((num = aIGCInputItem.type) != null && num.intValue() == 3)) {
                    Source source = c0lsz.LJIIL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<AIGCInputItem> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().value);
                    }
                    CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
                    if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                        creationId = "";
                    }
                    return new ImageUploadTaskInput(source, arrayList, creationId, publicTaskInput.parentTaskInput.commonParentTaskInput, null, 16, null);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip ");
            sbLIZ.append(this.LJ.getStepName());
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        List<AIGCInputItem> list;
        Object objLJJJLZIJ;
        String creationId;
        ImageUploadTaskOutput imageUploadTaskOutput = (ImageUploadTaskOutput) absTaskOutput;
        if (imageUploadTaskOutput != null) {
            publicTaskInput.childTaskOutPut.imageUploadTaskOutput = new ImageUploadTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, imageUploadTaskOutput.LIZLLL, imageUploadTaskOutput.imageXIdList, null, 0L, 96, null);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            String str = "";
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            TaskLogExtra taskLogExtra = c0lsz.LJJ;
            CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
            if (creativeInfo != null && (creationId = creativeInfo.getCreationId()) != null) {
                str = creationId;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
            sbLIZ.append(", upload: finished");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
            List<String> list2 = imageUploadTaskOutput.imageXIdList;
            ArrayList arrayList = new ArrayList();
            if (commonParentTaskInput != null && (list = commonParentTaskInput.inputItems) != null) {
                int i = 0;
                for (AIGCInputItem aIGCInputItem : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Integer num = aIGCInputItem.type;
                        if ((num == null || num.intValue() != 1) && (objLJJJLZIJ = C13LP.LJJJLZIJ(i, list2)) != null) {
                            arrayList.add(objLJJJLZIJ);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "IMAGE_UPLOAD", 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, str, strLIZIZ2, 0, null, null, null, arrayList, false, null, 914431), null, null, 0, null, 260038591);
        }
        return null;
    }
}

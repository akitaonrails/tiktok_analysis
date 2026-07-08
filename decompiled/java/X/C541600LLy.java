package X;

import com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.aikit.experiments.AIGCImagePreprocessConfigExp;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0LLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541600LLy extends AbstractC541550LLt<C541610LLz, ImagePreprocessTaskOutput> {
    public final C0LTN<C541610LLz, ImagePreprocessTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.C0LRS
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0LRS
    public final C0LTN<C541610LLz, ImagePreprocessTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    public C541600LLy(C542870LQv c542870LQv, C0LM6 c0lm6) {
        super(c542870LQv, c0lm6);
        this.LIZLLL = c542870LQv;
        this.LJ = c0lm6;
    }

    @Override // X.C0LRS
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        List<AIGCInputItem> list;
        List<AIGCInputItem> list2;
        List<String> list3;
        if (!AIGCImagePreprocessConfigExp.LIZ().enable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip ");
            sbLIZ.append(this.LJ.getStepName());
            sbLIZ.append(": AB disabled");
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
            if (commonParentTaskInput != null && (list = commonParentTaskInput.inputItems) != null) {
                ArrayList arrayList = new ArrayList();
                for (AIGCInputItem aIGCInputItem : list) {
                    Integer num = aIGCInputItem.type;
                    if (num != null && num.intValue() == 2) {
                        arrayList.add(aIGCInputItem);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AIGCInputItem) it2.next()).value);
                }
                if (!arrayList2.isEmpty()) {
                    ImagePreprocessTaskOutput imagePreprocessTaskOutput = publicTaskInput.childTaskOutPut.imagePreprocessTaskOutput;
                    if (imagePreprocessTaskOutput != null && imagePreprocessTaskOutput.LIZ != null && imagePreprocessTaskOutput != null && (list3 = imagePreprocessTaskOutput.transformedPaths) != null && (!list3.isEmpty())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("skip ");
                        sbLIZ2.append(this.LJ.getStepName());
                        sbLIZ2.append(": already processed");
                        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        return null;
                    }
                    CommonParentTaskInput commonParentTaskInput2 = publicTaskInput.parentTaskInput.commonParentTaskInput;
                    if (commonParentTaskInput2 != null && (list2 = commonParentTaskInput2.inputItems) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (AIGCInputItem aIGCInputItem2 : list2) {
                            Integer num2 = aIGCInputItem2.type;
                            if (num2 != null && num2.intValue() == 2) {
                                arrayList3.add(aIGCInputItem2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((AIGCInputItem) it3.next()).value);
                        }
                        if (!arrayList4.isEmpty()) {
                            CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
                            if (creativeInfo == null) {
                                creativeInfo = new CreativeInfo(c0lsz.LJIIJ, c0lsz.LJIIJJI, null, 4, null);
                            }
                            Source source = c0lsz.LJIIL;
                            if (source == null) {
                                source = Source.AI_THEATER;
                            }
                            return new C541610LLz(source, creativeInfo, arrayList4);
                        }
                    }
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("skip ");
            sbLIZ3.append(this.LJ.getStepName());
            sbLIZ3.append(": no image inputs");
            C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        }
        return null;
    }

    @Override // X.C0LRS
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        String creationId;
        ImagePreprocessTaskOutput imagePreprocessTaskOutput = (ImagePreprocessTaskOutput) absTaskOutput;
        if (imagePreprocessTaskOutput == null) {
            return null;
        }
        publicTaskInput.childTaskOutPut.imagePreprocessTaskOutput = imagePreprocessTaskOutput;
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
        sbLIZ.append(", IMAGE_PREPROCESS: finished");
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "IMAGE_PREPROCESS", 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, str, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1045503), null, null, 0, null, 260038591);
    }
}

package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LLK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LLK extends AbstractC542960LRe<FaceDetectTaskInput, FaceDetectTaskOutput> {
    public final C0LTN<FaceDetectTaskInput, FaceDetectTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.AbstractC542960LRe
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC542960LRe
    public final C0LTN<FaceDetectTaskInput, FaceDetectTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    public C0LLK(C0LLP c0llp, C0LM6 c0lm6) {
        super(c0llp, c0lm6);
        this.LIZLLL = c0llp;
        this.LJ = c0lm6;
    }

    @Override // X.AbstractC542960LRe
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        Map<String, String> mapLJ;
        List<String> listLIZIZ;
        CommonParentTaskInput commonParentTaskInput;
        CommonParentTaskInput commonParentTaskInput2 = publicTaskInput.parentTaskInput.commonParentTaskInput;
        if (commonParentTaskInput2 == null || (mapLJ = commonParentTaskInput2.bizExtras) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String str = mapLJ.get("needs_face_detect");
        if (str == null || !Intrinsics.LJFF(a0.LJLI(str), Boolean.TRUE) || (commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput) == null || (listLIZIZ = commonParentTaskInput.LIZIZ()) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        if (!listLIZIZ.isEmpty()) {
            String strLIZ = C2084808Es.LIZ(C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, null, 62));
            FaceDetectTaskOutput faceDetectTaskOutput = publicTaskInput.childTaskOutPut.faceDetectTaskOutput;
            if (C123100dR.LIZ(strLIZ) && faceDetectTaskOutput != null && Intrinsics.LJFF(strLIZ, faceDetectTaskOutput.inputId)) {
                return null;
            }
            return new FaceDetectTaskInput(c0lsz.LJIIL, listLIZIZ);
        }
        return null;
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        FaceDetectTaskOutput faceDetectTaskOutput = (FaceDetectTaskOutput) absTaskOutput;
        if (faceDetectTaskOutput != null) {
            publicTaskInput.childTaskOutPut.faceDetectTaskOutput = faceDetectTaskOutput;
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
        }
        return null;
    }
}

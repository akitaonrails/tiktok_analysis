package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.NleRestoreTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTosTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.tasks.UpdateDraftTaskInput;
import java.util.List;

/* JADX INFO: renamed from: X.0LJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541050LJv extends AbstractC542960LRe<UpdateDraftTaskInput, C1974307oL> {
    public final C0LTN<UpdateDraftTaskInput, C1974307oL> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.AbstractC542960LRe
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC542960LRe
    public final C0LTN<UpdateDraftTaskInput, C1974307oL> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LIZ(C0LSZ c0lsz) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "DOWNLOAD", 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435135);
    }

    public C541050LJv(C539380LDk c539380LDk, C0LM6 c0lm6) {
        super(c539380LDk, c0lm6);
        this.LIZLLL = c539380LDk;
        this.LJ = c0lm6;
    }

    @Override // X.AbstractC542960LRe
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        boolean z;
        NleRestoreTaskOutput nleRestoreTaskOutput;
        String str;
        String str2;
        List<AutoPickTaskResponse> list;
        String str3;
        String str4 = c0lsz.LJIIJ;
        if (str4 != null && str4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        MusicInfo musicInfo = null;
        if (z || (nleRestoreTaskOutput = publicTaskInput.childTaskOutPut.nleRestoreTaskOutput) == null || (str = nleRestoreTaskOutput.nleModelJson) == null || str.length() == 0) {
            return null;
        }
        ChildTaskOutput childTaskOutput = publicTaskInput.childTaskOutPut;
        AutoCutServerTaskOutput autoCutServerTaskOutput = childTaskOutput.autoCutServerTaskOutput;
        VideoUploadTosTaskOutput videoUploadTosTaskOutput = childTaskOutput.videoUploadTaskOutput;
        String str5 = "";
        if (videoUploadTosTaskOutput == null || (str2 = videoUploadTosTaskOutput.vid) == null) {
            str2 = "";
        }
        if (autoCutServerTaskOutput != null && (str3 = autoCutServerTaskOutput.requestId) != null) {
            str5 = str3;
        }
        if (autoCutServerTaskOutput != null) {
            musicInfo = autoCutServerTaskOutput.musicInfo;
            list = autoCutServerTaskOutput.autoPickTaskResponses;
        } else {
            list = null;
        }
        return new UpdateDraftTaskInput(str4, str, musicInfo, list, str2, str5);
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        if (absTaskOutput == null) {
            return null;
        }
        String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
    }
}

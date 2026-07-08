package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.NleRestoreTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.NleRestoreTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541040LJu extends AbstractC542960LRe<NleRestoreTaskInput, NleRestoreTaskOutput> {
    public final C0LTN<NleRestoreTaskInput, NleRestoreTaskOutput> LIZLLL;
    public final C0LM6 LJ;

    @Override // X.AbstractC542960LRe
    public final C0LM6 LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC542960LRe
    public final C0LTN<NleRestoreTaskInput, NleRestoreTaskOutput> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LIZ(C0LSZ c0lsz) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, "DOWNLOAD", 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 1000L, null, null, null, 0, null, 264240831);
    }

    public C541040LJu(C0LGV c0lgv, C0LM6 c0lm6) {
        super(c0lgv, c0lm6);
        this.LIZLLL = c0lgv;
        this.LJ = c0lm6;
    }

    @Override // X.AbstractC542960LRe
    public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        String str;
        String str2 = c0lsz.LJIIJ;
        boolean z = false;
        if (str2 != null && str2.length() != 0 && c0lsz.LJIIJJI >= 0) {
            z = true;
        }
        if (z) {
            AutoCutServerTaskOutput autoCutServerTaskOutput = publicTaskInput.childTaskOutPut.autoCutServerTaskOutput;
            if (autoCutServerTaskOutput == null || (str = autoCutServerTaskOutput.nleDraft) == null) {
                str = "";
            }
            if (a0.LJJJIL(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AutoCutChildTaskNleRestoreTask getInput: skip NLE_RESTORE, nleDraft is blank. serverTaskId=");
                sbLIZ.append(c0lsz.LJIJJLI);
                sbLIZ.append(", creationId=");
                sbLIZ.append(c0lsz.LJIIJ);
                C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return new NleRestoreTaskInput(c0lsz.LJIIL, "", str, c0lsz.LJIIJ, c0lsz.LJIIJJI, publicTaskInput.parentTaskInput.commonParentTaskInput);
            }
        }
        return null;
    }

    @Override // X.AbstractC542960LRe
    public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
        NleRestoreTaskOutput nleRestoreTaskOutput = (NleRestoreTaskOutput) absTaskOutput;
        if (nleRestoreTaskOutput != null) {
            publicTaskInput.childTaskOutPut.nleRestoreTaskOutput = new NleRestoreTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, nleRestoreTaskOutput.nleModelJson);
            String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, this.LJ.getStepName(), 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427199);
        }
        return null;
    }
}

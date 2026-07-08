package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult;
import com.ss.android.ugc.aweme.aigc.asynctask.SaveDraftTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LQN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQN extends C0LSC<PublicTaskInput, Object> {
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(621));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1118));

    @Override // X.C0LTN
    public final String LJJ() {
        return C0LQP.AI_THEATER_AUTO.getTypeName();
    }

    @Override // X.C0LSC
    public final AICreationGenerateConfigExp.AICreationGenerateConfig LJJLJ() {
        return (AICreationGenerateConfigExp.AICreationGenerateConfig) this.LJIJI.getValue();
    }

    @Override // X.C0LSC
    public final C0LSL LJJLL() {
        return (C0LSL) this.LJIJJ.getValue();
    }

    @Override // X.C0LRR
    public final List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(new C0LNP(new C0LV4(), C0LM6.PROGRESS));
        c13dvLIZIZ.add(new C0LML(new C541740LMm(), C0LM6.DOWNLOAD));
        final C0LMB c0lmb = new C0LMB();
        final C0LM6 c0lm6 = C0LM6.SAVE_DRAFT;
        c13dvLIZIZ.add(new AbstractC541550LLt<SaveDraftTaskInput, C1974407oM>(c0lmb, c0lm6) { // from class: X.0LLu
            public final C0LTN<SaveDraftTaskInput, C1974407oM> LIZLLL;
            public final C0LM6 LJ;

            @Override // X.C0LRS
            public final C0LM6 LIZIZ() {
                return this.LJ;
            }

            @Override // X.C0LRS
            public final C0LTN<SaveDraftTaskInput, C1974407oM> LIZLLL() {
                return this.LIZLLL;
            }

            @Override // X.C0LRS
            public final C0LSZ LIZ(C0LSZ c0lsz) {
                return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, C0LMH.LIZIZ, 0, this.LIZLLL.getTaskId(), null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435135);
            }

            {
                super(c0lmb, c0lm6);
                this.LIZLLL = c0lmb;
                this.LJ = c0lm6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
            @Override // X.C0LRS
            public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                ?? arrayList;
                List<DownloadItemResult> list;
                Source source = publicTaskInput.source;
                CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                String str2 = c0lsz.LJIJJLI;
                CreationDownloadListTaskOutput creationDownloadListTaskOutput = publicTaskInput.childTaskOutPut.creationDownloadListTaskOutput;
                if (creationDownloadListTaskOutput != null && (list = creationDownloadListTaskOutput.downloadItemList) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<DownloadItemResult> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().localFilePath);
                    }
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                return new SaveDraftTaskInput(source, commonParentTaskInput, str2, arrayList);
            }

            @Override // X.C0LRS
            public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                if (absTaskOutput != null) {
                    TaskLogExtra taskLogExtra = c0lsz.LJJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
                    sbLIZ.append(", ");
                    sbLIZ.append(C0LMH.LIZIZ);
                    sbLIZ.append(": finished");
                    return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(taskLogExtra, null, null, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1046527), null, null, 0, null, 260046847);
                }
                return null;
            }
        });
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // X.C0LRR
    public final java.lang.Object LJJJLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQN.LJJJLIIL(X.05Vn):java.lang.Object");
    }
}

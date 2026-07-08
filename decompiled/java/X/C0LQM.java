package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.SendDMMessageTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.SendDMMessageTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LQM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQM extends C0LSC<PublicTaskInput, Object> {
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(622));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1119));

    @Override // X.C0LTN
    public final String LJJ() {
        return C0LQP.AI_THEATER_DM.getTypeName();
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
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ai_theater_check_cameo_permission_enable", true, true)) {
            c13dvLIZIZ.add(new C541540LLs(new C541920LNe(), C0LM6.CHECK_CAMEO_PERMISSION));
        }
        c13dvLIZIZ.add(new C0LQC(new C0LSS(), C0LM6.QUOTA));
        c13dvLIZIZ.add(new C541600LLy(new C542870LQv(), C0LM6.IMAGE_PREPROCESS));
        c13dvLIZIZ.add(new C541510LLp(new C541410LLf(), C0LM6.IMAGE_UPLOAD));
        final C0LM0 c0lm0 = new C0LM0();
        final C0LM6 c0lm6 = C0LM6.DM_FAKE_MESSAGE;
        c13dvLIZIZ.add(new AbstractC541550LLt<SendDMMessageTaskInput, SendDMMessageTaskOutput>(c0lm0, c0lm6) { // from class: X.0LLw
            public final C0LTN<SendDMMessageTaskInput, SendDMMessageTaskOutput> LIZLLL;
            public final C0LM6 LJ;

            @Override // X.C0LRS
            public final C0LM6 LIZIZ() {
                return this.LJ;
            }

            @Override // X.C0LRS
            public final C0LTN<SendDMMessageTaskInput, SendDMMessageTaskOutput> LIZLLL() {
                return this.LIZLLL;
            }

            {
                super(c0lm0, c0lm6);
                this.LIZLLL = c0lm0;
                this.LJ = c0lm6;
            }

            @Override // X.C0LRS
            public final C09JG LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
                String str2;
                boolean z;
                Map<String, String> map;
                Map<String, String> map2;
                CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                String str3 = null;
                if (commonParentTaskInput != null && (map2 = commonParentTaskInput.bizExtras) != null) {
                    str2 = map2.get("dm_message_params");
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("skip ");
                    sbLIZ.append(this.LJ.getStepName());
                    C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
                if (publicTaskInput.childTaskOutPut.sendDMMessageOutput != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("skip ");
                    sbLIZ2.append(this.LJ.getStepName());
                    sbLIZ2.append(", success");
                    C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    return null;
                }
                Source source = publicTaskInput.source;
                CommonParentTaskInput commonParentTaskInput2 = publicTaskInput.parentTaskInput.commonParentTaskInput;
                if (commonParentTaskInput2 != null && (map = commonParentTaskInput2.bizExtras) != null) {
                    str3 = map.get("dm_message_params");
                }
                return new SendDMMessageTaskInput(source, commonParentTaskInput2, str3);
            }

            @Override // X.C0LRS
            public final C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, AbsTaskOutput absTaskOutput) {
                String creationId;
                SendDMMessageTaskOutput sendDMMessageTaskOutput = (SendDMMessageTaskOutput) absTaskOutput;
                LinkedHashMap linkedHashMap = null;
                if (sendDMMessageTaskOutput == null) {
                    return null;
                }
                publicTaskInput.childTaskOutPut.sendDMMessageOutput = new SendDMMessageTaskOutput(c0lsz.LJ, c0lsz.LJIILL, c0lsz.LJIILLIIL, sendDMMessageTaskOutput.LIZLLL, sendDMMessageTaskOutput.messageId);
                CommonParentTaskInput commonParentTaskInput = publicTaskInput.parentTaskInput.commonParentTaskInput;
                String str2 = "";
                if (commonParentTaskInput != null) {
                    Map<String, String> map = commonParentTaskInput.generateExtra;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(map);
                        String str3 = sendDMMessageTaskOutput.messageId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        linkedHashMap.put("dm_client_msg_id", str3);
                    }
                    commonParentTaskInput.generateExtra = linkedHashMap;
                }
                TaskLogExtra taskLogExtra = c0lsz.LJJ;
                CreativeInfo creativeInfo = publicTaskInput.parentTaskInput.creativeInfo;
                if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
                    creationId = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0lsz.LJJ.aigcWorkflowStatus);
                String str4 = C0LMH.LIZ;
                sbLIZ.append(str4);
                sbLIZ.append(": finished");
                TaskLogExtra taskLogExtraLIZ = TaskLogExtra.LIZ(taskLogExtra, null, null, creationId, C2188811AlT.LIZIZ(sbLIZ), 0, null, null, null, null, false, null, 1045503);
                String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
                if (strLIZIZ != null) {
                    str2 = strLIZIZ;
                }
                return C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, str4, 0, null, null, null, 0, null, str2, null, 0, null, null, null, 0L, null, 0L, taskLogExtraLIZ, null, null, 0, null, 260038591);
            }
        });
        c13dvLIZIZ.add(new C0LNO(new C0LUW(), C0LM6.SERVER));
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
    public final java.lang.Object LJJJLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQM.LJJJLIIL(X.05Vn):java.lang.Object");
    }
}

package X;

import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;

/* JADX INFO: renamed from: X.0LcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546730LcN {
    public static final void LIZ(WritableAIGCGenerationModel writableAIGCGenerationModel) {
        writableAIGCGenerationModel.setResults(C13BV.INSTANCE);
        writableAIGCGenerationModel.setErrorCode(-1);
        writableAIGCGenerationModel.setErrorMsg("");
        writableAIGCGenerationModel.ud("");
        writableAIGCGenerationModel.RH(-1L);
    }

    public static final CreateState LIZLLL(C0LU9 c0lu9) {
        if (c0lu9 instanceof C0LUD) {
            return CreateState.NullState.INSTANCE;
        }
        if (c0lu9 instanceof C0LUB) {
            return LIZJ((C0LUB) c0lu9, null);
        }
        if (c0lu9 instanceof C0LUC) {
            C0LUC c0luc = (C0LUC) c0lu9;
            return new CreateState.Finished(c0luc.LIZIZ.duration, c0luc.LIZ.LIZ);
        }
        if (c0lu9 instanceof C0LUA) {
            return LIZIZ((C0LUA) c0lu9, null);
        }
        if (c0lu9 instanceof C0LU3) {
            return CreateState.Canceled.INSTANCE;
        }
        throw new C1954807lC();
    }

    public static final CreateState.Failed LIZIZ(C0LUA c0lua, WritableAIGCGenerationModel writableAIGCGenerationModel) {
        C0LUN c0lun;
        C0LU8 c0lu8 = c0lua.LIZIZ;
        if ((c0lu8 instanceof C0LUN) && (c0lun = (C0LUN) c0lu8) != null) {
            CreateState.Failed failed = new CreateState.Failed(c0lun.getStep(), c0lun.getErrorCode(), c0lun.getErrorMsg(), c0lun.getErrorSource(), c0lun.getFailReasonMsg(), c0lua.LIZJ.duration);
            if (writableAIGCGenerationModel != null && !C546670LcH.LIZ(writableAIGCGenerationModel)) {
                LIZ(writableAIGCGenerationModel);
                writableAIGCGenerationModel.Jq(c0lua.LIZ);
                writableAIGCGenerationModel.Qd(c0lun.getStep());
                writableAIGCGenerationModel.P3(UsageStatus.FAIL);
                writableAIGCGenerationModel.setErrorCode(c0lun.getErrorCode());
                writableAIGCGenerationModel.setErrorMsg(c0lun.getErrorMsg());
                writableAIGCGenerationModel.ud(c0lun.getErrorSource());
                writableAIGCGenerationModel.aO(c0lun.getFailReasonMsg());
                writableAIGCGenerationModel.RH(c0lua.LIZJ.duration);
            }
            return failed;
        }
        return new CreateState.Failed("", -1, "", null, "", -1L);
    }

    public static final CreateState.Running LIZJ(C0LUB c0lub, WritableAIGCGenerationModel writableAIGCGenerationModel) {
        CreateState.Running running = new CreateState.Running(c0lub.LIZ, c0lub.LIZIZ, c0lub.LIZLLL);
        if (writableAIGCGenerationModel != null) {
            writableAIGCGenerationModel.P3(UsageStatus.LOADING);
            writableAIGCGenerationModel.Qd(c0lub.LIZ.toString());
            writableAIGCGenerationModel.setProgress(c0lub.LIZIZ);
            writableAIGCGenerationModel.pA(c0lub.LIZJ);
            writableAIGCGenerationModel.Jq(c0lub.LIZLLL);
            if (c0lub.LIZJ > 0 && writableAIGCGenerationModel.T1() < 0) {
                writableAIGCGenerationModel.Wn(c0lub.LIZJ);
            }
            LIZ(writableAIGCGenerationModel);
        }
        return running;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJ(X.C0LU9 r7, java.lang.String r8, com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aikit.api.create.CreateState> r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C546730LcN.LJ(X.0LU9, java.lang.String, com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel, X.05Vn):java.lang.Object");
    }
}

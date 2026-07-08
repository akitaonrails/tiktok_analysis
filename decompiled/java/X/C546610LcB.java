package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationResultInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import java.util.Collections;

/* JADX INFO: renamed from: X.0LcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546610LcB implements InterfaceC546480Lby<AwemeDraft> {
    public static void LIZJ(CreativeModel creativeModel) {
        boolean z;
        String strValueOf;
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel == null) {
            return;
        }
        AITheaterGenerationModel aITheaterGenerationModel = aITheaterModel.getCreationModel().generationModel;
        if (aITheaterGenerationModel.getStatus() == UsageStatus.SUCCESS_APPLY) {
            z = true;
        } else {
            z = false;
        }
        AITheaterContextModel contextModel = aITheaterModel.getContextModel();
        String str = aITheaterModel.getCreationModel().sessionModel.traceId;
        C547200Ld8 c547200Ld8 = C547300LdI.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft restore aigc info: ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(aITheaterGenerationModel.getErrorCode());
        C547130Ld1.LIZ(str, c547200Ld8, "AITheaterDraftRestoreHandler", C2188811AlT.LIZIZ(sbLIZ));
        String serverTaskId = aITheaterGenerationModel.getServerTaskId();
        long durationMs = aITheaterGenerationModel.getDurationMs();
        if (z) {
            strValueOf = null;
        } else {
            strValueOf = String.valueOf(aITheaterGenerationModel.getErrorCode());
        }
        contextModel.aigcCreationResultInfo = new AIGCCreationResultInfo(Boolean.valueOf(z), strValueOf, durationMs, serverTaskId, EnumC547660Lds.ASYNCHRONOUS.getValue());
        String clientTaskId = aITheaterModel.getCreationModel().generationModel.getClientTaskId();
        if (clientTaskId != null) {
            creativeModel.asyncTaskIds = Collections.singletonList(clientTaskId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    @Override // X.InterfaceC546480Lby
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r34, X.InterfaceC1364105Vn<? super kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C546610LcB.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }
}

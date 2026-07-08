package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;

/* JADX INFO: renamed from: X.0M2R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2R {
    public static final DraftDBSaveResult LIZ(C545640Lac c545640Lac) {
        DraftDBSaveResult draftDBSaveResult;
        boolean zContains;
        Object objValueOf;
        String str;
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        CreativeModel creativeModel2;
        DraftInfoModel draftInfoModel2;
        CreativeModel creativeModel3;
        DraftInfoModel draftInfoModel3;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftUpdateDBParams.updateToDB; creativeInfo : ");
        sbLIZ.append(c545640Lac.LIZ.LIZIZ());
        sbLIZ.append(", extraInfo : ");
        sbLIZ.append(c545640Lac.LIZIZ);
        C0M7L.LIZ("", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            draftDBSaveResult = C0MZJ.LIZIZ().LIZLLL(c545640Lac.LIZ);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            draftDBSaveResult = new DraftDBSaveResult(System.currentTimeMillis() - jCurrentTimeMillis, new DraftDBSaveException(-1002, e));
        }
        if (draftDBSaveResult.isSuc()) {
            IDraftListener.UpdateParams updateParams = new IDraftListener.UpdateParams(c545640Lac.LIZ, c545640Lac.LIZIZ.LIZJ);
            Boolean boolValueOf = null;
            if (C306790C0v.LIZ() && !C0M1A.LIZ(updateParams) && !updateParams.draft.LIZ.draftInfoModel.isDraft) {
                C0M1W.LIZ(null);
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), null, null, new C0KU7(updateParams, null), 3);
            int i = c545640Lac.LIZIZ.LIZIZ;
            AwemeDraft awemeDraft = c545640Lac.LIZ;
            if (awemeDraft != null && (creativeModel3 = awemeDraft.LIZ) != null && (draftInfoModel3 = creativeModel3.draftInfoModel) != null && !draftInfoModel3.isDraft && (str2 = draftInfoModel3.saveDraftScene) != null) {
                zContains = C0M2S.LIZIZ.contains(str2);
            } else {
                zContains = false;
            }
            if (!zContains) {
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onDraftSavedIfUserDriven: skip — not user-driven (saveFrom=");
                sbLIZ2.append(i);
                sbLIZ2.append(", scene=");
                if (awemeDraft != null && (creativeModel2 = awemeDraft.LIZ) != null && (draftInfoModel2 = creativeModel2.draftInfoModel) != null) {
                    str = draftInfoModel2.saveDraftScene;
                } else {
                    str = null;
                }
                sbLIZ2.append(str);
                sbLIZ2.append(", isExistingDraft=");
                if (awemeDraft != null && (creativeModel = awemeDraft.LIZ) != null && (draftInfoModel = creativeModel.draftInfoModel) != null) {
                    boolValueOf = Boolean.valueOf(draftInfoModel.isDraft);
                }
                sbLIZ2.append(boolValueOf);
                sbLIZ2.append(')');
                C201955140j.LIZLLL(c0may, "DraftOrganizerSavedTracker", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                C0M2S.LIZ.getClass();
                C0M2S.LIZ("draft_organizer_skip_remaining_count");
                C0M2S.LIZ("draft_organizer_skip_remaining_memory");
                Object objValueOf2 = "null";
                if (!C0M2S.LIZIZ().contains("draft_organizer_skip_remaining_count")) {
                    objValueOf = "null";
                } else {
                    objValueOf = Long.valueOf(C0M2S.LIZIZ().getLong("draft_organizer_skip_remaining_count", 0L));
                }
                if (C0M2S.LIZIZ().contains("draft_organizer_skip_remaining_memory")) {
                    objValueOf2 = Long.valueOf(C0M2S.LIZIZ().getLong("draft_organizer_skip_remaining_memory", 0L));
                }
                C0MAY c0may2 = C0MAY.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onDraftSaved: skipRemaining[count=");
                sbLIZ3.append(objValueOf);
                sbLIZ3.append(", mem=");
                sbLIZ3.append(objValueOf2);
                sbLIZ3.append(']');
                C201955140j.LIZLLL(c0may2, "DraftOrganizerSavedTracker", C2188811AlT.LIZIZ(sbLIZ3));
                return draftDBSaveResult;
            }
        }
        return draftDBSaveResult;
    }
}

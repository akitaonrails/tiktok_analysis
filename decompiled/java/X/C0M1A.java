package X;

import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M1A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M1A {
    public static boolean LIZ(IDraftListener.UpdateParams updateParams) {
        if (Intrinsics.LJFF(updateParams.draft.LIZJ(), "CHECK_POINT")) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftChangeListenerFilter", "needFilter return true, params.draft.draftPrimaryKey == CHECK_POINT_PRIMARY_KEY");
            return true;
        }
        if (!C0MZ9.LJII(updateParams.draft)) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftChangeListenerFilter", "needFilter return true, draft.isCanShow == false");
            return true;
        }
        String str = updateParams.draft.LIZ.draftInfoModel.saveDraftScene;
        if (!Intrinsics.LJFF(str, "silence") && !Intrinsics.LJFF(str, "autoSaveDraftAfterPublished")) {
            if (updateParams.isPublish() && !updateParams.draft.LIZ.pugcTemplateData.isFromCreateTemplate) {
                C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftChangeListenerFilter", "needFilter return true, isPublish == true");
                return true;
            }
            return false;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needFilter return true, saveDraftScene = ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c0may, "DraftChangeListenerFilter", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }
}

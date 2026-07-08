package X;

import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;

/* JADX INFO: renamed from: X.0M0H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0H {
    public static final C0M0H LIZ = new C0M0H();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r12) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M0H.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft):int");
    }

    public static boolean LIZIZ(AwemeDraft awemeDraft) {
        CreativeModel creativeModel;
        AutoPickModel autoPickModel;
        List<AutoPickMediaModel> list;
        if (awemeDraft == null || (creativeModel = awemeDraft.LIZ) == null || (autoPickModel = creativeModel.autoPickModel) == null || (list = autoPickModel.mediaList) == null || !(!list.isEmpty()) || !awemeDraft.LIZ.autoPickModel.isFromAutoPickPanel) {
            return false;
        }
        return true;
    }
}

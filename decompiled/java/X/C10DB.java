package X;

import android.content.Context;
import com.ss.android.ugc.aweme.unifiedauth.push.UniAuthGuidePopupServiceImpl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;

/* JADX INFO: renamed from: X.10DB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10DB implements C10DS {
    public final /* synthetic */ C10DS LIZ;
    public final /* synthetic */ UniAuthGuidePopupServiceImpl LIZIZ;
    public final /* synthetic */ UnifiedAuthPopupConfig LIZJ;
    public final /* synthetic */ Context LIZLLL;

    @Override // X.C10DS
    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowSmsPopup#onNotShow(");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
        this.LIZIZ.LJI(this.LIZLLL, this.LIZ, this.LIZJ);
    }

    @Override // X.C10DS
    public final void onShow(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowSmsPopup#onShow(");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
        C10DS c10ds = this.LIZ;
        if (c10ds != null) {
            c10ds.onShow(i);
        }
    }

    @Override // X.C10DS
    public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowSmsPopup#onDismissAfterShown(");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(abstractC343940De4);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
        C10DS c10ds = this.LIZ;
        if (c10ds != null) {
            c10ds.LIZIZ(i, abstractC343940De4);
        }
    }

    public C10DB(C10DS c10ds, UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl, UnifiedAuthPopupConfig unifiedAuthPopupConfig, Context context) {
        this.LIZ = c10ds;
        this.LIZIZ = uniAuthGuidePopupServiceImpl;
        this.LIZJ = unifiedAuthPopupConfig;
        this.LIZLLL = context;
    }
}

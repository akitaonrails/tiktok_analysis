package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0LzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560860LzA {
    public final Context LIZ;

    public C560860LzA(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(IAVDraftService iAVDraftService, ShortVideoContext shortVideoContext) {
        ICreativeSAAService iCreativeSAAService;
        CreativeFlowData creativeFlowData;
        InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
        if (accountService.isLogin()) {
            if (shortVideoContext != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null) {
                if (creativeFlowData.getEditorProModel() == null) {
                    creativeFlowData.setEditorProModel(new EditorProModel(false, null, false, false, "", false, 0L, null, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, false, 0, false, false, false, false, 0, false, false, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, -1, -1, "", false, false, null, null, new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ConcurrentHashMap(), new ArrayList(), false, false, "", false, -1L, false, null));
                }
                EditorProModel editorProModel = creativeFlowData.getEditorProModel();
                if (editorProModel != null) {
                    editorProModel.setOpenEditToolType("add_draft");
                }
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "shoot_page_edit_tab", bundle);
            C786410Ut5.LJJJI("enter_method", "click_editor_tab_drafts", bundle);
            if (iAVDraftService != null) {
                iAVDraftService.openDraftActivity(this.LIZ, bundle);
            }
            Activity activityLIZ = C0FNT.LIZ(this.LIZ);
            if (activityLIZ != null && (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
                iCreativeSAAService.finishSAAActivitySafely(activityLIZ);
                return;
            }
            return;
        }
        Activity activityLIZ2 = C0FNT.LIZ(this.LIZ);
        if (activityLIZ2 == null) {
            return;
        }
        accountService.LJIILL(activityLIZ2, null);
    }
}

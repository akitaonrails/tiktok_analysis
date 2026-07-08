package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15IN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IN implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
    }

    public C15IN(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        Activity activity = this.LIZ;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("creation_id", C15IK.LJ, bundle2);
        C786410Ut5.LJJJI("shoot_way", C15IK.LJIIJJI, bundle2);
        String str = C15IK.LIZ;
        if (a0.LJJIIZI(str, "shoot", false)) {
            str = "shoot_page_upload_song";
        } else if (a0.LJJIIZI(str, "edit", false)) {
            str = "edit_page_upload_song";
        }
        C786410Ut5.LJJJI("enter_from", str, bundle2);
        bundle2.putLong("start_time", System.currentTimeMillis());
        C786410Ut5.LJJIIZI(bundle, bundle2, "extra_log_info_map");
        iRecordServiceRecordService.startAlbumForExtractMusic(activity, bundle);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;

/* JADX INFO: renamed from: X.0olR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485670olR {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1485680olS());

    public static final ICLAPerfETService LIZ() {
        return (ICLAPerfETService) LIZ.getValue();
    }

    public static final boolean LIZIZ(CaptionItemModel captionItemModel) {
        if (captionItemModel == null || captionItemModel.expire >= System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            return false;
        }
        return true;
    }
}

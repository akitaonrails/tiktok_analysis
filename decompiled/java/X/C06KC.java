package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.api.services.IInboxImgService;
import com.ss.android.ugc.aweme.notification.service.InboxImgServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.06KC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06KC implements IInboxImgService {
    public static final C06KC LIZIZ = new C06KC();
    public final /* synthetic */ IInboxImgService LIZ;

    @Override // com.ss.android.ugc.aweme.notice.api.services.IInboxImgService
    public final UrlModel LIZ(Context context, C427660Gpo c427660Gpo, User user) {
        return this.LIZ.LIZ(context, c427660Gpo, user);
    }

    public C06KC() {
        IInboxImgService iInboxImgService;
        Object objLIZ = C04TD.LIZ(IInboxImgService.class, false);
        if (objLIZ != null) {
            iInboxImgService = (IInboxImgService) objLIZ;
        } else {
            if (C04TD.R2 == null) {
                synchronized (IInboxImgService.class) {
                    if (C04TD.R2 == null) {
                        C04TD.R2 = new InboxImgServiceImpl();
                    }
                }
            }
            iInboxImgService = C04TD.R2;
        }
        this.LIZ = iInboxImgService;
    }
}

package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.service.IPostModeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666010QAl implements IPostModeService {
    public static final C666010QAl LIZIZ = new C666010QAl();
    public final /* synthetic */ IPostModeService LIZ = (IPostModeService) ServiceManager.get().getService(IPostModeService.class);

    @Override // com.ss.android.ugc.aweme.lemon.postmode.service.IPostModeService
    public final void LIZ(C19EG c19eg, VideoItemParams videoItemParams, PostModeDetailParams postModeDetailParams, String str, Fragment fragment, Function0 function0) {
        this.LIZ.LIZ(c19eg, videoItemParams, postModeDetailParams, str, fragment, function0);
    }

    @Override // com.ss.android.ugc.aweme.lemon.postmode.service.IPostModeService
    public final boolean showEngagementCount() {
        return this.LIZ.showEngagementCount();
    }
}

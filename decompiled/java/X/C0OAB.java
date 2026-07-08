package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.VideoLikeEmptyService;
import java.util.List;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS479S0200000_11;

/* JADX INFO: renamed from: X.0OAB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAB implements IVideoLikeService {
    public static final C0OAB LIZIZ = new C0OAB();
    public final /* synthetic */ IVideoLikeService LIZ;

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService
    public final void LIZ(Fragment fragment, Aweme aweme, List list, AwS447S0200000_11 awS447S0200000_11, AwS479S0200000_11 awS479S0200000_11) {
        this.LIZ.LIZ(fragment, aweme, list, awS447S0200000_11, awS479S0200000_11);
    }

    public C0OAB() {
        IVideoLikeService iVideoLikeService = (IVideoLikeService) PluggableExtentionKt.pluggableSpi$default(IVideoLikeService.class, false, false, false, 14, null);
        this.LIZ = iVideoLikeService == null ? new VideoLikeEmptyService() : iVideoLikeService;
    }
}

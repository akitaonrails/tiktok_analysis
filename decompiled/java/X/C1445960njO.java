package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Objects;

/* JADX INFO: renamed from: X.0njO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445960njO {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final IMainService LIZJ;

    public C1445960njO() {
        Boolean bool = Boolean.FALSE;
        this.LIZ = bool;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        Objects.requireNonNull(iMainService);
        this.LIZJ = iMainService;
        this.LIZIZ = bool;
        this.LIZ = Boolean.TRUE;
    }

    public static Activity LIZ() {
        return ActivityStack.getTopActivity() != null ? ActivityStack.getTopActivity() : C2214201BlK.LJFF();
    }

    public final Boolean LIZIZ() {
        Activity activityLIZ = LIZ();
        Boolean bool = this.LIZIZ;
        return bool != null ? bool : activityLIZ != null ? Boolean.valueOf(((ICreativePageService) ServiceManager.get().getService(ICreativePageService.class)).isPublishPage(activityLIZ)) : Boolean.FALSE;
    }

    public final Boolean LIZJ(Object obj) {
        boolean z;
        Activity activityLIZ = LIZ();
        if (obj instanceof VideoPublishEditModel) {
            if (C1428470nHB.LJJJLL((VideoPublishEditModel) obj)) {
                return Boolean.FALSE;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if ((!(activityLIZ instanceof C19EG) || !this.LIZJ.isMainActivity((C19EG) activityLIZ)) && videoPublishEditModel.creativeModel.paidContentModel.getCollectionId().isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}

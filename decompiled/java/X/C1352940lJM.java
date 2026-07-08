package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INowFeedPreLoadService;

/* JADX INFO: renamed from: X.0lJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352940lJM implements INowFeedPreLoadService {
    public static final C1352940lJM LIZIZ = new C1352940lJM();
    public final /* synthetic */ INowFeedPreLoadService LIZ = (INowFeedPreLoadService) ServiceManager.get().getService(INowFeedPreLoadService.class);

    @Override // com.ss.android.ugc.aweme.service.INowFeedPreLoadService
    public final View LIZ(int i, Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.LIZ.LIZ(i, context, layoutInflater, viewGroup);
    }
}

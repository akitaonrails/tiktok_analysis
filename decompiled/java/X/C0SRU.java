package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SRU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRU implements InterfaceC1167830gUn {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ Activity LIZJ;

    @Override // X.InterfaceC1167830gUn
    public final void LIZ(int i, boolean z) {
        if (z) {
            if (i == 0) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "key_mix_add_aweme_info", this.LIZ);
                ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJ(this.LIZIZ, bundle, 3, "graphic_detail", "long_press");
                return;
            }
            ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIJJLI(this.LIZJ, this.LIZ, "", "", "graphic_detail", "long_press");
            return;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(this.LIZIZ);
        c1233040iBy.LIZIZ(R.string.m25);
        c1233040iBy.LIZLLL();
    }

    public C0SRU(Aweme aweme, Context context, C19EG c19eg) {
        this.LIZ = aweme;
        this.LIZIZ = context;
        this.LIZJ = c19eg;
    }
}

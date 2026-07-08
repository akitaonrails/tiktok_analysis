package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.entrance.ITakoFeedNormalEntranceHotspotLayoutHost;

/* JADX INFO: renamed from: X.14F8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14F8 implements ITakoFeedNormalEntranceHotspotLayoutHost {
    public final View LIZ;
    public final SmartImageView LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedNormalEntranceHotspotLayoutHost
    public final View getIconNewView() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedNormalEntranceHotspotLayoutHost
    public final View getIconShadowView() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedNormalEntranceHotspotLayoutHost
    public final View getIconView() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedNormalEntranceHotspotLayoutHost
    public final View getRootView() {
        return this.LIZ;
    }

    public C14F8(View view, C14TH c14th) {
        this.LIZ = view;
        this.LIZIZ = c14th.LIZIZ;
        this.LIZJ = c14th.LIZJ;
        this.LIZLLL = c14th.LIZLLL;
    }
}

package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.entrance.ITakoFeedBubbleEntranceHotspotLayoutHost;

/* JADX INFO: renamed from: X.14F9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14F9 implements ITakoFeedBubbleEntranceHotspotLayoutHost {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final SmartImageView LIZLLL;

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedBubbleEntranceHotspotLayoutHost
    public final View getBottomBoardView() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedBubbleEntranceHotspotLayoutHost
    public final View getHotspotContainer() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedBubbleEntranceHotspotLayoutHost
    public final View getLogoView() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tako.entrance.ITakoFeedBubbleEntranceHotspotLayoutHost
    public final View getRootView() {
        return this.LIZ;
    }

    public C14F9(View view, C14TG c14tg) {
        this.LIZ = view;
        this.LIZIZ = c14tg.LIZJ;
        this.LIZJ = c14tg.LIZIZ;
        this.LIZLLL = c14tg.LJI;
    }
}

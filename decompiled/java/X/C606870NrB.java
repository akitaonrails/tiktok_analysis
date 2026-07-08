package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.List;

/* JADX INFO: renamed from: X.0NrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C606870NrB {
    public final IFeedPanelPlatformAbility LIZ;
    public final IFeedFetchDataAbility LIZIZ;

    public List<Aweme> LIZ() {
        return this.LIZ.getAwemeList();
    }

    public C606870NrB(IFeedPanelPlatformAbility iFeedPanelPlatformAbility, IFeedFetchDataAbility iFeedFetchDataAbility) {
        this.LIZ = iFeedPanelPlatformAbility;
        this.LIZIZ = iFeedFetchDataAbility;
    }
}

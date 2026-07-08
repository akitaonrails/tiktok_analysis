package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T4F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4F extends C09AY implements Function0<IRefreshAbility> {
    public final /* synthetic */ MFUGAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T4F(MFUGAssem mFUGAssem) {
        super(0);
        this.LL = mFUGAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IRefreshAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IRefreshAbility.class, null);
    }
}

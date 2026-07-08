package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cC9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002510cC9 extends C09AY implements Function0<InterfaceC1008670cM5> {
    public final /* synthetic */ ShakeEgg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002510cC9(ShakeEgg shakeEgg) {
        super(0);
        this.LL = shakeEgg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1008670cM5 invoke() {
        ICommercializeFeedService iCommercializeFeedService = (ICommercializeFeedService) ServiceManager.get().getService(ICommercializeFeedService.class);
        if (iCommercializeFeedService == null) {
            return null;
        }
        ShakeEgg shakeEgg = this.LL;
        return iCommercializeFeedService.LJFF(shakeEgg.LL, shakeEgg.LLJJIJIL, new InterfaceC1399350mWD() { // from class: X.0cCA
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return i == 4;
            }
        });
    }
}

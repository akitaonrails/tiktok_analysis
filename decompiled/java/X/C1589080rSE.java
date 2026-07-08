package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.protocol.IForYouFeedSkylightProtocol;
import com.ss.android.ugc.aweme.protocol.SkylightProtocol;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rSE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589080rSE extends C09AY implements Function0<InterfaceC427710Gpt> {
    public final /* synthetic */ RecommendFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589080rSE(RecommendFeedComponent recommendFeedComponent) {
        super(0);
        this.LL = recommendFeedComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC427710Gpt invoke() {
        final RecommendFeedComponent recommendFeedComponent = this.LL;
        return new InterfaceC427710Gpt() { // from class: X.0qw9
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                SkylightProtocol skylightProtocol;
                if (i != 4 && i != 12) {
                    return;
                }
                List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(recommendFeedComponent), IForYouFeedSkylightProtocol.class, false);
                if (listLIZIZ != null && (skylightProtocol = (SkylightProtocol) C13LP.LJJJLL(listLIZIZ)) != null) {
                    skylightProtocol.PA0(recommendFeedComponent);
                }
                RecommendFeedComponent recommendFeedComponent2 = recommendFeedComponent;
                ((IAccountService) recommendFeedComponent2.LLJJJ.getValue()).LJIIJ().LJIILLIIL((InterfaceC427710Gpt) recommendFeedComponent2.LLJJJIL.getValue());
            }
        };
    }
}
